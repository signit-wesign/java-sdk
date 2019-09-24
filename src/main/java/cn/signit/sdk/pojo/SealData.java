/*
 * Copyright © 2018 signit.cn. All rights reserved.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
package cn.signit.sdk.pojo;

/**
 * 印章数据
 * 
 * @since 2.0.0
 */
public class SealData extends FileData {
    private String name;

    /**
     * 印章数据对象构建器
     * 
     * @since 2.0.0
     */
    public static class SealDataBuilder extends FileData.Builder {
        private String url;
        private String base64;
        private String name;

        /**
         * 
         * @param url
         *            印章数据url
         * @return 印章数据对象建造器{@link SealDataBuilder}
         * @since 2.0.0
         */
        public SealDataBuilder withUrl(String url) {
            this.url = url;
            return this;
        }

        /**
         * 
         * @param base64
         *            印章数据的base64字符串格式
         * @return 印章数据对象建造器{@link SealDataBuilder}
         * @since 2.0.0
         */
        public SealDataBuilder withBase64(String base64) {
            this.base64 = base64;
            return this;
        }

        /**
         * 印章名字在企业中是唯一时，可以通过填写印章名字指定使用该印章
         * 
         * @param name
         *            印章名称
         * @return 印章数据对象建造器{@link SealDataBuilder}
         * @since 2.0.0
         */
        public SealDataBuilder withName(String name) {
            this.name = name;
            return this;
        }

        /**
         * 
         * @return 印章数据对象
         * @since 2.0.0
         */
        public SealData build() {
            return new SealData(name, url, base64);
        }
    }

    public static SealDataBuilder builder() {
        return new SealDataBuilder();
    }

    public SealData() {
    }

    public SealData(String name, String url, String base64) {
        super(url);
        super.setBase64(base64);
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
