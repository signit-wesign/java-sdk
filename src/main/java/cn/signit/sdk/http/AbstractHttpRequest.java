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

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.util.Scanner;

import cn.signit.sdk.SignitException;

public abstract class AbstractHttpRequest {
    protected String url;

    // 连接超时时间，默认20秒
    protected static int READ_TIMEOUT = 20000;

    // 传输超时时间，默认10秒
    protected static int CONNECT_TIMEOUT = 10000;
    public final static String USER_AGENT = "Signit HTTP";
    protected Integer lastHttpStatusCode;
    protected InputStream lastResponseStream;

    protected Authentication auth;

    public final static String DEFAULT_ENCODING = "UTF-8";

    public void doRequest() throws SignitException {
        HttpURLConnection connection;
        try {
            connection = getConnection();
            connection.setConnectTimeout(CONNECT_TIMEOUT);
            connection.setReadTimeout(READ_TIMEOUT);
        } catch (MalformedURLException e) {
            throw new SignitException(e);
        } catch (IOException e) {
            throw new SignitException(e);
        }
        try {
            lastHttpStatusCode = connection.getResponseCode();
            if (lastHttpStatusCode >= 200 && lastHttpStatusCode < 300) {
                lastResponseStream = connection.getInputStream();
            } else {
                lastResponseStream = connection.getErrorStream();
            }
        } catch (Exception ex) {
            throw new SignitException(ex);
        }
    }

    /**
     * Returns the last HTTP response code.
     * 
     * @return Integer response code
     */
    public Integer getResponseCode() {
        return lastHttpStatusCode;
    }

    /**
     * Returns the last response stream as a string.
     * 
     * @return String
     */
    public String getResponseBody() {
        String responseStr = "";
        if (lastResponseStream != null) {
            Scanner s = new Scanner(lastResponseStream);
            s.useDelimiter("\\A");
            responseStr = (s.hasNext()) ? s.next() : "";
            s.close();
        }
        return responseStr;
    }

    abstract HttpURLConnection getConnection() throws SignitException, IOException;
}
