package cn.signit.sdk.pojo.request;

import cn.signit.sdk.pojo.EnvelopeBasicInfo;
import cn.signit.sdk.pojo.EnvelopeContentInfo;
import cn.signit.sdk.pojo.EnvelopeParticipantInfo;
import cn.signit.sdk.pojo.response.StartEnvelopeResponse;
import cn.signit.sdk.type.AcceptDataType;

/**
 * 信封启动服务请求体.
 * </p>
 * 包含信封基本信息、信封流程中的签署文件内容、签署参与者信息、自定义跳转URL、自定义可接受数据类型、自定义标识.
 * 
 * @since 1.0.2
 */
public class StartEnvelopeRequest extends AbstractSignitRequest<StartEnvelopeResponse> {

    /**
     * 信封基本信息.
     *
     * @since 1.0.5
     */
    private EnvelopeBasicInfo basicinfo;

    /**
     * 信封流程中的签署文件内容.
     *
     * @since 1.0.5
     */
    private EnvelopeContentInfo contentInfo;
    /**
     * 签署参与者信息.
     *
     * @since 1.0.5
     */
    private EnvelopeParticipantInfo participantInfo;

    @Override
    public Class<StartEnvelopeResponse> getResponseClass() {
        return StartEnvelopeResponse.class;
    }

    public EnvelopeBasicInfo getBasicinfo() {
        return basicinfo;
    }

    public EnvelopeContentInfo getContentInfo() {
        return contentInfo;
    }

    public EnvelopeParticipantInfo getParticipantInfo() {
        return participantInfo;
    }

    public String getCustomTag() {
        return customTag;
    }

    public StartEnvelopeRequest() {
    }

    public StartEnvelopeRequest(Builder builder) {
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

    public static class Builder implements cn.signit.sdk.pojo.Builder<StartEnvelopeRequest> {
        private EnvelopeBasicInfo basicinfo;
        private EnvelopeContentInfo contentInfo;
        private EnvelopeParticipantInfo participantInfo;

        private String customTag;
        private String returnUrl;
        private AcceptDataType acceptDataType;

        public Builder() {
        }

        public Builder(StartEnvelopeRequest request) {
            this.basicinfo = request.basicinfo;
            this.contentInfo = request.contentInfo;
            this.participantInfo = request.participantInfo;
            this.customTag = request.customTag;
            this.returnUrl = request.returnUrl;
            this.acceptDataType = request.acceptDataType;
        }

        public Builder basicinfo(EnvelopeBasicInfo basicinfo) {
            this.basicinfo = basicinfo;
            return this;
        }

        public Builder basicinfo(EnvelopeBasicInfo.Builder basicinfoBuilder) {
            if (basicinfoBuilder != null) {
                this.basicinfo = basicinfoBuilder.build();
            }
            return this;
        }

        public Builder contentInfo(EnvelopeContentInfo contentInfo) {
            this.contentInfo = contentInfo;
            return this;
        }

        public Builder contentInfo(EnvelopeContentInfo.Builder contentInfoBuilder) {
            if (contentInfoBuilder != null) {
                this.contentInfo = contentInfoBuilder.build();
            }
            return this;
        }

        public Builder participantInfo(EnvelopeParticipantInfo participantInfo) {
            this.participantInfo = participantInfo;
            return this;
        }

        public Builder participantInfo(EnvelopeParticipantInfo.Builder participantInfoBuilder) {
            if (participantInfoBuilder != null) {
                this.participantInfo = participantInfoBuilder.build();
            }
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

        @Override
        public StartEnvelopeRequest build() {
            return new StartEnvelopeRequest(this);
        }
    }

}
