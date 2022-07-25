/*
 * Copyright © 2019 signit.cn. All rights reserved.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
package cn.signit.sdk.pojo;

/**
 * 企业元数据.
 * 
 * @author RyanChang
 * @since 1.4.0
 */
public class EnterpriseMetadata {
    /**
     * 企业名称.
     * 
     * @since 1.4.0
     */
    private String name;
    /**
     * 行业类型.
     * 
     * @since 1.4.0
     */
    private String industryType;
    /**
     * 统一社会信用代码.
     * 
     * @since 1.4.0
     */
    private String unifiedSocialCreditCode;

    public EnterpriseMetadata() {
    }

    /**
     * 完整构造方法.
     *
     * @param name
     *            企业名称.
     * @param industryType
     *            行业类型.
     * @param unifiedSocialCreditCode
     *            统一社会信用代码.
     */
    public EnterpriseMetadata(String name, String industryType, String unifiedSocialCreditCode) {
        super();
        this.name = name;
        this.industryType = industryType;
        this.unifiedSocialCreditCode = unifiedSocialCreditCode;
    }

    /**
     * @since 2.5.0
     * @return 返回一个新的{@link Builder}对象
     */
    public static Builder builder() {
        return new Builder();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIndustryType() {
        return industryType;
    }

    public void setIndustryType(String industryType) {
        this.industryType = industryType;
    }

    public String getUnifiedSocialCreditCode() {
        return unifiedSocialCreditCode;
    }

    public void setUnifiedSocialCreditCode(String unifiedSocialCreditCode) {
        this.unifiedSocialCreditCode = unifiedSocialCreditCode;
    }

    /**
     * 企业元数据建造器
     * 
     * @since 2.5.0
     */
    public static class Builder implements cn.signit.sdk.pojo.Builder<EnterpriseMetadata> {
        /**
         * 企业名称.
         * 
         * @since 1.4.0
         */
        private String name;
        /**
         * 行业类型.
         * 
         * @since 1.4.0
         */
        private String industryType;
        /**
         * 统一社会信用代码.
         * 
         * @since 1.4.0
         */
        private String unifiedSocialCreditCode;

        /**
         * @param name
         *            企业名称.
         * @since 2.5.0
         * @return 企业元数据建造器
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * @param industryType
         *            行业类型.
         * @since 2.5.0
         * @return 企业元数据建造器
         */
        public Builder industryType(String industryType) {
            this.industryType = industryType;
            return this;
        }

        /**
         * @param unifiedSocialCreditCode
         *            统一社会信用代码.
         * @since 2.5.0
         * @return 企业元数据建造器
         */
        public Builder unifiedSocialCreditCode(String unifiedSocialCreditCode) {
            this.unifiedSocialCreditCode = unifiedSocialCreditCode;
            return this;
        }

        /**
         * @since 2.5.0
         * @return 返回一个新的{@link EnterpriseMetadata}对象
         */
        @Override
        public EnterpriseMetadata build() {
            return new EnterpriseMetadata(name, industryType, unifiedSocialCreditCode);
        }

    }
}
