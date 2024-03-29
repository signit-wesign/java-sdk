package cn.signit.sdk;

/**
 * The MIT License (MIT)
 * 
 * Copyright (C) 2018 signit.cn
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

import java.io.IOException;
import java.util.Map;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;

import cn.signit.sdk.pojo.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import cn.signit.sdk.http.Authentication;
import cn.signit.sdk.http.HttpClient;
import cn.signit.sdk.pojo.request.AbstractSignitRequest;
import cn.signit.sdk.pojo.response.AbstractSignitResponse;
import cn.signit.sdk.pojo.webhook.response.WebhookResponse;
import cn.signit.sdk.type.TokenType;
import cn.signit.sdk.util.FastjsonDecoder;
import cn.signit.sdk.util.HmacSignatureBuilder;
import cn.signit.sdk.util.RequestParam;
import cn.signit.sdk.util.Validator;

/**
 * 易企签快捷签署 Java SDK的基本操作类.
 * 
 * 
 * 
 * <pre>
 * 2018-12-8
 * 将此Client扩展为易企签所有开放平台应用公共使用的Client
 * 
 * 2019-07-31
 * 将成员变量全部ThreadLocal化，支持单例使用SignitClient对象，保证线程安全
 * </pre>
 * @since：2.0.0
 *
 */
public class SignitClient {

    private static ThreadLocal<Authentication> AUTH = new ThreadLocal<Authentication>() {
        @Override
        protected Authentication initialValue() {
            return new Authentication();
        }
    };
    private static ThreadLocal<HttpClient> HTTP_CLIENT = new ThreadLocal<HttpClient>() {
        @Override
        protected HttpClient initialValue() {
            return new HttpClient();
        }
    };
    private static ThreadLocal<String> BASE_URL = new ThreadLocal<String>();

    private static ThreadLocal<String> OAUTH_TOKEN_URL = new ThreadLocal<String>();

    private static final int MAX_COUNT = 3;
    private static final Pattern LEFT_QUOTATION = Pattern.compile("\"\\{");
    private static final Pattern RIGHT_QUOTATION = Pattern.compile("\\}\"");
    private static final Pattern BACKLASH_QUOTATION = Pattern.compile("\\\\\"");

    /**
     * 默认为：快捷签署客户端.
     *
     * @param auth
     *            授权信息
     * @since 1.0.0
     */
    public SignitClient(Authentication auth) {
        this(auth, new HttpClient(), RequestParam.DEFAULT_ENVIRONMENT_URL);
    }

    /**
     * 默认为：快捷签署客户端. 期望直接设置应用的请求路径，故而舍弃该方法
     * 
     * @param auth
     *            授权信息
     * @param envUrl
     *            应用环境
     * @since 1.0.0
     * @since 2.0.0 废弃
     */
    @Deprecated
    public SignitClient(Authentication auth, String envUrl) {
        this(auth, new HttpClient(), envUrl);
    }

    private SignitClient(Authentication auth, HttpClient httpClient, String url) {
        setUrl(url);
        AUTH.set(auth);
        HTTP_CLIENT.set(httpClient);
    }

    /**
     * 应用客户端.
     *
     * @param appId
     *            APP ID
     * @param secretKey
     *            APP Secret
     * @param appUrl
     *            应用请求路径
     * @since 2.0.0
     */
    public SignitClient(String appId, String secretKey, String appUrl) {
        this(appId, secretKey, appUrl, -1, -1);
    }
    
    /**
     * 应用客户端.
     *
     * @param appId
     *            APP ID
     * @param secretKey
     *            APP Secret
     * @param appUrl
     *            应用请求路径
     * @param connectTimeout
     *            连接超时毫秒数
     * @param readTimeout
     *            传输超时毫秒数
     * @since 2.7.4
     */
    public SignitClient(String appId, String secretKey, String appUrl, int connectTimeout, int readTimeout) {
        AUTH.set(new Authentication(appId, secretKey));
        BASE_URL.set(appUrl);
        OAUTH_TOKEN_URL.set(RequestParam.DEFAULT_ENVIRONMENT_URL + RequestParam.DEFAULT_OAUTH_TOKEN_URL);
        HTTP_CLIENT.set(new HttpClient().withConnectTimeout(connectTimeout).withReadTimeout(readTimeout));
    }

    private void setUrl(String environmentUrl) {
        String tempUrl = environmentUrl == null || environmentUrl.trim().equals("")
                ? RequestParam.DEFAULT_ENVIRONMENT_URL
                : environmentUrl;
        BASE_URL.set(new StringBuilder().append(tempUrl).append(RequestParam.DEFAULT_BASE_API_URL).toString());
        OAUTH_TOKEN_URL.set(
                new StringBuilder().append(tempUrl).append(RequestParam.DEFAULT_OAUTH_TOKEN_URL).toString());
    }

