package cn.signit.sdk.pojo;

import java.util.List;

import cn.signit.sdk.util.ListBuilder;

/**
 * 签署文件内容
 * 
 * @since 2.0.0
 */
public class EnvelopeContentInfo {
    /**
     * 签署文件详细信息列表.
     *
     * @since 2.0.0
     */
    private List<EnvelopeFile> files;

    /**
     * 获取files属性字段的值.
     *
     * @return 类型为{@code List<EnvelopeFile>}的files属性字段的值.
     */
    public List<EnvelopeFile> getFiles() {
        return files;
    }

    public void setFiles(List<EnvelopeFile> files) {
        this.files = files;
    }

    public EnvelopeContentInfo() {
    }

    public EnvelopeContentInfo(Builder builder) {
        this.files = builder.files;
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    /**
     * 签署文件内容对象建造器
     * 
     * @since 2.0.0
     */
    public static class Builder implements cn.signit.sdk.pojo.Builder<EnvelopeContentInfo> {
        private List<EnvelopeFile> files;

        public Builder() {
        }

        public Builder(EnvelopeContentInfo contentInfo) {
            this.files = contentInfo.files;
        }

        /**
         * 
         * @param envelopeFiles
         *            签署文件详细信息列表， 每次最多添加30个，目前支持
         *            PDF、DOC、XLS、PPT、DOCX、XLSX.、PPTX、JPG、JPEG、PNG、BMP格式
         *            {@link EnvelopeFile}
         * @return 签署文件内容对象建造器{@link EnvelopeContentInfo.Builder}
         * @since 2.0.0
         */
        public Builder files(List<EnvelopeFile> envelopeFiles) {
            this.files = envelopeFiles;
            return this;
        }

        /**
         * 
         * @param builders
         *            签署文件详细信息构造器列表， 每次最多添加30个，目前支持
         *            PDF、DOC、XLS、PPT、DOCX、XLSX.、PPTX、JPG、JPEG、PNG、BMP格式
         *            {@link EnvelopeFile.Builder}
         * @return 签署文件内容对象建造器{@link EnvelopeContentInfo.Builder}
         * @since 2.0.0
         */
        public Builder files(EnvelopeFile.Builder... builders) {
            this.files = ListBuilder.buildList(builders);
            return this;
        }

        /**
         * 
         * @return 签署文件内容对象{@link EnvelopeContentInfo}
         * @since 2.0.0
         */
        @Override
        public EnvelopeContentInfo build() {
            return new EnvelopeContentInfo(this);
        }

    }
}
