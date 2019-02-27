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
    /**
     * 跨页表单距离页面边缘边距，单位px
     * 
     * @since 2.0.1
     */
    private Float margin;
    /**
     * 防伪标记中心按顺时针方向,沿页面边缘偏移的量
     *
     * @since 2.0.1
     */
    private Float offset;
    /**
     * 签署完成后证书所在的页数，若为空字符串或null，则等价于为均为无证书骑缝章。支持格式形如：'first','last','all','odd','even','1','1-5','1,3,4,7,8',...
     * 
     * @since 2.0.1
     */
    private String certPages;
    /**
     * 单位图片所占像素(当且仅当每页宽度不足1px时有效).
     * 
     * @since 2.0.1
     */
    private Integer pixel;
    /**
     * 单页数是否加盖骑缝章
     * 
     * @since 2.0.1
     */
    private boolean singlePageMark;
    /**
     * 是否重设骑缝章尺寸
     * 
     * @since 2.0.1
     */
    private boolean resizable;
    /**
     * 重设骑缝章尺寸宽度.单位px.当resizable=true时该值的设置才有效
     * 
     * @since 2.0.1
     */
    private Float resizeWidth;
    /**
     * 重设骑缝章尺寸高度.单位px.当resizable=true时该值的设置才有效
     * 
     * @since 2.0.1
     */
    private Float resizeHeight;

    /**
     * 二维码宽,单位px.
     * 
     * @since 2.0.1
     */
    private Float width;

    /**
     * 二维码高，单位px.
     * 
     * @since 2.0.1
     */
    private Float height;

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

    public Float getMargin() {
        return margin;
    }

    public void setMargin(Float margin) {
        this.margin = margin;
    }

    public Float getOffset() {
        return offset;
    }

    public void setOffset(Float offset) {
        this.offset = offset;
    }

    public String getCertPages() {
        return certPages;
    }

    public void setCertPages(String certPages) {
        this.certPages = certPages;
    }

    public Integer getPixel() {
        return pixel;
    }

    public void setPixel(Integer pixel) {
        this.pixel = pixel;
    }

    public boolean isSinglePageMark() {
        return singlePageMark;
    }

    public void setSinglePageMark(boolean singlePageMark) {
        this.singlePageMark = singlePageMark;
    }

    public boolean isResizable() {
        return resizable;
    }

    public void setResizable(boolean resizable) {
        this.resizable = resizable;
    }

    public Float getResizeWidth() {
        return resizeWidth;
    }

    public void setResizeWidth(Float resizeWidth) {
        this.resizeWidth = resizeWidth;
    }

    public Float getResizeHeight() {
        return resizeHeight;
    }

    public void setResizeHeight(Float resizeHeight) {
        this.resizeHeight = resizeHeight;
    }

    public Float getWidth() {
        return width;
    }

    public void setWidth(Float width) {
        this.width = width;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
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
        this.margin = builder.margin;
        this.offset = builder.offset;
        this.certPages = builder.certPages;
        this.pixel = builder.pixel;
        this.singlePageMark = builder.singlePageMark;
        this.resizable = builder.resizable;
        this.resizeWidth = builder.resizeWidth;
        this.resizeHeight = builder.resizeHeight;
        this.width = builder.width;
        this.height = builder.height;
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
        private Float margin;
        private Float offset;
        private String certPages;
        private Integer pixel;
        private boolean singlePageMark;
        private boolean resizable;
        private Float resizeWidth;
        private Float resizeHeight;
        private Float width;
        private Float height;

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
            this.margin = form.margin;
            this.offset = form.offset;
            this.certPages = form.certPages;
            this.pixel = form.pixel;
            this.singlePageMark = form.singlePageMark;
            this.resizable = form.resizable;
            this.resizeWidth = form.resizeWidth;
            this.resizeHeight = form.resizeHeight;
            this.width = form.width;
            this.height = form.height;
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
         * 
         *
         * @param margin
         *            跨页表单距离页面边缘边距，单位px
         * @return 预设表单信息对象建造器{@link PresetForm.Builder}
         * @since 2.0.1
         */
        public Builder margin(Float margin) {
            this.margin = margin;
            return this;
        }

        /**
         * 
         * 
         *
         * @param offset
         *            防伪标记中心按顺时针方向,沿页面边缘偏移的量
         * @return 预设表单信息对象建造器{@link PresetForm.Builder}
         * @since 2.0.1
         */
        public Builder offset(Float offset) {
            this.offset = offset;
            return this;
        }

        /**
         * 
         * 
         *
         * @param certPages
         *            签署完成后证书所在的页数，若为空字符串或null，则等价于为均为无证书骑缝章。支持格式形如：'first','last','all','odd','even','1','1-5','1,3,4,7,8',...
         * @return 预设表单信息对象建造器{@link PresetForm.Builder}
         * @since 2.0.1
         */
        public Builder certPages(String certPages) {
            this.certPages = certPages;
            return this;
        }

        /**
         * 
         * 
         *
         * @param pixel
         *            单位图片所占像素(当且仅当每页宽度不足1px时有效).
         * @return 预设表单信息对象建造器{@link PresetForm.Builder}
         * @since 2.0.1
         */
        public Builder pixel(Integer pixel) {
            this.pixel = pixel;
            return this;
        }

        /**
         * 
         * 
         *
         * @param singlePageMark
         *            单页数是否加盖骑缝章
         * @return 预设表单信息对象建造器{@link PresetForm.Builder}
         * @since 2.0.1
         */
        public Builder singlePageMark(boolean singlePageMark) {
            this.singlePageMark = singlePageMark;
            return this;
        }

        /**
         * 
         * 
         *
         * @param resizable
         *            是否重设骑缝章尺寸
         * @return 预设表单信息对象建造器{@link PresetForm.Builder}
         * @since 2.0.1
         */
        public Builder resizable(boolean resizable) {
            this.resizable = resizable;
            return this;
        }

        /**
         * 
         * 
         *
         * @param resizeWidth
         *            重设骑缝章尺寸宽度.单位px.当resizable=true时该值的设置才有效
         * @return 预设表单信息对象建造器{@link PresetForm.Builder}
         * @since 2.0.1
         */
        public Builder resizeWidth(Float resizeWidth) {
            this.resizeWidth = resizeWidth;
            return this;
        }

        /**
         * 
         * 
         *
         * @param resizeHeight
         *            重设骑缝章尺寸高度.单位px.当resizable=true时该值的设置才有效
         * @return 预设表单信息对象建造器{@link PresetForm.Builder}
         * @since 2.0.1
         */
        public Builder resizeHeight(Float resizeHeight) {
            this.resizeHeight = resizeHeight;
            return this;
        }

        /**
         * 
         * 
         *
         * @param width
         *            二维码宽,单位px.
         * @return 预设表单信息对象建造器{@link PresetForm.Builder}
         * @since 2.0.1
         */
        public Builder width(Float width) {
            this.width = width;
            return this;
        }

        /**
         * 
         * 
         *
         * @param height
         *            二维码高，单位px.
         * @return 预设表单信息对象建造器{@link PresetForm.Builder}
         * @since 2.0.1
         */
        public Builder height(Float height) {
            this.height = height;
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
