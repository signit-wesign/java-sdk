package cn.signit.sdk.pojo;

import cn.signit.sdk.pojo.Signer.Position;
import cn.signit.sdk.type.FormType;

/**
 * 预设表单信息。 包括表单类型、印章/手写签名名字、所签署文件ID、签署表单坐标位置、表单是否必填、表单缩放比例
 * 、签名初始化值、表单是否允许修正、当前表单的自定义标识、是否是纠正创建的表单
 * 
 * @since 2.0.0
 */
public class PresetForm {
    /**
     * 表单类型。 对应枚举：FormType
     * 
     * @since 2.0.0
     */
    private FormType formType;
    /**
     * 当前表单要设置到的文件上，引用contentInfo.files[].id值.
     *
     * @since 2.0.0
     */
    private String fileId;
    /**
     * 签署表单坐标位置.
     *
     * @since 2.0.0
     */
    private Position position;
    /**
     * 表单是否必填.
     *
     * @since 2.0.0
     */
    @Deprecated
    private boolean required = false;
    /**
     * 表单缩放比例.
     *
     * @since 2.0.0
     */
    private Float scale = 1.0f;
    /**
     * 签名初始化值.
     *
     * @since 2.0.0
     */
    private InitialValue initialValue;
    /**
     * 表单是否允许修正.
     *
     * @since 2.0.0
     */
    private boolean revisable = false;
    /**
     * 当前表单的自定义标识.
     *
     * @since 2.0.0
     */
    private String tagId;
    /**
     * 是否是纠正创建的表单.
     *
     * @since 2.0.0
     */
    private boolean corrected = false;

    public FormType getFormType() {
        return formType;
    }

