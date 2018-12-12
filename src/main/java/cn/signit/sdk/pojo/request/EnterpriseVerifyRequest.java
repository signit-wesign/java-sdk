package cn.signit.sdk.pojo.request;

import java.util.List;

import cn.signit.sdk.pojo.EnterpriseAgent;
import cn.signit.sdk.pojo.EnterpriseBankCardInfo;
import cn.signit.sdk.pojo.EnterpriseLegalPerson;
import cn.signit.sdk.pojo.IdCardImage;
import cn.signit.sdk.pojo.response.EnterpriseVerifyResponse;
import cn.signit.sdk.type.AcceptDataType;
import cn.signit.sdk.type.EnterpriseAuthType;
import cn.signit.sdk.util.ListBuilder;

/**
 * 企业实名认证请求数据结构.
 * 
 * @since 1.0.2
 */
public class EnterpriseVerifyRequest extends AbstractSignitRequest<EnterpriseVerifyResponse> {
    /**
     * 待认证企业名称.
     *
     * @since 1.0.2
     */
    private String name;
    /**
     * 待认证企业电话.
     *
     * @since 1.0.2
     */
    private String telephone;
    /**
     * 经办人信息.
     *
     * @since 1.0.2
     */
    private EnterpriseAgent agent;
    /**
     * 经办人信息.
     *
     * @since 1.0.2
     */
    private EnterpriseLegalPerson legalPerson;
    /**
     * 统一社会信用代码.
     *
     * @since 1.0.2
     */
    private String unifiedSocialCode;
    /**
     * 营业执照照片信息.
     *
     * @since 1.0.2
     */
    private IdCardImage businessLicenceImage;
    /**
     * 组织机构代码（已由“统一社会信用代码”替换）.
     *
     * @since 1.0.2
     */
    private String orgCode;
    /**
     * 组织机构代码证照片信息.
     *
     * @since 1.0.2
     */
    private IdCardImage orgImage;
    /**
     * 工商注册号（已由“统一社会信用代码”替换）.
     *
     * @since 1.0.2
     */
    private String registCode;
    /**
     * LEGAL_PERSON-法人认证，AGENT-经办人认证.
     *
     * @since 1.0.2
     */
    private EnterpriseAuthType authType;
    /**
     * 企业对公银行信息.
     *
     * @since 1.0.2
     */
    private EnterpriseBankCardInfo bankCardInfo;
    /**
     * 额外认证所需照片信息数组.
     *
     * @since 1.0.2
     */
    private List<IdCardImage> extraAuthImages;

    public String getName() {
        return name;
    }

    public String getTelephone() {
        return telephone;
    }

    public EnterpriseAgent getAgent() {
        return agent;
    }

    public EnterpriseLegalPerson getLegalPerson() {
        return legalPerson;
    }

    public String getUnifiedSocialCode() {
        return unifiedSocialCode;
    }