    /**
     * 
     * 不期望用户修改应用环境. 如有需要请直接在初始化时直接设置应用请求路径
     * 
     *
     * @param url
     *            应用环境
     * @return 修改应用环境后的快捷签署客户端
     * @since 1.0.0
     * @since 2.0.0 废弃
     */
    @Deprecated
    public SignitClient setEnvironmentUrl(String url) {
        setUrl(url);
        return this;
    }

    /**
     * 设置授权请求路径.
     *
     * @param url
     *            授权请求路径
     * @return 修改授权路径后的应用客户端
     */
    public SignitClient setOauthUrl(String url) {
        OAUTH_TOKEN_URL.set(url);
        return this;
    }

    /**
     * 设置快捷签署请求路径. 期望在客戶端初始化时设置应用请求路径，故而废弃
     * 
     * @param url
     *            快捷签署请求路径
     * @return 快捷签署客户端
     * @since 1.0.0
     * @since 2.0.0 废弃
     */
    @Deprecated
    public SignitClient setSignUrl(String url) {
        BASE_URL.set(url);
        return this;
    }

    /**
     * 发送快捷签署请求.
     *
     * @param request
     *            快捷签署请求
     * @return 快捷签署响应
     * @throws SignitException
     *             易企签自定义异常
     * @throws IOException
     *             数据流异常
     * @since 1.0.0
     */
    public SignatureResponse sendSignatureRequest(SignatureRequest request) throws SignitException, IOException {
        if (request == null) {
            return null;
        }
        if (!AUTH.get().hasAccessTokenType() || !AUTH.get().hasAppId() || !AUTH.get().hasSecretKey()) {
            throw new SignitException("请完善开发者信息");
        }
        HTTP_CLIENT.get().withAuth(AUTH.get()).withPostObject(request);
        if (!AUTH.get().hasAccessToken()) {
            getOauthData(AUTH.get().getAppId(), AUTH.get().getSecretKey(), AUTH.get().getAccessTokenType(), true);
        }
        return retrySendRequest(1);
    }

