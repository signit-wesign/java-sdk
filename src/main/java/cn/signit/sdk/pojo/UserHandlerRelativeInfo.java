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
package cn.signit.sdk.pojo;


/**
* 描述： 相对经办人信息数据传输对象
* @author xiazhitao
* @since 1.0.0
*/
public class UserHandlerRelativeInfo {

    /**
     * 当前个人相对方的拥有者全局唯一ID：\r\nWSID_PUSR_xxx - 属于某个个人用户的相对方；\r\nWSID_ENTE_xxx - 属于某个企业的相对方；\r\nWSID_EUSR_xxx/WSID_EMEM_xxx - 属于某个企业下某用户的相对方；
     */
    private String uhrOwnerWsid;

    /**
     * 当前个人相对方账号状态：\r\n0 - 可用；\r\n1 - 冻结（临时不可用，可解冻为”可用“状态）；\r\n2 - 注销；\r\n3 - 禁用（不可解冻，需要人工干预）；
     * 具体见 UserRelativeStatus枚举类
     */
    private String uhrStatus;

    /**
     * 当前状态描述
     */
    private String uprStatusDescription;

    /**
     * 个人相对方全局唯一ID
     */
    private String uprWsid;

    /**
     * 机构相对方全局唯一ID
     */
    private String uerWsid;

    /**
     * 第三方平台个人账号的唯一标识。可将个人证件号、手机号、邮箱地址等作为此账号的唯一标识
     */
    private String uprThirdPartyUserId;

    /**
     * 创建机构账号的唯一标识。可将企业证件号、企业邮箱地址等作为此账号的唯一标识。
     */
    private String uerThirdPartyUserId;

    /**
     * 当前相对方的同步状态，\r\n0 - 待从外部平台同步；\r\n1 - 从外部平台同步进行中；\r\n2 - 从外部平台同步已完成；\r\n3 - 从外部平台同步失败；
     * \r\n10 - 待同步到签章平台中；\r\n11 - 同步到签章平台进行中；\r\n12 - 同步到签章平台已完成；\r\n13 - 同步到签章平台失败；
     * 具体见UserRelativeSyncStatus枚举类
     */
    private String uprSyncStatus;

    /**
     * 当前相对方的同步状态描述
     */
    private String uprSyncStatusDescription;

    /**
     * 本次调用的唯一标识.
     *
     * @since 1.0.0
     */
    private String invokeNo;

    public String getUhrOwnerWsid() {
        return uhrOwnerWsid;
    }

    public void setUhrOwnerWsid(String uhrOwnerWsid) {
        this.uhrOwnerWsid = uhrOwnerWsid;
    }

    public String getUhrStatus() {
        return uhrStatus;
    }

    public void setUhrStatus(String uhrStatus) {
        this.uhrStatus = uhrStatus;
    }

    public String getUprStatusDescription() {
        return uprStatusDescription;
    }

    public void setUprStatusDescription(String uprStatusDescription) {
        this.uprStatusDescription = uprStatusDescription;
    }

    public String getUprWsid() {
        return uprWsid;
    }

    public void setUprWsid(String uprWsid) {
        this.uprWsid = uprWsid;
    }

    public String getUerWsid() {
        return uerWsid;
    }

    public void setUerWsid(String uerWsid) {
        this.uerWsid = uerWsid;
    }

    public String getUprThirdPartyUserId() {
        return uprThirdPartyUserId;
    }

    public void setUprThirdPartyUserId(String uprThirdPartyUserId) {
        this.uprThirdPartyUserId = uprThirdPartyUserId;
    }

    public String getUerThirdPartyUserId() {
        return uerThirdPartyUserId;
    }

    public void setUerThirdPartyUserId(String uerThirdPartyUserId) {
        this.uerThirdPartyUserId = uerThirdPartyUserId;
    }

    public String getUprSyncStatus() {
        return uprSyncStatus;
    }

    public void setUprSyncStatus(String uprSyncStatus) {
        this.uprSyncStatus = uprSyncStatus;
    }

    public String getUprSyncStatusDescription() {
        return uprSyncStatusDescription;
    }

    public void setUprSyncStatusDescription(String uprSyncStatusDescription) {
        this.uprSyncStatusDescription = uprSyncStatusDescription;
    }

    public String getInvokeNo() {
        return invokeNo;
    }

    public void setInvokeNo(String invokeNo) {
        this.invokeNo = invokeNo;
    }

    public UserHandlerRelativeInfo(){

    }

