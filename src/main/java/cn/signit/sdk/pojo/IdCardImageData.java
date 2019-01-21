package cn.signit.sdk.pojo;

/**
 * 证件图片数据.
 * 
 * @since 2.0.0
 */
public class IdCardImageData extends BaseFileData {

    /**
     * 证件的文件全局唯一ID.
     *
     * @since 2.0.0
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

    /**
     * 证件图片数据对象建造器
     * 
     * @since 2.0.0
     */
    public static class Builder extends BaseFileData.Builder {
        private String fileWsid;

        public Builder() {
        }

        public Builder(IdCardImageData idCardImageData) {
            this.base64 = idCardImageData.base64;
            this.url = idCardImageData.url;
            this.fileWsid = idCardImageData.fileWsid;
        }

        /**
         * 
         * @param base64
         *            证件照片数据的base64（最大支持大约10MB）
         * @return 证件图片对象建造器 {@link IdCardImageData.Builder}
         * @since 2.0.0
         */
        public Builder base64(String base64) {
            this.base64 = base64;
            return this;
        }

        /**
         * 
         * @param url
         *            证件照片数据的url地址，允许易企签通过HTTP的GET请求获取的地址
         * @return 证件图片数据对象建造器 {@link IdCardImageData.Builder}
         * @since 2.0.0
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        /**
         * 
         * @param fileWsid
         *            文件在易企签系统的唯一ID，由易企签生成
         * @return 证件图片数据对象建造器 {@link IdCardImageData.Builder}
         * @since 2.0.0
         */
        @Deprecated
        public Builder fileWsid(String fileWsid) {
            this.fileWsid = fileWsid;
            return this;
        }

        /**
         * 
         * @return 证件图片数据对象
         * @since 2.0.0
         */
        public IdCardImageData build() {
            return new IdCardImageData(this);
        }
    }
}