/*
 * Copyright © 2023 signit.cn. All rights reserved.
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
* 描述： 相对方业务信息数据传输对象
* @author xiazhitao
*/
public class UserEnterpriseRelativeInfo {

    /**
     * 当前添加的机构相对方全局唯一ID
     */
    private String uerWsid;

    /**
     * 当前企业相对方的拥有者全局唯一ID：\r\nWSID_PUSR_xxx - 属于某个个人用户的相对方；\r\nWSID_ENTE_xxx - 属于某个企业的相对方；\r\nWSID_EUSR_xxx/WSID_EMEM_xxx - 属于某个企业下某用户的相对方；
     */
    private String uerOwnerWsid;

    /**
     * 当前机构相对方账号状态：\r\n0 - 可用；\r\n1 - 冻结（临时不可用，可解冻为”可用“状态）；\r\n2 - 注销；\r\n3 - 禁用（不可解冻，需要人工干预）；
     * 具体见UserRelativeStatus枚举类
     */
    private String uerStatus;

    /**
     * 当前状态描述
     */
    private String uerStatusDescription;

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
     * 当前相对方的同步状态，\r\n0 - 待从外部平台同步；\r\n1 - 从外部平台同步进行中；\r\n2 - 从外部平台同步已完成；\r\n3 - 从外部平台同步失败；
     * \r\n10 - 待同步到签章平台中；\r\n11- 同步到签章平台进行中；\r\n12 - 同步到签章平台已完成；\r\n13 - 同步到签章平台失败；
     * 具体见枚举类UserRelativeSyncStatus
     */
    private String uerSyncStatus;

    /**
     * 当前相对方的同步状态描述
     */
    private String uerSyncStatusDescription;

    /**
     * 同步规则：\r\n0 - 签章平台自动完成机构帐号注册（默认）；\r\n1 - 签章平台自动完成机构帐号注册+自动机构实名认证；
     * \r\n2 - 签章平台自动完成机构帐号注册+自动个人帐号注册（基于法人信息，如果没有，创建临时帐号）+自动加入机构；
     * \r\n3 - 签章平台自动完成机构帐号注册+自动机构实名认证+自动个人帐号注册（基于法人信息，此规则，法人信息必填）+自动个人实名认证（基于法人信息，此规则，法人信息必填）+自动加入机构；
     * 具体见枚举类UserEnterpriseRelativeSyncRule
     */
    private String uerSyncRule;

    /**
     * 同步当前相对方到电子签章平台的个人用户全局唯一ID
     */
    private String uerSyncEnterpriseWsid;

    /**
     * 调用方自定义标识，易企签会原封不动返回.
     *
     * @since 1.0.5
     */
    private String customTag;

    /**
     * 本次调用的唯一标识.
     *
     * @since 1.0.0
     */
    private String invokeNo;

    /**
     * 应用ID. <br/>
     * 通过OAUTH2.0认证成功后的上下文中获取到
     *
     * @since 1.0.0
     */
    private String appId;

    public String getUerWsid() {
        return uerWsid;
    }

    public void setUerWsid(String uerWsid) {
        this.uerWsid = uerWsid;
    }

    public String getUerOwnerWsid() {
        return uerOwnerWsid;
    }

    public void setUerOwnerWsid(String uerOwnerWsid) {
        this.uerOwnerWsid = uerOwnerWsid;
    }

    public String getUerStatus() {
        return uerStatus;
    }

    public void setUerStatus(String uerStatus) {
        this.uerStatus = uerStatus;
    }

    public String getUerStatusDescription() {
        return uerStatusDescription;
    }

    public void setUerStatusDescription(String uerStatusDescription) {
        this.uerStatusDescription = uerStatusDescription;
    }

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

    public String getUerSyncStatus() {
        return uerSyncStatus;
    }

    public void setUerSyncStatus(String uerSyncStatus) {
        this.uerSyncStatus = uerSyncStatus;
    }

    public String getUerSyncStatusDescription() {
        return uerSyncStatusDescription;
    }

    public void setUerSyncStatusDescription(String uerSyncStatusDescription) {
        this.uerSyncStatusDescription = uerSyncStatusDescription;
    }

    public String getUerSyncRule() {
        return uerSyncRule;
    }

    public void setUerSyncRule(String uerSyncRule) {
        this.uerSyncRule = uerSyncRule;
    }

    public String getUerSyncEnterpriseWsid() {
        return uerSyncEnterpriseWsid;
    }

    public void setUerSyncEnterpriseWsid(String uerSyncEnterpriseWsid) {
        this.uerSyncEnterpriseWsid = uerSyncEnterpriseWsid;
    }

    public String getCustomTag() {
        return customTag;
    }

    public void setCustomTag(String customTag) {
        this.customTag = customTag;
    }

    public String getInvokeNo() {
        return invokeNo;
    }

