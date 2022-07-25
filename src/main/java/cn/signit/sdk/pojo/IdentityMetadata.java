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
 * 身份认证元数据.
 * 
 * @author RyanChang
 * @since 1.4.0
 */
public class IdentityMetadata {
    /**
     * 用户姓名.
     *
     * @since 1.4.0
     */
    private String name;
    /**
     * 手机号.
     *
     * @since 1.4.0
     */
    private String phone;
    /**
     * 证件类型.
     *
     * @since 1.4.0
     */
    private String identityType;
    /**
     * 证件号.
     *
     * @since 1.4.0
     */
    private String identityNo;

    public IdentityMetadata() {
    }

    /**
     * 完整构造方法
     *
     * @param name
     *            用户姓名.
     * @param phone
     *            手机号.
     * @param identityType
     *            证件类型.
     * @param identityNo
     *            证件号.
     */
    public IdentityMetadata(String name, String phone, String identityType, String identityNo) {
        super();
        this.name = name;
        this.phone = phone;
        this.identityType = identityType;
        this.identityNo = identityNo;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIdentityType() {
        return identityType;
    }

    public void setIdentityType(String identityType) {
        this.identityType = identityType;
    }

    public String getIdentityNo() {
        return identityNo;
    }

    public void setIdentityNo(String identityNo) {
        this.identityNo = identityNo;
    }

    /**
     * 身份认证元数据建造器
     * 
     * @since 2.5.0
     */
    public static class Builder implements cn.signit.sdk.pojo.Builder<IdentityMetadata> {
        /**
         * 用户姓名.
         *
         * @since 1.4.0
         */
        private String name;
        /**
         * 手机号.
         *
         * @since 1.4.0
         */
        private String phone;
        /**
         * 证件类型.
         *
         * @since 1.4.0
         */
        private String identityType;
        /**
         * 证件号.
         *
         * @since 1.4.0
         */
        private String identityNo;

        /**
         * @param name
         *            用户姓名.
         * @since 2.5.0
         * @return 身份认证元数据建造器
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * @param phone
         *            手机号.
         * @since 2.5.0
         * @return 身份认证元数据建造器
         */
        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        /**
         * @param identityType
         *            证件类型.
         * @since 2.5.0
         * @return 身份认证元数据建造器
         */
        public Builder identityType(String identityType) {
            this.identityType = identityType;
            return this;
        }

        /**
         * @param identityNo
         *            证件号.
         * @since 2.5.0
         * @return 身份认证元数据建造器
         */
        public Builder identityNo(String identityNo) {
            this.identityNo = identityNo;
            return this;
        }

        /**
         * @since 2.5.0
         * @return 返回一个新的{@link IdentityMetadata}对象
         */
        @Override
        public IdentityMetadata build() {
            return new IdentityMetadata(name, phone, identityType, identityNo);
        }

    }
}
