package cn.signit.sdk.pojo;

import java.util.List;

import cn.signit.sdk.util.ListBuilder;

/**
 * 签署参与者信息.
 * </p>
 * 包含发送者信息和接受者信息列表.
 * 
 * @since 1.0.2
 */
public class EnvelopeParticipantInfo {
    /**
     * 发送者信息.
     *
     * @since 1.0.2
     */
    private Sender sender;
    /**
     * 接受者信息列表.
     *
     * @since 1.0.2
     */
    private List<Receiver> receivers;

    public Sender getSender() {
        return sender;
    }

    public List<Receiver> getReceivers() {
        return receivers;
    }

    public void setSender(Sender sender) {
        this.sender = sender;
    }

    public void setReceivers(List<Receiver> receivers) {
        this.receivers = receivers;
    }

    public EnvelopeParticipantInfo() {
    }

    public EnvelopeParticipantInfo(Builder builder) {
        this.receivers = builder.receivers;
        this.sender = builder.sender;
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder implements cn.signit.sdk.pojo.Builder<EnvelopeParticipantInfo> {
        private Sender sender;
        private List<Receiver> receivers;

        public Builder() {
        }

        public Builder(EnvelopeParticipantInfo participantInfo) {
            this.receivers = participantInfo.receivers;
            this.sender = participantInfo.sender;
        }

        public Builder sender(Sender sender) {
            this.sender = sender;
            return this;
        }

        public Builder sender(Sender.Builder senderBuilder) {
            if (senderBuilder != null) {
                this.sender = senderBuilder.build();
            }
            return this;
        }

        public Builder receivers(List<Receiver> receivers) {
            this.receivers = receivers;
            return this;
        }

        public Builder receivers(Receiver.Builder... builders) {
            this.receivers = ListBuilder.buildList(builders);
            return this;
        }

        @Override
        public EnvelopeParticipantInfo build() {
            return new EnvelopeParticipantInfo(this);
        }
    }
}
