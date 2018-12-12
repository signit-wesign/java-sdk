package cn.signit.sdk.pojo;

import cn.signit.sdk.pojo.Signer.Position;
import cn.signit.sdk.type.FormType;

/**
 * 预设表单信息.
 * </p>
 * 包括表单类型、印章/手写签名名字、所签署文件ID、签署表单坐标位置、表单是否必填、表单缩放比例
 * 、签名初始化值、表单是否允许修正、当前表单的自定义标识、是否是纠正创建的表单
 * 
 * @since 1.0.2
 */
public class PresetForm {
    /**
     * 表单类型.
     * </p>
     * 对应枚举：FormType
     * 
     * @since 1.0.2
     */
    private FormType formType;
    /**
     * 当前表单要设置到的文件上，引用contentInfo.files[].id值.
     *
     * @since 1.0.2
     */
    private String fileId;
    /**
     * 签署表单坐标位置.
     *
     * @since 1.0.2
     */
    private Position position;
    /**
     * 表单是否必填.
     *
     * @since 1.0.2
     */
    private boolean required = false;
    /**
     * 表单缩放比例.
     *
     * @since 1.0.2
     */
    private Float scale = 1.0f;
    /**
     * 签名初始化值.
     *
     * @since 1.0.2
     */
    private InitialValue initialValue;
    /**
     * 表单是否允许修正.
     *
     * @since 1.0.2
     */
    private boolean revisable = false;
    /**
     * 当前表单的自定义标识.
     *
     * @since 1.0.2
     */
    private String tagId;
    /**
     * 是否是纠正创建的表单.
     *
     * @since 1.0.2
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

    public boolean isRequired() {
        return required;
    }

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

    public static class Builder implements cn.signit.sdk.pojo.Builder<PresetForm> {
        private FormType formType;
        private String fileId;
        private Position position;
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

        public Builder formType(FormType formType) {
            this.formType = formType;
            return this;
        }

        public Builder fileId(String fileId) {
            this.fileId = fileId;
            return this;
        }

        public Builder position(Position position) {
            this.position = position;
            return this;
        }

        public Builder position(Position.PositionBuilder positionBuilder) {
            if (positionBuilder != null) {
                this.position = positionBuilder.build();
            }
            return this;
        }

        public Builder required(boolean required) {
            this.required = required;
            return this;
        }

        public Builder scale(Float scale) {
            this.scale = scale;
            return this;
        }

        public Builder initialValue(InitialValue initialValue) {
            this.initialValue = initialValue;
            return this;
        }

        public Builder initialValue(InitialValue.Builder initialValueBuilder) {
            if (initialValueBuilder != null) {
                this.initialValue = initialValueBuilder.build();
            }
            return this;
        }

        public Builder revisable(boolean revisable) {
            this.revisable = revisable;
            return this;
        }

        public Builder tagId(String tagId) {
            this.tagId = tagId;
            return this;
        }

        public Builder corrected(boolean corrected) {
            this.corrected = corrected;
            return this;
        }

        @Override
        public PresetForm build() {
            return new PresetForm(this);
        }
    }

}
