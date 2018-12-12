package cn.signit.sdk.pojo;

import java.util.List;

import cn.signit.sdk.type.IdCardType;
import cn.signit.sdk.util.ListBuilder;

public class EnterpriseLegalPerson {
    /**
     * 待认证的用户姓名.
     *
     * @since 1.0.2
     */
    private String name;

    /**
     * 待认证的用户手机号.
     *
     * @since 1.0.2
     */
    private String phone;
    /**
     * 待认证的用户证件类型.
     *
     * @since 1.0.2
     */
    private IdCardType idCardType;
    /**
     * 待认证的用户证件号.
     *
     * @since 1.0.2
     */
    private String idCardNo;
    /**
     * 待认证的用户证件照片数组.
     *
     * @since 1.0.2
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

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder idCardType(IdCardType idCardType) {
            this.idCardType = idCardType;
            return this;
        }

        public Builder idCardNo(String idCardNo) {
            this.idCardNo = idCardNo;
            return this;
        }

        public Builder idCardImages(List<IdCardImage> idCardImages) {
            this.idCardImages = idCardImages;
            return this;
        }

        public Builder idCardImages(IdCardImage.Builder... idCardImageBuilders) {
            this.idCardImages = ListBuilder.buildList(idCardImageBuilders);
            return this;
        }

        public EnterpriseLegalPerson build() {
            return new EnterpriseLegalPerson(this);
        }
    }
}
