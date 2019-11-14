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
 * @since 2.0.0
 */
public class EnterpriseVerifyRequest extends AbstractSignitRequest<EnterpriseVerifyResponse> {
    /**
     * 待认证企业名称.
     *
     * @since 2.0.0
     */
    private String name;
    /**
     * 待认证企业电话.
     *
     * @since 2.0.0
     */
    @Deprecated
    private String telephone;
    /**
     * 经办人信息.
     *
     * @since 2.0.0
     */
    private EnterpriseAgent agent;
    /**
     * 法人信息.
     *
     * @since 2.0.0
     */
    private EnterpriseLegalPerson legalPerson;
    /**
     * 统一社会信用代码.
     *
     * @since 2.0.0
     */
    private String unifiedSocialCode;
    /**
     * 营业执照照片信息.
     *
     * @since 2.0.0
     */
    private IdCardImage businessLicenceImage;
    /**
     * 组织机构代码（已由“统一社会信用代码”替换）.
     *
     * @since 2.0.0
     */
    private String orgCode;
    /**
     * 组织机构代码证照片信息.
     *
     * @since 2.0.0
     */
    private IdCardImage orgImage;
    /**
     * 工商注册号（已由“统一社会信用代码”替换）.
     *
     * @since 2.0.0
     */
    private String registCode;
    /**
     * LEGAL_PERSON-法人认证，AGENT-经办人认证.
     *
     * @since 2.0.0
     */
    private EnterpriseAuthType authType;
    /**
     * 企业对公银行信息.
     *
     * @since 2.0.0
     */
    private EnterpriseBankCardInfo bankCardInfo;
    /**
     * 额外认证所需照片信息数组.
     *
     * @since 2.0.0
     */
    private List<IdCardImage> extraAuthImages;
    
    /**
     * 启用嵌入模式，调用方系统中直接嵌入易企签WEB流程时设置为true，签署流程消息只会通过webhook事件消息方式通知，用户在易企签平台设置的短信/邮件等消息将自动屏蔽。非必填，默认值：false.
     *
     * @since 2.5.1
     */
    private Boolean enableEmbeddedMode;

