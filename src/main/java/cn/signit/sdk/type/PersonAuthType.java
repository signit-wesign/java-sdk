package cn.signit.sdk.type;

/**
 * 个人实名认证方式
 *
 * @since 2.1.0
 */
public enum PersonAuthType {
    /**
     * 三网手机号三元素实名认证方式
     */
    PHONE_AUTH,
    
    /**
     * 人脸识别认证方式
     * @since 2.5.2
     */
    FACE_AUTH,
    
    /**
     * 支付宝芝麻认证方式
     * @since 2.5.2
     */
    ZM_AUTH,
    
    /**
     * 三网手机号三元素实名认证+人脸识别认证，双重认证方式
     * @since 2.5.2
     */
    PHONE_FACE_AUTH

}
