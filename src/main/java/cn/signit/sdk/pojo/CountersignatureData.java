package cn.signit.sdk.pojo;

/**
 * 会签的签名数据；包含了手写签名数据，签名大小，以及签名人信息
 * 
 * @since 2.5.0
 */
public class CountersignatureData {

    private WriteData writeData;

    private SignSize size;

    private Integer sequence;

    private CountersignatureSigner signer;

    public WriteData getWriteData() {
        return writeData;
    }

    public void setWriteData(WriteData writeData) {
        this.writeData = writeData;
    }

    public SignSize getSize() {
        return size;
    }

    public void setSize(SignSize size) {
        this.size = size;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public CountersignatureSigner getSigner() {
        return signer;
    }

    public void setSigner(CountersignatureSigner signer) {
        this.signer = signer;
    }

    public CountersignatureData() {
        super();
    }

    /**
     * @param writeData
     *            手写签名数据，仅支持使用URL或者BASE64获取手写签名数据
     * @param size
     *            签名大小
     * @param sequence
     *            签署顺序
     * @param signer
     *            签署人信息
     */
    public CountersignatureData(WriteData writeData, SignSize size, Integer sequence, CountersignatureSigner signer) {
        super();
        this.writeData = writeData;
        this.size = size;
        this.sequence = sequence;
        this.signer = signer;
    }

    /**
     * @since 2.5.0
     * @return 返回一个新的{@link Builder}对象
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * 会签的签名数据建造器
     * 
     * @since 2.5.0
     */
    public static class Builder implements cn.signit.sdk.pojo.Builder<CountersignatureData> {
        private WriteData writeData;

        private SignSize size;

        private Integer sequence;

        private CountersignatureSigner signer;

        /**
         * @param writeData
         *            手写签名数据，仅支持使用URL或者BASE64获取手写签名数据
         * @since 2.5.0
         * @return 会签的签名数据建造器
         */
        public Builder writeData(WriteData writeData) {
            this.writeData = writeData;
            return this;
        }

        /**
         * @param writeDataBuilder
         *            手写签名数据建造器，仅支持使用URL或者BASE64获取手写签名数据
         *            {@link cn.signit.sdk.pojo.WriteData.Builder}
         * @since 2.5.0
         * @return 会签的签名数据建造器
         */
        public Builder writeData(WriteData.Builder writeDataBuilder) {
            this.writeData = writeDataBuilder.build();
            return this;
        }

        /**
         * @param size
         *            手写签名大小
         * @since 2.5.0
         * @return 会签的签名数据建造器
         */
        public Builder size(SignSize size) {
            this.size = size;
            return this;
        }

        /**
         * @param sizeBuilder
         *            手写签名大小建造器 {@link cn.signit.sdk.pojo.SignSize.Builder}
         * @since 2.5.0
         * @return 会签的签名数据建造器
         */
        public Builder size(SignSize.Builder sizeBuilder) {
            this.size = sizeBuilder.build();
            return this;
        }

        /**
         * @param sequence
         *            签署顺序，从1开始。每次最多允许100个签署
         * @since 2.5.0
         * @return 会签的签名数据建造器
         */
        public Builder sequence(Integer sequence) {
            this.sequence = sequence;
            return this;
        }

        /**
         * @param signer
         *            签署者的详细信息
         * @since 2.5.0
         * @return 会签的签名数据建造器
         */
        public Builder signer(CountersignatureSigner signer) {
            this.signer = signer;
            return this;
        }

        /**
         * @param signerBuilder
         *            签署者的详细信息建造器
         *            {@link cn.signit.sdk.pojo.CountersignatureSigner.Builder}
         * @since 2.5.0
         * @return 会签的签名数据建造器
         */
        public Builder signer(CountersignatureSigner.Builder signerBuilder) {
            this.signer = signerBuilder.build();
            return this;
        }

        /**
         * 
         * @since 2.5.0
         * @return 返回一个新的{@link CountersignatureData}对象
         */
        @Override
        public CountersignatureData build() {
            return new CountersignatureData(writeData, size, sequence, signer);
        }

    }
}
