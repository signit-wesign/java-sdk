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

import java.util.Arrays;
import java.util.List;

import cn.signit.sdk.pojo.IdCardImage;
import cn.signit.sdk.pojo.response.PersonVerifyResponse;
import cn.signit.sdk.type.AcceptDataType;
import cn.signit.sdk.type.IdCardType;
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
    }

    public PersonVerifyRequest() {
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder implements cn.signit.sdk.pojo.Builder<PersonVerifyRequest> {
        private String name;
        private String phone;
        private IdCardType idCardType;
        private String idCardNo;
        private List<IdCardImage> idCardImages;
        private String customTag;
        private String returnUrl;
        private AcceptDataType acceptDataType;

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
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder idCardType(IdCardType idCardType) {
            this.idCardType = idCardType;
            return this;
        }

        public Builder idCardNo(String idCardNo) {
            this.idCardNo = idCardNo;
            return this;
        }

        public Builder idCardImages(List<IdCardImage> idCardImages) {
            this.idCardImages = idCardImages;
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

        public Builder idCardImages(IdCardImage.Builder... idCardImageBuilders) {
            this.idCardImages = ListBuilder.buildList(Arrays.asList(idCardImageBuilders));
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