    private SignatureResponse retrySendRequest(int tryStartCount) throws SignitException {
        if (tryStartCount > MAX_COUNT) {
            throw new SignitException("请核实开发者账户数据是否无误");
        }
        try {
            return HTTP_CLIENT.get().withAuth(AUTH.get()).post(BASE_URL.get()).asObject(SignatureResponse.class);
        } catch (SignitException e) {
            if ("invalid_token".equals(e.getMessage())) {
                // 重新授权
                getOauthData(AUTH.get().getAppId(), AUTH.get().getSecretKey(), AUTH.get().getAccessTokenType(), true);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e1) {
                    return retrySendRequest(++tryStartCount);
                }
                return retrySendRequest(++tryStartCount);
            } else {
                throw e;
            }
        } catch (Exception e) {
            throw new SignitException(e);
        }
    }

    // 可用单独授权，或者可单独调用只获取token
    public OauthData getOauthData(String apiKey, String secretKey, TokenType grantType, boolean autoSetRequestToken)
            throws SignitException {
        if (apiKey == null || secretKey == null) {
            throw new SignitException("请完善开发者账户数据");
        }
        TokenType tmpGrantType = grantType != null ? grantType : TokenType.CLIENT_CREDENTIALS;
        String response = HTTP_CLIENT.get().withAuth(AUTH.get()).withGetParam(RequestParam.CLIENT_ID,
                apiKey).withGetParam(RequestParam.CLIENT_SECRET, secretKey).withGetParam(RequestParam.GRANT_TYPE,
                        tmpGrantType.name().toLowerCase()).get(OAUTH_TOKEN_URL.get()).getLastResponse();
        JSONObject data = JSON.parseObject(Validator.notNull(response, "请求token数据失败"));
        if (data != null && autoSetRequestToken) {
            AUTH.get().setAccessToken(Validator.notNull(data.getString("access_token"), "token获取失败"));
        }
        return FastjsonDecoder.decodeAsBean(response, OauthData.class);
    }

    /**
     * 快捷签署webhook响应数据解析.
     *
     * @param webhook
     *            webhook Json格式数据字符串
     * @return 推送给调用方的webhook事件数据
     * @since 1.0.0
     */
    public WebhookData parseWebhookData(String webhook) {
        if (webhook == null || webhook.trim().length() <= 0) {
            return null;
        }
        webhook = LEFT_QUOTATION.matcher(webhook).replaceAll("{");
        webhook = RIGHT_QUOTATION.matcher(webhook).replaceAll("}");
        webhook = BACKLASH_QUOTATION.matcher(webhook).replaceAll("\"");

        return FastjsonDecoder.decodeAsBean(webhook, WebhookData.class);
    }

    /**
     * 
     * 解析webhook响应数据.
     *
     * @param webhook
     *            webhook Json格式字符串
     * @return 推送给调用方的webhook事件数据
     * @since 2.0.0
     */
    public static WebhookResponse parseWebhookResponse(String webhook) {
        return FastjsonDecoder.decodeAsBean(webhook, WebhookResponse.class);
    }


    // 可用单独授权，或者可单独调用只获取token
    public <T extends AbstractSignitResponse> T getData(Class<T> responseClass, Map<String,String> params)
            throws SignitException {
        if (!AUTH.get().hasAccessTokenType() || !AUTH.get().hasAppId() || !AUTH.get().hasSecretKey()) {
            throw new SignitException("请完善开发者信息");
        }

        if (!AUTH.get().hasAccessToken()) {
            getOauthData(AUTH.get().getAppId(), AUTH.get().getSecretKey(), AUTH.get().getAccessTokenType(), true);
        }
        return sendGetRequest(responseClass,params,1);
    }

    //get
    private <T> T sendGetRequest(Class<T> responseClass, Map<String,String> params, int tryStartCount) throws SignitException {
        if (tryStartCount > MAX_COUNT) {
            throw new SignitException("请核实开发者账户数据是否无误");
        }
        try {
            params.put("access_token",AUTH.get().getAccessToken());
            return HTTP_CLIENT.get().withAuth(AUTH.get()).withGetParams(params).get(BASE_URL.get()).asObject(responseClass);
        } catch (SignitException e) {
            if ("invalid_token".equals(e.getMessage())) {
                // 重新授权
                getOauthData(AUTH.get().getAppId(), AUTH.get().getSecretKey(), AUTH.get().getAccessTokenType(), true);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e1) {
                    return sendGetRequest(responseClass,params, ++tryStartCount);
                }
                return sendGetRequest(responseClass,params, ++tryStartCount);
            } else {
                throw e;
            }
        } catch (Exception e) {
            throw new SignitException(e);
        }
    }

    //post（无params）
    public <T extends AbstractSignitResponse> T execute(AbstractSignitRequest<T> request) throws SignitException {
        if (request == null) {
            return null;
        }
        if (!AUTH.get().hasAccessTokenType() || !AUTH.get().hasAppId() || !AUTH.get().hasSecretKey()) {
            throw new SignitException("请完善开发者信息");
        }
        HTTP_CLIENT.get().withAuth(AUTH.get()).withPostObject(request);
        if (!AUTH.get().hasAccessToken()) {
            getOauthData(AUTH.get().getAppId(), AUTH.get().getSecretKey(), AUTH.get().getAccessTokenType(), true);
        }
        return retrySendRequest(request.getResponseClass(), 1);
    }

    private <T> T retrySendRequest(Class<T> responseClass, int tryStartCount) throws SignitException {
        if (tryStartCount > MAX_COUNT) {
            throw new SignitException("请核实开发者账户数据是否无误");
        }
        try {
            return HTTP_CLIENT.get().withAuth(AUTH.get()).post(BASE_URL.get()).asObject(responseClass);
        } catch (SignitException e) {
            if ("invalid_token".equals(e.getMessage())) {
                // 重新授权
                getOauthData(AUTH.get().getAppId(), AUTH.get().getSecretKey(), AUTH.get().getAccessTokenType(), true);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e1) {
                    return retrySendRequest(responseClass, ++tryStartCount);
                }
                return retrySendRequest(responseClass, ++tryStartCount);
            } else {
                throw e;
            }
        } catch (Exception e) {
            throw new SignitException(e);
        }
    }

    //post（有params）
    public <T extends AbstractSignitResponse> T executePost(AbstractSignitRequest<T> request,Map<String,String> params) throws SignitException {
        if (request == null) {
            return null;
        }
        if (!AUTH.get().hasAccessTokenType() || !AUTH.get().hasAppId() || !AUTH.get().hasSecretKey()) {
            throw new SignitException("请完善开发者信息");
        }
        HTTP_CLIENT.get().withAuth(AUTH.get()).withPostObject(request);
        if (!AUTH.get().hasAccessToken()) {
            getOauthData(AUTH.get().getAppId(), AUTH.get().getSecretKey(), AUTH.get().getAccessTokenType(), true);
        }
        return retrySendPostRequest(request.getResponseClass(), 1,params);
    }

    private <T> T retrySendPostRequest(Class<T> responseClass, int tryStartCount,Map<String,String> params) throws SignitException {
        if (tryStartCount > MAX_COUNT) {
            throw new SignitException("请核实开发者账户数据是否无误");
        }
        try {
            return HTTP_CLIENT.get().withAuth(AUTH.get()).withGetParams(params).post(BASE_URL.get()).asObject(responseClass);
        } catch (SignitException e) {
            if ("invalid_token".equals(e.getMessage())) {
                // 重新授权
                getOauthData(AUTH.get().getAppId(), AUTH.get().getSecretKey(), AUTH.get().getAccessTokenType(), true);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e1) {
                    return retrySendPostRequest(responseClass, ++tryStartCount,params);
                }
                return retrySendPostRequest(responseClass, ++tryStartCount,params);
            } else {
                throw e;
            }
        } catch (Exception e) {
            throw new SignitException(e);
        }
    }

    //put
    public <T extends AbstractSignitResponse> T executePut(AbstractSignitRequest<T> request,Map<String,String> params) throws SignitException {
        if (request == null) {
            return null;
        }
        if (!AUTH.get().hasAccessTokenType() || !AUTH.get().hasAppId() || !AUTH.get().hasSecretKey()) {
            throw new SignitException("请完善开发者信息");
        }
        HTTP_CLIENT.get().withAuth(AUTH.get()).withPostObject(request);
        if (!AUTH.get().hasAccessToken()) {
            getOauthData(AUTH.get().getAppId(), AUTH.get().getSecretKey(), AUTH.get().getAccessTokenType(), true);
        }
        return retrySendPutRequest(request.getResponseClass(), 1,params);
    }

    private <T> T retrySendPutRequest(Class<T> responseClass, int tryStartCount,Map<String,String> params) throws SignitException {
        if (tryStartCount > MAX_COUNT) {
            throw new SignitException("请核实开发者账户数据是否无误");
        }
        try {
            params.put("access_token",AUTH.get().getAccessToken());
            return HTTP_CLIENT.get().withAuth(AUTH.get()).withGetParams(params).put(BASE_URL.get()).asObject(responseClass);
        } catch (SignitException e) {
            if ("invalid_token".equals(e.getMessage())) {
                // 重新授权
                getOauthData(AUTH.get().getAppId(), AUTH.get().getSecretKey(), AUTH.get().getAccessTokenType(), true);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e1) {
                    return retrySendPutRequest(responseClass, ++tryStartCount,params);
                }
                return retrySendPutRequest(responseClass, ++tryStartCount,params);
            } else {
                throw e;
            }
        } catch (Exception e) {
            throw new SignitException(e);
        }
    }

    /**
     * 
     * 客户端验证服务器的webhook响应数据.
     * 
     * @param signitSignature
     *            webhook响应header中x-signit-signature数据。服务器构建的hmac，用于客户端验证服务器
     * @param appId
     *            APP ID
     * @param builder
     *            hmac签名建造器
     * @return 验证结果： true-是服务器发送给客户端的数据；false-验证失败
     * @since 2.0.0
     */
    public static boolean verify(String signitSignature, String appId, HmacSignatureBuilder builder) {
        if (builder == null || appId == null || signitSignature == null) {
            return false;
        }
        String selfBuiltHmac = builder.getDefaultAlgorithm() + " " + appId + ":" + builder.buildAsBase64();
        return selfBuiltHmac.equals(signitSignature);
    }

    /**
     * 客户端验证服务器的webhook响应数据
     * 
     * @param appId
     *            APP ID
     * 
     * @param appSecretKey
     *            APP Secret
     * @param body
     *            webhook响应具体数据。考虑到request中只能获取到body一次，故而需要在方法外获取并传递给此方法
     * @param request
     *            服务端向客户端发起的请求
     * @throws IOException
     *             数据流异常
     * @return 验证结果： true-是服务器发送给客户端的数据；false-验证失败
     * @since 2.0.0
     */
    public static boolean verify(String appId, String appSecretKey, byte[] body, HttpServletRequest request)
            throws IOException {
        HmacSignatureBuilder builder = new HmacSignatureBuilder();

        String signitSignature = request.getHeader("X-Signit-Signature");
        builder.scheme(request.getHeader("X-Signit-Scheme")).apiKey(appId).apiSecret(appSecretKey.getBytes()).method(
                request.getMethod().toUpperCase()).payload(body).contentType(request.getContentType()).host(
                        Validator.isEmpty(request.getHeader("X-Signit-Host")) ? ""
                                : request.getHeader("X-Signit-Host")).resource(
                                        Validator.isEmpty(request.getHeader("X-Signit-Resource")) ? ""
                                                : request.getHeader("X-Signit-Resource")).nonce(
                                                        Validator.isEmpty(request.getHeader("X-Signit-Nonce")) ? ""
                                                                : request.getHeader("X-Signit-Nonce")).date(
                                                                        Validator.isEmpty(
                                                                                request.getHeader("X-Signit-Date")) ? ""
                                                                                        : request.getHeader(
                                                                                                "X-Signit-Date"));
        String selfBuiltHmac = builder.getDefaultAlgorithm() + " " + appId + ":" + builder.buildAsBase64();
        return selfBuiltHmac.equals(signitSignature);
    }

}
