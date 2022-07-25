package cn.signit.sdk.type;

/**
 * 文件传输类型.
 * 
 * @author zhd
 * @since 2.0.0
 */
public enum TransferType {
    UNKNOWN(-1, "未知状态"), 
    BASE64(0, "BASE64传输类型"), 
    URL(1, "URL传输类型"),
    FILE_WSID(2, "FILE_WSID传输类型");
    ;

    private int code;
    private String description;

    private TransferType(int code, String description) {
        this.setCode(code);
        this.setDescription(description);
    }

    /**
     * 
     * 根据枚举code值解析得到对应的枚举类型.
     *
     * @param code
     *            枚举状态码
     * @return 对应的枚举类型
     * @author luliangwei
     * @since 1.0.0
     */
    public static TransferType parse(int code) {
        for (TransferType val : values()) {
            if (val.getCode() == code) {
                return val;
            }
        }
        return TransferType.UNKNOWN;
    }

    /**
     * 
     * 根据枚举名称解析枚举类型（不区分大小写）.
     *
     * @param name
     *            枚举名称
     * @return 对应的枚举类型
     * @author luliangwei
     * @since 1.0.0
     */
    public static TransferType parse(String name) {
        for (TransferType val : values()) {
            if (val.name()
                    .equalsIgnoreCase(name)) {
                return val;
            }
        }
        return TransferType.UNKNOWN;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