    public UserHandlerRelativeInfo(Builder builder){
        this.uhrOwnerWsid = builder.uhrOwnerWsid;
        this.uhrStatus = builder.uhrStatus;
        this.uprStatusDescription = builder.uprStatusDescription;
        this.uprWsid = builder.uprWsid;
        this.uerWsid = builder.uerWsid;
        this.uprThirdPartyUserId = builder.uerThirdPartyUserId;
        this.uerThirdPartyUserId = builder.uprThirdPartyUserId;
        this.uprSyncStatus = builder.uprSyncStatus;
        this.uprSyncStatusDescription = builder.uprStatusDescription;
        this.invokeNo = builder.invokeNo;
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder implements cn.signit.sdk.pojo.Builder<UserHandlerRelativeInfo>{

        private String uhrOwnerWsid;
        private String uhrStatus;
        private String uprStatusDescription;
        private String uprWsid;
        private String uerWsid;
        private String uprThirdPartyUserId;
        private String uerThirdPartyUserId;
        private String uprSyncStatus;
        private String uprSyncStatusDescription;
        protected String invokeNo;

        public Builder(){

        }

        public Builder(UserHandlerRelativeInfo info){
            this.uhrOwnerWsid = info.uhrOwnerWsid;
            this.uhrStatus = info.uhrStatus;
            this.uprStatusDescription = info.uprStatusDescription;
            this.uprWsid = info.uprWsid;
            this.uerWsid = info.uerWsid;
            this.uprThirdPartyUserId = info.uerThirdPartyUserId;
            this.uerThirdPartyUserId = info.uprThirdPartyUserId;
            this.uprSyncStatus = info.uprSyncStatus;
            this.uprSyncStatusDescription = info.uprStatusDescription;
            this.invokeNo = info.invokeNo;
        }

        /**
         * @param uhrOwnerWsid
         *            当前个人相对方的拥有者全局唯一ID
         * @return 相对方经办人信息对象建造器
         * @since 2.0.0
         */
        public Builder uhrOwnerWsid(String uhrOwnerWsid){
            this.uhrOwnerWsid = uhrOwnerWsid;
            return this;
        }

        /**
         * @param uhrStatus
         *            当前个人相对方账号状态,具体见 UserRelativeStatus枚举类
         * @return 相对方经办人信息对象建造器
         * @since 2.0.0
         */
        public Builder uhrStatus(String uhrStatus){
            this.uhrStatus = uhrStatus;
            return this;
        }

        /**
         * @param uprStatusDescription
         *            当前状态描述
         * @return 相对方经办人信息对象建造器
         * @since 2.0.0
         */
        public Builder uprStatusDescription(String uprStatusDescription){
            this.uprStatusDescription = uprStatusDescription;
            return this;
        }

        /**
         * @param uprWsid
         *            个人相对方全局唯一ID
         * @return 相对方经办人信息对象建造器
         * @since 2.0.0
         */
        public Builder uprWsid(String uprWsid){
            this.uprWsid = uprWsid;
            return this;
        }

        /**
         * @param uerWsid
         *            机构相对方全局唯一ID
         * @return 相对方经办人信息对象建造器
         * @since 2.0.0
         */
        public Builder uerWsid(String uerWsid){
            this.uerWsid = uerWsid;
            return this;
        }

        /**
         * @param uprThirdPartyUserId
         *            第三方平台个人账号的唯一标识
         * @return 相对方经办人信息对象建造器
         * @since 2.0.0
         */
        public Builder uprThirdPartyUserId(String uprThirdPartyUserId){
            this.uprThirdPartyUserId = uprThirdPartyUserId;
            return this;
        }

        /**
         * @param uerThirdPartyUserId
         *            第三方机构账号的唯一标识
         * @return 相对方经办人信息对象建造器
         * @since 2.0.0
         */
        public Builder uerThirdPartyUserId(String uerThirdPartyUserId){
            this.uerThirdPartyUserId = uerThirdPartyUserId;
            return this;
        }

        /**
         * @param uprSyncStatus
         *            当前相对方的同步状态，具体见UserRelativeSyncStatus枚举类
         * @return 相对方经办人信息对象建造器
         * @since 2.0.0
         */
        public Builder uprSyncStatus(String uprSyncStatus){
            this.uprSyncStatus = uprSyncStatus;
            return this;
        }

        /**
         * @param uprSyncStatusDescription
         *            当前相对方的同步状态描述
         * @return 相对方经办人信息对象建造器
         * @since 2.0.0
         */
        public Builder uprSyncStatusDescription(String uprSyncStatusDescription){
            this.uprSyncStatusDescription = uprSyncStatusDescription;
            return this;
        }

        /**
         * @param invokeNo
         *            本次调用的唯一标识
         * @return 相对方经办人信息对象建造器
         * @since 2.0.0
         */
        public Builder invokeNo(String invokeNo){
            this.invokeNo = invokeNo;
            return this;
        }

        @Override
        public UserHandlerRelativeInfo build() {
            return new UserHandlerRelativeInfo(this);
        }
    }
}