    public void setFormType(FormType formType) {
        this.formType = formType;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Deprecated
    public boolean isRequired() {
        return required;
    }

    @Deprecated
    public void setRequired(boolean required) {
        this.required = required;
    }

    public Float getScale() {
        return scale;
    }

    public void setScale(Float scale) {
        this.scale = scale;
    }

    public InitialValue getInitialValue() {
        return initialValue;
    }

    public void setInitialValue(InitialValue initialValue) {
        this.initialValue = initialValue;
    }

    public boolean isRevisable() {
        return revisable;
    }

    public void setRevisable(boolean revisable) {
        this.revisable = revisable;
    }

    public String getTagId() {
        return tagId;
    }

    public void setTagId(String tagId) {
        this.tagId = tagId;
    }

    public boolean isCorrected() {
        return corrected;
    }

    public void setCorrected(boolean corrected) {
        this.corrected = corrected;
    }

    public PresetForm() {
    }

    public PresetForm(Builder builder) {
        this.formType = builder.formType;
        this.fileId = builder.fileId;
        this.position = builder.position;
        this.required = builder.required;
        this.scale = builder.scale;
        this.initialValue = builder.initialValue;
        this.revisable = builder.revisable;
        this.tagId = builder.tagId;
        this.corrected = builder.corrected;
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    /**
     * 预设表单信息对象建造器
     * 
     * @since 2.0.0
     */
    public static class Builder implements cn.signit.sdk.pojo.Builder<PresetForm> {
        private FormType formType;
        private String fileId;
        private Position position;
        @Deprecated
        private boolean required = false;
        private Float scale = 1.0f;
        private InitialValue initialValue;
        private boolean revisable = false;
        private String tagId;
        private boolean corrected = false;

        public Builder() {

        }

        public Builder(PresetForm form) {
            this.formType = form.formType;
            this.fileId = form.fileId;
            this.position = form.position;
            this.required = form.required;
            this.scale = form.scale;
            this.initialValue = form.initialValue;
            this.revisable = form.revisable;
            this.tagId = form.tagId;
            this.corrected = form.corrected;
        }

        /**
         * 
         * @param formType
         *            SEAL_SIGN-印章签名； WRITE_SIGN-手写签名；{@link FormType}
         * @return 预设表单信息对象建造器{@link PresetForm.Builder}
         * @since 2.0.0
         */
        public Builder formType(FormType formType) {
            this.formType = formType;
            return this;
        }

        /**
         * 
         * @param fileId
         *            指定当前表单要设置到哪个文件上，该ID应该与{@link EnvelopeContentInfo}中{@link EnvelopeFile}对象的id对应
         * @return 预设表单信息对象建造器{@link PresetForm.Builder}
         * @since 2.0.0
         */
        public Builder fileId(String fileId) {
            this.fileId = fileId;
            return this;
        }

        /**
         * 
         * @param position
         *            签署表单坐标位置对象 {@link Position}
         * @return 预设表单信息对象建造器{@link PresetForm.Builder}
         * @since 2.0.0
         */
        public Builder position(Position position) {
            this.position = position;
            return this;
        }

        /**
         * 
         * @param positionBuilder
         *            签署表单坐标位置对象建造器 {@link Position.PositionBuilder}
         * @return 预设表单信息对象建造器{@link PresetForm.Builder}
         * @since 2.0.0
         */
        public Builder position(Position.PositionBuilder positionBuilder) {
            if (positionBuilder != null) {
                this.position = positionBuilder.build();
            }
            return this;
        }

        /**
         * 
         * @param required
         *            表单是否必填; true-预设表单必须设置签名初始化值；false-预设表单可以不设置签名初始化值；默认为false
         * @return 预设表单信息对象建造器{@link PresetForm.Builder}
         * @since 2.0.0
         */
        @Deprecated
        public Builder required(boolean required) {
            this.required = required;
            return this;
        }

        /**
         * 
         * @param scale
         *            表单缩放比例
         * @return 预设表单信息对象建造器{@link PresetForm.Builder}
         * @since 2.0.0
         */
        public Builder scale(Float scale) {
            this.scale = scale;
            return this;
        }

        /**
         * 
         * @param initialValue
         *            签名初始化值对象,表单类型为SEAL_SIGN时选用。当表单类型为WRITE_SIGN时，此字段无效。{@link InitialValue}
         * @return 预设表单信息对象建造器{@link PresetForm.Builder}
         * @since 2.0.0
         */
        public Builder initialValue(InitialValue initialValue) {
            this.initialValue = initialValue;
            return this;
        }

        /**
         * 
         * @param initialValueBuilder
         *            {@code 签名初始化值对象建造器，表单类型为SEAL_SIGN时选用。当表单类型为WRITE_SIGN时，此字段无效。}
         *            {@link InitialValue.Builder}
         * @return 预设表单信息对象建造器{@link PresetForm.Builder}
         * @since 2.0.0
         */
        public Builder initialValue(InitialValue.Builder initialValueBuilder) {
            if (initialValueBuilder != null) {
                this.initialValue = initialValueBuilder.build();
            }
            return this;
        }

        /**
         * 
         * @param revisable
         *            表单框是否允许修正；
         *            true-表单框的位置和大小可以修改，false-表单框的位置和大小不可以修改；默认为false
         * @return 预设表单信息对象建造器{@link PresetForm.Builder}
         * @since 2.0.0
         */
        public Builder revisable(boolean revisable) {
            this.revisable = revisable;
            return this;
        }

        /**
         * 
         * @param tagId
         *            调用方定义标识当前表单（json字符串）
         * @return 预设表单信息对象建造器{@link PresetForm.Builder}
         * @since 2.0.0
         */
        public Builder tagId(String tagId) {
            this.tagId = tagId;
            return this;
        }

        /**
         * 
         * @param corrected
         *            是否是纠正创建的表单；true- false-
         * @return 预设表单信息对象建造器{@link PresetForm.Builder}
         * @since 2.0.0
         */
        @Deprecated
        public Builder corrected(boolean corrected) {
            this.corrected = corrected;
            return this;
        }

        /**
         * 
         * @return 预设表单信息对象 {@link PresetForm}
         * @since 2.0.0
         */
        @Override
        public PresetForm build() {
            return new PresetForm(this);
        }
    }

}
