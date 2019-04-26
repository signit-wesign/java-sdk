package cn.signit.sdk.type;

/**
 * 签署认证类型类型.
 * 
 * 用户确认签署时，需要验证签署人身份，此处为所有验证方式枚举
 * 
 * @since 2.1.0
 */
public enum AuthType {
    /**
     * 短信验证码
     * 
     * @since 2.1.0
     */
    SMS_CODE,
    /**
     * 邮箱验证码
     * 
     * @since 2.1.0
     */
    EMAIL_CODE,
    /**
     * 签署密码
     * 
     * @since 2.1.0
     */
    SIGN_PIN,
    /**
     * 活体认证
     * 
     * @since 2.1.0
     */
    LIVING_AUTH,
    /**
     * usbkey认证
     * 
     * @since 2.1.0
     */
    USBKEY,
    /**
     * 手机盾认证
     * 
     * @since 2.1.0
     */
    MOBILE_SHIELD;

}