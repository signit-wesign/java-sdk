/*
 * Copyright © 2022 signit.cn. All rights reserved.
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
package cn.signit.sdk.pojo.request.relative;

import cn.signit.sdk.pojo.request.AbstractSignitRequest;
import cn.signit.sdk.pojo.response.relative.UserEnterpriseRelativeResponse;

/**
* 描述： 相对方企业信息响应对象
* @author xiazhitao
*/
public class UserEnterpriseRelativeResquest extends AbstractSignitRequest<UserEnterpriseRelativeResponse> {

    @Override public Class<UserEnterpriseRelativeResponse> getResponseClass() {
        return UserEnterpriseRelativeResponse.class;
    }

    /**
     * 创建机构账号的唯一标识。可将企业证件号、企业邮箱地址等作为此账号的唯一标识。
     */
    private String uerThirdPartyUserId;

    /**
     * 姓名
     */
    private String uerName;

    /**
     * 机构证件类型，\r\n0 - 统一社会信用代码（默认）；\r\n1 - 工商注册号；
     * 具体见UserEnterpriseRelativeInfoIdType
     */
    private String uerIdType;

    /**
     * 机构证件号，需传入真实存在的证件信息
     */
    private String uerIdCode;

    /**
     * 法定代表人证件号
     */
    private String uerOrgLegalIdCode;

    /**
     * 法定代表人名称
     */
    private String uerOrgLegalName;


    /**
     * 调用方自定义标识，易企签会原封不动返回.
     *
     * @since 1.0.5
     */
    private String customTag;

    /**
     * 应用ID. <br/>
     * 通过OAUTH2.0认证成功后的上下文中获取到
     *
     * @since 1.0.0
     */
    private String appId;


    public String getUerThirdPartyUserId() {
        return uerThirdPartyUserId;
    }

    public void setUerThirdPartyUserId(String uerThirdPartyUserId) {
        this.uerThirdPartyUserId = uerThirdPartyUserId;
    }

    public String getUerName() {
        return uerName;
    }

    public void setUerName(String uerName) {
        this.uerName = uerName;
    }

    public String getUerIdType() {
        return uerIdType;
    }

    public void setUerIdType(String uerIdType) {
        this.uerIdType = uerIdType;
    }

    public String getUerIdCode() {
        return uerIdCode;
    }

    public void setUerIdCode(String uerIdCode) {
        this.uerIdCode = uerIdCode;
    }

    public String getUerOrgLegalIdCode() {
        return uerOrgLegalIdCode;
    }

    public void setUerOrgLegalIdCode(String uerOrgLegalIdCode) {
        this.uerOrgLegalIdCode = uerOrgLegalIdCode;
    }

    public String getUerOrgLegalName() {
        return uerOrgLegalName;
    }

    public void setUerOrgLegalName(String uerOrgLegalName) {
        this.uerOrgLegalName = uerOrgLegalName;
    }

    public String getCustomTag() {
        return customTag;
    }

    public void setCustomTag(String customTag) {
        this.customTag = customTag;
    }


    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public UserEnterpriseRelativeResquest(){

    }

    public UserEnterpriseRelativeResquest(Builder builder){
        this.uerThirdPartyUserId = builder.uerThirdPartyUserId;
        this.uerName = builder.uerName;
        this.uerIdType = builder.uerIdType;
        this.uerIdCode = builder.uerIdCode;
        this.uerOrgLegalIdCode = builder.uerOrgLegalIdCode;
        this.uerOrgLegalName = builder.uerOrgLegalName;
        this.customTag = builder.customTag;
        this.appId = builder.appId;
    }

    public class Builder implements cn.signit.sdk.pojo.Builder<UserEnterpriseRelativeResquest> {

        private String uerThirdPartyUserId;
        private String uerName;
        private String uerIdType;
        private String uerIdCode;
        private String uerOrgLegalIdCode;
        private String uerOrgLegalName;
        private String customTag;
        private String invokeNo;
        private String appId;

        public Builder(){

        }

        public Builder(UserEnterpriseRelativeResquest info){
            this.uerThirdPartyUserId = info.uerThirdPartyUserId;
            this.uerName = info.uerName;
            this.uerIdType = info.uerIdType;
            this.uerIdCode = info.uerIdCode;
            this.uerOrgLegalIdCode = info.uerOrgLegalIdCode;
            this.uerOrgLegalName = info.uerOrgLegalName;
            this.customTag = info.customTag;
            this.appId = info.appId;
        }


        /**
         *
         * @param uerThirdPartyUserId
         *            创建机构账号的唯一标识。可将企业证件号、企业邮箱地址等作为此账号的唯一标识。
         * @return 相对方企业信息对象建造器
         * @since 2.0.0
         */
        public Builder uerThirdPartyUserId(String uerThirdPartyUserId){
            this.uerThirdPartyUserId = uerThirdPartyUserId;
            return this;
        }

        /**
         *
         * @param uerName
         *            企业名称
         * @return 相对方企业信息对象建造器
         * @since 2.0.0
         */
        public Builder uerName(String uerName){
            this.uerName = uerName;
            return this;
        }

        /**
         *
         * @param uerIdType
         *            机构证件类型（具体见UserEnterpriseRelativeInfoIdType）
         * @return 相对方企业信息对象建造器
         * @since 2.0.0
         */
        public Builder uerIdType(String uerIdType){
            this.uerIdType = uerIdType;
            return this;
        }

        /**
         *
         * @param uerIdCode
         *            机构证件号，需传入真实存在的证件信息
         * @return 相对方企业信息对象建造器
         * @since 2.0.0
         */
        public Builder uerIdCode(String uerIdCode){
            this.uerIdCode = uerIdCode;
            return this;
        }

        /**
         *
         * @param uerOrgLegalIdCode
         *            法定代表人证件号
         * @return 相对方企业信息对象建造器
         * @since 2.0.0
         */
        public Builder uerOrgLegalIdCode(String uerOrgLegalIdCode){
            this.uerOrgLegalIdCode = uerOrgLegalIdCode;
            return this;
        }

        /**
         *
         * @param uerOrgLegalName
         *            法定代表人名称
         * @return 相对方企业信息对象建造器
         * @since 2.0.0
         */
        public Builder uerOrgLegalName(String uerOrgLegalName){
            this.uerOrgLegalName = uerOrgLegalName;
            return this;
        }

        /**
         *
         * @param customTag
         *            调用方自定义标识
         * @return 相对方企业信息对象建造器
         * @since 2.0.0
         */
        public Builder customTag(String customTag){
            this.customTag = customTag;
            return this;
        }

        /**
         *
         * @param invokeNo
         *            本次调用的唯一标识
         * @return 相对方企业信息对象建造器
         * @since 2.0.0
         */
        public Builder invokeNo(String invokeNo){
            this.invokeNo = invokeNo;
            return this;
        }

        /**
         *
         * @param appId
         *            应用ID
         * @return 相对方企业信息对象建造器
         * @since 2.0.0
         */
        public Builder appId(String appId){
            this.appId = appId;
            return this;
        }

        @Override
        public UserEnterpriseRelativeResquest build() {
            return new UserEnterpriseRelativeResquest(this);
        }
    }

}
