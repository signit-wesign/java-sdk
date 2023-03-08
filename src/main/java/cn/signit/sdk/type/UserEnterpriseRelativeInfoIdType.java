package cn.signit.sdk.type;

/**
* 描述：相对方企业证件类型枚举
* @author xiazhitao
*/
public enum UserEnterpriseRelativeInfoIdType {
    UNKNOWN(-1, "未知的证件类型"),
    UNIFIED_SOCIAL_CREDIT_CODE(0, "统一社会信用代码"),
    BYUSINESS_REGISTRATION_NO(1, "工商注册号"),
    ;

    private int code;
    private String description;

    UserEnterpriseRelativeInfoIdType(int code, String description) {
        this.code = code;
        this.description = description;
    }

    /**
     * 根据枚举code获取枚举类型.
     *
     * @param code
     *            枚举对应的code
     * @return 对应的枚举类型
     * @author xiazhitao
     */
    public static UserEnterpriseRelativeInfoIdType parse(int code) {
        for (UserEnterpriseRelativeInfoIdType val : values()) {
            if (val.getCode() == code) {
                return val;
            }
        }
        return UserEnterpriseRelativeInfoIdType.UNKNOWN;
    }

    /**
     * 根据枚举名称获取枚举的类型(不区分大小写).
     *
     * @param name
     *            枚举名称
     * @return 对应的枚举类型
     * @author xiazhitao
     */
    public static UserEnterpriseRelativeInfoIdType parse(String name) {
        for (UserEnterpriseRelativeInfoIdType val : values()) {
            if (val.name()
                    .equalsIgnoreCase(name)) {
                return val;
            }
        }
        return UserEnterpriseRelativeInfoIdType.UNKNOWN;
    }

    /**
     * 获取code属性字段的值.
     *
     * @return 类型为int的code属性字段的值.
     */
    public int getCode() {
        return code;
    }

    /**
     * 设置code属性字段的值.
     *
     * @param code
     *            待设置类型为int的code属性字段的值.
     */
    public void setCode(int code) {
        this.code = code;
    }

    /**
     * 获取description属性字段的值.
     *
     * @return 类型为String的description属性字段的值.
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置description属性字段的值.
     *
     * @param description
     *            待设置类型为String的description属性字段的值.
     */
    public void setDescription(String description) {
        this.description = description;
    }

}
