package cn.signit.sdk.type;

/**
* 描述：相对方个人证件类型枚举
* @author xiazhitao
*/
public enum UserPersonRelativeInfoIdType {
    UNKNOWN(-1, "未知的证件类型"),
    SECOND_GENERATION_IDCARD(0, "二代身份证"),
    PASSPORT(1, "护照"),
    TAI_WAN_IDCARD(2, "台湾来往大陆通行证"),
    MA_CAO_IDCARD(3, "澳门来往大陆通行证"),
    HONG_KONG_IDCARD(4, "香港来往大陆通行证"),
    ;

    private int code;
    private String description;

    UserPersonRelativeInfoIdType(int code, String description) {
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
    public static UserPersonRelativeInfoIdType parse(int code) {
        for (UserPersonRelativeInfoIdType val : values()) {
            if (val.getCode() == code) {
                return val;
            }
        }
        return UserPersonRelativeInfoIdType.UNKNOWN;
    }

    /**
     * 根据枚举名称获取枚举的类型(不区分大小写).
     *
     * @param name
     *            枚举名称
     * @return 对应的枚举类型
     * @author xiazhitao
     */
    public static UserPersonRelativeInfoIdType parse(String name) {
        for (UserPersonRelativeInfoIdType val : values()) {
            if (val.name()
                    .equalsIgnoreCase(name)) {
                return val;
            }
        }
        return UserPersonRelativeInfoIdType.UNKNOWN;
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
