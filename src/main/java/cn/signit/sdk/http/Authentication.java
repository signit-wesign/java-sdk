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

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;

import org.apache.commons.codec.binary.Base64;

import cn.signit.sdk.SignitException;
import cn.signit.sdk.type.TokenType;

public class Authentication {

    private String appId = new String();
    private String secretKey = new String();
    private String accessToken = new String();
    private TokenType accessTokenType;
    private String cacheTokenDir = System.getProperty("java.io.tmpdir");

    public Authentication() {

    }

    public Authentication(String apiKey, String secretKey) {
        this(apiKey, secretKey, TokenType.CLIENT_CREDENTIALS);
    }

    public Authentication(String apiKey, String secretKey, TokenType authenticationType) {
        this.appId = notNull(apiKey, "appId不可为空");
        this.secretKey = notNull(secretKey, "secretKey不可为空");
        this.accessTokenType = notNull(authenticationType, "tokentype不可为空");
        initFromLocal();
    }

    /**
     * 
     * 从本地缓存文件中中加载token,如果token已经存在，则不再读取
     * 
     * @since 2.0.0
     */
    private void initFromLocal() {
        if (this.accessToken == null || this.accessToken.trim()
                .equals("")) {
            String filename = generateCachedTokenFilename();
            if (filename != null) {
                try {
                    File file = new File(filename);
                    FileInputStream fis = new FileInputStream(file);
                    byte[] datas = new byte[fis.available()];
                    // 读取数据
                    fis.read(datas);

                    String keyBase64 = "9ijhWI+0fNf0RSRJxgPt7q2zciyGVxmcco95I+gKids=";
                    Key key = new SecretKeySpec(Base64.decodeBase64(keyBase64), "AES");
                    Cipher cipher = null;
                    // 解密
                    cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
                    cipher.init(Cipher.DECRYPT_MODE, key);
                    byte[] decodeResult = cipher.doFinal(datas);
                    // 转换为String
                    this.accessToken = new String(decodeResult);
                    fis.close();
                } catch (NoSuchAlgorithmException e) {
                    return;
                } catch (NoSuchPaddingException e) {
                    return;
                } catch (IllegalBlockSizeException e) {
                    return;
                } catch (BadPaddingException e) {
                    return;
                } catch (InvalidKeyException e) {
                    return;
                } catch (IOException e) {
                    return;
                }
            }
        }

    }

    private String generateCachedTokenFilename() {
        if (appId != null && secretKey != null && accessTokenType != null) {
            StringBuffer sb = new StringBuffer();
            sb = sb.append(appId)
                    .append(",")
                    .append(secretKey)
                    .append(",")
                    .append(accessTokenType);
            try {
                MessageDigest md5 = MessageDigest.getInstance("MD5");
                md5.update(sb.toString()
                        .getBytes());
                return cacheTokenDir.concat(Base64.encodeBase64String(md5.digest()));
            } catch (NoSuchAlgorithmException e) {
                return null;
            }
        }
        return null;
    }

    /**
     * 
     * 将token缓存到本地临时文件中
     * 
     * @since 2.0.0
     */
    private void cacheToLocal() {
        if (this.accessToken != null && !this.accessToken.trim()
                .equals("")) {
            String filename = generateCachedTokenFilename();
            if (filename != null) {
                try {
                    File file = new File(filename);
                    FileOutputStream fos = new FileOutputStream(file);
                    byte[] datas = this.accessToken.getBytes();

                    String keyBase64 = "9ijhWI+0fNf0RSRJxgPt7q2zciyGVxmcco95I+gKids=";
                    Key key = new SecretKeySpec(Base64.decodeBase64(keyBase64), "AES");

                    Cipher cipher = null;
                    // 加密
                    cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
                    cipher.init(Cipher.ENCRYPT_MODE, key);
                    byte[] decodeResult = cipher.doFinal(datas);
                    fos.write(decodeResult);
                    fos.flush();
                    fos.close();
                } catch (NoSuchAlgorithmException e) {
                    return;
                } catch (NoSuchPaddingException e) {
                    return;
                } catch (IllegalBlockSizeException e) {
                    return;
                } catch (BadPaddingException e) {
                    return;
                } catch (InvalidKeyException e) {
                    return;
                } catch (IOException e) {
                    return;
                }
            }
        }
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
        initFromLocal();
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        cacheToLocal();
    }

    public TokenType getAccessTokenType() {
        return accessTokenType;
    }

    public void setAccessTokenType(TokenType accessTokenType) {
        this.accessTokenType = accessTokenType;
    }

    public boolean hasAccessTokenType() {
        return !("".equals(accessTokenType) || "".equals(accessTokenType));
    }

    public boolean hasAccessToken() {
        initFromLocal();
        return !("".equals(accessToken) || "".equals(accessToken));
    }

    public void authenticate(HttpURLConnection httpConn, String url) {
        String authorization = null;
        if (hasAppId()) {
            String appid = getAppId() + ":";
            authorization = "Basic " + DatatypeConverter.printBase64Binary(appid.getBytes())
                    .trim();
        }
        if (authorization != null) {
            httpConn.setRequestProperty("authorization", authorization);
        }
    }

}
