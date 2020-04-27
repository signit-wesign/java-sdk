/*
 * Copyright © 2020 signit.cn. All rights reserved.
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
package cn.signit.sdk.pojo.request;

import cn.signit.sdk.pojo.EnvelopeBasicInfo;
import cn.signit.sdk.pojo.EnvelopeContentInfo;
import cn.signit.sdk.pojo.EnvelopeParticipantInfo;
import cn.signit.sdk.pojo.response.CreateSignProcessResponse;
import cn.signit.sdk.type.AcceptDataType;

/**
 * 创建签署流程请求数据
 *
 * @author dengwen
 * @since 3.6.0
 */
public class CreateSignProcessRequest extends AbstractSignitRequest<CreateSignProcessResponse> {

    private EnvelopeBasicInfo basicinfo;

    private EnvelopeContentInfo contentInfo;

    private EnvelopeParticipantInfo participantInfo;

    public EnvelopeBasicInfo getBasicinfo() {
        return basicinfo;
    }

    public void setBasicinfo(EnvelopeBasicInfo basicinfo) {
        this.basicinfo = basicinfo;
    }

    public EnvelopeContentInfo getContentInfo() {
        return contentInfo;
    }

    public void setContentInfo(EnvelopeContentInfo contentInfo) {
        this.contentInfo = contentInfo;
    }

    public EnvelopeParticipantInfo getParticipantInfo() {
        return participantInfo;
    }

    public void setParticipantInfo(EnvelopeParticipantInfo participantInfo) {
        this.participantInfo = participantInfo;
    }

    @Override
    public Class<CreateSignProcessResponse> getResponseClass() {
        return CreateSignProcessResponse.class;
    }

    public CreateSignProcessRequest() {
    }

    public CreateSignProcessRequest(Builder builder) {
        this.basicinfo = builder.basicinfo;
        this.contentInfo = builder.contentInfo;
        this.participantInfo = builder.participantInfo;
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

    /**
     * 创建签署流程请求对象建造器
     *
     * @since 3.6.0
     */
    public static class Builder implements cn.signit.sdk.pojo.Builder<CreateSignProcessRequest> {

        private EnvelopeBasicInfo basicinfo;
        private EnvelopeContentInfo contentInfo;
        private EnvelopeParticipantInfo participantInfo;
        private String customTag;
        private String returnUrl;
        private AcceptDataType acceptDataType;

        public Builder() {
        }

        public Builder(CreateSignProcessRequest createSignProcessRequest) {
            this.basicinfo = createSignProcessRequest.basicinfo;
            this.contentInfo = createSignProcessRequest.contentInfo;
            this.participantInfo = createSignProcessRequest.participantInfo;
            this.customTag = createSignProcessRequest.customTag;
            this.returnUrl = createSignProcessRequest.returnUrl;
            this.acceptDataType = createSignProcessRequest.acceptDataType;
        }

        /**
         * 
         * @param basicinfo
         *            信封基本信息
         * @return 创建签署流程请求对象建造器{@link CreateSignProcessRequest.Builder}
         * @since 3.6.0
         */
        public Builder basicinfo(EnvelopeBasicInfo basicinfo) {
            this.basicinfo = basicinfo;
            return this;
        }

        /**
         * 
         * @param basicinfoBuilder
         *            信封基本信息建造器
         * @return 创建签署流程请求对象建造器{@link CreateSignProcessRequest.Builder}
         * @since 3.6.0
         */
        public Builder basicinfo(EnvelopeBasicInfo.Builder basicinfoBuilder) {
            if (basicinfoBuilder != null) {
                this.basicinfo = basicinfoBuilder.build();
            }
            return this;
        }

        /**
         * 
         * @param contentInfo
         *            信封内容基本信息
         * @return 创建签署流程请求对象建造器{@link CreateSignProcessRequest.Builder}
         * @since 3.6.0
         */
        public Builder contentInfo(EnvelopeContentInfo contentInfo) {
            this.contentInfo = contentInfo;
            return this;
        }

        /**
         * 
         * @param contentInfoBuilder
         *            信封内容基本信息建造器
         * @return 创建签署流程请求对象建造器{@link CreateSignProcessRequest.Builder}
         * @since 3.6.0
         */
        public Builder contentInfo(EnvelopeContentInfo.Builder contentInfoBuilder) {
            if (contentInfoBuilder != null) {
                this.contentInfo = contentInfoBuilder.build();
            }
            return this;
        }

        /**
         * 
         * @param participantInfo
         *            参与者基本信息
         * @return 创建签署流程请求对象建造器{@link CreateSignProcessRequest.Builder}
         * @since 3.6.0
         */
        public Builder participantInfo(EnvelopeParticipantInfo participantInfo) {
            this.participantInfo = participantInfo;
            return this;
        }

        /**
         * 
         * @param participantInfoBuilder
         *            参与者基本信息建造器
         * @return 创建签署流程请求对象建造器{@link CreateSignProcessRequest.Builder}
         * @since 3.6.0
         */
        public Builder participantInfo(EnvelopeParticipantInfo.Builder participantInfoBuilder) {
            if (participantInfoBuilder != null) {
                this.participantInfo = participantInfoBuilder.build();
            }
            return this;
        }

        /**
         * 
         *
         * @param customTag
         *            调用方自定义标识，易企签会原封不动返回
         * @return 信封启动请求建筑器.{@link StartEnvelopeRequest.Builder}
         * @since 3.6.0
         */
        public Builder customTag(String customTag) {
            this.customTag = customTag;
            return this;
        }

        /**
         * 
         *
         * @param returnUrl
         *            调用方自定义要求易企签的WEB平台在流程结束后需要跳转的指定URL地址
         * @return 信封启动请求建筑器.{@link StartEnvelopeRequest.Builder}
         * @since 3.6.0
         */
        public Builder returnUrl(String returnUrl) {
            this.returnUrl = returnUrl;
            return this;
        }

        /**
         * 
         *
         * @param acceptDataType
         *            调用方接受的数据类型，支持：BASE64/URL {@link AcceptDataType}；默认是BASE64
         * @return 信封启动请求建筑器.{@link StartEnvelopeRequest.Builder}
         * @since 3.6.0
         */
        public Builder acceptDataType(AcceptDataType acceptDataType) {
            this.acceptDataType = acceptDataType;
            return this;
        }

        /**
         * 
         * @return 创建签署流程请求响应对象{@link CreateSignProcessRequest}
         * @since 3.6.0
         */
        @Override
        public CreateSignProcessRequest build() {
            return new CreateSignProcessRequest(this);
        }
    }
}
