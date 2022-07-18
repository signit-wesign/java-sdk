package cn.signit.sdk.type;

/**
 * 
 * wehook推送事件枚举.
 *
 * @author luliangwei
 * @since 1.0.0
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
     * 会签签署完成
     */
    COUNTERSIGNATURE_SIGN_COMPLETED("countersignatureSignCompleted", "会签签署完成"),
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
     * 信封启动成功事件
     */
    ENVELOPE_STARTED_SUCCEED("envelopeStartedSucceed", "信封启动成功事件"),
    /**
     * 信封启动失败事件
     */
    ENVELOPE_STARTED_FAILED("envelopeStartedFailed", "信封启动失败事件"),
    /**
     * 参与者拒绝
     */
    PARTICIPANT_REJECTED("participantRejected", "参与者拒绝"),
    /**
     * 参与者撤销
     */
    PARTICIPANT_REVOKED("participantRevoked", "参与者撤销"),
    /**
     * 参与者确认
     */
    PARTICIPANT_CONFIRMED("participantConfirmed", "参与者确认"),
    /**
     * 参与者作废
     */
    PARTICIPANT_INVALIDATED("participantInvalidated", "参与者作废"),
    /**
     * 参与者审核不通过
     */
    PARTICIPANT_NOT_PASS_CHECKED("participantNotPassChecked", "参与者审核不通过"),
    /**
     * 参与者待他处理信封.
     *
     * @since 1.2.19
     */
    PARTICIPANT_HANDLING("participantHandling", "参与者处理信封"),
    
    /**
     * 信封逾期未签署完成.
     *
     * @since 2.1.7
     */
    PARTICIPANT_EXPIRED("participantExpired", "参与者逾期未签署信封"),
    /**
     * 信封流程完成
     */
    ENVELOPE_COMPLETED("envelopeCompleted", "信封流程完成"),
    /**
     * 信封成功流程结束
     */
    ENVELOPE_COMPLETED_SUCCEED("envelopeCompletedSucceed", "信封成功流程结束"),
    /**
     * 信封作废流程结束
     */
    ENVELOPE_COMPLETED_INVALIDATED("envelopeCompletedInvalidated", "信封作废流程结束"),
    /**
     * 信封拒签流程结束
     */
    ENVELOPE_COMPLETED_REJECTED("envelopeCompletedRejected", "信封拒签流程结束"),
    /**
     * 信封审核未通过流程结束
     */
    ENVELOPE_COMPLETED_NOT_PASS_CHECKED("envelopeCompletedNotPassChecked", "信封审核未通过流程结束"),
    /**
     * 信封撤销流程结束
     */
    ENVELOPE_COMPLETED_REVOKED("envelopeCompletedRevoked", "信封撤销流程结束"),
    /**
     * 信封逾期流程结束
     */
    ENVELOPE_COMPLETED_EXPIRED("envelopeCompletedExpired", "信封逾期流程结束"),
    /**
     * 身份验证-人脸验证-录入流程完成
     * 
     * @since 2.2.0
     */
    FACE_INPUT_VERIFICATION_COMPLETED("faceInputVerificationCompleted", "身份验证-人脸验证-录入流程完成"),
    /**
     * 身份验证-人脸验证-验证流程完成
     * 
     * @since 2.2.0
     */
    FACE_VERIFY_VERIFICATION_COMPLETED("faceVerifyVerificationCompleted", "身份验证-人脸验证-验证流程完成"),
    /**
     * 身份验证-USBKEY验证-录入流程完成
     * 
     * @since 2.2.0
     */
    USBKEY_INPUT_VERIFICATION_COMPLETED("usbkeyInputVerificationCompleted", "身份验证-USBKEY验证-录入流程完成"),
    /**
     * 身份验证-USBKEY验证-验证流程完成
     * 
     * @since 2.2.0
     */
    USBKEY_VERIFY_VERIFICATION_COMPLETED("usbkeyVerifyVerificationCompleted", "身份验证-USBKEY验证-验证流程完成"),

    /**
     * 企业账户同步-激活启动
     * 
     * @since 1.4.0
     */
    ENTERPRISE_ACCOUNT_ACTIVATE_STARTED("enterpriseAccountActivateStarted", "企业账户同步-激活启动"),
    /**
     * 企业账户同步-激活完成
     * 
     * @since 1.4.0
     */
    ENTERPRISE_ACCOUNT_ACTIVATE_COMPLETED("enterpriseAccountActivateCompleted", "企业账户同步-激活完成"),
    /**
     * 企业账户同步-认证等待审核
     * 
     * @since 1.4.0
     */
    ENTERPRISE_ACCOUNT_AUTHENTICATION_WAITING("enterpriseAccountAuthenticationWaiting", "企业账户同步-认证等待审核"),
    /**
     * 企业账户同步-认证完成
     * 
     * @since 1.4.0
     */
    ENTERPRISE_ACCOUNT_AUTHENTICATION_COMPLETED("enterpriseAccountAuthenticationCompleted", "企业账户同步-认证完成"),
    /**
     * 个人账户同步-个人账户激活完成
     * 
     * @since 1.4.0
     */
    PERSON_ACCOUNT_ACTIVATE_COMPLETED("personAccountActivateCompleted", "个人账户同步-激活完成"),
    /**
     * 个人账户同步-个人账户激活开始
     * 
     * @since 1.4.0
     */
    PERSON_ACCOUNT_ACTIVATE_STARTED("personAccountActivateStarted", "个人账户同步-激活开始"),
    /**
     * 个人账户同步-个人账户认证完成
     * 
     * @since 1.4.0
     */
    PERSON_ACCOUNT_AUTHENTICATION_COMPLETED("personAccountAuthenticationCompleted", "个人账户同步-认证完成"),
    /**
     * 个人实名认证-个人实名认证完成
     * 
     * @since 1.4.0
     */
    PERSON_AUTHENTICATION_COMPLETED("personAuthenticationCompleted", "个人账户同步-认证完成"),

    /**
     * 开放平台独立企业实名认证流程认证成功
     *
     * @since 2.2.3
     */
    OPEN_ENTERPRISE_AUTHENTICATION_SUCCESS("openEnterpriseAuthenticationSuccess", "开放平台独立企业实名认证流程认证成功"),

    /**
     * 开放平台独立企业实名认证流程认证失败
     *
     * @since 2.2.3
     */
    OPEN_ENTERPRISE_AUTHENTICATION_DENY("openEnterpriseAuthenticationDeny", "开放平台独立企业实名认证流程认证失败"),
    /**
     * 开放平台独立企业实名认证流程认证失败
     *
     * @since 2.2.3
     */
    OPEN_ENTERPRISE_AUTHENTICATION_CHANGE("openEnterpriseAuthenticationChange", "开放平台独立企业实名认证流程认证改变"),;
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
     * @return 对应的事件类型,如无法识别返回
     * @author luliangwei
     * @since 1.0.0
     */
    public static WebhookEventType parse(String event) {
        for (WebhookEventType val : values()) {
            if (val.name().equalsIgnoreCase(event) || val.getEvent().equalsIgnoreCase(event)) {
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
     * @author luliangwei
     * @since 1.0.0
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
     * @author luliangwei
     * @since 1.0.0
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
