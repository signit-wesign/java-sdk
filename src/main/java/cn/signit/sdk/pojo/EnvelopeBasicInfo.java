package cn.signit.sdk.pojo;

import cn.signit.sdk.type.AuthLevel;
import cn.signit.sdk.type.EnvelopeType;

/**
 * 信封基本信息.
 * </p>
 * 包含信封标题、信封主题、信封类型、信封认证等级、自定义元数据信息.
 *
 * @since 1.0.2
 */
public class EnvelopeBasicInfo {
    /**
     * 信封标题.
     *
     * @since 1.0.2
     */
    private String title;
    /**
     * 信封主题.
     *
     * @since 1.0.2
     */
    private String subject;
    /**
     * 信封类型.
     * </p>
     * 对应枚举：EnvelopeType
     * 
     * @since 1.0.2
     */
    private EnvelopeType type;
    /**
     * 信封认证等级.
     * </p>
     * 对应枚举：AuthLevel
     * 
     * @since 1.0.2
     */
    private AuthLevel authLevel;
    /**
     * 自定义元数据信息.
     *
     * @since 1.0.2
     */
    private String metadata;

    public String getTitle() {
        return title;
    }

    public String getSubject() {
        return subject;
    }

    public EnvelopeType getType() {
        return type;
    }

    public AuthLevel getAuthLevel() {
        return authLevel;
    }

    public String getMetadata() {
        return metadata;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setType(EnvelopeType type) {
        this.type = type;
    }

    public void setAuthLevel(AuthLevel authLevel) {
        this.authLevel = authLevel;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    public EnvelopeBasicInfo() {

    }

    public EnvelopeBasicInfo(Builder builder) {
        this.title = builder.title;
        this.subject = builder.subject;
        this.type = builder.type;
        this.authLevel = builder.authLevel;
        this.metadata = builder.metadata;
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder implements cn.signit.sdk.pojo.Builder<EnvelopeBasicInfo> {
        private String title;
        private String subject;
        private EnvelopeType type;
        private AuthLevel authLevel;
        private String metadata;

        public Builder() {
        }

        public Builder(EnvelopeBasicInfo enveBasicInfo) {
            this.title = enveBasicInfo.title;
            this.subject = enveBasicInfo.subject;
            this.type = enveBasicInfo.type;
            this.authLevel = enveBasicInfo.authLevel;
            this.metadata = enveBasicInfo.metadata;
        }

        public Builder title(String titile) {
            this.title = titile;
            return this;
        }

        public Builder subject(String subject) {
            this.subject = subject;
            return this;
        }

        public Builder type(EnvelopeType type) {
            this.type = type;
            return this;
        }

        public Builder authLevel(AuthLevel authLevel) {
            this.authLevel = authLevel;
            return this;
        }

        public Builder metadata(String metadata) {
            this.metadata = metadata;
            return this;
        }

        @Override
        public EnvelopeBasicInfo build() {
            return new EnvelopeBasicInfo(this);
        }

    }

}
