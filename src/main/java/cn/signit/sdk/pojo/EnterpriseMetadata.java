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
}
