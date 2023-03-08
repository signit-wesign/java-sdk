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

import cn.signit.sdk.SignitException;
import cn.signit.sdk.util.FastjsonEncoder;
import cn.signit.sdk.util.RequestParam;

import javax.net.ssl.*;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.Map;

public class HttpPutRequest extends AbstractHttpRequest {

    private Map<String, String> parameters = null;

    private static SSLContext ctx = null;

    private static HostnameVerifier verifier = null;

    private static SSLSocketFactory socketFactory = null;

    private final String boundary;
    private static final String LINE_FEED = "\r\n";

    protected String method = "PUT";

    private HttpURLConnection httpConn;
    private OutputStream outputStream;
    private PrintWriter writer;

    private Map<String, Serializable> fields = null;
    private Object object = null;

    static {

        try {
            ctx = SSLContext.getInstance("TLS");
            ctx.init(new KeyManager[0], new TrustManager[] { new DefaultTrustManager() }, new SecureRandom());

            ctx.getClientSessionContext().setSessionTimeout(15);
            ctx.getClientSessionContext().setSessionCacheSize(1000);

            socketFactory = ctx.getSocketFactory();
        } catch (Exception e) {

        }

        verifier = new HostnameVerifier() {
            public boolean verify(String hostname, SSLSession session) {
                return true;// 默认认证不通过，进行证书校验。
            }
        };

    }

    private static class DefaultTrustManager implements X509TrustManager {
        public X509Certificate[] getAcceptedIssuers() {
            return null;
        }

        public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {
        }

        public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {
        }
    }

    public HttpPutRequest(String url) throws SignitException {
        this(url, null, null,null);
    }

    public HttpPutRequest(String url, Authentication auth) throws SignitException {
        this(url, null, auth,null);
    }

    public HttpPutRequest(String url, Map<String, Serializable> fields) throws SignitException {
        this(url, fields, null,null);
    }

    public HttpPutRequest(String url, Map<String, Serializable> fields,
            Map<String, String> parameters) throws SignitException {
        this(url, fields, null,parameters);
    }

    public HttpPutRequest(String url, Map<String, Serializable> fields, Authentication auth,
            Map<String, String> parameters) throws SignitException {
        if (url == null || "".equals(url)) {
            throw new SignitException("URL cannot be null or empty");
        }
        this.url = url;
        if (fields != null) {
            this.fields = fields;
        }
        if (auth != null) {
            this.auth = new Authentication(auth);
        }
        if(parameters != null){
            this.parameters = parameters;
        }
        // creates a unique boundary based on time stamp
        boundary = "===" + Long.toHexString(System.currentTimeMillis()) + "===";
    }

    public HttpPutRequest(String url, Object object, Authentication auth,Map<String, String> parameters) throws SignitException {
        if (url == null || "".equals(url)) {
            throw new SignitException("URL cannot be null or empty");
        }
        this.url = url;
        if (object != null) {
            this.object = object;
        }
        if (auth != null) {
            this.auth = new Authentication(auth);
        }
        if(parameters != null){
            this.parameters = parameters;
        }
        // creates a unique boundary based on time stamp
        boundary = "===" + Long.toHexString(System.currentTimeMillis()) + "===";
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
        HttpURLConnection conn = null;
        URL url = new URL(this.url);
        if ("https".equals(url.getProtocol())) {
            HttpsURLConnection connHttps = (HttpsURLConnection) url.openConnection();
            connHttps.setSSLSocketFactory(socketFactory);
            connHttps.setHostnameVerifier(verifier);
            conn = connHttps;
        } else {
            conn = (HttpURLConnection) url.openConnection();
        }
        conn.setRequestMethod("PUT");
        conn.setDoOutput(true);
        conn.setRequestProperty("user-agent", USER_AGENT);
        conn.setRequestProperty("accept-encoding", DEFAULT_ENCODING);
        conn.setRequestProperty("Content-Type", "application/json");
        conn.setRequestProperty("Accept", "application/json");
        conn.setRequestProperty(RequestParam.APP_ID, auth.getAppId());
        try {
            OutputStream output = conn.getOutputStream();
            try {
                output.write(FastjsonEncoder.encodeAsString(this.object).getBytes(DEFAULT_ENCODING));
            } finally {
                try {
                    output.close();
                } catch (IOException logOrIgnore) {
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new SignitException(ex.getMessage());
        }
        return conn;
    }

    @SuppressWarnings("unused")
    private HttpURLConnection postWithFile() throws SignitException {
        try {
            openMultipartPostConnection();
            if (fields != null) {
                for (String key : fields.keySet()) {
                    Serializable val = fields.get(key);
                    if (val instanceof File) {
                        addFilePart(key, (File) val);
                    } else {
                        addFormField(key, val.toString());
                    }
                }
            }
            return finish();
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new SignitException(ex.getMessage());
        }
    }

    private void openMultipartPostConnection() throws IOException {
        // httpConn = getProxiedConnection(this.url);
        httpConn = null;
        httpConn.setUseCaches(false);
        httpConn.setDoOutput(true); // indicates POST method
        httpConn.setDoInput(true);
        httpConn.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + boundary);
        httpConn.setRequestProperty("User-Agent", USER_AGENT);
        if (auth != null) {
            // auth.authenticate(httpConn, this.url);
        }
        outputStream = httpConn.getOutputStream();
        writer = new PrintWriter(new OutputStreamWriter(outputStream, DEFAULT_ENCODING), true);
    }

    private void addFormField(String name, String value) {
        write("--" + boundary).write(LINE_FEED);
        write("Content-Disposition: form-data; name=\"" + name + "\"").write(LINE_FEED);
        write("Content-Type: text/plain; charset=" + DEFAULT_ENCODING).write(LINE_FEED);
        write(LINE_FEED);
        write(value).append(LINE_FEED);
        writer.flush();
    }

    private void addFilePart(String fieldName, File uploadFile) throws IOException {
        String fileName = uploadFile.getName();
        write("--" + boundary).write(LINE_FEED);
        write("Content-Disposition: form-data; name=\"" + fieldName + "\"; filename=\"" + fileName + "\"")
                .write(LINE_FEED);
        write("Content-Type: " + URLConnection.guessContentTypeFromName(fileName)).write(LINE_FEED);
        write("Content-Transfer-Encoding: binary").write(LINE_FEED);
        write(LINE_FEED);
        writer.flush();

        FileInputStream inputStream = new FileInputStream(uploadFile);
        byte[] buffer = new byte[4096];
        int bytesRead = -1;
        while ((bytesRead = inputStream.read(buffer)) != -1) {
            outputStream.write(buffer, 0, bytesRead);
        }
        outputStream.flush();
        inputStream.close();

        write(LINE_FEED);
        writer.flush();
    }

    private HttpURLConnection finish() throws IOException {
        writer.flush();
        write("--" + boundary + "--").write(LINE_FEED);
        writer.close();
        return httpConn;
    }

    private PrintWriter write(String str) {
        return writer.append(str);
    }

}
