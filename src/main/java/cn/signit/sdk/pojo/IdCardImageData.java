package cn.signit.sdk.pojo;

/**
 * 证件图像数据.
 * 
 * @since 1.0.2
 */
public class IdCardImageData extends BaseFileData {

    /**
     * 证件的文件全局唯一ID.
     *
     * @since 1.0.2
     */
    private String fileWsid;

    public String getFileWsid() {
        return fileWsid;
    }

    public void setFileWsid(String fileWsid) {
        this.fileWsid = fileWsid;
    }

    public IdCardImageData(Builder builder) {
        super(builder);
        this.fileWsid = builder.fileWsid;
    }

    public IdCardImageData() {

    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder extends BaseFileData.Builder {
        private String fileWsid;

        public Builder() {
        }

        public Builder(IdCardImageData idCardImageData) {
            this.base64 = idCardImageData.base64;
            this.url = idCardImageData.url;
            this.fileWsid = idCardImageData.fileWsid;
        }

        public Builder base64(String base64) {
            this.base64 = base64;
            return this;
        }

        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public Builder fileWsid(String fileWsid) {
            this.fileWsid = fileWsid;
            return this;
        }

        public IdCardImageData build() {
            return new IdCardImageData(this);
        }
    }
}