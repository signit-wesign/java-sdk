package cn.signit.sdk.pojo;

import java.util.List;

import cn.signit.sdk.util.ListBuilder;

public class EnvelopeContentInfo {
    /**
     * 签署文件信息列表.
     *
     * @since 1.0.2
     */
    private List<EnvelopeFile> files;

    /**
     * 获取files属性字段的值.
     *
     * @return 类型为List<EnvelopeFile>的files属性字段的值.
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

    public static class Builder implements cn.signit.sdk.pojo.Builder<EnvelopeContentInfo> {
        private List<EnvelopeFile> files;

        public Builder() {
        }

        public Builder(EnvelopeContentInfo contentInfo) {
            this.files = contentInfo.files;
        }

        public Builder files(List<EnvelopeFile> envelopeFiles) {
            this.files = envelopeFiles;
            return this;
        }

        public Builder files(EnvelopeFile.Builder... builders) {
            this.files = ListBuilder.buildList(builders);
            return this;
        }

        @Override
        public EnvelopeContentInfo build() {
            return new EnvelopeContentInfo(this);
        }

    }
}
