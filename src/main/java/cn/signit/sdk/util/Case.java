package cn.signit.sdk.util;

import java.util.regex.Pattern;

import cn.signit.sdk.type.NamingStyle;

/**
 * 
 * @since 1.0.2
 */
public final class Case {
    private static final char SEPARATOR_UNDER_LINE = '_';
    private static final char SEPARATOR_HYPHEN_LINE = '-';

    private Case() {
    }

    /**
     * 下划线命名风格字符串
     * 
     * @param str
     *            待转换字符串
     * @return 下划线风格字符串
     * @author Zhanghongdong
     */
    public static String toUnderline(String str) {
        if (str == null) {
            return null;
        }
        if (str.isEmpty()) {
            return str;
        }
        // 本身下划线
        if (str.indexOf(SEPARATOR_UNDER_LINE) >= 0) {
            return str.toLowerCase();
        }
        // 本身连词符
        if (str.indexOf(SEPARATOR_HYPHEN_LINE) >= 0) {
            return str.replace(SEPARATOR_HYPHEN_LINE, SEPARATOR_UNDER_LINE)
                    .toLowerCase();
        }
        StringBuilder sb = new StringBuilder();
        boolean upperCase = false;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            boolean nextUpperCase = true;

            if (i < (str.length() - 1)) {
                nextUpperCase = Character.isUpperCase(str.charAt(i + 1));
            }

            if ((i >= 0) && Character.isUpperCase(c)) {
                if (!upperCase || !nextUpperCase) {
                    if (i > 0) {
                        sb.append(SEPARATOR_UNDER_LINE);
                    }
                }
                upperCase = true;
            } else {
                upperCase = false;
            }

            sb.append(Character.toLowerCase(c));
        }

        return sb.toString();
    }

    /**
     * 下划线命名风格字符串
     * 
     * @param str
     *            待转换字符串
     * @return 下划线风格字符串
     * @author Zhanghongdong
     */
    public static String toUnix(String str) {
        return toUnderline(str);
    }

    /**
     * 蛇型命名风格字符串
     * 
     * @param str
     *            待转换字符串
     * @return 蛇型命名风格字符串
     * @author Zhanghongdong
     */
    public static String toSnake(String str) {
        return toUnderline(str);
    }

    /**
     * 小驼峰命名风格字符串
     * 
     * @param str
     *            待转换字符串
     * @return 小驼峰风格字符串
     * @author Zhanghongdong
     */
    public static String toLowerCamel(String str) {
        String s = str;
        if (s == null) {
            return null;
        }
        if (str.isEmpty()) {
            return str;
        }
        // 无下划线或连词符
        if (s.indexOf(SEPARATOR_UNDER_LINE) < 0 && s.indexOf(SEPARATOR_HYPHEN_LINE) < 0) {
            if (Character.isLowerCase(s.charAt(0))) {
                return s;
            } else if (Pattern.matches("^[A-Z]{2,}", s)) {
                s = s.toLowerCase();
            }
            return s.substring(0, 1)
                    .toLowerCase() + s.substring(1);

        }
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder(s.length());
        boolean upperCase = false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == SEPARATOR_UNDER_LINE || c == SEPARATOR_HYPHEN_LINE) {
                upperCase = true;
            } else if (upperCase) {
                sb.append(Character.toUpperCase(c));
                upperCase = false;
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    /**
     * 大驼峰命名风格字符串
     * 
     * @param str
     *            待转换字符串
     * @return 大驼峰风格字符串
     * @author Zhanghongdong
     */
    public static String toCapitalizeCamel(String str) {
        String s = str;
        if (s == null) {
            return null;
        }
        if (str.isEmpty()) {
            return str;
        }
        if (s.indexOf(SEPARATOR_UNDER_LINE) < 0 && s.indexOf(SEPARATOR_HYPHEN_LINE) < 0) {
            if (Character.isUpperCase(s.charAt(0))) {
                return s;
            } else {
                return s.substring(0, 1)
                        .toUpperCase() + s.substring(1);
            }
        }
        s = toLowerCamel(s);
        return s.substring(0, 1)
                .toUpperCase() + s.substring(1);
    }

    /**
     * 大驼峰命名风格字符串
     * 
     * @param str
     *            待转换字符串
     * @return 大驼峰风格字符串
     * @author Zhanghongdong
     */
    public static String toUpperCamel(String str) {
        return toCapitalizeCamel(str);
    }

    /**
     * 帕斯卡命名风格字符串
     * 
     * @param str
     *            待转换字符串
     * @return 帕斯卡风格字符串
     * @author Zhanghongdong
     */
    public static String toPascal(String str) {
        return toCapitalizeCamel(str);
    }

    /**
     * 连词符命名风格字符串
     * 
     * @param str
     *            待转换字符串
     * @return 连词符命名风格字符串
     * @author Zhanghongdong
     */
    public static String toKebab(String str) {
        return toHyphenLine(str);
    }

    /**
     * 连词符命名风格字符串
     * 
     * @param str
     *            待转换字符串
     * @return 连词符命名风格字符串
     * @author Zhanghongdong
     */
    public static String toHyphenLine(String str) {
        if (str == null) {
            return null;
        }
        if (str.isEmpty()) {
            return str;
        }
        // 本身连词符
        if (str.indexOf(SEPARATOR_HYPHEN_LINE) >= 0) {
            return str.toLowerCase();
        }
        // 本身下划线
        if (str.indexOf(SEPARATOR_UNDER_LINE) >= 0) {
            return str.replace(SEPARATOR_UNDER_LINE, SEPARATOR_HYPHEN_LINE)
                    .toLowerCase();
        }
        StringBuilder sb = new StringBuilder();
        boolean upperCase = false;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            boolean nextUpperCase = true;
            if (i < (str.length() - 1)) {
                nextUpperCase = Character.isUpperCase(str.charAt(i + 1));
            }
            if ((i >= 0) && Character.isUpperCase(c)) {
                if (!upperCase || !nextUpperCase) {
                    if (i > 0) {
                        sb.append(SEPARATOR_HYPHEN_LINE);
                    }
                }
                upperCase = true;
            } else {
                upperCase = false;
            }
            sb.append(Character.toLowerCase(c));
        }
        return sb.toString();
    }

    /**
     * 指定具体命名风格来生成相应命名风格的字符串.
     *
     * @param str
     *            待转换字符串. 若为null，则返回null.
     * @param namingStyle
     *            命名风格的枚举. 若namingStyle为null，CAMEL
     * @return namingStyle命名风格的字符串
     * @author zhd
     * @since 1.0.0
     */
    public static String to(String str, NamingStyle namingStyle) {
        NamingStyle ns = namingStyle;
        if (str == null) {
            return null;
        }
        if (ns == null) {
            ns = NamingStyle.CAMEL;
        }
        String formatStr;
        switch (ns) {
        case CAMEL:
            formatStr = toLowerCamel(str);
            break;
        case SNAKE:
            formatStr = toSnake(str);
            break;
        case PASCAL:
            formatStr = toPascal(str);
            break;
        case KEBAB:
            formatStr = toKebab(str);
            break;
        default:
            formatStr = toLowerCamel(str);
            break;
        }
        return formatStr;
    }
}