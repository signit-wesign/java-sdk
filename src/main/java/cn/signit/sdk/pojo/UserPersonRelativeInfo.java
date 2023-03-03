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
* 描述： 相对方个人信息数据传输对象
* @author xiazhitao
* @since 1.0.0
*/
public class UserPersonRelativeInfo {

    /**
     * 当前添加的个人相对方全局唯一ID
     */
    private String uprWsid;

    /**
     * 当前个人相对方的拥有者全局唯一ID：\r\nWSID_PUSR_xxx - 属于某个个人用户的相对方；\r\nWSID_ENTE_xxx - 属于某个企业的相对方；\r\nWSID_EUSR_xxx/WSID_EMEM_xxx - 属于某个企业下某用户的相对方；
     */
    private String uprOwnerWsid;

    /**
     * 当前个人相对方账号状态：\r\n0 - 可用；\r\n1 - 冻结（临时不可用，可解冻为”可用“状态）；\r\n2 - 注销；\r\n3 - 禁用（不可解冻，需要人工干预）；
     * 具体见 UserRelativeStatus枚举类
     */
    private String uprStatus;

    /**
     * 当前状态描述
     */
    private String uprStatusDescription;

    /**
     * 创建个人账号的唯一标识。可将个人证件号、手机号、邮箱地址等作为此账号的唯一标识
     */
    private String uprThirdPartyUserId;

    /**
     * 姓名
     */
    private String uprName;

    /**
     * 证件类型，\r\n0 - 大陆身份证（默认）；\r\n1 - 护照；\r\n2 - 台湾来往大陆通行证；\r\n3 - 澳门来往大陆通行证；\r\n4 - 香港来往大陆通行证；
     * 具体见UserPersonRelativeInfoIdType枚举类
     */
    private String uprIdType;

    /**
     * 证件号，需传入真实存在的证件信息
     */
    private String uprIdCode;

    /**
     * 手机号码
     */
    private String uprPhone;

    /**
     * 邮箱地址
     */
    private String uprEmail;

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
     * 同步规则：\r\n0 - 签章平台自动完成个人帐号注册（默认）；\r\n1 - 签章平台自动完成个人帐号注册+自动个人实名认证；
     * 具体见UserPersonRelativeSyncRule枚举类
     */
    private String uprSyncRule;

    /**
     * 同步当前相对方到电子签章平台的个人用户全局唯一ID
     */
    private String uprSyncPersonWsid;

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

    public UserPersonRelativeInfo(){

    }

