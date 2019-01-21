package cn.signit.sdk.pojo;

/**
 * 用户联系方式. 包含邮箱和手机号码.
 *
 * @since 2.0.0
 */
public class Contact {
    /**
     * 电子邮箱.
     *
     * @since 2.0.0
     */
    private String email;
    /**
     * 手机号码.
     *
     * @since 2.0.0
     */
    private String phone;

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Contact() {
    }

    public Contact(Builder builder) {
        this.email = builder.email;
        this.phone = builder.phone;
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    /**
     * 用户联系方式对象建造器
     * 
     * @since 2.0.0
     */
    public static class Builder implements cn.signit.sdk.pojo.Builder<Contact> {
        private String email;
        private String phone;

        public Builder() {
        }

        public Builder(Contact contact) {
            this.email = contact.email;
            this.phone = contact.phone;
        }

        /**
         * 
         * @param email
         *            电子邮箱
         * @return 用户联系方式对象建造器{@link Contact.Builder}
         * @since 2.0.0
         */
        public Builder email(String email) {
            this.email = email;
            return this;
        }

        /**
         * 
         * @param phone
         *            手机号
         * @return 用户联系方式对象建造器{@link Contact.Builder}
         * @since 2.0.0
         */
        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        /**
         * 
         * @return 用户联系方式对象 {@link Contact}
         * @since 2.0.0
         */
        @Override
        public Contact build() {
            return new Contact(this);
        }

    }

}
