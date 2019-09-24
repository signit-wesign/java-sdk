package cn.signit.sdk.pojo;

/**
 * 签名大小
 * 
 * @since 2.5.0
 */
public class SignSize {
    private Float height;
    private Float width;

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public Float getWidth() {
        return width;
    }

    public void setWidth(Float width) {
        this.width = width;
    }

    /**
     * 签名大小的构造
     * 
     * @param height
     *            此签名的高
     * @param width
     *            此签名的宽
     */
    public SignSize(Float height, Float width) {
        super();
        this.height = height;
        this.width = width;
    }

    public SignSize() {
        super();
    }

    /**
     * 
     * @since 2.5.0
     * @return 返回一个新的{@link Builder}构造器
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * 签名大小的建造器
     * 
     * @since 2.5.0
     */
    public static class Builder implements cn.signit.sdk.pojo.Builder<SignSize> {
        private Float height;
        private Float width;

        /**
         * @param height
         *            此签名的高
         * @since 2.5.0
         * @return 签名大小的建造器
         */
        public Builder height(Float height) {
            this.height = height;
            return this;
        }

        /**
         * @param width
         *            此签名的宽
         * @since 2.5.0
         * @return 签名大小的建造器
         */
        public Builder width(Float width) {
            this.width = width;
            return this;
        }

        /**
         *
         * 
         * @since 2.5.0
         * @return 返回一个新的{@link SignSize}对象
         */
        @Override
        public SignSize build() {
            return new SignSize(height, width);
        }

    }
}
