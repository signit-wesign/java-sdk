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
package cn.signit.sdk.pojo.request.relative;

import cn.signit.sdk.pojo.request.AbstractSignitRequest;
import cn.signit.sdk.pojo.response.relative.UserPersonRelativeResponse;

/**
* 描述： 相对方个人信息响应对象
* @author xiazhitao
*/
public class UserPersonRelativeResquest extends AbstractSignitRequest<UserPersonRelativeResponse> {

    @Override public Class<UserPersonRelativeResponse> getResponseClass() {
        return UserPersonRelativeResponse.class;
    }

    /**
     * 当前添加的个人相对方全局唯一ID
     */
    private String uprWsid;

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

    public String getUprWsid() {
        return uprWsid;
    }

    public void setUprWsid(String uprWsid) {
        this.uprWsid = uprWsid;
    }

    public String getUprThirdPartyUserId() {
        return uprThirdPartyUserId;
    }

    public void setUprThirdPartyUserId(String uprThirdPartyUserId) {
        this.uprThirdPartyUserId = uprThirdPartyUserId;
    }

    public String getUprName() {
        return uprName;
    }

    public void setUprName(String uprName) {
        this.uprName = uprName;
    }

    public String getUprIdType() {
        return uprIdType;
    }

    public void setUprIdType(String uprIdType) {
        this.uprIdType = uprIdType;
    }

    public String getUprIdCode() {
        return uprIdCode;
    }

    public void setUprIdCode(String uprIdCode) {
        this.uprIdCode = uprIdCode;
    }

    public String getUprPhone() {
        return uprPhone;
    }

    public void setUprPhone(String uprPhone) {
        this.uprPhone = uprPhone;
    }

    public String getUprEmail() {
        return uprEmail;
    }

    public void setUprEmail(String uprEmail) {
        this.uprEmail = uprEmail;
    }

    public UserPersonRelativeResquest(){

    }

    public UserPersonRelativeResquest(Builder builder){
        this.uprWsid = builder.uprWsid;
        this.uprThirdPartyUserId = builder.uprThirdPartyUserId;
        this.uprName = builder.uprName;
        this.uprIdType = builder.uprIdType;
        this.uprIdCode = builder.uprIdCode;
        this.uprPhone = builder.uprPhone;
        this.uprEmail = builder.uprEmail;
        this.customTag = builder.customTag;
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder implements cn.signit.sdk.pojo.Builder<UserPersonRelativeResquest> {

        private String uprWsid;
        private String uprThirdPartyUserId;
        private String uprName;
        private String uprIdType;
        private String uprIdCode;
        private String uprPhone;
        private String uprEmail;
        private String customTag;

        public Builder(){

        }

        public Builder(UserPersonRelativeResquest info){
            this.uprWsid = info.uprWsid;
            this.uprThirdPartyUserId = info.uprThirdPartyUserId;
            this.uprName = info.uprName;
            this.uprIdType = info.uprIdType;
            this.uprIdCode = info.uprIdCode;
            this.uprPhone = info.uprPhone;
            this.uprEmail = info.uprEmail;
            this.customTag = info.customTag;
        }


        /**
         *
         * @param uprWsid
         *            创建机构账号的唯一标识。可将企业证件号、企业邮箱地址等作为此账号的唯一标识。
         * @return 相对方个人信息对象建造器
         * @since 2.0.0
         */
        public Builder uprWsid(String uprWsid){
            this.uprWsid = uprWsid;
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
         *            法定代表人证件号
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
         * @param customTag
         *            调用方自定义标识，易企签会原封不动返回
         * @return 相对方个人信息对象建造器
         * @since 2.0.0
         */
        public Builder customTag(String customTag) {
            this.customTag = customTag;
            return this;
        }

        @Override
        public UserPersonRelativeResquest build() {
            return new UserPersonRelativeResquest(this);
        }
    }

}
