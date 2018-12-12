package cn.signit.sdk.pojo;

/**
 * 证书数据.
 * </p>
 * 支持base64、URL、证书数据全局唯一ID中对的任意一种方式.
 *
 * @see (可填，引用或参考其他类型资源，如: {@link java.util.Properties}).
 * @since 1.0.2
 */
public class CertData extends BaseFileData {
    /**
     * 证书数据的全局唯一ID.
     *
     * @since 1.0.2
     */
    private String wsid;

    public String getWsid() {
        return wsid;
    }

    public void setWsid(String wsid) {
        this.wsid = wsid;
    }

    public CertData() {
    }

    public CertData(Builder builder) {
        this.base64 = builder.base64;
        this.url = builder.url;
        this.wsid = builder.wsid;
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder extends BaseFileData.Builder {
        private String wsid;

        public Builder() {
        }

        public Builder(CertData certData) {
            this.base64 = certData.base64;
            this.url = certData.url;
            this.wsid = certData.wsid;
        }

        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public Builder base64(String base64) {
            this.base64 = base64;
            return this;
        }

        public Builder wsid(String wsid) {
            this.wsid = wsid;
            return this;
        }

        @Override
        public CertData build() {
            return new CertData(this);
        }
    }
}
