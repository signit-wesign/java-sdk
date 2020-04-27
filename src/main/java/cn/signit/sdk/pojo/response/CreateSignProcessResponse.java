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
package cn.signit.sdk.pojo.response;

import cn.signit.sdk.pojo.EnvelopeBasicInfo;
import cn.signit.sdk.pojo.EnvelopeParticipantInfo;

/**
 * 创建签署流程响应数据
 *
 * @author dengwen
 * @since 3.6.0
 */
public class CreateSignProcessResponse extends AbstractSignitResponse {

    private String actionUrl;
    private EnvelopeBasicInfo basicinfo;
    private EnvelopeParticipantInfo participantInfo;

    public CreateSignProcessResponse() {
    }

    public CreateSignProcessResponse(Builder builder) {
        super();
        this.actionUrl = builder.actionUrl;
        this.basicinfo = builder.basicinfo;
        this.participantInfo = builder.participantInfo;
    }

    public String getActionUrl() {
        return actionUrl;
    }

    public void setActionUrl(String actionUrl) {
        this.actionUrl = actionUrl;
    }

    public EnvelopeBasicInfo getBasicinfo() {
        return basicinfo;
    }

    public void setBasicinfo(EnvelopeBasicInfo basicinfo) {
        this.basicinfo = basicinfo;
    }

    public EnvelopeParticipantInfo getParticipantInfo() {
        return participantInfo;
    }

    public void setParticipantInfo(EnvelopeParticipantInfo participantInfo) {
        this.participantInfo = participantInfo;
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    public static Builder Builder() {
        return new Builder();
    }

    /**
     * 创建签署流程响应对象建造器
     *
     * @since 3.6.0
     */
    public static class Builder implements cn.signit.sdk.pojo.Builder<CreateSignProcessResponse> {

        private String actionUrl;
        private EnvelopeBasicInfo basicinfo;
        private EnvelopeParticipantInfo participantInfo;

        public Builder() {

        }

        public Builder(CreateSignProcessResponse createSignProcessResponse) {
            this.actionUrl = createSignProcessResponse.actionUrl;
            this.basicinfo = createSignProcessResponse.basicinfo;
            this.participantInfo = createSignProcessResponse.participantInfo;
        }

        /**
         * 
         * @param actionUrl
         *            访问URL
         * @return 创建签署流程响应对象建造器{@link CreateSignProcessResponse.Builder}
         * @since 3.6.0
         */
        public Builder actionUrl(String actionUrl) {
            this.actionUrl = actionUrl;
            return this;
        }

        /**
         * 
         * @param basicinfo
         *            信封基本信息
         * @return 创建签署流程响应对象建造器{@link CreateSignProcessResponse.Builder}
         * @since 3.6.0
         */
        public Builder basicinfo(EnvelopeBasicInfo basicinfo) {
            this.basicinfo = basicinfo;
            return this;
        }

        /**
         * 
         * @param participantInfo
         *            参与者基本信息
         * @return 创建签署流程响应对象建造器{@link CreateSignProcessResponse.Builder}
         * @since 3.6.0
         */
        public Builder participantInfo(EnvelopeParticipantInfo participantInfo) {
            this.participantInfo = participantInfo;
            return this;
        }

        /**
         * 
         * @return 创建签署流程响应对象{@link CreateSignProcessResponse}
         * @since 2.0.0
         */
        @Override
        public CreateSignProcessResponse build() {
            return new CreateSignProcessResponse(this);
        }
    }
}
