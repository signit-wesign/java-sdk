package cn.signit.sdk.pojo;

import java.util.List;

import cn.signit.sdk.type.IdCardType;
import cn.signit.sdk.util.ListBuilder;

/**
 * 法人信息
 * 
 * @since 2.0.0
 */
public class EnterpriseLegalPerson {
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

    public EnterpriseLegalPerson() {
        super();
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    public EnterpriseLegalPerson(Builder builder) {
        this.name = builder.name;
        this.phone = builder.phone;
        this.idCardType = builder.idCardType;
        this.idCardNo = builder.idCardNo;
        this.idCardImages = builder.idCardImages;
    }

    /**
     * 法人信息对象建造器
     * 
     * @since 2.0.0
     */
    public static class Builder implements cn.signit.sdk.pojo.Builder<EnterpriseLegalPerson> {
        private String name;
        private String phone;
        private IdCardType idCardType;
        private String idCardNo;
        private List<IdCardImage> idCardImages;

        public Builder() {
        }

        public Builder(EnterpriseLegalPerson enterpriseLegalPerson) {
            this.name = enterpriseLegalPerson.name;
            this.phone = enterpriseLegalPerson.phone;
            this.idCardType = enterpriseLegalPerson.idCardType;
            this.idCardNo = enterpriseLegalPerson.idCardNo;
            this.idCardImages = enterpriseLegalPerson.idCardImages;
        }

        /**
         * 
         * @param name
         *            法人的姓名
         * @return 法人信息对象建造器{@link EnterpriseLegalPerson.Builder}}
         * @since 2.0.0
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * 
         * @param phone
         *            法人的手机号
         * @return 法人信息对象建造器{@link EnterpriseLegalPerson.Builder}}
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
         * @return 法人信息对象建造器{@link EnterpriseLegalPerson.Builder}}
         * @since 2.0.0
         */
        public Builder idCardType(IdCardType idCardType) {
            this.idCardType = idCardType;
            return this;
        }

        /**
         * 
         * @param idCardNo
         *            法人的证件号码
         * @return 法人信息对象建造器{@link EnterpriseLegalPerson.Builder}}
         * @since 2.0.0
         */
        public Builder idCardNo(String idCardNo) {
            this.idCardNo = idCardNo;
            return this;
        }

        /**
         * 
         * @param idCardImages
         *            {@link IdCardImage} 法人的证件照片数组
         * @return 法人信息对象建造器{@link EnterpriseLegalPerson.Builder}}
         * @since 2.0.0
         */
        public Builder idCardImages(List<IdCardImage> idCardImages) {
            this.idCardImages = idCardImages;
            return this;
        }

        /**
         * 
         * @param idCardImageBuilders
         *            {@link IdCardImage.Builder} 法人的证件照片对象建造器数组
         * @return 法人信息对象建造器{@link EnterpriseLegalPerson.Builder}}
         * @since 2.0.0
         */
        public Builder idCardImages(IdCardImage.Builder... idCardImageBuilders) {
            this.idCardImages = ListBuilder.buildList(idCardImageBuilders);
            return this;
        }

        /**
         * 
         * @return 法人信息对象
         * @since 2.0.0
         */
        public EnterpriseLegalPerson build() {
            return new EnterpriseLegalPerson(this);
        }
    }
}
