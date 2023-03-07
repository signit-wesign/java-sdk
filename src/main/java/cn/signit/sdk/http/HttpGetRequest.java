package cn.signit.sdk.http;

import java.io.IOException;

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

import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;

import cn.signit.sdk.SignitException;
import cn.signit.sdk.util.RequestParam;

public class HttpGetRequest extends AbstractHttpRequest {


    private Map<String, String> parameters = null;

    public HttpGetRequest(String url) throws SignitException {
        this(url, null, null);
    }

    public HttpGetRequest(String url, Authentication auth) throws SignitException {
        this(url, null, auth);
    }

    public HttpGetRequest(String url, Map<String, String> parameters) throws SignitException {
        this(url, parameters, null);
    }

    public HttpGetRequest(String url, Map<String, String> parameters, Authentication auth) throws SignitException {
        if (url == null || "".equals(url)) {
            throw new SignitException("URL cannot be null or empty");
        }
        this.url = url;
        if (parameters != null) {
            this.parameters = parameters;
        }
        if (auth != null) {
            this.auth = new Authentication(auth);
        }
    }


    @Override
    protected HttpURLConnection getConnection() throws SignitException, IOException {
        if (parameters != null) {
            if(url.contains("?")){
                url += "&";
            }else{
                url += "?";
            }
            Iterator<String> keys = parameters.keySet().iterator();
            while (keys.hasNext()) {
                String key = keys.next();
                try {
                    url += URLEncoder.encode(key, DEFAULT_ENCODING) + "="
                            + URLEncoder.encode(parameters.get(key), DEFAULT_ENCODING);
                } catch (UnsupportedEncodingException ex) {
                    throw new SignitException(ex);
                }
                if (keys.hasNext()) {
                    url += "&";
                }
            }
        }
        HttpURLConnection connection;
        try {
            connection = (HttpURLConnection) new URL(url).openConnection();
        } catch (Exception e) {
            throw new SignitException(e);
        }
        connection.setRequestProperty("user-agent", USER_AGENT);
        connection.setRequestProperty("Accept-Charset", DEFAULT_ENCODING);
        connection.setRequestProperty(RequestParam.APP_ID, auth.getAppId());
        if (auth != null) {
            auth.authenticate(connection, url);
        }
        return connection;
    }
}
