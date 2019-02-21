package cn.signit.sdk.type;

/**
 * 参与者处理表单的模式枚举
 *
 * @since 2.0.0
 */
public enum ParticipantHandleMode {
    /**
     * 正常处理模式（默认）.
     * 
     * @since 2.0.0
     */
    NORMAL,
    /**
     * 静默处理模式. </br>
     * 该接受方不用执行签署流程，自动完成签署。接收方设置为静默签署条件：①接收方类型为签署者SIGNER；②接收方和发起方为同一企业下的同一人；③该接收方有预设表单，且该接收方的预设表单均设置了初始值(手写签名表单除外)。
     * 
     * @since 2.0.0
     */
    SILENCE;

}