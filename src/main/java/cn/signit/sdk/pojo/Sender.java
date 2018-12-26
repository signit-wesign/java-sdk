package cn.signit.sdk.pojo;

/**
 * 发送者信息.
 * </p>
 * 包含姓名和联系方式.
 *
 * @since 1.0.2
 */
public class Sender {
    /**
     * 发送者名字.
     *
     * @since 1.0.2
     */
    private String name;
    /**
     * 发送者联系方式.
     *
     * @since 1.0.2
     */
    private Contact contact;
    /**
     * 流程完成后删除当前参与者的信封. <br/>
     * 默认：false
     * 
     * @since 1.2.12
     */
    private boolean deleteCompletedEnvelope;
    
    
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

        public Builder contact(Contact contact) {
            this.contact = contact;
            return this;
        }

        public Builder contact(Contact.Builder contactBuilder) {
            if (contactBuilder != null) {
                this.contact = contactBuilder.build();
            }
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }
        
        public Builder deleteCompletedEnvelope(boolean deleteCompletedEnvelope) {
            this.deleteCompletedEnvelope = deleteCompletedEnvelope;
            return this;
        }

        @Override
        public Sender build() {
            return new Sender(this);
        }

    }
}
