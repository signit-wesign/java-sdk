/*
 * Copyright © 2017 signit.cn. All rights reserved.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
package cn.signit.sdk.util;

import java.util.Collection;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Validator {

    private Validator() {
    }

    /**
     * 正则表达式常量类.
     * 
     * @author zhd
     * @since 1.0.0
     */
    public static final class RegexType {
        private RegexType() {
        }

        /**
         * 邮箱正则表达式.
         *
         * @since 1.0.0
         */
        public static final String EMAIL = "^[a-zA-Z0-9_\\.\\-\\+]+@[a-zA-Z0-9_\\.\\-\\+]+\\.[a-zA-Z]{2,5}$";

        /**
         * 手机正则表达式. <br>
         * <br>
         * 规则说明：<br>
         * 中国大陆：开头1 3-8号段，后边跟9位数字<br>
         * 台湾：09开头后面跟8位数字<br>
         * 香港：9或6开头后面跟7位数字<br>
         * 澳门：66或68开头后面跟5位数字<br>
         * 注意：以上表达式只验证港澳台及大陆手机号码，不包含座机小灵通及区号等验证<br>
         * 
         * @since 1.0.0
         */
        public static final String CHINA_CELLPHONE = "^[1][3-8]\\d{9}$|^([6|9])\\d{7}$"
                + "|^[0][9]\\d{8}$|^[6]([8|6])\\d{5}$";

        /**
         * 整数正则表达式. <br>
         * 包括正整数和负整数以及0.
         *
         * @since 1.0.0
         */
        public static final String INTEGER_NUMBER = "^(-|\\+)?\\d+$";

        /**
         * IPv4正则表达式.
         *
         * @since 1.0.0
         */
        public static final String IPV4 = "^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)"
                + "(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$";

        /**
         * IPv6标准格式正则表达式.
         *
         * @since 1.0.0
         */
        public static final String IPV6_STD = "^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$";

        /**
         * IPv6十六进制压缩格式正则表达式.
         *
         * @since 1.0.0
         */
        public static final String IPV6_HEX_COMPRESSED = "^((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)::"
                + "((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)$";

        /**
         * 通用身份证正则表达式.
         *
         * @since 1.0.0
         */
        public static final String COMMON_ID_CARD = "^[0-9a-zA-Z]{6,}$";

        /**
         * 中国大陆身份证(15位)正则表达式.
         *
         * @since 1.0.0
         */
        public static final String CHINA_MAINLAND_ID_CARD_15 = "^[1-9]\\d{7}((0[1-9])||(1[0-2]))((0[1-9])||"
                + "(1\\d)||(2\\d)||(3[0-1]))\\d{3}$";

        /**
         * 中国大陆身份证(18位)正则表达式.
         *
         * @since 1.0.0
         */
        public static final String CHINA_MAINLAND_ID_CARD_18 = "^[1-9]\\d{5}[1-9]\\d{3}((0[1-9])||(1[0-2]))((0[1-9])||"
                + "(1\\d)||(2\\d)||(3[0-1]))\\d{3}([0-9]||X)$";

        /**
         * 中国香港身份证正则表达式.<br>
         * <br>
         * 规则说明：<br>
         * 一个英文+6个数字+(一个校验码，0~9或A)
         *
         * @since 1.0.0
         */
        public static final String CHINA_HK_ID_CARD = "^[A-Z]{1,2}[0-9]{6}([0-9A])$";

        /**
         * 中国澳门身份证正则表达式.<br>
         * <br>
         * 规则说明：<br>
         * 第一位1、5、7，后面6个数字，最后带括号的一位校验码0~9
         *
         * @since 1.0.0
         */
        public static final String CHINA_MO_ID_CARD = "^[157][0-9]{6}([0-9])$";

        /**
         * 中国台湾身份证正则表达式.<br>
         * <br>
         * 规则说明：<br>
         * 1个英文+9个数字
         *
         * @since 1.0.0
         */
        public static final String CHINA_TW_ID_CARD = "^[A-Z][0-9]{9}$";

        /**
         * 中国台湾身份证正则表达式.<br>
         * <br>
         * 规则说明：<br>
         * 6～50位，且由字母、数字、特殊可打印字符，且不含空格的任意2种的组合
         *
         * @since 1.0.0
         */
        private static final String PASSWORD_BASE = "^(?![0-9]*$)(?![a-zA-Z]*$)(?![!\\[\\]\"#$%&'()*+,\\-./:;<=>?@^_`{|}~]*$).";
        private static final String PASSWORD_LEN_TEMP = "{%d,%d}$";
        public static final String PASSWORD = PASSWORD_BASE + "{6,50}$";

        /**
         * URL正则表达式.<br>
         * <br>
         * 规则说明：<br>
         * 支持http/https/ftp/ftps/sftp/file/gopher/news/nntp/telnet方式的URL
         *
         * @since 1.0.0
         */
        public static final String URL = "^(?:https?|ftp?|sftp|file|gopher|news|nntp|telnet):///?[^\\s/$.?#].[^\\s]*$";

        /**
         * MD5正则表达式.<br>
         * <br>
         * 规则说明：<br>
         * 支持十六进制编码大/小写32个字符方式的MD5
         *
         * @since 1.0.0
         */
        public static final String MD5 = "^[a-fA-F0-9]{32}$";

        /**
         * SHA1正则表达式.<br>
         * <br>
         * 规则说明：<br>
         * 支持十六进制编码大/小写40个字符方式的SHA1
         *
         * @since 1.0.0
         */
        public static final String SHA1 = "^[a-fA-F0-9]{40}$";

        /**
         * WSID正则表达式.<br>
         * <br>
         * 规则说明：<br>
         * WSID_大写字母4个字符_十六进制编码大/小写32个字符
         *
         * @since 1.0.0
         */
        public static final String WSID = "^WSID_[A-Z]{4}_[a-fA-F0-9]{32}$";

        /**
         * BASE64编码正则表达式.<br>
         * <br>
         * 规则说明：<br>
         * <a href=
         * 'https://stackoverflow.com/questions/8571501/how-to-check-whether-the-string-is-base64-encoded-or-not'>https://stackoverflow.com/questions/8571501/how-to-check-whether-the-string-is-base64-encoded-or-not</a>
         *
         * @since 1.0.0
         */
        public static final String BASE64 = "^([A-Za-z0-9+/]{4})*([A-Za-z0-9+/]{4}|[A-Za-z0-9+/]{3}=|[A-Za-z0-9+/]{2}==)$";

        /**
         * 16进制编码正则表达式.<br>
         * <br>
         * 规则说明：<br>
         * 0 1 2 3 4 5 6 7 8 9 a/A b/B c/C d/D e/E f/F
         * 
         * @since 1.0.0
         */
        public static final String HEX = "[a-fA-F0-9]+";

    }

    /**
     * 校验并断言表达式不为<code>false</code>.<br>
     * 如果为<code>false</code> 则抛出 异常
     *
     * @param expression
     *            待校验的表达式
     * @throws java.lang.IllegalArgumentException
     *             抛出参数不合法异常.
     * @author zhd
     * @since 1.0.0
     */
    public static void notFalse(boolean expression) {
        if (!expression) {
            throw new IllegalArgumentException();
        }
    }

    /**
     * 校验并断言表达式不为<code>false</code>.<br>
     * 如果为<code>false</code> 则抛出 异常
     *
     * @param expression
     *            待校验的表达式
     * @param errorMessage
     *            自定义校验失败的异常描述信息
     * @throws java.lang.IllegalArgumentException
     *             抛出参数不合法异常.
     * @author zhd
     * @since 1.0.0
     */
    public static void notFalse(boolean expression, Object errorMessage) {
        if (!expression) {
            throw new IllegalArgumentException(String.valueOf(errorMessage));
        }
    }

    /**
     * 校验并断言表达式不为<code>false</code>.<br>
     * 如果为<code>false</code> 则抛出 异常,
     * 且允许自定义错误描述信息模板.
     *
     * @param expression
     *            待校验的表达式
     * @param errorMessageTemplate
     *            自定义校验失败的异常描述信息模板
     * @param errorMessageArgs
     *            异常描述信息模板的参数
     * @throws java.lang.IllegalArgumentException
     *             抛出参数不合法异常.
     * @author zhd
     * @since 1.0.0
     */
    public static void notFalse(boolean expression, String errorMessageTemplate, Object... errorMessageArgs) {
        if (!expression) {
            throw new IllegalArgumentException(String.format(errorMessageTemplate, errorMessageArgs));
        }
    }

    /**
     * 校验并断言表达式为<code>false</code>.<br>
     * 如果不为<code>false</code> 则抛出 异常
     *
     * @param expression
     *            待校验的表达式
     * @param errorMessage
     *            自定义校验失败的异常描述信息
     * @throws java.lang.IllegalArgumentException
     *             抛出参数不合法异常.
     * @author zhd
     * @since 1.0.0
     */
    public static void isFalse(boolean expression, Object errorMessage) {
        if (expression) {
            throw new IllegalArgumentException(String.valueOf(errorMessage));
        }
    }

    /**

     * 校验并断言表达式为<code>false</code>.<br>
     * 如果不为<code>false</code> 则抛出 异常,

     * 且允许自定义错误描述信息模板.
     *
     * @param expression
     *            待校验的表达式
     * @param errorMessageTemplate
     *            自定义校验失败的异常描述信息模板
     * @param errorMessageArgs
     *            异常描述信息模板的参数
     * @throws java.lang.IllegalArgumentException
     *             抛出参数不合法异常.
     * @author zhd
     * @since 1.0.0
     */
    public static void isFalse(boolean expression, String errorMessageTemplate, Object... errorMessageArgs) {
        if (expression) {
            throw new IllegalArgumentException(String.format(errorMessageTemplate, errorMessageArgs));
        }
    }

    /**

     * 校验并断言表达式为<code>true</code>.<br>
     * 如果不为<code>true</code> 则抛出 异常

     *
     * @param expression
     *            待校验的表达式
     * @throws java.lang.IllegalArgumentException
     *             抛出参数不合法异常.
     * @author zhd
     * @since 1.0.0
     */
    public static void isTrue(boolean expression) {
        if (!expression) {
            throw new IllegalArgumentException();
        }
    }

    /**

     * 校验并断言表达式为<code>true</code>.<br>
     * 如果不为<code>true</code> 则抛出 异常

     *
     * @param expression
     *            待校验的表达式
     * @param errorMessage
     *            自定义校验失败的异常描述信息
     * @throws java.lang.IllegalArgumentException
     *             抛出参数不合法异常.
     * @author zhd
     * @since 1.0.0
     */
    public static void isTrue(boolean expression, Object errorMessage) {
        if (!expression) {
            throw new IllegalArgumentException(String.valueOf(errorMessage));
        }
    }

    /**

     * 校验并断言表达式为<code>true</code>.<br>
     * 如果不为<code>true</code> 则抛出 异常,

     * 且允许自定义错误描述信息模板.
     *
     * @param expression
     *            待校验的表达式
     * @param errorMessageTemplate
     *            自定义校验失败的异常描述信息模板
     * @param errorMessageArgs
     *            异常描述信息模板的参数
     * @throws java.lang.IllegalArgumentException
     *             抛出参数不合法异常.
     * @author zhd
     * @since 1.0.0
     */
    public static void isTrue(boolean expression, String errorMessageTemplate, Object... errorMessageArgs) {
        if (!expression) {
            throw new IllegalArgumentException(String.format(errorMessageTemplate, errorMessageArgs));
        }
    }

    /**

     * 校验并断言表达式不为<code>true</code>.<br>
     * 如果为<code>true</code> 则抛出 异常

     *
     * @param expression
     *            待校验的表达式
     * @throws java.lang.IllegalArgumentException
     *             抛出参数不合法异常.
     * @author zhd
     * @since 1.0.0
     */
    public static void notTrue(boolean expression) {
        if (expression) {
            throw new IllegalArgumentException();
        }
    }

    /**

     * 校验并断言表达式不为<code>true</code>.<br>
     * 如果为<code>true</code> 则抛出 异常

     *
     * @param expression
     *            待校验的表达式
     * @param errorMessage
     *            自定义校验失败的异常描述信息
     * @throws java.lang.IllegalArgumentException
     *             抛出参数不合法异常.
     * @author zhd
     * @since 1.0.0
     */
    public static void notTrue(boolean expression, Object errorMessage) {
        if (expression) {
            throw new IllegalArgumentException(String.valueOf(errorMessage));
        }
    }

    /**

     * 校验并断言表达式不为<code>true</code>.<br>
     * 如果为<code>true</code> 则抛出 异常,

     * 且允许自定义错误描述信息模板.
     *
     * @param expression
     *            待校验的表达式
     * @param errorMessageTemplate
     *            自定义校验失败的异常描述信息模板
     * @param errorMessageArgs
     *            异常描述信息模板的参数
     * @throws java.lang.IllegalArgumentException
     *             抛出参数不合法异常.
     * @author zhd
     * @since 1.0.0
     */
    public static void notTrue(boolean expression, String errorMessageTemplate, Object... errorMessageArgs) {
        if (expression) {
            throw new IllegalArgumentException(String.format(errorMessageTemplate, errorMessageArgs));
        }
    }

    /**

     * 校验并断言对象为<code>null</code>.<br>
     * 如果不为<code>null</code> 则抛出 异常

     *
     * @param reference
     *            待校验的对象
     * @param <T>
     *            校验的该对象
     * @throws java.lang.IllegalArgumentException
     *             抛出参数不合法异常.
     * @author zhd
     * @since 1.0.0
     */
    public static <T> void isNull(T reference) {
        if (reference != null) {
            throw new IllegalArgumentException();
        }
    }

    /**

     * 校验并断言对象为<code>null</code>.<br>
     * 如果不为<code>null</code> 则抛出 异常

     *
     * @param reference
     *            待校验的对象
     * @param errorMessage
     *            自定义校验失败的异常描述信息
     * @param <T>
     *            校验的该对象
     * @throws java.lang.IllegalArgumentException
     *             抛出参数不合法异常.
     * @author zhd
     * @since 1.0.0
     */
    public static <T> void isNull(T reference, Object errorMessage) {
        if (reference != null) {
            throw new IllegalArgumentException(String.valueOf(errorMessage));
        }
    }

    /**

     * 校验并断言对象为<code>null</code>.<br>
     * 如果不为<code>null</code> 则抛出 异常,

     * 且允许自定义错误描述信息模板.
     *
     * @param reference
     *            待校验的对象
     * @param errorMessageTemplate
     *            自定义校验失败的异常描述信息模板
     * @param errorMessageArgs
     *            异常描述信息模板的参数
     * @param <T>
     *            校验的该对象
     * @throws java.lang.IllegalArgumentException
     *             抛出参数不合法异常.
     * @author zhd
     * @since 1.0.0
     */
    public static <T> void isNull(T reference, String errorMessageTemplate, Object... errorMessageArgs) {
        if (reference != null) {
            throw new IllegalArgumentException(String.format(errorMessageTemplate, errorMessageArgs));
        }
    }

    /**
     * 校验并断言任意对象不是<code>null</code>. 如果是<code>null</code>,

     * 则抛出 异常

     *
     * @param reference
     *            待校验的对象
     * @return 校验后的该对象
     * @param <T>
     *            校验后的该对象
     * @throws java.lang.NullPointerException
     *             抛出空指针异常.
     * @author zhd
     * @since 1.0.0
     */
    public static <T> T notNull(T reference) {
        if (reference == null) {
            throw new NullPointerException();
        }
        return reference;
    }

    /**
     * 校验并断言任意对象不是<code>null</code>. 如果是<code>null</code>,

     * 则抛出 异常, 且允许自定义错误描述信息.

     *
     * @param reference
     *            待校验的对象
     * @param errorMessage
     *            自定义校验失败的异常描述信息
     * @return 校验后的该对象
     * @param <T>
     *            校验后的该对象
     * @throws java.lang.NullPointerException
     *             抛出空指针异常.
     * @author zhd
     * @since 1.0.0
     */
    public static <T> T notNull(T reference, Object errorMessage) {
        if (reference == null) {
            throw new NullPointerException(String.valueOf(errorMessage));
        }
        return reference;
    }

    /**
     * 校验并断言任意对象不是<code>null</code>. 如果是<code>null</code>,

     * 则抛出 异常, 且允许自定义错误描述信息模板.

     *
     * @param reference
     *            待校验的对象
     * @param errorMessageTemplate
     *            自定义校验失败的异常描述信息模板
     * @param errorMessageArgs
     *            异常描述信息模板的参数
     * @return 校验后的该对象
     * @param <T>
     *            校验后的该对象
     * @throws java.lang.NullPointerException
     *             抛出空指针异常.
     * @author zhd
     * @since 1.0.0
     */
    public static <T> T notNull(T reference, String errorMessageTemplate, Object... errorMessageArgs) {
        if (reference == null) {
            throw new NullPointerException(String.format(errorMessageTemplate, errorMessageArgs));
        }
        return reference;
    }

    /**
     * 校验并断言任意集合（如:List/Set）不是空. 如果是空,

     * 则抛出 异常

     *
     * @param collection
     *            待校验的集合（如:List/Set）
     * @return 校验后的该集合（如:List/Set）
     * @throws java.lang.IllegalArgumentException
     *             抛出参数不合法异常.
     * @author zhd
     * @since 1.0.0
     */
    public static Collection<?> notEmpty(Collection<?> collection) {
        if (isEmpty(collection)) {
            throw new IllegalArgumentException();
        }
        return collection;
    }

    /**
     * 校验并断言任意集合（如:List/Set）不是空. 如果是空,

     * 则抛出 异常, 且允许自定义错误描述信息.

     *
     * @param collection
     *            待校验的集合（如:List/Set）
     * @param errorMessage
     *            自定义校验失败的异常描述信息
     * @return 校验后的该集合（如:List/Set）
     * @throws java.lang.IllegalArgumentException
     *             抛出参数不合法异常.
     * @author zhd
     * @since 1.0.0
     */
    public static Collection<?> notEmpty(Collection<?> collection, Object errorMessage) {
        if (isEmpty(collection)) {
            throw new IllegalArgumentException(String.valueOf(errorMessage));
        }
        return collection;
    }

    /**
     * 校验并断言任意集合（如:List/Set）不是空. 如果是空,

     * 则抛出 异常, 且允许自定义错误描述信息.

     *
     * @param collection
     *            待校验的集合（如:List/Set）
     * @param errorMessageTemplate
     *            自定义校验失败的异常描述信息模板
     * @param errorMessageArgs
     *            异常描述信息模板的参数
     * @return 校验后的该集合（如:List/Set）
     * @throws java.lang.IllegalArgumentException
     *             抛出参数不合法异常.
     * @author zhd
     * @since 1.0.0
     */
    public static Collection<?> notEmpty(Collection<?> collection, String errorMessageTemplate,
            Object... errorMessageArgs) {
        if (isEmpty(collection)) {
            throw new IllegalArgumentException(String.format(errorMessageTemplate, errorMessageArgs));
        }
        return collection;
    }

    /**

     * 校验并断言任意Map不是空. 如果是空, 则抛出 异常

     *
     * @param map
     *            待校验的Map
     * @return 校验后的该Map
     * @throws java.lang.IllegalArgumentException
     *             抛出参数不合法异常.
     * @author zhd
     * @since 1.0.0
     */
    public static Map<?, ?> notEmpty(Map<?, ?> map) {
        if (isEmpty(map)) {
            throw new IllegalArgumentException();
        }
        return map;
    }

    /**

     * 校验并断言任意Map不是空. 如果是空, 则抛出 异常,

     * 且允许自定义错误描述信息.
     *
     * @param map
     *            待校验的Map
     * @param errorMessage
     *            自定义校验失败的异常描述信息
     * @return 校验后的该Map
     * @throws java.lang.IllegalArgumentException
     *             抛出参数不合法异常.
     * @author zhd
     * @since 1.0.0
     */
    public static Map<?, ?> notEmpty(Map<?, ?> map, Object errorMessage) {
        if (isEmpty(map)) {
            throw new IllegalArgumentException(String.valueOf(errorMessage));
        }
        return map;
    }

    /**

     * 校验并断言任意Map不是空. 如果是空, 则抛出 异常,

     * 且允许自定义错误描述信息.
     *
     * @param map
     *            待校验的Map
     * @param errorMessageTemplate
     *            自定义校验失败的异常描述信息模板
     * @param errorMessageArgs
     *            异常描述信息模板的参数
     * @return 校验后的该Map
     * @throws java.lang.IllegalArgumentException
     *             抛出参数不合法异常.
     * @author zhd
     * @since 1.0.0
     */
    public static Map<?, ?> notEmpty(Map<?, ?> map, String errorMessageTemplate, Object... errorMessageArgs) {
        if (isEmpty(map)) {
            throw new IllegalArgumentException(String.format(errorMessageTemplate, errorMessageArgs));
        }
        return map;
    }

    /**

     * 校验并断言任意对象数组不是空. 如果是空, 则抛出 异常

     *
     * @param arr
     *            待校验的对象数组
     * @return 校验后的该对象数组
     * @param <T>
     *            校验后的该对象数组
     * @throws java.lang.IllegalArgumentException
     *             抛出参数不合法异常.
     * @author zhd
     * @since 1.0.0
     */
    public static <T> T[] notEmpty(T[] arr) {
        if (isEmpty(arr)) {
            throw new IllegalArgumentException();
        }
        return arr;
    }

    /**

     * 校验并断言任意对象数组不是空. 如果是空, 则抛出 异常,

     * 且允许自定义错误描述信息.
     *
     * @param arr
     *            待校验的对象数组
     * @param errorMessage
     *            自定义校验失败的异常描述信息
     * @return 校验后的该对象数组
     * @param <T>
     *            校验后的该对象数组
     * @throws java.lang.IllegalArgumentException
     *             抛出参数不合法异常.
     * 
     * @author zhd
     * @since 1.0.0
     */
    public static <T> T[] notEmpty(T[] arr, Object errorMessage) {
        if (isEmpty(arr)) {
            throw new IllegalArgumentException(String.valueOf(errorMessage));
        }
        return arr;
    }

    /**

     * 校验并断言任意对象数组不是空. 如果是空, 则抛出 异常,

     * 且允许自定义错误描述信息.
     *
     * @param arr
     *            待校验的对象数组
     * @param errorMessageTemplate
     *            自定义校验失败的异常描述信息模板
     * @param errorMessageArgs
     *            异常描述信息模板的参数
     * @return 校验后的该对象数组
     * @param <T>
     *            校验后的该对象数组
     * @throws java.lang.IllegalArgumentException
     *             抛出参数不合法异常.
     * @author zhd
     * @since 1.0.0
     */
    public static <T> T[] notEmpty(T[] arr, String errorMessageTemplate, Object... errorMessageArgs) {
        if (isEmpty(arr)) {
            throw new IllegalArgumentException(String.format(errorMessageTemplate, errorMessageArgs));
        }
        return arr;
    }

    /**

     * 校验并断言字节型数组不是空. 如果是空, 则抛出 异常

     *
     * @param arr
     *            待校验的字节型数组
     * @return 校验后的该字节型数组
     * @throws java.lang.IllegalArgumentException
     *             抛出参数不合法异常.
     * @author zhd
     * @since 1.0.0
     */
    public static byte[] notEmpty(byte[] arr) {
        if (isEmpty(arr)) {
            throw new IllegalArgumentException();
        }
        return arr;
    }

    /**

     * 校验并断言字节型数组不是空. 如果是空, 则抛出 异常,

     * 且允许自定义错误描述信息.
     *
     * @param arr
     *            待校验的字节型数组
     * @param errorMessage
     *            自定义校验失败的异常描述信息
     * @return 校验后的该字节型数组
     * @throws java.lang.IllegalArgumentException
     *             抛出参数不合法异常.
     * 
     * @author zhd
     * @since 1.0.0
     */
    public static byte[] notEmpty(byte[] arr, Object errorMessage) {
        if (isEmpty(arr)) {
            throw new IllegalArgumentException(String.valueOf(errorMessage));
        }
        return arr;
    }

    /**

     * 校验并断言字节型数组不是空. 如果是空, 则抛出 异常,

     * 且允许自定义错误描述信息.
     *
     * @param arr
     *            待校验的字节型数组
     * @param errorMessageTemplate
     *            自定义校验失败的异常描述信息模板
     * @param errorMessageArgs
     *            异常描述信息模板的参数
     * @return 校验后的该字节型数组
     * @throws java.lang.IllegalArgumentException
     *             抛出参数不合法异常.
     * @author zhd
     * @since 1.0.0
     */
    public static byte[] notEmpty(byte[] arr, String errorMessageTemplate, Object... errorMessageArgs) {
        if (isEmpty(arr)) {
            throw new IllegalArgumentException(String.format(errorMessageTemplate, errorMessageArgs));
        }
        return arr;
    }

    /**

     * 校验并断言整数型数组不是空. 如果是空, 则抛出 异常

     *
     * @param arr
     *            待校验的整数型数组
     * @return 校验后的该整数型数组
     * @throws java.lang.IllegalArgumentException
     *             抛出参数不合法异常.
     * @author zhd
     * @since 1.0.0
     */
    public static int[] notEmpty(int[] arr) {
        if (isEmpty(arr)) {
            throw new IllegalArgumentException();
        }
        return arr;
    }

    /**

     * 校验并断言整数型数组不是空. 如果是空, 则抛出 异常,

     * 且允许自定义错误描述信息.
     *
     * @param arr
     *            待校验的整数型数组
     * @param errorMessage
     *            自定义校验失败的异常描述信息
     * @return 校验后的该整数型数组
     * @throws java.lang.IllegalArgumentException
     *             抛出参数不合法异常.
     * 
     * @author zhd
     * @since 1.0.0
     */
    public static int[] notEmpty(int[] arr, Object errorMessage) {
        if (isEmpty(arr)) {
            throw new IllegalArgumentException(String.valueOf(errorMessage));
        }
        return arr;
    }

    /**

     * 校验并断言整数型数组不是空. 如果是空, 则抛出 异常,

     * 且允许自定义错误描述信息.
     *
     * @param arr
     *            待校验的整数型数组
     * @param errorMessageTemplate
     *            自定义校验失败的异常描述信息模板
     * @param errorMessageArgs
     *            异常描述信息模板的参数
     * @return 校验后的该整数型数组
     * @throws java.lang.IllegalArgumentException
     *             抛出参数不合法异常.
     * @author zhd
     * @since 1.0.0
     */
    public static int[] notEmpty(int[] arr, String errorMessageTemplate, Object... errorMessageArgs) {
        if (isEmpty(arr)) {
            throw new IllegalArgumentException(String.format(errorMessageTemplate, errorMessageArgs));
        }
        return arr;
    }

    /**
     * 校验任意对象是否为<code>email</code>格式.
     *
     * @param reference
     *            待校验的对象
     * @return <code>true</code> 是<code>email</code>格式; <code>false</code>
     *         不是<code>email</code>格式
     * @param <T>
     *            校验结果
     * @author zhd
     * @since 1.0.0
     */
    public static <T> boolean isEmail(T reference) {
        return isEmail(reference, RegexType.EMAIL);
    }

    /**
     * 校验任意对象是否为邮箱( <code>email</code> )格式.
     *
     * @param reference
     *            待校验的对象
     * @param regex
     *            自定义正则表达式对<code>reference</code>进行校验.若为<code>null</code>,则使用默认正则表达式.
     * @return <code>true</code> 邮箱( <code>email</code> )格式; <code>false</code>
     *         不是邮箱( <code>email</code> )格式
     * @param <T>
     *            校验结果
     * @author zhd
     * @since 1.0.0
     */
    public static <T> boolean isEmail(T reference, String regex) {
        if (reference == null) {
            return false;
        }
        if (regex == null) {
            return isEmail(reference);
        }
        return match(regex, reference);
    }

    /**
     * 校验任意对象是否为手机( <code>cellphone</code> , 中国大陆及其港澳台)格式.
     *
     * @param reference
     *            待校验的对象
     * @return <code>true</code> 是手机( <code>cellphone</code> , 中国大陆及其港澳台)格式;
     *         <code>false</code> 不是手机( <code>cellphone</code> , 中国大陆及其港澳台)格式
     * @param <T>
     *            校验结果
     * @author zhd
     * @since 1.0.0
     */
    public static <T> boolean isChinaCellphone(T reference) {
        return isChinaCellphone(reference, RegexType.CHINA_CELLPHONE);
    }

    /**
     * 校验任意对象是否为手机( <code>cellphone</code> , 中国大陆及其港澳台)格式.
     *
     * @param reference
     *            待校验的对象
     * @param regex
     *            自定义正则表达式对<code>reference</code>进行校验.若为<code>null</code>,则使用默认正则表达式.
     * @return <code>true</code> 手机( <code>cellphone</code> , 中国大陆及其港澳台)格式;
     *         <code>false</code> 不是手机( <code>cellphone</code> , 中国大陆及其港澳台)格式
     * @param <T>
     *            校验结果
     * @author zhd
     * @since 1.0.0
     */
    public static <T> boolean isChinaCellphone(T reference, String regex) {
        if (reference == null) {
            return false;
        }
        if (regex == null) {
            return isChinaCellphone(reference);
        }
        return match(regex, reference);
    }

    /**
     * 校验任意对象是否为整数(正负整数和0)数字( <code>number</code> )格式.
     *
     * @param reference
     *            待校验的对象
     * @return <code>true</code> 整数(正负整数和0)数字( <code>number</code> )格式;
     *         <code>false</code> 不是整数(正负整数和0)数字( <code>number</code> )格式
     * @param <T>
     *            校验结果
     * @author zhd
     * @since 1.0.0
     */
    public static <T> boolean isIntegerNumber(T reference) {
        return isIntegerNumber(reference, RegexType.INTEGER_NUMBER);
    }

    /**
     * 校验任意对象是否为整数(正负整数和0)数字( <code>number</code> )格式.
     *
     * @param reference
     *            待校验的对象
     * @param regex
     *            自定义正则表达式对<code>reference</code>进行校验.若为<code>null</code>,则使用默认正则表达式.
     * @return <code>true</code> 整数(正负整数和0)数字( <code>number</code> )格式;
     *         <code>false</code> 不是整数(正负整数和0)数字( <code>number</code> )格式
     * @param <T>
     *            校验结果
     * @author zhd
     * @since 1.0.0
     */
    public static <T> boolean isIntegerNumber(T reference, String regex) {
        if (reference == null) {
            return false;
        }
        if (regex == null) {
            return isIntegerNumber(reference);
        }
        return match(regex, reference);
    }

    /**
     * 校验字符串是否为空.
     * 
     * <pre>
     * ""    true
     * null  true
     * " "   false
     * </pre>
     *
     * @param string
     *            任意字符序列
     * @return <code>true</code> 是空字符串; <code>false</code> 不是空字符串
     * @author zhd
     * @since 1.0.0
     */
    public static boolean isEmpty(CharSequence string) {
        return string == null || string.length() <= 0;
    }

    /**
     * 校验Map是否为空.
     * 
     * <pre>
     * null  true
     * {}    true
     * </pre>
     *
     * @param map
     *            任意Map
     * @return <code>true</code> 是空Map; <code>false</code> 不是空Map
     * @author zhd
     * @since 1.0.0
     */
    public static boolean isEmpty(Map<?, ?> map) {
        return map == null || map.isEmpty();
    }

    /**
     * 校验集合（如:List/Set）是否为空.
     * 
     * <pre>
     * null  true
     * []    true
     * </pre>
     *
     * @param collection
     *            任意集合（如:List/Set）
     * @return <code>true</code> 是空集合（如:List/Set）; <code>false</code>
     *         不是空集合（如:List/Set）
     * @author zhd
     * @since 1.0.0
     */
    public static boolean isEmpty(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    /**
     * 校验任意对象数组是否为空.
     * 
     * <pre>
     * null  true
     * []    true
     * </pre>
     *
     * @param arr
     *            任意对象数组

     * @param <T> 泛型调用

     * @return <code>true</code> 是空对象数组; <code>false</code> 不是空对象数组
     * @author zhd
     * @since 1.0.0
     */
    public static <T> boolean isEmpty(T[] arr) {
        return arr == null || arr.length <= 0;
    }

    /**
     * 校验原始整型数组是否为空.
     * 
     * <pre>
     * null  true
     * []    true
     * </pre>
     *
     * @param arr
     *            原始整型数组
     * @return <code>true</code> 是空原始整型数组; <code>false</code> 不是空原始整型数组
     * @author zhd
     * @since 1.0.0
     */
    public static boolean isEmpty(int[] arr) {
        return arr == null || arr.length <= 0;
    }

    /**
     * 校验原始长整型数组是否为空.
     * 
     * <pre>
     * null  true
     * []    true
     * </pre>
     *
     * @param arr
     *            原始长整型数组
     * @return <code>true</code> 是空原始长整型数组; <code>false</code> 不是空原始长整型数组
     * @author zhd
     * @since 1.0.0
     */
    public static boolean isEmpty(long[] arr) {
        return arr == null || arr.length <= 0;
    }

    /**
     * 校验原始单精度浮点型数组是否为空.
     * 
     * <pre>
     * null  true
     * []    true
     * </pre>
     *
     * @param arr
     *            原始单精度浮点型数组
     * @return <code>true</code> 是空原始单精度浮点型数组; <code>false</code> 不是空原始单精度浮点型数组
     * @author zhd
     * @since 1.0.0
     */
    public static boolean isEmpty(float[] arr) {
        return arr == null || arr.length <= 0;
    }

    /**
     * 校验原始双精度浮点型数组是否为空.
     * 
     * <pre>
     * null  true
     * []    true
     * </pre>
     *
     * @param arr
     *            原始双精度浮点型数组
     * @return <code>true</code> 是空原始双精度浮点型数组; <code>false</code> 不是空原始双精度浮点型数组
     * @author zhd
     * @since 1.0.0
     */
    public static boolean isEmpty(double[] arr) {
        return arr == null || arr.length <= 0;
    }

    /**
     * 校验原始短整型数组是否为空.
     * 
     * <pre>
     * null  true
     * []    true
     * </pre>
     *
     * @param arr
     *            原始短整型数组
     * @return <code>true</code> 是空原始短整型数组; <code>false</code> 不是空原始短整型数组
     * @author zhd
     * @since 1.0.0
     */
    public static boolean isEmpty(short[] arr) {
        return arr == null || arr.length <= 0;
    }

    /**
     * 校验原始boolean型数组是否为空.
     * 
     * <pre>
     * null  true
     * []    true
     * </pre>
     *
     * @param arr
     *            原始boolean型数组
     * @return <code>true</code> 是空原始boolean型数组; <code>false</code>
     *         不是空原始boolean型数组
     * @author zhd
     * @since 1.0.0
     */
    public static boolean isEmpty(boolean[] arr) {
        return arr == null || arr.length <= 0;
    }

    /**
     * 校验原始字节型数组是否为空.
     * 
     * <pre>
     * null  true
     * []    true
     * </pre>
     *
     * @param arr
     *            原始字节型数组
     * @return <code>true</code> 是空原始字节型数组; <code>false</code> 不是空原始字节型数组
     * @author zhd
     * @since 1.0.0
     */
    public static boolean isEmpty(byte[] arr) {
        return arr == null || arr.length <= 0;
    }

    /**
     * 校验原始字符型数组是否为空.
     * 
     * <pre>
     * null  true
     * []    true
     * </pre>
     *
     * @param arr
     *            原始字符型数组
     * @return <code>true</code> 是空原始字符型数组; <code>false</code> 不是空原始字符型数组
     * @author zhd
     * @since 1.0.0
     */
    public static boolean isEmpty(char[] arr) {
        return arr == null || arr.length <= 0;
    }

    /**
     * 校验任意对象是否为( <code>IP</code> )地址(支持IPv4/IPv6)格式.
     *
     * @param reference
     *            待校验的对象
     * @return <code>true</code> 是<code>IP</code> 地址(支持IPv4/IPv6)格式;
     *         <code>false</code> 不是<code>IP</code> 地址(支持IPv4/IPv6)格式
     * @param <T>
     *            校验结果
     * @author zhd
     * @since 1.0.0
     */
    public static <T> boolean isIP(T reference) {
        return isIPv4(reference) || isIPv6(reference);
    }

    /**
     * 校验任意对象是否为( <code>IP</code> )地址(支持IPv4/IPv6)格式.
     *
     * @param reference
     *            待校验的对象
     * @param regex
     *            自定义正则表达式对<code>reference</code>进行校验.若为<code>null</code>,则使用默认正则表达式.
     * @return <code>true</code> 是<code>IP</code> 地址(支持IPv4/IPv6)格式;
     *         <code>false</code> 不是<code>IP</code> 地址(支持IPv4/IPv6)格式
     * @param <T>
     *            校验结果
     * @author zhd
     * @since 1.0.0
     */
    public static <T> boolean isIP(T reference, String regex) {
        return isIPv4(reference, regex) || isIPv6(reference, regex);
    }

    /**
     * 校验任意对象是否为( <code>IPv4</code> )地址格式.
     *
     * @param reference
     *            待校验的对象
     * @return <code>true</code> 是<code>IPv4</code> 地址格式; <code>false</code>
     *         不是<code>IPv4</code> 地址格式
     * @param <T>
     *            校验结果
     * @author zhd
     * @since 1.0.0
     */
    public static <T> boolean isIPv4(T reference) {
        return isIPv4(reference, RegexType.IPV4);
    }

    /**
     * 校验任意对象是否为( <code>IPv4</code> )地址格式.
     *
     * @param reference
     *            待校验的对象
     * @param regex
     *            自定义正则表达式对<code>reference</code>进行校验.若为<code>null</code>,则使用默认正则表达式.
     * @return <code>true</code> 是<code>IPv4</code> 地址格式; <code>false</code>
     *         不是<code>IPv4</code> 地址格式
     * @param <T>
     *            校验结果
     * @author zhd
     * @since 1.0.0
     */
    public static <T> boolean isIPv4(T reference, String regex) {
        if (reference == null) {
            return false;
        }
        if (regex == null) {
            return isIPv4(reference);
        }
        return match(regex, reference);
    }

    /**
     * 校验任意对象是否为( <code>IPv6</code> )地址格式.
     *
     * @param reference
     *            待校验的对象
     * @return <code>true</code> 是<code>IPv6</code> 地址格式; <code>false</code>
     *         不是<code>IPv6</code> 地址格式
     * @param <T>
     *            校验结果
     * @author zhd
     * @since 1.0.0
     */
    public static <T> boolean isIPv6(T reference) {
        return isIPv6(reference, RegexType.IPV6_STD) || isIPv6(reference, RegexType.IPV6_HEX_COMPRESSED);
    }

    /**
     * 校验任意对象是否为( <code>IPv6</code> )地址格式.
     *
     * @param reference
     *            待校验的对象
     * @param regex
     *            自定义正则表达式对<code>reference</code>进行校验.若为<code>null</code>,则使用默认正则表达式.
     * @return <code>true</code> 是<code>IPv6</code> 地址格式; <code>false</code>
     *         不是<code>IPv6</code> 地址格式
     * @param <T>
     *            校验结果
     * @author zhd
     * @since 1.0.0
     */
    public static <T> boolean isIPv6(T reference, String regex) {
        if (reference == null) {
            return false;
        }
        if (regex == null) {
            return isIPv6(reference);
        }
        return match(regex, reference);
    }

    /**

     * 校验任意对象是否为通用身份证( <code>ID Card</code> )格式.<br>
     * <br>

     * 注: 此检查不够严格，只要包含至少6位的字母与数字组合均可通过.
     *
     * @param reference
     *            待校验的对象
     * @return <code>true</code> 是通用身份证( <code>ID Card</code> )格式;
     *         <code>false</code> 不是通用身份证( <code>ID Card</code> )格式
     * @param <T>
     *            校验结果
     * @author zhd
     * @since 1.0.0
     */
    public static <T> boolean isCommonIDcard(T reference) {
        return isCommonIDcard(reference, RegexType.COMMON_ID_CARD);
    }

    /**

     * 校验任意对象是否为通用身份证( <code>ID Card</code> )格式.<br>
     * <br>

     * 注: 此检查不够严格，只要包含至少6位的字母与数字组合均可通过.
     *
     * @param reference
     *            待校验的对象
     * @param regex
     *            自定义正则表达式对<code>reference</code>进行校验.若为<code>null</code>,则使用默认正则表达式.
     * @return <code>true</code> 是通用身份证( <code>ID Card</code> )格式;
     *         <code>false</code> 不是通用身份证( <code>ID Card</code> )格式
     * @param <T>
     *            校验结果
     * @author zhd
     * @since 1.0.0
     */
    public static <T> boolean isCommonIDcard(T reference, String regex) {
        if (reference == null) {
            return false;
        }
        if (regex == null) {
            return isCommonIDcard(reference);
        }
        return match(regex, reference);
    }

    /**

     * 校验任意对象是否为中国（含港澳台）身份证( <code>ID Card</code> )格式.<br>
     * <br>

     * 注: 此检查较为严格，但只保证中国（含港澳台）身份证( <code>ID Card</code>
     * )格式符合身份证编码规则，不能确定身份证本身是否有效.
     *
     * @param reference
     *            待校验的对象
     * @return <code>true</code> 是中国（含港澳台）身份证( <code>ID Card</code> )格式;
     *         <code>false</code> 不是中国（含港澳台）身份证( <code>ID Card</code> )格式
     * @param <T>
     *            校验结果
     * @author zhd
     * @since 1.0.0
     */
    public static <T> boolean isChinaIDcard(T reference) {
        return isChinaIDcard(reference, RegexType.CHINA_MAINLAND_ID_CARD_18)
                || isChinaIDcard(reference, RegexType.CHINA_MAINLAND_ID_CARD_15)
                || isChinaIDcard(reference, RegexType.CHINA_HK_ID_CARD)
                || isChinaIDcard(reference, RegexType.CHINA_MO_ID_CARD)
                || isChinaIDcard(reference, RegexType.CHINA_TW_ID_CARD);
    }

    /**

     * 校验任意对象是否为中国（含港澳台）身份证( <code>ID Card</code> )格式.<br>
     * <br>

     * 注: 此检查较为严格，但只保证中国（含港澳台）身份证( <code>ID Card</code>
     * )格式符合身份证编码规则，不能确定身份证本身是否有效.
     *
     * @param reference
     *            待校验的对象
     * @param regex
     *            自定义正则表达式对<code>reference</code>进行校验.若为<code>null</code>,则使用默认正则表达式.
     * @return <code>true</code> 是中国（含港澳台）身份证( <code>ID Card</code> )格式;
     *         <code>false</code> 不是中国（含港澳台）身份证( <code>ID Card</code> )格式
     * @param <T>
     *            校验结果
     * @author zhd
     * @since 1.0.0
     */
    public static <T> boolean isChinaIDcard(T reference, String regex) {
        if (reference == null) {
            return false;
        }
        if (regex == null) {
            return isChinaIDcard(reference);
        }
        return match(regex, reference);
    }

    /**

     * 校验任意对象是否为密码格式.<br>
     * 使用默认规则： 
     *
     * @param reference
     *            待校验的对象
     * @return <code>true</code> 是密码格式;
     *         <code>false</code> 不是密码格式

     * @param <T>
     *            校验结果
     * @author zhd
     * @since 1.0.0
     */
    public static <T> boolean isPassword(T reference) {
        return isPassword(reference, RegexType.PASSWORD);
    }

    /**

     * 校验任意对象是否为密码格式.<br>
     * 使用默认规则： 

     *
     * @param reference
     *            待校验的对象
     * @param minLen
     *            自定义允许的最小长度(包含).

     * @return <code>true</code> 是密码格式;
     *         <code>false</code> 不是密码格式

     * @param <T>
     *            校验结果
     * @author zhd
     * @since 1.0.0
     */
    public static <T> boolean isPassword(T reference, int minLen) {
        return isPassword(reference, RegexType.PASSWORD_BASE + String.format(RegexType.PASSWORD_LEN_TEMP, minLen, 50));
    }

    /**

     * 校验任意对象是否为密码格式.<br>
     * 使用默认规则： 

     *
     * @param reference
     *            待校验的对象
     * @param minLen
     *            自定义允许的最小长度(包含).
     * @param maxLen
     *            自定义允许的最大长度(包含).

     * @return <code>true</code> 是密码格式;
     *         <code>false</code> 不是密码格式

     * @param <T>
     *            校验结果
     * @author zhd
     * @since 1.0.0
     */
    public static <T> boolean isPassword(T reference, int minLen, int maxLen) {
        return isPassword(reference,
                RegexType.PASSWORD_BASE + String.format(RegexType.PASSWORD_LEN_TEMP, minLen, maxLen));
    }

    /**

     * 校验任意对象是否为密码格式.

     *
     * @param reference
     *            待校验的对象
     * @param regex
     *            自定义正则表达式对<code>reference</code>进行校验.若为<code>null</code>,则使用默认正则表达式.

     * @return <code>true</code> 是密码格式;
     *         <code>false</code> 不是密码格式

     * @param <T>
     *            校验结果
     * @author zhd
     * @since 1.0.0
     */
    public static <T> boolean isPassword(T reference, String regex) {
        if (reference == null) {
            return false;
        }
        if (regex == null) {
            return isPassword(reference);
        }
        return match(regex, reference);
    }

    /**
     * 校验任意对象是否为( <code>URL</code> )地址格式.
     *
     * @param reference
     *            待校验的对象
     * @return <code>true</code> 是( <code>URL</code> )地址格式; <code>false</code>
     *         不是( <code>URL</code> )地址格式
     * @param <T>
     *            校验结果
     * @author zhd
     * @since 1.0.0
     */
    public static <T> boolean isUrl(T reference) {
        return isUrl(reference, RegexType.URL);
    }

    /**

     * 校验任意对象是否为( <code>URL</code> )地址格式.<br>
     * 使用默认规则： 

     *
     * @param reference
     *            待校验的对象
     * @param regex
     *            自定义正则表达式对<code>reference</code>进行校验.若为<code>null</code>,则使用默认正则表达式.
     * @return <code>true</code> 是( <code>URL</code> )地址格式; <code>false</code>
     *         不是( <code>URL</code> )地址格式
     * @param <T>
     *            校验结果
     * @author zhd
     * @since 1.0.0
     */
    public static <T> boolean isUrl(T reference, String regex) {
        if (reference == null) {
            return false;
        }
        if (regex == null) {
            return isUrl(reference);
        }
        return match(regex, reference);
    }

    /**
     * 校验任意对象是否为( <code>MD5</code> )16进制表示的格式.
     *
     * @param reference
     *            待校验的对象
     * @return <code>true</code> 是( <code>MD5</code> )16进制表示的格式;
     *         <code>false</code> 不是( <code>MD5</code> )16进制表示的格式
     * @param <T>
     *            校验结果
     * @author zhd
     * @since 1.0.0
     */
    public static <T> boolean isMd5(T reference) {
        return isMd5(reference, RegexType.MD5);
    }

    /**

     * 校验任意对象是否为( <code>MD5</code> )16进制表示的格式.<br>
     * 使用默认规则： 

     *
     * @param reference
     *            待校验的对象
     * @param regex
     *            自定义正则表达式对<code>reference</code>进行校验.若为<code>null</code>,则使用默认正则表达式.
     * @return <code>true</code> 是( <code>MD5</code> )16进制表示的格式;
     *         <code>false</code> 不是( <code>MD5</code> )16进制表示的格式
     * @param <T>
     *            校验结果
     * @author zhd
     * @since 1.0.0
     */
    public static <T> boolean isMd5(T reference, String regex) {
        if (reference == null) {
            return false;
        }
        if (regex == null) {
            return isMd5(reference);
        }
        return match(regex, reference);
    }

    /**

     * 校验任意对象是否为( <code>SHA1</code> )16进制表示的格式.<br>
     * 使用默认规则： 

     *
     * @param reference
     *            待校验的对象
     * @return <code>true</code> 是( <code>SHA1</code> )16进制表示的格式;
     *         <code>false</code> 不是( <code>SHA1</code> )16进制表示的格式
     * @param <T>
     *            校验结果
     * @author zhd
     * @since 1.0.0
     */
    public static <T> boolean isSha1(T reference) {
        return isSha1(reference, RegexType.SHA1);
    }

    /**

     * 校验任意对象是否为( <code>SHA1</code> )16进制表示的格式.<br>
     * 使用默认规则： 

     *
     * @param reference
     *            待校验的对象
     * @param regex
     *            自定义正则表达式对<code>reference</code>进行校验.若为<code>null</code>,则使用默认正则表达式.
     * @return <code>true</code> 是( <code>SHA1</code> )16进制表示的格式;
     *         <code>false</code> 不是( <code>SHA1</code> )16进制表示的格式
     * @param <T>
     *            校验结果
     * @author zhd
     * @since 1.0.0
     */
    public static <T> boolean isSha1(T reference, String regex) {
        if (reference == null) {
            return false;
        }
        if (regex == null) {
            return isSha1(reference);
        }
        return match(regex, reference);
    }

    /**

     * 校验任意对象是否为( <code>WSID</code> )表示的格式.<br>
     * 使用默认规则： 

     *
     * @param reference
     *            待校验的对象
     * @return <code>true</code> 是( <code>WSID</code> )表示的格式; <code>false</code>
     *         不是( <code>WSID</code> )表示的格式
     * @param <T>
     *            校验结果
     * @author zhd
     * @since 1.0.0
     */
    public static <T> boolean isWsid(T reference) {
        return isWsid(reference, RegexType.WSID);
    }

    /**

     * 校验任意对象是否为( <code>WSID</code> )表示的格式.<br>
     * 使用默认规则： 

     *
     * @param reference
     *            待校验的对象
     * @param regex
     *            自定义正则表达式对<code>reference</code>进行校验.若为<code>null</code>,则使用默认正则表达式.
     * @return <code>true</code> 是( <code>WSID</code> )表示的格式; <code>false</code>
     *         不是( <code>WSID</code> )表示的格式
     * @param <T>
     *            校验结果
     * @author zhd
     * @since 1.0.0
     */
    public static <T> boolean isWsid(T reference, String regex) {
        if (reference == null) {
            return false;
        }
        if (regex == null) {
            return isWsid(reference);
        }
        return match(regex, reference);
    }

    /**

     * 校验任意对象是否为( <code>BASE64</code> )表示的格式.<br>
     * 使用默认规则： 

     *
     * @param reference
     *            待校验的对象
     * @return <code>true</code> 是( <code>BASE64</code> )表示的格式;
     *         <code>false</code> 不是( <code>BASE64</code> )表示的格式
     * @param <T>
     *            校验结果
     * @author zhd
     * @since 1.0.0
     */
    public static <T> boolean isBase64(T reference) {
        return isBase64(reference, RegexType.BASE64);
    }

    /**

     * 校验任意对象是否为( <code>BASE64</code> )表示的格式.<br>
     * 使用默认规则： 

     *
     * @param reference
     *            待校验的对象
     * @param regex
     *            自定义正则表达式对<code>reference</code>进行校验.若为<code>null</code>,则使用默认正则表达式.
     * @return <code>true</code> 是( <code>BASE64</code> )表示的格式;
     *         <code>false</code> 不是( <code>BASE64</code> )表示的格式
     * @param <T>
     *            校验结果
     * @author zhd
     * @since 1.0.0
     */
    public static <T> boolean isBase64(T reference, String regex) {
        if (reference == null) {
            return false;
        }
        if (regex == null) {
            return isBase64(reference);
        }
        return match(regex, reference);
    }

    /**

     * 校验任意对象是否为( <code>HEX</code> )16进制表示的格式.<br>
     * 使用默认规则： 

     *
     * @param reference
     *            待校验的对象
     * @return <code>true</code> 是( <code>HEX</code> )16进制表示的格式;
     *         <code>false</code> 不是( <code>HEX</code> )16进制表示的格式
     * @param <T>
     *            校验结果
     * @author zhd
     * @since 1.0.0
     */
    public static <T> boolean isHex(T reference) {
        return isHex(reference, RegexType.HEX);
    }

    /**

     * 校验任意对象是否为( <code>HEX</code> )16进制表示的格式.<br>
     * 使用默认规则： 

     *
     * @param reference
     *            待校验的对象
     * @param regex
     *            自定义正则表达式对<code>reference</code>进行校验.若为<code>null</code>,则使用默认正则表达式.
     * @return <code>true</code> 是( <code>HEX</code> )16进制表示的格式;
     *         <code>false</code> 不是( <code>HEX</code> )16进制表示的格式
     * @param <T>
     *            校验结果
     * @author zhd
     * @since 1.0.0
     */
    public static <T> boolean isHex(T reference, String regex) {
        if (reference == null) {
            return false;
        }
        if (regex == null) {
            return isHex(reference);
        }
        return match(regex, reference);
    }

    private static <T> boolean match(String regex, T reference) {
        String input = null;
        if (regex == null || reference == null) {
            return false;
        }
        if (reference instanceof String) {
            input = (String) reference;
        } else if (reference instanceof byte[]) {
            input = new String((byte[]) reference);
        } else {
            input = String.valueOf(reference);
        }
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        return matcher.lookingAt();
    }
}
