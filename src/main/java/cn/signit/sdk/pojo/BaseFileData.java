package cn.signit.sdk.pojo;

/**
 * 
 * 文件基础数据.
 * 
 * @since 2.0.0
 */
public class BaseFileData {
    protected String url;
    protected String base64;
    protected String name;



    public String getUrl() {
        return url;
    }

    public String getBase64() {
        return base64;
    }

    public String getName() {
        return name;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setBase64(String base64) {
        this.base64 = base64;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BaseFileData(Builder builder) {
        this.base64 = builder.base64;
        this.url = builder.url;
        this.name = builder.name;
    }

    public BaseFileData() {

    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    /**
     * 文件基础数据对象建造器
     * 
     * @since 2.0.0
     */
    public static class Builder implements cn.signit.sdk.pojo.Builder<BaseFileData> {
        protected String base64;
        protected String url;
        protected String name;

        public Builder() {
        }

        public Builder(BaseFileData fileData) {
            this.base64 = fileData.base64;
            this.url = fileData.url;
            this.name = fileData.name;
        }

        /**
         * 
         * @param url
         *            文件数据url地址
         * @return 文件基础数据对象建造器{@link BaseFileData.Builder}
         * @since 2.0.0
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        /**
         * 
         * @param base64
         *            文件数据的base64标识形式的字符串，支持最大约10MB的文件数据
         * @return 文件基础数据对象建造器{@link BaseFileData.Builder}
         * @since 2.0.0
         */
        public Builder base64(String base64) {
            this.base64 = base64;
            return this;
        }

        /**
         * 
         * @param name
         *            文件名
         * @return 文件基础数据对象建造器{@link BaseFileData.Builder}
         * @since 3.6.0
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * 
         * @return 文件基础数据对象 {@link BaseFileData}
         * @since 2.0.0
         */
        @Override
        public BaseFileData build() {
            return new BaseFileData(this);
        }
    }
}
