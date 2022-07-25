package cn.signit.sdk.http;

import java.io.Serializable;
import java.util.HashMap;

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

import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;

import cn.signit.sdk.SignitException;
import cn.signit.sdk.util.FastjsonDecoder;

public class HttpClient {

    private Authentication auth;
    private Map<String, String> getParams;
    private Map<String, Serializable> postFields;
    private AbstractHttpRequest request;
    private Object object;
    private int readTimeout;
    private int connectTimeout;

    public HttpClient withAuth(Authentication auth) {
        this.auth = auth;
        return this;
    }

    public HttpClient withGetParam(String key, String value) {
        if (getParams == null) {
            getParams = new HashMap<String, String>();
        }
        getParams.put(key, value);
        return this;
    }

    public HttpClient withGetParams(Map<String, String> params) {
        getParams = params;
        return this;
    }

    public HttpClient withPostField(String key, Serializable value) {
        if (postFields == null) {
            postFields = new HashMap<String, Serializable>();
        }
        postFields.put(key, value);
        return this;
    }

    public HttpClient withPostFields(Map<String, Serializable> fields) {
        this.postFields = fields;
        return this;
    }

    public HttpClient withPostObject(Object object) {
        this.object = object;
        return this;
    }
    
    public HttpClient withReadTimeout(int readTimeout) {
        this.readTimeout = readTimeout;
        return this;
    }
    
    public HttpClient withConnectTimeout(int connectTimeout) {
        this.connectTimeout = connectTimeout;
        return this;
    }
    
    public String getLastResponse() {
        if (request == null) {
            return null;
        }
        return request.getResponseBody();
    }

    public Integer getLastResponseCode() {
        if (request == null) {
            return null;
        }
        return request.getResponseCode();
    }

    /**
     * Clears the client after a request has successfully completed.
     */
    private void reset() {
        this.auth = null;
        this.getParams = null;
        this.postFields = null;
        this.request = null;
    }

    public JSONObject asJson() throws SignitException {
        JSONObject json = null;
        String response = getLastResponse();
        try {
            json = JSON.parseObject(response);
        } catch (JSONException e) {
            throw new SignitException(e);
        } finally {
            reset();
        }
        return json;
    }

    @SuppressWarnings("unchecked")
    public <T> T asObject(Class<T> clazz) throws SignitException {
        String response = getLastResponse();
        Object o = null;
        try {
            JSONObject json = JSON.parseObject(response);
            if (json.containsKey("error")) {
                throw new SignitException(json.getString("error"));
            }
            if (json.containsKey("errorWsid")) {
                throw new SignitException(response);
            }
            o = FastjsonDecoder.decodeAsBean(response, clazz);
        } catch (JSONException e) {
            throw new SignitException(e);
        } finally {
            reset();
        }
        if (o == null) {
            return null;
        }
        return (T) o;
    }

    public int asHttpCode() throws SignitException {
        Integer code = getLastResponseCode();
        if (code == null) {
            throw new SignitException("No request performed");
        }
        if (code >= 200 && code < 300) {
            reset();
            return code;
        }
        throw new SignitException("HTTP Code " + code);
    }

    public HttpClient get(String url) throws SignitException {
        request = new HttpGetRequest(url, getParams, auth);
        if (this.readTimeout > 0) {
            HttpGetRequest.READ_TIMEOUT = this.readTimeout;
        }
        if (this.connectTimeout > 0) {
            HttpGetRequest.CONNECT_TIMEOUT = this.connectTimeout;
        }
        request.doRequest();
        return this;
    }

    public HttpClient post(String url) throws SignitException {
        url += "?access_token=" + auth.getAccessToken();
        request = new HttpPostRequest(url, object, auth);
        if (this.readTimeout > 0) {
            HttpGetRequest.READ_TIMEOUT = this.readTimeout;
        }
        if (this.connectTimeout > 0) {
            HttpGetRequest.CONNECT_TIMEOUT = this.connectTimeout;
        }
        request.doRequest();
        return this;
    }

}
