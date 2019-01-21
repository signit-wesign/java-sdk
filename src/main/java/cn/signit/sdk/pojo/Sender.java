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

        public Builder() {

        }

        public Builder(Sender sender) {
            this.contact = sender.contact;
            this.name = sender.name;
            this.deleteCompletedEnvelope = sender.deleteCompletedEnvelope;
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
         * @return 发送方信息对象 {@link Sender}
         * @since 2.0.0
         */
        @Override
        public Sender build() {
            return new Sender(this);
        }

    }
}
