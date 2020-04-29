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

import cn.signit.sdk.pojo.ParticipantInfo;
import cn.signit.sdk.pojo.response.AppendEnvelopeParticipantsResponse;

/**
 * 签署流程中追加新的签署方请求数据
 *
 * @author dengwen
 * @since 2.6.0
 */
public class AppendEnvelopeParticipantsRequest extends AbstractSignitRequest<AppendEnvelopeParticipantsResponse> {

    private ParticipantInfo participantInfo;

    public ParticipantInfo getParticipantInfo() {
        return participantInfo;
    }

    public void setParticipantInfo(ParticipantInfo participantInfo) {
        this.participantInfo = participantInfo;
    }

    public AppendEnvelopeParticipantsRequest(Builder builder) {
        this.participantInfo = builder.participantInfo;
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public Class<AppendEnvelopeParticipantsResponse> getResponseClass() {
        return AppendEnvelopeParticipantsResponse.class;
    }

    public static class Builder implements cn.signit.sdk.pojo.Builder<AppendEnvelopeParticipantsRequest> {
        private ParticipantInfo participantInfo;

        public Builder() {
        }

        public Builder(AppendEnvelopeParticipantsRequest appendEnvelopeParticipantsRequest) {
            this.participantInfo = appendEnvelopeParticipantsRequest.participantInfo;
        }

        public Builder participantInfo(ParticipantInfo participantInfo) {
            this.participantInfo = participantInfo;
            return this;
        }

        public Builder participantInfo(ParticipantInfo.Builder participantInfoBuilder) {
            if (participantInfoBuilder != null) {
                this.participantInfo = participantInfoBuilder.build();
            }
            return this;
        }

        @Override
        public AppendEnvelopeParticipantsRequest build() {
            return new AppendEnvelopeParticipantsRequest(this);
        }

    }
}