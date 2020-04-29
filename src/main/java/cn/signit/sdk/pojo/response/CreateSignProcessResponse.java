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
 * @since 2.6.0
 */
public class CreateSignProcessResponse extends AbstractSignitResponse {

    private String actionUrl;
    private EnvelopeBasicInfo basicInfo;
    private EnvelopeParticipantInfo participantInfo;

    public CreateSignProcessResponse() {
    }

    public CreateSignProcessResponse(Builder builder) {
        super();
        this.actionUrl = builder.actionUrl;
        this.basicInfo = builder.basicInfo;
        this.participantInfo = builder.participantInfo;
    }

    public String getActionUrl() {
        return actionUrl;
    }

    public void setActionUrl(String actionUrl) {
        this.actionUrl = actionUrl;
    }

    public EnvelopeBasicInfo getBasicinfo() {
        return basicInfo;
    }

    public void setBasicinfo(EnvelopeBasicInfo basicInfo) {
        this.basicInfo = basicInfo;
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
     * @since 2.6.0
     */
    public static class Builder implements cn.signit.sdk.pojo.Builder<CreateSignProcessResponse> {

        private String actionUrl;
        private EnvelopeBasicInfo basicInfo;
        private EnvelopeParticipantInfo participantInfo;

        public Builder() {

        }

        public Builder(CreateSignProcessResponse createSignProcessResponse) {
            this.actionUrl = createSignProcessResponse.actionUrl;
            this.basicInfo = createSignProcessResponse.basicInfo;
            this.participantInfo = createSignProcessResponse.participantInfo;
        }

        public Builder actionUrl(String actionUrl) {
            this.actionUrl = actionUrl;
            return this;
        }

        public Builder basicInfo(EnvelopeBasicInfo basicInfo) {
            this.basicInfo = basicInfo;
            return this;
        }

        public Builder basicInfo(EnvelopeBasicInfo.Builder basicInfoBuilder) {
            this.basicInfo = basicInfoBuilder.build();
            return this;
        }

        /**
         * 
         * @param participantInfo
         *            参与者基本信息
         * @return 创建签署流程响应对象建造器{@link CreateSignProcessResponse.Builder}
         * @since 2.6.0
         */
        public Builder participantInfo(EnvelopeParticipantInfo participantInfo) {
            this.participantInfo = participantInfo;
            return this;
        }

        /**
         * 
         * @param participantInfoBuilder
         *            参与者基本信息
         * @return 创建签署流程响应对象建造器{@link CreateSignProcessResponse.Builder}
         * @since 2.6.0
         */
        public Builder participantInfo(EnvelopeParticipantInfo.Builder participantInfoBuilder) {
            this.participantInfo = participantInfoBuilder.build();
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