    public IdCardImage getBusinessLicenceImage() {
        return businessLicenceImage;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public IdCardImage getOrgImage() {
        return orgImage;
    }

    public String getRegistCode() {
        return registCode;
    }

    public EnterpriseAuthType getAuthType() {
        return authType;
    }

    public EnterpriseBankCardInfo getBankCardInfo() {
        return bankCardInfo;
    }

    public List<IdCardImage> getExtraAuthImages() {
        return extraAuthImages;
    }

    public EnterpriseVerifyRequest() {

    }

    public EnterpriseVerifyRequest(Builder builder) {
        this.name = builder.name;
        this.telephone = builder.telephone;
        this.agent = builder.agent;
        this.legalPerson = builder.legalPerson;
        this.unifiedSocialCode = builder.unifiedSocialCode;
        this.businessLicenceImage = builder.businessLicenceImage;
        this.orgCode = builder.orgCode;
        this.orgImage = builder.orgImage;
        this.registCode = builder.registCode;
        this.authType = builder.authType;
        this.bankCardInfo = builder.bankCardInfo;
        this.extraAuthImages = builder.extraAuthImages;
        this.customTag = builder.customTag;
        this.returnUrl = builder.returnUrl;
        this.acceptDataType = builder.acceptDataType;
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder implements cn.signit.sdk.pojo.Builder<EnterpriseVerifyRequest> {
        private String name;
        private String telephone;
        private EnterpriseAgent agent;
        private EnterpriseLegalPerson legalPerson;
        private String unifiedSocialCode;
        private IdCardImage businessLicenceImage;
        private String orgCode;
        private IdCardImage orgImage;
        private String registCode;
        private EnterpriseAuthType authType;
        private EnterpriseBankCardInfo bankCardInfo;
        private List<IdCardImage> extraAuthImages;
        private String customTag;
        private String returnUrl;
        private AcceptDataType acceptDataType;

        public Builder() {

        }

        public Builder(EnterpriseVerifyRequest enterpriseVerifyRequest) {
            this.name = enterpriseVerifyRequest.name;
            this.telephone = enterpriseVerifyRequest.telephone;
            this.agent = enterpriseVerifyRequest.agent;
            this.legalPerson = enterpriseVerifyRequest.legalPerson;
            this.unifiedSocialCode = enterpriseVerifyRequest.unifiedSocialCode;
            this.businessLicenceImage = enterpriseVerifyRequest.businessLicenceImage;
            this.orgCode = enterpriseVerifyRequest.orgCode;
            this.orgImage = enterpriseVerifyRequest.orgImage;
            this.registCode = enterpriseVerifyRequest.registCode;
            this.authType = enterpriseVerifyRequest.authType;
            this.bankCardInfo = enterpriseVerifyRequest.bankCardInfo;
            this.extraAuthImages = enterpriseVerifyRequest.extraAuthImages;
            this.customTag = enterpriseVerifyRequest.customTag;
            this.returnUrl = enterpriseVerifyRequest.returnUrl;
            this.acceptDataType = enterpriseVerifyRequest.acceptDataType;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder telephone(String telephone) {
            this.telephone = telephone;
            return this;
        }

        public Builder agent(EnterpriseAgent agent) {
            this.agent = agent;
            return this;
        }

        public Builder legalPerson(EnterpriseLegalPerson legalPerson) {
            this.legalPerson = legalPerson;
            return this;
        }

        public Builder unifiedSocialCode(String unifiedSocialCode) {
            this.unifiedSocialCode = unifiedSocialCode;
            return this;
        }

        public Builder businessLicenceImage(IdCardImage businessLicenceImage) {
            this.businessLicenceImage = businessLicenceImage;
            return this;
        }

        public Builder orgCode(String orgCode) {
            this.orgCode = orgCode;
            return this;
        }

        public Builder orgImage(IdCardImage orgImage) {
            this.orgImage = orgImage;
            return this;
        }

        public Builder registCode(String registCode) {
            this.registCode = registCode;
            return this;
        }

        public Builder authType(EnterpriseAuthType authType) {
            this.authType = authType;
            return this;
        }

        public Builder bankCardInfo(EnterpriseBankCardInfo bankCardInfo) {
            this.bankCardInfo = bankCardInfo;
            return this;
        }

        public Builder extraAuthImages(List<IdCardImage> extraAuthImages) {
            this.extraAuthImages = extraAuthImages;
            return this;
        }

        public Builder customTag(String customTag) {
            this.customTag = customTag;
            return this;
        }

        public Builder returnUrl(String returnUrl) {
            this.returnUrl = returnUrl;
            return this;
        }

        public Builder acceptDataType(AcceptDataType acceptDataType) {
            this.acceptDataType = acceptDataType;
            return this;
        }

        public Builder agent(EnterpriseAgent.Builder builder) {
            if (builder != null) {
                this.agent = builder.build();
            }
            return this;
        }

        public Builder legalPerson(EnterpriseLegalPerson.Builder builder) {
            if (builder != null) {
                this.legalPerson = builder.build();
            }
            return this;
        }

        public Builder businessLicenceImage(IdCardImage.Builder builder) {
            if (builder != null) {
                this.businessLicenceImage = builder.build();
            }
            return this;
        }

        public Builder orgImage(IdCardImage.Builder builder) {
            if (builder != null) {
                this.orgImage = builder.build();
            }
            return this;
        }

        public Builder bankCardInfo(EnterpriseBankCardInfo.Builder builder) {
            if (builder != null) {
                this.bankCardInfo = builder.build();
            }
            return this;
        }

        public Builder extraAuthImages(IdCardImage.Builder... builders) {
            this.extraAuthImages = ListBuilder.buildList(builders);
            return this;
        }

        public EnterpriseVerifyRequest build() {
            return new EnterpriseVerifyRequest(this);
        }
    }

    @Override
    public Class<EnterpriseVerifyResponse> getResponseClass() {
        return EnterpriseVerifyResponse.class;
    }
}