    public void setInvokeNo(String invokeNo) {
        this.invokeNo = invokeNo;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public UserEnterpriseRelativeInfo(){

    }

    public UserEnterpriseRelativeInfo(Builder builder){
        this.uerWsid = builder.uerWsid;
        this.uerOwnerWsid = builder.uerOwnerWsid;
        this.uerStatus = builder.uerStatus;
        this.uerStatusDescription = builder.uerSyncStatusDescription;
        this.uerThirdPartyUserId = builder.uerThirdPartyUserId;
        this.uerName = builder.uerName;
        this.uerIdType = builder.uerIdType;
        this.uerIdCode = builder.uerIdCode;
        this.uerOrgLegalIdCode = builder.uerOrgLegalIdCode;
        this.uerOrgLegalName = builder.uerOrgLegalName;
        this.uerSyncStatus = builder.uerSyncStatus;
        this.uerSyncStatusDescription = builder.uerSyncStatusDescription;
        this.uerSyncRule = builder.uerSyncRule;
        this.uerSyncEnterpriseWsid = builder.uerSyncEnterpriseWsid;
        this.customTag = builder.customTag;
        this.invokeNo = builder.invokeNo;
        this.appId = builder.appId;
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder implements cn.signit.sdk.pojo.Builder<UserEnterpriseRelativeInfo> {

        private String uerWsid;
        private String uerOwnerWsid;
        private String uerStatus;
        private String uerStatusDescription;
        private String uerThirdPartyUserId;
        private String uerName;
        private String uerIdType;
        private String uerIdCode;
        private String uerOrgLegalIdCode;
        private String uerOrgLegalName;
        private String uerSyncStatus;
        private String uerSyncStatusDescription;
        private String uerSyncRule;
        private String uerSyncEnterpriseWsid;
        private String customTag;
        private String invokeNo;
        private String appId;

        public Builder(){

        }

        public Builder(UserEnterpriseRelativeInfo info){
            this.uerWsid = info.uerWsid;
            this.uerOwnerWsid = info.uerOwnerWsid;
            this.uerStatus = info.uerStatus;
            this.uerStatusDescription = info.uerSyncStatusDescription;
            this.uerThirdPartyUserId = info.uerThirdPartyUserId;
            this.uerName = info.uerName;
            this.uerIdType = info.uerIdType;
            this.uerIdCode = info.uerIdCode;
            this.uerOrgLegalIdCode = info.uerOrgLegalIdCode;
            this.uerOrgLegalName = info.uerOrgLegalName;
            this.uerSyncStatus = info.uerSyncStatus;
            this.uerSyncStatusDescription = info.uerSyncStatusDescription;
            this.uerSyncRule = info.uerSyncRule;
            this.uerSyncEnterpriseWsid = info.uerSyncEnterpriseWsid;
            this.customTag = info.customTag;
            this.invokeNo = info.invokeNo;
            this.appId = info.appId;
        }

        /**
         *
         * @param uerWsid
         *            当前添加的机构相对方全局唯一ID
         * @return 相对方企业信息对象建造器
         * @since 2.0.0
         */
        public Builder uerWsid(String uerWsid){
            this.uerWsid = uerWsid;
            return this;
        }

        /**
         *
         * @param uerOwnerWsid
         *            当前企业相对方的拥有者全局唯一ID
         * @return 相对方企业信息对象建造器
         * @since 2.0.0
         */
        public Builder uerOwnerWsid(String uerOwnerWsid){
            this.uerOwnerWsid = uerOwnerWsid;
            return this;
        }

        /**
         *
         * @param uerStatus
         *            当前机构相对方账号状态（具体见UserRelativeStatus枚举类）
         * @return 相对方企业信息对象建造器
         * @since 2.0.0
         */
        public Builder uerStatus(String uerStatus){
            this.uerStatus = uerStatus;
            return this;
        }

        /**
         *
         * @param uerStatusDescription
         *            当前状态描述
         * @return 相对方企业信息对象建造器
         * @since 2.0.0
         */
        public Builder uerStatusDescription(String uerStatusDescription){
            this.uerStatus = uerStatus;
            return this;
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
         * @param uerSyncStatus
         *            当前相对方的同步状态（具体见枚举类UserRelativeSyncStatus）
         * @return 相对方企业信息对象建造器
         * @since 2.0.0
         */
        public Builder uerSyncStatus(String uerSyncStatus){
            this.uerSyncStatus = uerSyncStatus;
            return this;
        }

        /**
         *
         * @param uerSyncStatusDescription
         *            当前相对方的同步状态描述
         * @return 相对方企业信息对象建造器
         * @since 2.0.0
         */
        public Builder uerSyncStatusDescription(String uerSyncStatusDescription){
            this.uerSyncStatusDescription = uerSyncStatusDescription;
            return this;
        }

        /**
         *
         * @param uerSyncEnterpriseWsid
         *            同步当前相对方到电子签章平台的个人用户全局唯一ID
         * @return 相对方企业信息对象建造器
         * @since 2.0.0
         */
        public Builder uerSyncEnterpriseWsid(String uerSyncEnterpriseWsid){
            this.uerSyncEnterpriseWsid = uerSyncEnterpriseWsid;
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
        public UserEnterpriseRelativeInfo build() {
            return new UserEnterpriseRelativeInfo(this);
        }
    }


}
