package cn.signit.sdk.pojo;

import java.util.List;

import cn.signit.sdk.type.IdCardType;
import cn.signit.sdk.util.ListBuilder;

/**
 * 经办人信息
 * 
 * @since 2.0.0
 */
public class EnterpriseAgent {
    /**
     * 委托书照片信息.
     *
     * @since 2.0.0
     */
    private IdCardImage trustInstrumentImage;
    /**
     * 待认证的用户姓名.
     *
     * @since 2.0.0
     */
    private String name;

    /**
     * 待认证的用户手机号.
     *
     * @since 2.0.0
     */
    private String phone;
    /**
     * 待认证的用户证件类型.
     *
     * @since 2.0.0
     */
    private IdCardType idCardType;
    /**
     * 待认证的用户证件号.
     *
     * @since 2.0.0
     */
    private String idCardNo;
    /**
     * 待认证的用户证件照片数组.
     *
     * @since 2.0.0
     */
    private List<IdCardImage> idCardImages;

    public IdCardImage getTrustInstrumentImage() {
        return trustInstrumentImage;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public IdCardType getIdCardType() {
        return idCardType;
    }

    public String getIdCardNo() {
        return idCardNo;
    }

    public List<IdCardImage> getIdCardImages() {
        return idCardImages;
    }

    public void setTrustInstrumentImage(IdCardImage trustInstrumentImage) {
        this.trustInstrumentImage = trustInstrumentImage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setIdCardType(IdCardType idCardType) {
        this.idCardType = idCardType;
    }

    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo;
    }

    public void setIdCardImages(List<IdCardImage> idCardImages) {
        this.idCardImages = idCardImages;
    }

    public EnterpriseAgent() {
        super();
    }

    public EnterpriseAgent(Builder builder) {
        this.name = builder.name;
        this.phone = builder.phone;
        this.idCardType = builder.idCardType;
        this.idCardNo = builder.idCardNo;
        this.idCardImages = builder.idCardImages;
        this.trustInstrumentImage = builder.trustInstrumentImage;
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    /**
     * 经办人信息对象建造器
     * 
     * @since 2.0.0
     */
    public static class Builder implements cn.signit.sdk.pojo.Builder<EnterpriseAgent> {
        private IdCardImage trustInstrumentImage;
        private String name;
        private String phone;
        private IdCardType idCardType;
        private String idCardNo;
        private List<IdCardImage> idCardImages;

        public Builder() {
            super();
        }

        public Builder(EnterpriseAgent enterpriseAgent) {
            this.name = enterpriseAgent.name;
            this.phone = enterpriseAgent.phone;
            this.idCardType = enterpriseAgent.idCardType;
            this.idCardNo = enterpriseAgent.idCardNo;
            this.idCardImages = enterpriseAgent.idCardImages;
            this.trustInstrumentImage = enterpriseAgent.trustInstrumentImage;
        }

        /**
         * 
         * @param name
         *            经办人的姓名
         * @return 经办人信息对象建造器{@link EnterpriseAgent.Builder}
         * @since 2.0.0
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * 
         * @param phone
         *            经办人的手机号
         * @return 经办人信息对象建造器{@link EnterpriseAgent.Builder}
         * @since 2.0.0
         */
        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        /**
         * 
         * @param idCardType
         *            SECOND_GENERATION_IDCARD-二代身份证；TEMPORARY_IDCARD-临时身份证；PASSPORT-护照
         *            {@link IdCardType}
         * @return 经办人信息对象建造器{@link EnterpriseAgent.Builder}
         * @since 2.0.0
         */
        public Builder idCardType(IdCardType idCardType) {
            this.idCardType = idCardType;
            return this;
        }

        /**
         * 
         * @param idCardNo
         *            经办人的证件号码
         * @return 经办人信息对象建造器{@link EnterpriseAgent.Builder}
         * @since 2.0.0
         */
        public Builder idCardNo(String idCardNo) {
            this.idCardNo = idCardNo;
            return this;
        }

        /**
         * 
         * @param idCardImages
         *            经办人的证件照片列表 {@link IdCardImage}
         * @return 经办人信息对象建造器{@link EnterpriseAgent.Builder}
         * @since 2.0.0
         */
        public Builder idCardImages(List<IdCardImage> idCardImages) {
            this.idCardImages = idCardImages;
            return this;
        }

        /**
         * 
         * @param idCardImageBuilders
         *            经办人的证件照片对象建造器列表 {@link IdCardImage.Builder}
         * @return 经办人信息对象建造器{@link EnterpriseAgent.Builder}
         * @since 2.0.0
         */
        public Builder idCardImages(IdCardImage.Builder... idCardImageBuilders) {
            this.idCardImages = ListBuilder.buildList(idCardImageBuilders);
            return this;
        }

        /**
         * 
         * @param trustInstrumentImage
         *            委托书照片信息 {@link IdCardImage}
         * @return 经办人信息对象建造器{@link EnterpriseAgent.Builder}
         * @since 2.0.0
         */
        public Builder trustInstrumentImage(IdCardImage trustInstrumentImage) {
            this.trustInstrumentImage = trustInstrumentImage;
            return this;
        }

        /**
         * 
         * @param trustInstrumentImageBuilder
         *            委托书照片信息对象建造器 {@link IdCardImage.Builder}
         * @return 经办人信息对象建造器{@link EnterpriseAgent.Builder}
         * @since 2.0.0
         */
        public Builder trustInstrumentImage(IdCardImage.Builder trustInstrumentImageBuilder) {
            if (trustInstrumentImageBuilder != null) {
                this.trustInstrumentImage = trustInstrumentImageBuilder.build();
            }
            return this;
        }

        /**
         * 
         * @return 经办人信息对象
         * @since 2.0.0
         */
        public EnterpriseAgent build() {
            return new EnterpriseAgent(this);
        }
    }

}
