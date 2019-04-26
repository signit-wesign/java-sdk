package cn.signit.sdk.pojo.request;
/*
 * Copyright © 2018 signit.cn. All rights reserved.
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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import cn.signit.sdk.pojo.IdCardImage;
import cn.signit.sdk.pojo.response.PersonVerifyResponse;
import cn.signit.sdk.type.AcceptDataType;
import cn.signit.sdk.type.IdCardType;
import cn.signit.sdk.type.PersonAuthType;
import cn.signit.sdk.util.ListBuilder;

/**
 * 个人实名认证请求数据结构.
 * 
 * @since 2.0.1
 */
public class PersonVerifyRequest extends AbstractSignitRequest<PersonVerifyResponse> {

    /**
     * 待认证的用户姓名.
     *
     * @since 2.0.1
     */
    private String name;

    /**
     * 待认证的用户手机号.
     *
     * @since 2.0.1
     */
    private String phone;
    /**
     * 待认证的用户证件类型.
     *
     * @since 2.0.1
     */
    private IdCardType idCardType;
    /**
     * 待认证的用户证件号.
     *
     * @since 2.0.1
     */
    private String idCardNo;
    /**
     * 待认证的用户证件照片数组.
     *
     * @since 2.0.1
     */
    private List<IdCardImage> idCardImages;
    /**
     * 调用方自定义标识，易企签会原封不动返回.
     *
     * @since 2.0.1
     */
    private String customTag;

    /**
     * 调用方自定义要求易企签的WEB平台在流程结束后需要跳转的指定URL地址.
     *
     * @since 2.0.1
     */
    private String returnUrl;

    /**
     * 调用方接受的响应数据类型，支持：BASE64/URL.
     *
     * @since 2.0.1
     */
    private AcceptDataType acceptDataType;

    private List<PersonAuthType> authModes;

    public List<PersonAuthType> getAuthModes() {
        return authModes;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public IdCardType getIdCardType() {
        return idCardType;
    }

    public String getIdCardNo() {
        return idCardNo;
    }

    public List<IdCardImage> getIdCardImages() {
        return idCardImages;
    }

    public String getCustomTag() {
        return customTag;
    }

    public String getReturnUrl() {
        return returnUrl;
    }

    public AcceptDataType getAcceptDataType() {
        return acceptDataType;
    }

    public PersonVerifyRequest(Builder builder) {
        this.name = builder.name;
        this.phone = builder.phone;
        this.idCardType = builder.idCardType;
        this.idCardNo = builder.idCardNo;
        this.idCardImages = builder.idCardImages;
        this.customTag = builder.customTag;
        this.returnUrl = builder.returnUrl;
        this.acceptDataType = builder.acceptDataType;
        this.authModes = builder.authModes;
    }

    public PersonVerifyRequest() {
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    /**
     * 个人实名认证构造器.
     *
     * @since 2.0.1
     */
    public static class Builder implements cn.signit.sdk.pojo.Builder<PersonVerifyRequest> {
        private String name;
        private String phone;
        private IdCardType idCardType;
        private String idCardNo;
        private List<IdCardImage> idCardImages;
        private String customTag;
        private String returnUrl;
        private AcceptDataType acceptDataType;
        private List<PersonAuthType> authModes;

        public Builder() {
        }

        public Builder(PersonVerifyRequest personVerifyRequest) {
            this.name = personVerifyRequest.name;
            this.phone = personVerifyRequest.phone;
            this.idCardType = personVerifyRequest.idCardType;
            this.idCardNo = personVerifyRequest.idCardNo;
            this.idCardImages = personVerifyRequest.idCardImages;
            this.customTag = personVerifyRequest.customTag;
            this.returnUrl = personVerifyRequest.returnUrl;
            this.acceptDataType = personVerifyRequest.acceptDataType;
            this.authModes = personVerifyRequest.authModes;
        }

        /**
         * 
         * @param name
         *            待认证的个人真实姓名
         * @return 个人实名认证请求对象建筑器{@link PersonVerifyRequest.Builder}
         * @since 2.0.1
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * 
         * @param phone
         *            用户联系方式
         * @return 个人实名认证请求对象建筑器{@link PersonVerifyRequest.Builder}
         * @since 2.0.1
         */
        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        /**
         * 
         * @param idCardType
         *            认证资料中证件类型
         * @return 个人实名认证请求对象建筑器{@link PersonVerifyRequest.Builder}
         * @since 2.0.1
         */
        public Builder idCardType(IdCardType idCardType) {
            this.idCardType = idCardType;
            return this;
        }

        /**
         * 
         * @param idCardNo
         *            认证资料中证件号码
         * @return 个人实名认证请求对象建筑器{@link PersonVerifyRequest.Builder}
         * @since 2.0.1
         */
        public Builder idCardNo(String idCardNo) {
            this.idCardNo = idCardNo;
            return this;
        }

        /**
         * 
         * @param idCardImages
         *            认证所需照片信息列表 {@link IdCardImage}
         * @return 个人实名认证请求对象建筑器{@link PersonVerifyRequest.Builder}
         * @since 2.0.1
         */
        public Builder idCardImages(List<IdCardImage> idCardImages) {
            this.idCardImages = idCardImages;
            return this;
        }

        /**
         * 
         * @param customTag
         *            调用方自定义标识，易企签会原封不动返回
         * @return 个人实名认证请求对象建筑器{@link PersonVerifyRequest.Builder}
         * @since 2.0.1
         */
        public Builder customTag(String customTag) {
            this.customTag = customTag;
            return this;
        }

        /**
         * 
         * @param returnUrl
         *            调用方自定义要求易企签的WEB平台在流程结束后需要跳转的指定URL地址
         * @return 个人实名认证请求对象建筑器{@link PersonVerifyRequest.Builder}
         * @since 2.0.1
         */
        public Builder returnUrl(String returnUrl) {
            this.returnUrl = returnUrl;
            return this;
        }

        /**
         * 
         * @param acceptDataType
         *            调用方接受的数据类型，支持：BASE64/URL {@link AcceptDataType}；默认是BASE64
         * @return 个人实名认证请求对象建筑器{@link PersonVerifyRequest.Builder}
         * @since 2.0.1
         */
        public Builder acceptDataType(AcceptDataType acceptDataType) {
            this.acceptDataType = acceptDataType;
            return this;
        }

        /**
         * 
         * @param idCardImageBuilders
         *            认证所需照片信息列表构造器 {@link IdCardImage.Builder}
         * @return 个人实名认证请求对象建筑器{@link PersonVerifyRequest.Builder}
         * @since 2.0.1
         */
        public Builder idCardImages(IdCardImage.Builder... idCardImageBuilders) {
            this.idCardImages = ListBuilder.buildList(Arrays.asList(idCardImageBuilders));
            return this;
        }

        /**
         * @param authModes
         *            个人认证方式
         * @return 个人实名认证请求对象建筑器{@link PersonVerifyRequest.Builder}
         * @since 2.0.1
         */
        public Builder authModes(PersonAuthType... authModes) {
            if (authModes != null && authModes.length != 0) {
                List<PersonAuthType> list = new ArrayList<PersonAuthType>();
                for (PersonAuthType authMode : authModes) {
                    list.add(authMode);
                }
                this.authModes = list;
            }
            return this;
        }

        public PersonVerifyRequest build() {
            return new PersonVerifyRequest(this);
        }
    }

    @Override
    public Class<PersonVerifyResponse> getResponseClass() {
        return PersonVerifyResponse.class;
    }

}
