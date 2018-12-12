package cn.signit.sdk.type;

/**
 * 签名渲染模式.
 * </p>
 *
 * 
 * @since 1.0.2
 */
public enum RenderMode {

    /**
     * The rendering mode is just the description.
     */
    DESCRIPTION,
    /**
     * The rendering mode is the name of the signer and the description.
     */
    NAME_AND_DESCRIPTION,
    /**
     * The rendering mode is an image and the description.
     */
    GRAPHIC_AND_DESCRIPTION,
    /**
     * The rendering mode is just an image.
     */
    GRAPHIC;
}