    public Boolean getEnableEmbeddedMode() {
        return enableEmbeddedMode;
    }

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
        this.enableEmbeddedMode = builder.enableEmbeddedMode;
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    /**
     * 企业实名认证请求对象建筑器
     * 
     * @since 2.0.0
     */
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
        private Boolean enableEmbeddedMode;

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
            this.enableEmbeddedMode = enterpriseVerifyRequest.enableEmbeddedMode;
        }

        /**
         * 
         * @param name
         *            待认证的企业名称
         * @return 企业实名认证请求对象建筑器{@link EnterpriseVerifyRequest.Builder}
         * @since 2.0.0
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * 
         * @param telephone
         *            待认证的企业电话
         * @return 企业实名认证请求对象建筑器{@link EnterpriseVerifyRequest.Builder}
         * @since 2.0.0
         */
        @Deprecated
        public Builder telephone(String telephone) {
            this.telephone = telephone;
            return this;
        }

        /**
         * 
         * @param agent
         *            经办人信息 {@link EnterpriseAgent}
         * @return 企业实名认证请求对象建筑器{@link EnterpriseVerifyRequest.Builder}
         * @since 2.0.0
         */
        public Builder agent(EnterpriseAgent agent) {
            this.agent = agent;
            return this;
        }

        /**
         * 
         * @param legalPerson
         *            法人信息 {@link EnterpriseLegalPerson}
         * @return 企业实名认证请求对象建筑器{@link EnterpriseVerifyRequest.Builder}
         * @since 2.0.0
         */
        public Builder legalPerson(EnterpriseLegalPerson legalPerson) {
            this.legalPerson = legalPerson;
            return this;
        }

        /**
         * 
         * @param unifiedSocialCode
         *            统一社会信用代码
         * @return 企业实名认证请求对象建筑器{@link EnterpriseVerifyRequest.Builder}
         * @since 2.0.0
         */
        public Builder unifiedSocialCode(String unifiedSocialCode) {
            this.unifiedSocialCode = unifiedSocialCode;
            return this;
        }

        /**
         * 
         * @param businessLicenceImage
         *            营业执照图像信息 {@link IdCardImage}
         * @return 企业实名认证请求对象建筑器{@link EnterpriseVerifyRequest.Builder}
         * @since 2.0.0
         */
        public Builder businessLicenceImage(IdCardImage businessLicenceImage) {
            this.businessLicenceImage = businessLicenceImage;
            return this;
        }

        /**
         * 
         * @param orgCode
         *            组织机构代码（已由“统一社会信用代码”替换
         *            {@link Builder#unifiedSocialCode(String)}
         * @return 企业实名认证请求对象建筑器{@link EnterpriseVerifyRequest.Builder}
         * @since 2.0.0
         */
        @Deprecated
        public Builder orgCode(String orgCode) {
            this.orgCode = orgCode;
            return this;
        }

        /**
         * 
         * @param orgImage
         *            组织机构代码证图像信息（已由“统一社会信用代码”替换）
         *            {@link Builder#unifiedSocialCode(String)}
         * @return 企业实名认证请求对象建筑器{@link EnterpriseVerifyRequest.Builder}
         * @since 2.0.0
         */
        public Builder orgImage(IdCardImage orgImage) {
            this.orgImage = orgImage;
            return this;
        }

        /**
         * 
         * @param registCode
         *            工商注册号（已由“统一社会信用代码”替换）{@link Builder#unifiedSocialCode(String)}
         * @return 企业实名认证请求对象建筑器{@link EnterpriseVerifyRequest.Builder}
         * @since 2.0.0
         */
        public Builder registCode(String registCode) {
            this.registCode = registCode;
            return this;
        }

        /**
         * 
         * @param authType
         *            LEGAL_PERSON-法人认证，AGENT-代理认证 {@link EnterpriseAuthType}
         * @return 企业实名认证请求对象建筑器{@link EnterpriseVerifyRequest.Builder}
         * @since 2.0.0
         */
        public Builder authType(EnterpriseAuthType authType) {
            this.authType = authType;
            return this;
        }

        /**
         * 
         * @param bankCardInfo
         *            对公银行信息 {@link EnterpriseBankCardInfo}
         * @return 企业实名认证请求对象建筑器{@link EnterpriseVerifyRequest.Builder}
         * @since 2.0.0
         */
        public Builder bankCardInfo(EnterpriseBankCardInfo bankCardInfo) {
            this.bankCardInfo = bankCardInfo;
            return this;
        }

        /**
         * 
         * @param extraAuthImages
         *            认证所需额外照片信息列表 {@link IdCardImage}
         * @return 企业实名认证请求对象建筑器{@link EnterpriseVerifyRequest.Builder}
         * @since 2.0.0
         */
        public Builder extraAuthImages(List<IdCardImage> extraAuthImages) {
            this.extraAuthImages = extraAuthImages;
            return this;
        }

        /**
         * 
         * @param customTag
         *            调用方自定义标识，易企签会原封不动返回。
         * @return 企业实名认证请求对象建筑器{@link EnterpriseVerifyRequest.Builder}
         * @since 2.0.0
         */
        public Builder customTag(String customTag) {
            this.customTag = customTag;
            return this;
        }

        /**
         * 
         * @param returnUrl
         *            调用方自定义要求易企签的WEB平台在流程结束后需要跳转的指定URL地址
         * @return 企业实名认证请求对象建筑器{@link EnterpriseVerifyRequest.Builder}
         * @since 2.0.0
         */
        public Builder returnUrl(String returnUrl) {
            this.returnUrl = returnUrl;
            return this;
        }

        /**
         * 
         * @param acceptDataType
         *            调用方接受的响应数据类型，支持：BASE64/URL {@link AcceptDataType}
         *            默认为BASE64
         * @return 企业实名认证请求对象建筑器{@link EnterpriseVerifyRequest.Builder}
         * @since 2.0.0
         */
        public Builder acceptDataType(AcceptDataType acceptDataType) {
            this.acceptDataType = acceptDataType;
            return this;
        }

        /**
         * 
         * @param builder
         *            经办人信息对象建筑器 {@link EnterpriseAgent.Builder}
         * @return 企业实名认证请求对象建筑器{@link EnterpriseVerifyRequest.Builder}
         * @since 2.0.0
         */
        public Builder agent(EnterpriseAgent.Builder builder) {
            if (builder != null) {
                this.agent = builder.build();
            }
            return this;
        }

        /**
         * 
         * @param builder
         *            法人信息对象建筑器 {@link EnterpriseLegalPerson.Builder}
         * @return 企业实名认证请求对象建筑器{@link EnterpriseVerifyRequest.Builder}
         * @since 2.0.0
         */
        public Builder legalPerson(EnterpriseLegalPerson.Builder builder) {
            if (builder != null) {
                this.legalPerson = builder.build();
            }
            return this;
        }

        /**
         * 
         * @param builder
         *            营业执照图像信息对象建筑器 {@link IdCardImage.Builder}
         * @return 企业实名认证请求对象建筑器{@link EnterpriseVerifyRequest.Builder}
         * @since 2.0.0
         */
        public Builder businessLicenceImage(IdCardImage.Builder builder) {
            if (builder != null) {
                this.businessLicenceImage = builder.build();
            }
            return this;
        }

        /**
         * 
         * @param builder
         *            组织机构代码证图像信息对象建筑器（已由“统一社会信用代码”替换）
         *            {@link Builder#unifiedSocialCode(String)}
         * @return 企业实名认证请求对象建筑器{@link EnterpriseVerifyRequest.Builder}
         * @since 2.0.0
         */
        public Builder orgImage(IdCardImage.Builder builder) {
            if (builder != null) {
                this.orgImage = builder.build();
            }
            return this;
        }

        /**
         * 
         * @param builder
         *            对公银行信息对象建筑器 {@link EnterpriseBankCardInfo.Builder}
         * @return 企业实名认证请求对象建筑器{@link EnterpriseVerifyRequest.Builder}
         * @since 2.0.0
         */
        public Builder bankCardInfo(EnterpriseBankCardInfo.Builder builder) {
            if (builder != null) {
                this.bankCardInfo = builder.build();
            }
            return this;
        }

        /**
         * 
         * @param builders
         *            认证额外所需照片信息对象建筑器列表
         * @return 企业实名认证请求对象建筑器{@link EnterpriseVerifyRequest.Builder}
         * @since 2.0.0
         */
        public Builder extraAuthImages(IdCardImage.Builder... builders) {
            this.extraAuthImages = ListBuilder.buildList(builders);
            return this;
        }
        
        /**
         *
         * @param enableEmbeddedMode
         *            启用嵌入模式，调用方系统中直接嵌入易企签WEB流程时设置为true，实名认证流程消息只会通过webhook事件消息方式通知，用户在易企签平台设置的短信/邮件等消息将自动屏蔽。非必填，默认值：false
         * @return 企业实名认证请求对象建筑器{@link EnterpriseVerifyRequest.Builder}
         * @since 2.5.1
         */
        public Builder enableEmbeddedMode(boolean enableEmbeddedMode) {
            this.enableEmbeddedMode = enableEmbeddedMode;
            return this;
        }

        /**
         * 
         * @return 企业实名认证请求对象
         * @since 2.0.0
         */
        public EnterpriseVerifyRequest build() {
            return new EnterpriseVerifyRequest(this);
        }
    }

    @Override
    public Class<EnterpriseVerifyResponse> getResponseClass() {
        return EnterpriseVerifyResponse.class;
    }
}
