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

/**
 * 
 * 此SDK的通用异常类,便于使用者单独识别捕获.
 * </p>
 *
 * @author Ning
 * @since 1.0.0
 */
public class SignitException extends Exception {

    private static final long serialVersionUID = 5938953401116767L;

    private Integer httpCode;
    private String type;

    public SignitException(Exception e) {
        super(e);
    }

    public SignitException(String message) {
        super(message);
    }

    public SignitException(String message, Throwable e) {
        super(message, e);
    }

    public SignitException(String message, Integer httpCode, String type) {
        this(message, httpCode, type, null);
    }

    public SignitException(String message, Integer httpCode, String type, Exception e) {
        super(message, e);
        this.httpCode = httpCode;
        this.type = type;
    }

    public Integer getHttpCode() {
        return httpCode;
    }

    public String getType() {
        return type;
    }
}
