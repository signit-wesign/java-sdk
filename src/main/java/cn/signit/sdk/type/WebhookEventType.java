package cn.signit.sdk.type;

/**
 * webhook响应事件类型.
 *
 * @since 2.0.0
 */
public enum WebhookEventType {
    /**
     * 不支持的事件
     */
    UNKNOWN("unSupportEvent", "不支持的事件"),
    /**
     * 快捷签署完成
     */
    QUICK_SIGN_COMPLETED("quickSignCompleted", "快捷签署完成"),
    /**
     * 个人实名认证提交
     */
    PERSON_VERIFICATION_SUBMITTED("personVerificationSubmitted", "个人实名认证提交"),
    /**
     * 个人实名认证完成
     */
    PERSON_VERIFICATION_COMPLETED("personVerificationCompleted", "个人实名认证完成"),
    /**
     * 企业实名认证提交
     */
    ENTERPRISE_VERIFICATION_SUBMITTED("enterpriseVerificationSubmitted", "企业实名认证提交"),
    /**
     * 企业实名认证初级完成
     */
    ENTERPRISE_VERIFICATION_PRIMARY_COMPLETED("enterpriseVerificationPrimaryCompleted", " 企业实名认证初级完成"),
    /**
     * 企业实名认证已打款
     */
    ENTERPRISE_VERIFICATION_PAID("enterpriseVerificationPaid", "企业实名认证已打款"),
    /**
     * 企业实名认证完成
     */
    ENTERPRISE_VERIFICATION_COMPLETED("enterpriseVerificationCompleted", "企业实名认证完成"),
    /**
     * 信封流程启动
     */
    ENVELOPE_STARTED("envelopeStarted", "信封流程启动"),
    /**
     * 参与者拒绝
     */
    PARTICIPANT_REJECTED("participantRejected", "参与者拒绝"),
    /**
     * 参与者确认
     */
    PARTICIPANT_CONFIRMED("participantConfirmed", "参与者确认"),
    /**
     * 信封流程完成
     */
    ENVELOPE_COMPLETED("envelopeCompleted", "信封流程完成"),;
    private String event;
    private String description;

    private WebhookEventType(String event, String description) {
        this.event = event;
        this.description = description;
    }

    /**
     * 
     * 根据事件名称解析成对应的枚举类型.
     *
     * @param event
     *            事件名称(不区分大小写)
     * @return 对应的事件类型,如无法识别返回{@link cn.signit.wesign.mss.developer.utils.type.WebhookEventType.UNKNOWN }
     * @since 2.0.0
     */
    public static WebhookEventType parse(String event) {
        for (WebhookEventType val : values()) {
            if (val.name()
                    .equalsIgnoreCase(event)
                    || val.getEvent()
                            .equalsIgnoreCase(event)) {
                return val;
            }
        }
        return WebhookEventType.UNKNOWN;
    }

    /**
     * 
     * 判断Webhook是否支持当前事件列表.
     *
     * @param events
     *            待检查的事件列表
     * @return <code>true</code>--支持当前事件列表,<code>false</code>--不支持当前事件列表
     * @since 2.0.0
     */
    public static boolean support(String[] events) {
        if (events == null || events.length == 0) {
            return false;
        }
        for (String val : events) {
            if (!support(val)) {
                return false;
            }
        }
        return true;
    }

    /**
     * 
     * 判断Webhook是否支持当前事件.
     *
     * @param event
     *            待判断的字段
     * @return <code>true</code>--支持当前事件,<code>false</code>--不支持当前事件
     * @since 2.0.0
     */
    public static boolean support(String event) {
        return parse(event) != WebhookEventType.UNKNOWN;
    }

    /**
     * 获取event属性字段的值.
     *
     * @return 类型为String的event属性字段的值.
     */
    public String getEvent() {
        return event;
    }

    /**
     * 设置event属性字段的值.
     *
     * @param event
     *            待设置类型为String的event属性字段的值.
     */
    public void setEvent(String event) {
        this.event = event;
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
