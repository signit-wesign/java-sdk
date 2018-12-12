package cn.signit.sdk.pojo;

import cn.signit.sdk.type.FileType;

/**
 * 签署文件信息列表.
 * </p>
 * 包含：待签文件i唯一标识ID、该文件排列顺序、签署文件的数据、文件名、 文件拥有者访问口令、文件类型、文件是否作为附件、自定义元数据信息
 * 
 * @since 1.0.2
 */
public class EnvelopeFile {
    /**
     * 待签文件唯一标识ID.
     *
     * @since 1.0.2
     */
    private String id;
    /**
     * 该文件排列顺序.
     *
     * @since 1.0.2
     */
    private Integer sequence;
    /**
     * 签署文件的数据.
     *
     * @since 1.0.2
     */
    private BaseFileData data;
    /**
     * 文件名.
     *
     * @since 1.0.2
     */
    private String fileName;
    /**
     * 文件拥有者访问口令.
     *
     * @since 1.0.2
     */
    private String fileOverPassin;
    /**
     * 文件类型.
     * </p>
     * 对应枚举：FileType
     * 
     * @since 1.0.2
     */
    private FileType contentType;
    /**
     * 文件是否作为附件.
     * </p>
     * 默认为false
     * 
     * @since 1.0.2
     */
    private boolean isAttached = false;
    /**
     * 自定义元数据信息.
     *
     * @since 1.0.2
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

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder sequence(Integer sequence) {
            this.sequence = sequence;
            return this;
        }

        public Builder data(BaseFileData data) {
            this.data = data;
            return this;
        }

        public Builder data(BaseFileData.Builder dataBuilder) {
            if (dataBuilder != null) {
                this.data = dataBuilder.build();
            }
            return this;
        }

        public Builder fileName(String fileName) {
            this.fileName = fileName;
            return this;
        }

        public Builder fileOverPassin(String fileOverPassin) {
            this.fileOverPassin = fileOverPassin;
            return this;
        }

        public Builder contentType(FileType contentType) {
            this.contentType = contentType;
            return this;
        }

        public Builder isAttached(boolean isAttached) {
            this.isAttached = isAttached;
            return this;
        }

        public Builder metadata(String metadata) {
            this.metadata = metadata;
            return this;
        }

        @Override
        public EnvelopeFile build() {
            return new EnvelopeFile(this);
        }

    }

}
