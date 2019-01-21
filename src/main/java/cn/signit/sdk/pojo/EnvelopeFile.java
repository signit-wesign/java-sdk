package cn.signit.sdk.pojo;

import cn.signit.sdk.type.FileType;

/**
 * 签署文件详细信息。包含：待签文件i唯一标识ID、该文件排列顺序、签署文件的数据、文件名、 文件拥有者访问口令、文件类型、文件是否作为附件、自定义元数据信息
 * 
 * @since 2.0.0
 */
public class EnvelopeFile {
    /**
     * 待签文件唯一标识ID.
     *
     * @since 2.0.0
     */
    private String id;
    /**
     * 该文件排列顺序.
     *
     * @since 2.0.0
     */
    private Integer sequence;
    /**
     * 签署文件的数据.
     *
     * @since 2.0.0
     */
    private BaseFileData data;
    /**
     * 文件名.
     *
     * @since 2.0.0
     */
    private String fileName;
    /**
     * 文件拥有者访问口令.
     *
     * @since 2.0.0
     */
    private String fileOverPassin;
    /**
     * 文件类型.
     * </p>
     * 对应枚举：FileType
     * 
     * @since 2.0.0
     */
    private FileType contentType;
    /**
     * 文件是否作为附件.
     * </p>
     * 默认为false
     * 
     * @since 2.0.0
     */
    private boolean isAttached = false;
    /**
     * 自定义元数据信息.
     *
     * @since 2.0.0
     */
    private String metadata;

    public String getId() {
        return id;
    }

    public Integer getSequence() {
        return sequence;
    }

    public BaseFileData getData() {
        return data;
    }

    public String getFileName() {
        return fileName;
    }

    public String getFileOverPassin() {
        return fileOverPassin;
    }

    public FileType getContentType() {
        return contentType;
    }

    public boolean isAttached() {
        return isAttached;
    }

    public String getMetadata() {
        return metadata;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public void setData(BaseFileData data) {
        this.data = data;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setFileOverPassin(String fileOverPassin) {
        this.fileOverPassin = fileOverPassin;
    }

    public void setContentType(FileType contentType) {
        this.contentType = contentType;
    }

    public void setAttached(boolean isAttached) {
        this.isAttached = isAttached;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    public EnvelopeFile() {

    }

    public EnvelopeFile(Builder builder) {
        this.id = builder.id;
        this.sequence = builder.sequence;
        this.data = builder.data;
        this.fileName = builder.fileName;
        this.fileOverPassin = builder.fileOverPassin;
        this.contentType = builder.contentType;
        this.isAttached = builder.isAttached;
        this.metadata = builder.metadata;
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    /**
     * 签署文件详细信息对象建造器
     * 
     * @since 2.0.0
     */
    public static class Builder implements cn.signit.sdk.pojo.Builder<EnvelopeFile> {
        private String id;
        private Integer sequence;
        private BaseFileData data;
        private String fileName;
        private String fileOverPassin;
        private FileType contentType;
        private boolean isAttached = false;
        private String metadata;

        public Builder() {
        }

        public Builder(EnvelopeFile envelopeFile) {
            this.id = envelopeFile.id;
            this.sequence = envelopeFile.sequence;
            this.data = envelopeFile.data;
            this.fileName = envelopeFile.fileName;
            this.fileOverPassin = envelopeFile.fileOverPassin;
            this.contentType = envelopeFile.contentType;
            this.isAttached = envelopeFile.isAttached;
            this.metadata = envelopeFile.metadata;
        }

        /**
         * 
         * @param id
         *            调用方为当前待签文件设置一个ID标识，便于在预设表单时，指定预设表单签署在哪个文件中
         * @return 签署文件详细信息构造器{@link EnvelopeFile.Builder}
         * @since 2.0.0
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * 
         * @param sequence
         *            当前文件的排列顺序,从1开始，若不填，则系统默认设置为：1，sequence最大值为30，即：允许添加的文件个数最多为30个；默认值为1
         * @return 签署文件详细信息构造器{@link EnvelopeFile.Builder}
         * @since 2.0.0
         */
        public Builder sequence(Integer sequence) {
            this.sequence = sequence;
            return this;
        }

        /**
         * 
         * @param data
         *            签署文件的数据对象 {@link BaseFileData}
         * @return 签署文件详细信息构造器{@link EnvelopeFile.Builder}
         * @since 2.0.0
         */
        public Builder data(BaseFileData data) {
            this.data = data;
            return this;
        }

        /**
         * 
         * @param dataBuilder
         *            签署文件的数据对象建造器 {@link BaseFileData.Builder}
         * @return 签署文件详细信息构造器{@link EnvelopeFile.Builder}
         * @since 2.0.0
         */
        public Builder data(BaseFileData.Builder dataBuilder) {
            if (dataBuilder != null) {
                this.data = dataBuilder.build();
            }
            return this;
        }

        /**
         * 通过data获取
         * 
         * @param fileName
         *            如果传输文件方式为Base64，并且fileName为空，则生成随机名字。优先级：{@code fileName>url后缀名>随机名字}。
         * @return 签署文件详细信息构造器{@link EnvelopeFile.Builder}
         * @since 2.0.0
         */
        @Deprecated
        public Builder fileName(String fileName) {
            this.fileName = fileName;
            return this;
        }

        /**
         * 
         * @param fileOverPassin
         *            上传的文件如果有访问口令才能打开，则需要设置文件拥有者访问口令
         * @return 签署文件详细信息构造器{@link EnvelopeFile.Builder}
         * @since 2.0.0
         */
        public Builder fileOverPassin(String fileOverPassin) {
            this.fileOverPassin = fileOverPassin;
            return this;
        }

        /**
         * 通过data获取
         * 
         * @param contentType
         *            文件类型
         * @return 签署文件详细信息构造器{@link EnvelopeFile.Builder}
         * @since 2.0.0
         */
        @Deprecated
        public Builder contentType(FileType contentType) {
            this.contentType = contentType;
            return this;
        }

        /**
         * 
         * @param isAttached
         *            文件是否作为附件，true-文件作为附件，false-文件不作为附件；默认值为false
         * @return 签署文件详细信息构造器{@link EnvelopeFile.Builder}
         * @since 2.0.0
         */
        public Builder isAttached(boolean isAttached) {
            this.isAttached = isAttached;
            return this;
        }

        /**
         * 
         * @param metadata
         *            自定义元数据信息，用于扩展，会存储在易企签平台，仅支持JSON字符串
         * @return 签署文件详细信息构造器{@link EnvelopeFile.Builder}
         * @since 2.0.0
         */
        public Builder metadata(String metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * 
         * @return 签署文件详细信息对象{@link EnvelopeFile}
         * @since 2.0.0
         */
        @Override
        public EnvelopeFile build() {
            return new EnvelopeFile(this);
        }

    }

}
