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
 * 
 * 快捷签署文件数据.
 *
 * @since 1.0.0
 */
public class FileData {
    private String url;
    private String base64;
    private Boolean enableSinglePage;

    public Boolean getEnableSinglePage() {
        return enableSinglePage;
    }

    public void setEnableSinglePage(Boolean enableSinglePage) {
        this.enableSinglePage = enableSinglePage;
    }

    public FileData() {
    }

    public FileData(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public FileData setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getBase64() {
        return base64;
    }

    public FileData setBase64(String base64) {
        this.base64 = base64;
        return this;
    }

    /**
     * url和base64同时存在时，优先base64
     * 
     * @param url
     *            待签名文件（html/pdf/doc/docx/xls/xlsx/ppt/pptx）的URL地址
     * @param base64
     *            待签名文件（html/pdf/doc/docx/xls/xlsx/ppt/pptx）的base64表示形式的字符串，支持最大约10MB的文件数据
     * @param enableSinglePage
     *            待签名的文件是否转换成单页的形式，否则，默认使用A4尺寸自动进行分页，注：待签名文件为html时该值有效，且此单页最大支持的高度为5000mm
     */
    public FileData(String url, String base64, Boolean enableSinglePage) {
        super();
        this.url = url;
        this.base64 = base64;
        this.enableSinglePage = enableSinglePage;
    }

    /**
     * @since 2.5.0
     * @return 返回一个新的{@link Builder}对象
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * 文件数据建造器
     * 
     * @since 2.5.0
     */
    public static class Builder implements cn.signit.sdk.pojo.Builder<FileData> {
        private String url;
        private String base64;
        private Boolean enableSinglePage;

        /**
         * @param url
         *            待签名文件（html/pdf/doc/docx/xls/xlsx/ppt/pptx）的URL地址
         * @since 2.5.0
         * @return 文件数据建造器
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        /**
         * @param base64
         *            待签名文件（html/pdf/doc/docx/xls/xlsx/ppt/pptx）的base64表示形式的字符串，支持最大约10MB的文件数据
         * @since 2.5.0
         * @return 文件数据建造器
         */
        public Builder base64(String base64) {
            this.base64 = base64;
            return this;
        }

        /**
         * @param enableSinglePage
         *            待签名的文件是否转换成单页的形式，否则，默认使用A4尺寸自动进行分页，注：待签名文件为html时该值有效，且此单页最大支持的高度为5000mm
         * @since 2.5.0
         * @return 文件数据建造器
         */
        public Builder enableSinglePage(Boolean enableSinglePage) {
            this.enableSinglePage = enableSinglePage;
            return this;
        }

        /**
         * @since 2.5.0
         * @return 返回一个新的{@link FileData}对象
         */
        @Override
        public FileData build() {
            return new FileData(url, base64, enableSinglePage);
        }

    }

}
