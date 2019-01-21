package cn.signit.sdk.pojo;

import java.util.List;

import cn.signit.sdk.util.ListBuilder;

/**
 * 参与文件签署人员的信息. 包含发送者信息和接受者信息列表.
 * 
 * @since 2.0.0
 */
public class EnvelopeParticipantInfo {
    /**
     * 发送者信息.
     *
     * @since 2.0.0
     */
    private Sender sender;
    /**
     * 接受者信息列表.
     *
     * @since 2.0.0
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

    /**
     * 参与文件签署人员的信息对象建造器
     * 
     * @since 2.0.0
     */
    public static class Builder implements cn.signit.sdk.pojo.Builder<EnvelopeParticipantInfo> {
        private Sender sender;
        private List<Receiver> receivers;

        public Builder() {
        }

        public Builder(EnvelopeParticipantInfo participantInfo) {
            this.receivers = participantInfo.receivers;
            this.sender = participantInfo.sender;
        }

        /**
         * 
         * @param sender
         *            发送方信息对象 {@link Sender}
         * @return 参与文件签署人员的信息对象建造器{@link EnvelopeParticipantInfo.Builder}
         * @since 2.0.0
         */
        public Builder sender(Sender sender) {
            this.sender = sender;
            return this;
        }

        /**
         * 
         * @param senderBuilder
         *            发送发信息对象建造器 {@link Sender.Builder}
         * @return 参与文件签署人员的信息对象建造器{@link EnvelopeParticipantInfo.Builder}
         * @since 2.0.0
         */
        public Builder sender(Sender.Builder senderBuilder) {
            if (senderBuilder != null) {
                this.sender = senderBuilder.build();
            }
            return this;
        }

        /**
         * 
         * @param receivers
         *            接收方信息对象列表 {@link Receiver}
         * @return 参与文件签署人员的信息对象建造器{@link EnvelopeParticipantInfo.Builder}
         * @since 2.0.0
         */
        public Builder receivers(List<Receiver> receivers) {
            this.receivers = receivers;
            return this;
        }

        /**
         * 
         * @param builders
         *            接收方信息对象建造器列表 {@link Receiver.Builder}
         * @return 参与文件签署人员的信息对象建造器{@link EnvelopeParticipantInfo.Builder}
         * @since 2.0.0
         */
        public Builder receivers(Receiver.Builder... builders) {
            this.receivers = ListBuilder.buildList(builders);
            return this;
        }

        /**
         * 
         * @return 参与文件签署人员的信息对象 {@link EnvelopeParticipantInfo}
         * @since 2.0.0
         */
        @Override
        public EnvelopeParticipantInfo build() {
            return new EnvelopeParticipantInfo(this);
        }
    }
}
