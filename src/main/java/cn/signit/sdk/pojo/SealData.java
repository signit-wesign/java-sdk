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

public class SealData extends FileData {
    private String name;

    public static class SealDataBuilder {
        private String url;
        private String base64;
        private String name;

        public SealDataBuilder withUrl(String url) {
            this.url = url;
            return this;
        }

        public SealDataBuilder withBase64(String base64) {
            this.base64 = base64;
            return this;
        }

        public SealDataBuilder withName(String name) {
            this.name = name;
            return this;
        }

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
        super(url, base64);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