    public UserPersonRelativeInfo(Builder builder){
        this.uprWsid = builder.uprWsid;
        this.uprOwnerWsid = builder.uprOwnerWsid;
        this.uprStatus = builder.uprStatus;
        this.uprStatusDescription = builder.uprStatusDescription;
        this.uprThirdPartyUserId = builder.uprThirdPartyUserId;
        this.uprName = builder.uprName;
        this.uprIdType = builder.uprIdType;
        this.uprIdCode = builder.uprIdCode;
        this.uprPhone = builder.uprPhone;
        this.uprEmail = builder.uprEmail;
        this.uprSyncStatus = builder.uprSyncStatus;
        this.uprSyncStatusDescription = builder.uprSyncStatusDescription;
        this.uprSyncRule = builder.uprSyncRule;
        this.uprSyncPersonWsid = builder.uprSyncPersonWsid;
        this.customTag = builder.customTag;
        this.invokeNo = builder.invokeNo;
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder implements cn.signit.sdk.pojo.Builder<UserPersonRelativeInfo> {

        private String uprWsid;
        private String uprOwnerWsid;
        private String uprStatus;
        private String uprStatusDescription;
        private String uprThirdPartyUserId;
        private String uprName;
        private String uprIdType;
        private String uprIdCode;
        private String uprPhone;
        private String uprEmail;
        private String uprSyncStatus;
        private String uprSyncStatusDescription;
        private String uprSyncRule;
        private String uprSyncPersonWsid;
        private String customTag;
        private String invokeNo;

        public Builder(){

        }

        public Builder(UserPersonRelativeInfo info){
            this.uprWsid = info.uprWsid;
            this.uprOwnerWsid = info.uprOwnerWsid;
            this.uprStatus = info.uprStatus;
            this.uprStatusDescription = info.uprStatusDescription;
            this.uprThirdPartyUserId = info.uprThirdPartyUserId;
            this.uprName = info.uprName;
            this.uprIdType = info.uprIdType;
            this.uprIdCode = info.uprIdCode;
            this.uprPhone = info.uprPhone;
            this.uprEmail = info.uprEmail;
            this.uprSyncStatus = info.uprSyncStatus;
            this.uprSyncStatusDescription = info.uprSyncStatusDescription;
            this.uprSyncRule = info.uprSyncRule;
            this.uprSyncPersonWsid = info.uprSyncPersonWsid;
            this.customTag = info.customTag;
            this.invokeNo = info.invokeNo;
        }

        /**
         *
         * @param uprWsid
         *            当前添加的个人相对方全局唯一ID
         * @return 相对方个人信息对象建造器
         * @since 2.0.0
         */
        public Builder uprWsid(String uprWsid){
            this.uprWsid = uprWsid;
            return this;
        }

        /**
         *
         * @param uerOwnerWsid
         *            当前企业相对方的拥有者全局唯一ID
         * @return 相对方个人信息对象建造器
         * @since 2.0.0
         */
        public Builder uerOwnerWsid(String uerOwnerWsid){
            this.uprOwnerWsid = uerOwnerWsid;
            return this;
        }

        /**
         *
         * @param uprStatus
         *            当前个人相对方账号状态
         * @return 相对方个人信息对象建造器
         * @since 2.0.0
         */
        public Builder uprStatus(String uprStatus){
            this.uprStatus = uprStatus;
            return this;
        }

        /**
         *
         * @param uprStatusDescription
         *            当前状态描述
         * @return 相对方个人信息对象建造器
         * @since 2.0.0
         */
        public Builder uprStatusDescription(String uprStatusDescription){
            this.uprStatusDescription = uprStatusDescription;
            return this;
        }

        /**
         *
         * @param uprThirdPartyUserId
         *            创建个人账号的唯一标识。可将个人证件号、手机号、邮箱地址等作为此账号的唯一标识
         * @return 相对方个人信息对象建造器
         * @since 2.0.0
         */
        public Builder uprThirdPartyUserId(String uprThirdPartyUserId){
            this.uprThirdPartyUserId = uprThirdPartyUserId;
            return this;
        }

        /**
         *
         * @param uprName
         *            姓名
         * @return 相对方个人信息对象建造器
         * @since 2.0.0
         */
        public Builder uprName(String uprName){
            this.uprName = uprName;
            return this;
        }

        /**
         *
         * @param uprIdType
         *            证件类型（具体见UserPersonRelativeInfoIdType枚举类）
         * @return 相对方个人信息对象建造器
         * @since 2.0.0
         */
        public Builder uprIdType(String uprIdType){
            this.uprIdType = uprIdType;
            return this;
        }

        /**
         *
         * @param uprIdCode
         *            证件号，需传入真实存在的证件信息
         * @return 相对方个人信息对象建造器
         * @since 2.0.0
         */
        public Builder uprIdCode(String uprIdCode){
            this.uprIdCode = uprIdCode;
            return this;
        }

        /**
         *
         * @param uprPhone
         *            手机号
         * @return 相对方个人信息对象建造器
         * @since 2.0.0
         */
        public Builder uprPhone(String uprPhone){
            this.uprPhone = uprPhone;
            return this;
        }

        /**
         *
         * @param uprEmail
         *            邮箱
         * @return 相对方个人信息对象建造器
         * @since 2.0.0
         */
        public Builder uprEmail(String uprEmail){
            this.uprEmail = uprEmail;
            return this;
        }

        /**
         *
         * @param uprSyncStatus
         *            当前相对方的同步状态（具体见UserRelativeSyncStatus枚举类）
         * @return 相对方个人信息对象建造器
         * @since 2.0.0
         */
        public Builder uprSyncStatus(String uprSyncStatus){
            this.uprSyncStatus = uprSyncStatus;
            return this;
        }

        /**
         *
         * @param uprSyncStatusDescription
         *            当前相对方的同步状态描述
         * @return 相对方个人信息对象建造器
         * @since 2.0.0
         */
        public Builder uprSyncStatusDescription(String uprSyncStatusDescription){
            this.uprSyncStatusDescription = uprSyncStatusDescription;
            return this;
        }

        /**
         *
         * @param uprSyncRule
         *            同步规则（具体见UserPersonRelativeSyncRule枚举类）
         * @return 相对方个人信息对象建造器
         * @since 2.0.0
         */
        public Builder uprSyncRule(String uprSyncRule){
            this.uprSyncRule = uprSyncRule;
            return this;
        }

        /**
         *
         * @param customTag
         *            调用方自定义标识
         * @return 相对方个人信息对象建造器
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
         * @return 相对方个人信息对象建造器
         * @since 2.0.0
         */
        public Builder invokeNo(String invokeNo){
            this.invokeNo = invokeNo;
            return this;
        }

        @Override
        public UserPersonRelativeInfo build() {
            return new UserPersonRelativeInfo(this);
        }
    }
}
