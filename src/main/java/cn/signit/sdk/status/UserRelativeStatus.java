/*
 * Copyright © 2022 signit.cn. All rights reserved.
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
package cn.signit.sdk.status;

/**
* 描述： 相对方账号状态
* @author xiazhitao
* @since 1.0.0
*/
public enum UserRelativeStatus {

    UNKNOWN(-1, "未知类型"),
    AVAILABLE(0, "可用"),
    FROZEN(1, "冻结"),
    CANCELLATION(2, "注销"),
    DISABLE(3, "禁用"),;
    private Integer code;
    private String description;

    private UserRelativeStatus(Integer code, String description) {
        this.code = code;
        this.description = description;
    }

    /**
     * 根据枚举code获取枚举类型.
     *
     * @param code
     *            枚举整型code
     * @return 枚举具体类型
     * @author xiazhitao
     */
    public static UserRelativeStatus parse(Integer code) {
        if (code == null) {
            return UserRelativeStatus.UNKNOWN;
        }
        for (UserRelativeStatus formType : values()) {
            if (formType.getCode().intValue() == code.intValue()) {
                return formType;
            }
        }
        return UserRelativeStatus.UNKNOWN;
    }

    /**
     * 转换字符串中(比如：filters)包含的枚举英文为code.
     *
     * @param str
     *            需要转化的字符串
     * @return 转换完成的字符串
     * @author xiazhitao
     */
    public static String transferFilters(String str) {
        if (str == null) {
            return null;
        }
        String result = str;
        for (UserRelativeStatus val : values()) {
            if (result.contains("=" + val.toString())) {
                result = result.replace("=" + val.toString(), "=" + val.getCode());
            }
        }
        return result;
    }

    /**
     * 判断是否是当前枚举.
     *
     * @param code
     *            类型码
     * @return true 是当前枚举；false 不是当前枚举
     * @author xiazhitao
     */
    public boolean is(int code) {
        return this.getCode() == code;
    }

    /**
     * 获取code属性字段的值.
     *
     * @return 类型为Integer的code属性字段的值.
     */
    public Integer getCode() {
        return code;
    }

    /**
     * 获取description属性字段的值.
     *
     * @return 类型为String的description属性字段的值.
     */
    public String getDescription() {
        return description;
    }

}
