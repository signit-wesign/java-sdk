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
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import cn.signit.sdk.http.Authentication;
import cn.signit.sdk.http.HttpClient;
import cn.signit.sdk.pojo.OauthData;
import cn.signit.sdk.pojo.SignatureRequest;
import cn.signit.sdk.pojo.SignatureResponse;
import cn.signit.sdk.pojo.WebhookData;
import cn.signit.sdk.type.TokenType;
import cn.signit.sdk.util.FastjsonDecoder;
import cn.signit.sdk.util.RequestParam;
import cn.signit.sdk.util.Validator;

/**
 * 易企签快捷签署 Java SDK的基本操作类
 *
 */
public class SignitClient {

    private Authentication auth;
    private HttpClient httpClient;
    private final int MAX_COUNT = 3;
    private final AtomicInteger count = new AtomicInteger(MAX_COUNT);
    private final Pattern LEFT_QUOTATION = Pattern.compile("\"\\{");
    private final Pattern RIGHT_QUOTATION = Pattern.compile("\\}\"");
    private final Pattern BACKLASH_QUOTATION = Pattern.compile("\\\\\"");

    private String BASE_URL;

    private String OAUTH_TOKEN_URL;

    public SignitClient(Authentication auth) {
        this(auth, new HttpClient());
    }

    private SignitClient(Authentication auth, HttpClient httpClient) {
        BASE_URL = RequestParam.DEFAULT_BASE_API_URL;
        OAUTH_TOKEN_URL = RequestParam.DEFAULT_OAUTH_TOKEN_URL;
        this.auth = auth;
        this.httpClient = httpClient;
    }

    public SignitClient setOauthUrl(String url) {
        BASE_URL = url;
        return this;
    }

    public SignitClient setSignUrl(String url) {
        BASE_URL = url;
        return this;
    }

    public SignatureResponse sendSignatureRequest(SignatureRequest request) throws SignitException, IOException {
        if (request == null) {
            return null;
        }
        if (!auth.hasAccessTokenType() || !auth.hasAppId() || !auth.hasSecretKey()) {
            throw new SignitException("请完善开发者信息");
        }
        httpClient.withAuth(auth).withPostObject(request);
        getOauthData(auth.getAppId(), auth.getSecretKey(), auth.getAccessTokenType(), true);
        return retrySendRequest();
    }

    private SignatureResponse retrySendRequest() throws SignitException {
        if (count.decrementAndGet() <= -1) {
            throw new SignitException("请核实开发者账户数据是否无误");
        }
        try {
            return httpClient.withAuth(auth).post(BASE_URL).AsObject(SignatureResponse.class);
        } catch (SignitException e) {
            if ("invalid_token".equals(e.getMessage())) {
                // 重新授权
                getOauthData(auth.getAppId(), auth.getSecretKey(), auth.getAccessTokenType(), true);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e1) {
                    return retrySendRequest();
                }
                return retrySendRequest();
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
        String response = httpClient.withAuth(auth).withGetParam(RequestParam.CLIENT_ID, apiKey)
                .withGetParam(RequestParam.CLIENT_SECRET, secretKey)
                .withGetParam(RequestParam.GRANT_TYPE, TokenType.CLIENT_CREDENTIALS.name().toLowerCase())
                .get(OAUTH_TOKEN_URL).getLastResponse();
        JSONObject data = JSON.parseObject(Validator.notNull(response, "请求token数据失败"));
        if (data != null && autoSetRequestToken) {
            auth.setAccessToken(Validator.notNull(data.getString("access_token"), "token获取失败"));
        }
        return FastjsonDecoder.decodeAsBean(response, OauthData.class);
    }

    public WebhookData parseWebhookData(String webhook) {
        if (webhook == null || webhook.trim().length() <= 0) {
            return null;
        }
        webhook = LEFT_QUOTATION.matcher(webhook).replaceAll("{");
        webhook = RIGHT_QUOTATION.matcher(webhook).replaceAll("}");
        webhook = BACKLASH_QUOTATION.matcher(webhook).replaceAll("\"");
        return FastjsonDecoder.decodeAsBean(webhook, WebhookData.class);
    }
}
