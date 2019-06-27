package cn.signit.sdk.type;

/**
 * 
 * 表单类型枚举.
 *
 * @since 2.0.0
 */
public enum FormType {

    /**
     * 印章签名表单域
     */
    SEAL_SIGN,
    /**
     * 手写签名表单域
     */
    WRITE_SIGN,
    /**
     * 文本表单域
     */
    TEXT,
    /**
     * 骑缝章表单域
     */
    MULTI_CHECK_MARK,
    /**
     * 二维码骑缝章表单域
     */
    MULTI_QRCODE_MARK,
    /**
     * 时间戳表单
     */
    DATE;
}
