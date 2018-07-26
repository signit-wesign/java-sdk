package cn.signit.sdk.http;

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

import static cn.signit.sdk.util.Validator.notNull;

import java.net.HttpURLConnection;

import javax.xml.bind.DatatypeConverter;

import cn.signit.sdk.SignitException;

public class Authentication {

    private String appId = new String();
    private String developerId = new String();
    private String secretKey = new String();
    private String accessToken = new String();
    private String accessTokenType = new String();

    public Authentication() {

    }

    public Authentication(String apiKey) {
        this.appId = apiKey;
    }

    public Authentication(String apiKey, String secretKey, String authenticationType, String developerId) {
        this.appId = notNull(apiKey, "appId不可为空");
        this.secretKey = notNull(secretKey, "secretKey不可为空");
        this.accessTokenType = notNull(authenticationType, "tokentype不可为空");
        this.developerId = notNull(developerId, "developerId不可为空");
    }

    public Authentication(Authentication clone) throws SignitException {
        if (clone.hasAppId()) {
            setAppId(clone.getAppId());
        }
        if (clone.hasAccessToken()) {
            setAccessToken(clone.getAccessToken());
        }
        if (clone.hasSecretKey()) {
            setSecretKey(clone.getSecretKey());
        }
        if (clone.hasDeveloperId()) {
            setDeveloperId(clone.getDeveloperId());
        }
    }

    public String getAppId() {
        return appId;
    }

    public Authentication setAppId(String appId) {
        this.appId = appId;
        return this;
    }

    public boolean hasAppId() {
        return !("".equals(appId));
    }

    public String getSecretKey() {
        return secretKey;
    }

    public Authentication setSecretKey(String secretKey) {
        this.secretKey = secretKey;
        return this;
    }

    public boolean hasSecretKey() {
        return !("".equals(secretKey));
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getAccessTokenType() {
        return accessTokenType;
    }

    public void setAccessTokenType(String accessTokenType) {
        this.accessTokenType = accessTokenType;
    }

    public boolean hasAccessTokenType() {
        return !("".equals(accessTokenType) || "".equals(accessTokenType));
    }
    
    public String getDeveloperId() {
        return new String(developerId);
    }

    public Authentication setDeveloperId(String developerId) {
        this.developerId = developerId;
        return this;
    }

    public boolean hasDeveloperId() {
        return !("".equals(developerId));
    }

    public boolean hasAccessToken() {
        return !("".equals(accessToken) || "".equals(accessToken));
    }

    public void authenticate(HttpURLConnection httpConn, String url) {
        String authorization = null;
        if (hasAppId()) {
            String appid = getAppId() + ":";
            authorization = "Basic " + DatatypeConverter.printBase64Binary(appid.getBytes()).trim();
        }
        if (authorization != null) {
            httpConn.setRequestProperty("authorization", authorization);
        }
    }

}
