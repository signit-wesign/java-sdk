package cn.signit.sdk.pojo;

/**
 * 用户联系方式.
 * </p>
 * 包含邮箱和手机号码.
 *
 * @since 1.0.2
 */
public class Contact {
    /**
     * 电子邮箱.
     *
     * @since 1.0.2
     */
    private String email;
    /**
     * 手机号码.
     *
     * @since 1.0.2
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

    public static class Builder implements cn.signit.sdk.pojo.Builder<Contact> {
        private String email;
        private String phone;

        public Builder() {
        }

        public Builder(Contact contact) {
            this.email = contact.email;
            this.phone = contact.phone;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        @Override
        public Contact build() {
            return new Contact(this);
        }

    }

}
