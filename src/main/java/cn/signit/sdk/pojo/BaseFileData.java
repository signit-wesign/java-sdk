package cn.signit.sdk.pojo;

/**
 * 
 * 文件基础数据.
 * 
 * @since 1.0.2
 */
public class BaseFileData {
    protected String url;
    protected String base64;

    public String getUrl() {
        return url;
    }

    public String getBase64() {
        return base64;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setBase64(String base64) {
        this.base64 = base64;
    }

    public BaseFileData(Builder builder) {
        this.base64 = builder.base64;
        this.url = builder.url;
    }

    public BaseFileData() {

    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder implements cn.signit.sdk.pojo.Builder<BaseFileData> {
        protected String base64;
        protected String url;

        public Builder() {
        }

        public Builder(BaseFileData fileData) {
            this.base64 = fileData.base64;
            this.url = fileData.url;
        }

        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public Builder base64(String base64) {
            this.base64 = base64;
            return this;
        }

        @Override
        public BaseFileData build() {
            return new BaseFileData(this);
        }
    }
}
