package cn.signit.sdk.pojo;

/**
 * 手写签名数据.
 * </p>
 * 支持URL/Base64/签名全局唯一ID/签名名字，代表签名数据.
 *
 * @since 1.0.2
 */
public class WriteData extends BaseFileData {
    /**
     * 手写签名全局唯一ID.
     *
     * @since 1.0.2
     */
    private String wsid;
    /**
     * 手写签名名子.
     *
     * @since 1.0.2
     */
    private String name;

    public String getWsid() {
        return wsid;
    }

    public String getName() {
        return name;
    }

    public void setWsid(String wsid) {
        this.wsid = wsid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WriteData() {
    }

    public WriteData(Builder builder) {
        this.base64 = builder.base64;
        this.name = builder.name;
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
        private String name;

        public Builder() {
        }

        public Builder(WriteData writeData) {
            this.base64 = writeData.base64;
            this.name = writeData.name;
            this.url = writeData.url;
            this.wsid = writeData.wsid;
        }

        public Builder base64(String base64) {
            this.base64 = base64;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public Builder wsid(String wsid) {
            this.wsid = wsid;
            return this;
        }

        @Override
        public WriteData build() {
            return new WriteData(this);
        }
    }
}
