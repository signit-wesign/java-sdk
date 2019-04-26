package cn.signit.sdk.pojo;

/**
 * 发送方信息。 包含姓名和联系方式.
 *
 * @since 2.0.0
 */
public class Sender {
    /**
     * 发送者名字.
     *
     * @since 2.0.0
     */
    private String name;
    /**
     * 发送者联系方式.
     *
     * @since 2.0.0
     */
    private Contact contact;
    /**
     * 流程完成后删除当前参与者的信封. <br/>
     * 默认：false
     * 
     * @since 2.0.0
     */
    private boolean deleteCompletedEnvelope;

    /**
     * 启用嵌入模式，调用方系统中直接嵌入易企签WEB流程时设置为true，签署流程消息只会通过webhook事件消息方式通知，用户在易企签平台设置的短信/邮件等消息将自动屏蔽。非必填，默认值：false.
     *
     * @since 2.1.0
     */
    private boolean enableEmbeddedMode;

    /**
     * 签署发送方用户在调用方系统的唯一标识.<br/>
     * enableEmbeddedMode为false时，非必填；当enableEmbeddedMode为true时，则必填。默认：null
     *
     * @since 2.1.0
     */
    private String clientId;

    public boolean isEnableEmbeddedMode() {
        return enableEmbeddedMode;
    }

    public void setEnableEmbeddedMode(boolean enableEmbeddedMode) {
        this.enableEmbeddedMode = enableEmbeddedMode;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public void setDeleteCompletedEnvelope(boolean deleteCompletedEnvelope) {
        this.deleteCompletedEnvelope = deleteCompletedEnvelope;
    }

    public boolean isDeleteCompletedEnvelope() {
        return deleteCompletedEnvelope;
    }

    public String getName() {
        return name;
    }

    public Contact getContact() {
        return contact;
    }

    public Sender() {
    }

    public Sender(Builder builder) {
        this.contact = builder.contact;
        this.name = builder.name;
        this.deleteCompletedEnvelope = builder.deleteCompletedEnvelope;
        this.enableEmbeddedMode = builder.enableEmbeddedMode;
        this.clientId = builder.clientId;
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    /**
     * 发送方信息对象建造器
     * 
     * @since 2.0.0
     */
    public static class Builder implements cn.signit.sdk.pojo.Builder<Sender> {
        private boolean deleteCompletedEnvelope;
        private String name;
        private Contact contact;
        private boolean enableEmbeddedMode;
        private String clientId;

        public Builder() {

        }

        public Builder(Sender sender) {
            this.contact = sender.contact;
            this.name = sender.name;
            this.deleteCompletedEnvelope = sender.deleteCompletedEnvelope;
            this.enableEmbeddedMode = sender.enableEmbeddedMode;
            this.clientId = sender.clientId;
        }

        /**
         * 
         * @param contact
         *            发送方联系方式(邮件/手机号) {@link Contact}
         * @return 发送方信息对象建造器{@link Sender.Builder}
         * @since 2.0.0
         */
        public Builder contact(Contact contact) {
            this.contact = contact;
            return this;
        }

        /**
         * 
         * @param contactBuilder
         *            发送方联系方式(邮件/手机号) 构造器 {@link Contact.Builder}
         * @return 发送方信息对象建造器{@link Sender.Builder}
         * @since 2.0.0
         */
        public Builder contact(Contact.Builder contactBuilder) {
            if (contactBuilder != null) {
                this.contact = contactBuilder.build();
            }
            return this;
        }

        /**
         * 
         * @param name
         *            发送方姓名
         * @return 发送方信息对象建造器{@link Sender.Builder}
         * @since 2.0.0
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * 
         * @param deleteCompletedEnvelope
         *            对于发送方，在签署完成之后是否删除签署文件（删除文件后发送方不可再下载）true-删除签署文件，false-保留签署文件在易企签平台。默认为false
         * @return 发送方信息对象建造器{@link Sender.Builder}
         * @since 2.0.0
         */
        public Builder deleteCompletedEnvelope(boolean deleteCompletedEnvelope) {
            this.deleteCompletedEnvelope = deleteCompletedEnvelope;
            return this;
        }

        /**
         *
         * @param enableEmbeddedMode
         *            启用嵌入模式，调用方系统中直接嵌入易企签WEB流程时设置为true，签署流程消息只会通过webhook事件消息方式通知，用户在易企签平台设置的短信/邮件等消息将自动屏蔽。非必填，默认值：false
         * @return 发送方信息对象建造器{@link Sender.Builder}
         * @since 2.1.0
         */
        public Builder enableEmbeddedMode(boolean enableEmbeddedMode) {
            this.enableEmbeddedMode = enableEmbeddedMode;
            return this;
        }

        /**
         *
         * @param clientId
         *            签署发送方用户在调用方系统的唯一标识;enableEmbeddedMode为false时，非必填；当enableEmbeddedMode为true时，则必填。默认：null
         * @return 发送方信息对象建造器{@link Sender.Builder}
         * @since 2.1.0
         */
        public Builder clientId(String clientId) {
            this.clientId = clientId;
            return this;
        }

        /**
         * 
         * @return 发送方信息对象 {@link Sender}
         * @since 2.0.0
         */
        @Override
        public Sender build() {
            return new Sender(this);
        }

    }
}
