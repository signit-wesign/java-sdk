package cn.signit.sdk.type;

/**
 * 可编辑范围枚举.
 * </p>
 * 
 * @author zhd
 * @since 2.5.5
 */

public enum EditableScope {
    /**
     * 未指定.
     *
     * @since 2.5.5
     */
    UNKNOWN(-1, "未指定"),
    /**
     * 不可编辑所有信息（优先级最高）.
     *
     * @since 2.5.5
     */
    EDITABLE_ALL_LOCKED(0, "不可编辑所有信息（优先级最高）"),
    /**
     * 可编辑信封所有信息（优先级次之）.
     *
     * @since 2.5.5
     */
    EDITABLE_ALL(1, "可编辑信封所有信息（优先级次之）"),
    /**
     * 可编辑信封基本信息（优先级低于EDITABLE_ALL_LOCKED 和EDITABLE_ALL）.
     *
     * @since 2.5.5
     */
    EDITABLE_BASIC_INFO(2, "可编辑信封基本信息（优先级低于EDITABLE_ALL_LOCKED 和EDITABLE_ALL）"),
    /**
     * 可编辑信封基本信息（优先级低于EDITABLE_ALL_LOCKED 和EDITABLE_ALL）.
     *
     * @since 2.5.5
     */
    EDITABLE_CONTENT_INFO(3, "可编辑信封基本信息（优先级低于EDITABLE_ALL_LOCKED 和EDITABLE_ALL）"),
    /**
     * 可编辑信封基本信息（优先级低于EDITABLE_ALL_LOCKED 和EDITABLE_ALL）.
     *
     * @since 2.5.5
     */
    EDITABLE_PARTICIPANT_INFO(4, "可编辑信封基本信息（优先级低于EDITABLE_ALL_LOCKED 和EDITABLE_ALL）");

    private int code;
    private String description;

    private EditableScope(int code, String description) {
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
    public static EditableScope parse(int code) {
        for (EditableScope val : values()) {
            if (val.getCode() == code) {
                return val;
            }
        }
        return EditableScope.UNKNOWN;
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
    public static EditableScope parse(String name) {
        for (EditableScope val : values()) {
            if (val.name().equalsIgnoreCase(name)) {
                return val;
            }
        }
        return EditableScope.UNKNOWN;
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
