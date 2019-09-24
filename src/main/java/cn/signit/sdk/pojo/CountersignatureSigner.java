package cn.signit.sdk.pojo;

import cn.signit.sdk.pojo.Signer.SignerInfo;
import cn.signit.sdk.type.IdCardType;

/**
 * 签署者的详细信息
 * 
 * @since 2.5.0
 */
public class CountersignatureSigner extends SignerInfo {
    private IdCardType idCardType;

    public IdCardType getIdCardType() {
        return idCardType;
    }

    public void setIdCardType(IdCardType idCardType) {
        this.idCardType = idCardType;
    }

    public CountersignatureSigner() {
        super();
    }

    /**
     * @param idCardType
     *            签署者用户证件类型
     * @param name
     *            签署者姓名
     * @param orgnizationName
     *            签署者组织名称
     * @param idCardNo
     *            签署者用户身份证号
     * @param location
     *            签署者地理位置
     * @param contact
     *            签署者联系方式
     * @param reason
     *            签署原因
     */
    public CountersignatureSigner(IdCardType idCardType, String name, String orgnizationName, String idCardNo,
            String location, String contact, String reason) {
        super(name, orgnizationName, idCardNo, location, contact, reason);
        this.idCardType = idCardType;
    }

    /**
     * @since 2.5.0
     * @return 返回一个新的{@link Builder}对象
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * 快捷会签签署人信息建造器
     * 
     * @since 2.5.0
     */
    public static class Builder extends SignerInfo.SignerInfoBuilder
            implements cn.signit.sdk.pojo.Builder<CountersignatureSigner> {
        private IdCardType idCardType;

        /**
         * @param idCardType
         *            签署者用户证件类型
         * @return 快捷会签签署人信息建造器
         * @since 2.5.0
         */
        Builder withIdCardType(IdCardType idCardType) {
            this.idCardType = idCardType;
            return this;
        }

        /**
         * @param name
         *            签署者姓名
         * @return 快捷会签签署人信息建造器
         * @since 2.5.0
         */
        @Override

        public Builder withName(String name) {
            super.withName(name);
            return this;
        }

        /**
         * @param orgnizationName
         *            签署者组织名称
         * @return 快捷会签签署人信息建造器
         * @since 2.5.0
         */
        @Override
        public Builder withOrgnizationName(String orgnizationName) {
            super.withOrgnizationName(orgnizationName);
            return this;
        }

        /**
         * @param idCardNo
         *            签署者用户身份证号
         * @return 快捷会签签署人信息建造器
         * @since 2.5.0
         */
        @Override
        public Builder withIdCardNo(String idCardNo) {
            super.withIdCardNo(idCardNo);
            return this;
        }

        /**
         * @param location
         *            签署者地理位置
         * @return 快捷会签签署人信息建造器
         * @since 2.5.0
         */
        @Override
        public Builder withLocation(String location) {
            super.withLocation(location);
            return this;
        }

        /**
         * @param contact
         *            签署者联系方式
         * @return 快捷会签签署人信息建造器
         * @since 2.5.0
         */
        @Override
        public Builder withContact(String contact) {
            super.withContact(contact);
            return this;
        }

        /**
         * @param reason
         *            签署原因
         * @return 快捷会签签署人信息建造器
         * @since 2.5.0
         */
        @Override
        public Builder withReason(String reason) {
            super.withReason(reason);
            return this;
        }

        /**
         * 构建一个新的{@link CountersignatureSigner}对象
         * 
         * @since 2.5.0
         */
        @Override
        public CountersignatureSigner build() {
            SignerInfo signerInfo = super.build();
            return new CountersignatureSigner(idCardType, signerInfo.getName(), signerInfo.getOrgnizationName(),
                    signerInfo.getIdCardNo(), signerInfo.getLocation(), signerInfo.getContact(),
                    signerInfo.getReason());
        }

    }
}
