package cn.signit.sdk.pojo;

import cn.signit.sdk.type.CertType;
import cn.signit.sdk.type.RenderMode;

/**
 * 签名初始化数据.
 * </p>
 * 包含印章数据、手写数据、证书数据、证书签名证书秘钥访问口令、证书类型、 渲染模式、签名地理位置、联系方式、签名是否锁定、签名原因.
 * </p>
 * 印章数据、手写数据仅一个不为空的有效。
 * 
 *
 * @since 1.0.2
 */
public class InitialValue {
    /**
     * 印章数据.
     *
     * @since 1.0.2
     */
    private SealData sealData;
    /**
     * 手写签名数据.
     *
     * @since 1.0.2
     */
    private WriteData writeData;
    /**
     * 证书数据.
     *
     * @since 1.0.2
     */
    private CertData certData;
    /**
     * 证书签名证书密钥访问口令.
     *
     * @since 1.0.2
     */
    private String certPassin;
    /**
     * 证书类型.
     * </p>
     * 对应枚举：CertType
     * 
     * @since 1.0.2
     */
    private CertType certType;
    /**
     * 渲染模式. 对应枚举：
     * </p>
     * 对应枚举：RenderMode
     * 
     * @since 1.0.2
     */
    private RenderMode renderingMode = RenderMode.GRAPHIC;
    /**
     * 签名地理位置.
     *
     * @since 1.0.2
     */
    private String location;
    /**
     * 联系方式.
     *
     * @since 1.0.2
     */
    private String contact;
    /**
     * 签名是否锁定.
     *
     * @since 1.0.2
     */
    private boolean locked = false;
    /**
     * 签名原因.
     *
     * @since 1.0.2
     */
    private String reason;

    public SealData getSealData() {
        return sealData;
    }

    public WriteData getWriteData() {
        return writeData;
    }

    public CertData getCertData() {
        return certData;
    }

    public String getCertPassin() {
        return certPassin;
    }

    public CertType getCertType() {
        return certType;
    }

    public RenderMode getRenderingMode() {
        return renderingMode;
    }

    public String getLocation() {
        return location;
    }

    public String getContact() {
        return contact;
    }

    public boolean isLocked() {
        return locked;
    }

    public String getReason() {
        return reason;
    }

    public void setSealData(SealData sealData) {
        this.sealData = sealData;
    }

    public void setWriteData(WriteData writeData) {
        this.writeData = writeData;
    }

    public void setCertData(CertData certData) {
        this.certData = certData;
    }

    public void setCertPassin(String certPassin) {
        this.certPassin = certPassin;
    }

    public void setCertType(CertType certType) {
        this.certType = certType;
    }

    public void setRenderingMode(RenderMode renderingMode) {
        this.renderingMode = renderingMode;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public InitialValue() {
    }

    public InitialValue(Builder builder) {
        this.sealData = builder.sealData;
        this.writeData = builder.writeData;
        this.certData = builder.certData;
        this.certPassin = builder.certPassin;
        this.certType = builder.certType;
        this.renderingMode = builder.renderingMode;
        this.location = builder.location;
        this.contact = builder.contact;
        this.locked = builder.locked;
        this.reason = builder.reason;
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder implements cn.signit.sdk.pojo.Builder<InitialValue> {
        private SealData sealData;
        private WriteData writeData;
        private CertData certData;
        private String certPassin;
        private CertType certType;
        private RenderMode renderingMode = RenderMode.GRAPHIC;
        private String location;
        private String contact;
        private boolean locked = false;
        private String reason;

        public Builder() {
        }

        public Builder(InitialValue initValue) {
            this.sealData = initValue.sealData;
            this.writeData = initValue.writeData;
            this.certData = initValue.certData;
            this.certPassin = initValue.certPassin;
            this.certType = initValue.certType;
            this.renderingMode = initValue.renderingMode;
            this.location = initValue.location;
            this.contact = initValue.contact;
            this.locked = initValue.locked;
            this.reason = initValue.reason;
        }

        public Builder sealData(SealData sealData) {
            this.sealData = sealData;
            return this;
        }

        public Builder sealData(SealData.SealDataBuilder sealDataBuilder) {
            if (sealDataBuilder != null) {
                this.sealData = sealDataBuilder.build();
            }
            return this;
        }

        public Builder writeData(WriteData writeData) {
            this.writeData = writeData;
            return this;
        }

        public Builder writeData(WriteData.Builder writeDataBuilder) {
            if (writeDataBuilder != null) {
                this.writeData = writeDataBuilder.build();
            }
            return this;
        }

        public Builder certData(CertData certData) {
            this.certData = certData;
            return this;
        }

        public Builder certData(CertData.Builder certDataBuilder) {
            if (certDataBuilder != null) {
                this.certData = certDataBuilder.build();
            }
            return this;
        }

        public Builder certPassin(String certPassin) {
            this.certPassin = certPassin;
            return this;
        }

        public Builder certType(CertType certType) {
            this.certType = certType;
            return this;
        }

        public Builder renderingMode(RenderMode renderingMode) {
            this.renderingMode = renderingMode;
            return this;
        }

        public Builder location(String location) {
            this.location = location;
            return this;
        }

        public Builder contact(String contact) {
            this.contact = contact;
            return this;
        }

        public Builder locked(boolean locked) {
            this.locked = locked;
            return this;
        }

        public Builder reason(String reason) {
            this.reason = reason;
            return this;
        }

        @Override
        public InitialValue build() {
            return new InitialValue(this);
        }

    }
}
