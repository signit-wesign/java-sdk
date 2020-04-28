package cn.signit.sdk.pojo;

import cn.signit.sdk.type.AuthLevel;
import cn.signit.sdk.type.EnvelopeType;

/**
 * 信封基本信息. 包含信封标题、信封主题、信封类型、信封认证等级、自定义元数据信息.
 *
 * @since 2.0.0
 */
public class EnvelopeBasicInfo {
    /**
     * 信封标题.
     *
     * @since 2.0.0
     */
    private String title;
    /**
     * 信封主题.
     *
     * @since 2.0.0
     */
    private String subject;
    /**
     * 信封类型.
     * </p>
     * 对应枚举：EnvelopeType
     * 
     * @since 2.0.0
     */
    private EnvelopeType type;
    /**
     * 信封认证等级.
     * </p>
     * 对应枚举：AuthLevel
     * 
     * @since 2.0.0
     */
    private AuthLevel authLevel;
    /**
     * 自定义元数据信息.
     *
     * @since 2.0.0
     */
    private String metadata;

    /**
     * 时间单位：天；如果 当前时间 》 信封发起时间+逾期时间后，信封将不可签署
     * 
     * @since 2.4.0
     */
    private Integer expire;

    /**
     * 信封ID.
     *
     * @since 3.6.0
     */
    private String envelopeWsid;

    /**
     * 模式.
     *
     * @since 3.6.0
     */
    private String mode;

    public Integer getExpire() {
        return expire;
    }

    public void setExpire(Integer expire) {
        this.expire = expire;
    }

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

    public String getEnvelopeWsid() {
        return envelopeWsid;
    }

    public void setEnvelopeWsid(String envelopeWsid) {
        this.envelopeWsid = envelopeWsid;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public EnvelopeBasicInfo() {

    }

    public EnvelopeBasicInfo(Builder builder) {
        this.title = builder.title;
        this.subject = builder.subject;
        this.type = builder.type;
        this.authLevel = builder.authLevel;
        this.metadata = builder.metadata;
        this.expire = builder.expire;
        this.envelopeWsid = builder.envelopeWsid;
        this.mode = builder.mode;
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    /**
     * 信封基本信息对象建造器
     *
     * @since 2.0.0
     */
    public static class Builder implements cn.signit.sdk.pojo.Builder<EnvelopeBasicInfo> {
        private String title;
        private String subject;
        private EnvelopeType type;
        private AuthLevel authLevel;
        private String metadata;
        private Integer expire;
        private String envelopeWsid;
        private String mode;

        public Builder() {
        }

        public Builder(EnvelopeBasicInfo enveBasicInfo) {
            this.title = enveBasicInfo.title;
            this.subject = enveBasicInfo.subject;
            this.type = enveBasicInfo.type;
            this.authLevel = enveBasicInfo.authLevel;
            this.metadata = enveBasicInfo.metadata;
            this.expire = enveBasicInfo.expire;
            this.envelopeWsid = enveBasicInfo.envelopeWsid;
            this.mode = enveBasicInfo.mode;
        }

        /**
         * 
         * @param titile
         *            信封标题
         * @return 信封基本信息对象建造器{@link EnvelopeBasicInfo.Builder}
         * @since 2.0.0
         */
        public Builder title(String titile) {
            this.title = titile;
            return this;
        }

        /**
         * 
         * @param subject
         *            信封主题
         * @return 信封基本信息对象建造器{@link EnvelopeBasicInfo.Builder}
         * @since 2.0.0
         */
        public Builder subject(String subject) {
            this.subject = subject;
            return this;
        }

        /**
         * 
         * @param type
         *            ANY-任意签； ME-本人签； ME_AND_OTHERS-我与他人签；
         *            OTHERS-他人签；{@link EnvelopeType}；默认为ANY
         * @return 信封基本信息对象建造器{@link EnvelopeBasicInfo.Builder}
         * @since 2.0.0
         */
        public Builder type(EnvelopeType type) {
            this.type = type;
            return this;
        }

        /**
         * 
         * @param authLevel
         *            LOW - 低等级； MIDDLE - 中等级； HIGH - 高等级
         *            {@link AuthLevel}；默认为LOW
         * @return 信封基本信息对象建造器{@link EnvelopeBasicInfo.Builder}
         * @since 2.0.0
         */
        public Builder authLevel(AuthLevel authLevel) {
            this.authLevel = authLevel;
            return this;
        }

        /**
         * 
         * @param metadata
         *            自定义元数据信息，用于扩展，会存储在易企签平台，仅支持JSON字符串
         * @return 信封基本信息对象建造器{@link EnvelopeBasicInfo.Builder}
         * @since 2.0.0
         */
        public Builder metadata(String metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * 
         * @param expire
         *            时间单位：天；如果 当前时间 》 信封发起时间+逾期时间后，信封将不可签署
         * @return 信封基本信息对象建造器{@link EnvelopeBasicInfo.Builder}
         * @since 2.4.0
         */
        public Builder expire(Integer expire) {
            this.expire = expire;
            return this;
        }

        /**
         * 
         * @param envelopeWsid
         *            信封ID
         * @return 信封基本信息对象建造器{@link EnvelopeBasicInfo.Builder}
         * @since 3.6.0
         */
        public Builder envelopeWsid(String envelopeWsid) {
            this.envelopeWsid = envelopeWsid;
            return this;
        }

        /**
         * 
         * @param mode
         *            模式
         * @return 信封基本信息对象建造器{@link EnvelopeBasicInfo.Builder}
         * @since 3.6.0
         */
        public Builder mode(String mode) {
            this.mode = mode;
            return this;
        }

        /**
         * 
         * @return 信封基本信息对象 {@link EnvelopeBasicInfo}
         * @since 2.0.0
         */
        @Override
        public EnvelopeBasicInfo build() {
            return new EnvelopeBasicInfo(this);
        }

    }

}
