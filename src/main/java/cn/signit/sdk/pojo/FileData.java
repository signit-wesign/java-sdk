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

import cn.signit.sdk.type.TransferType;

/**
 * 
 * 快捷签署文件数据.
 *
 * @since 1.0.0
 */
public class FileData {
    /**
     * 文件名字.
     *
     * @since 1.4.0
     */
    private String name;
    /**
     * 文件内容类型
     * 
     * @since 1.4.0
     */
    private String contentType;
    /**
     * 文件字节大小.
     *
     * @since 1.4.0
     */
    private Long byteSize;
    /**
     * 文件传输类型.<br/>
     * 
     * BASE64/URL/FILE_WSID
     *
     * @since 1.4.0
     */
    private TransferType transferType;
    /**
     * BASE64编码表示的数据. <br>
     * 支持数据源方式（按优先级）：
     * 
     * <pre>
     * 1. BASE64
     * 2. URL
     * 3. FILE_WSID
     * 4.fileBytes
     * </pre>
     * 
     * @since 1.4.0
     */
    private String base64;
    /**
     * URL表示的数据地址. <br>
     * 支持数据源方式（按优先级）：
     * 
     * <pre>
     * 1. BASE64
     * 2. URL
     * 3. FILE_WSID
     * 4.fileBytes
     * </pre>
     * 
     * @since 1.4.0
     */
    private String url;
    /**
     * WSID表示的文件在易企签的唯一标识. <br>
     * 支持数据源方式（按优先级）：
     * 
     * <pre>
     * 1. BASE64
     * 2. URL
     * 3. FILE_WSID
     * 4.fileBytes
     * </pre>
     * 
     * @since 1.4.0
     */
    private String fileWsid;
    /**
     * 文件字节数组. <br>
     * 支持数据源方式（按优先级）：
     * 
     * <pre>
     * 1. BASE64
     * 2. URL
     * 3. FILE_WSID
     * 4.fileBytes
     * </pre>
     * 
     * @since 1.4.0
     */
    private byte[] fileBytes;
    /**
     * 待签名文件（HTML）是否转换成单页的形式，否则，默认使用A4尺寸自动进行分页.
     * 
     * @since 1.0.3
     */
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getByteSize() {
        return byteSize;
    }

    public void setByteSize(Long byteSize) {
        this.byteSize = byteSize;
    }

    public TransferType getTransferType() {
        return transferType;
    }

    public void setTransferType(TransferType transferType) {
        this.transferType = transferType;
    }

    public String getFileWsid() {
        return fileWsid;
    }

    public void setFileWsid(String fileWsid) {
        this.fileWsid = fileWsid;
    }

    public byte[] getFileBytes() {
        return fileBytes;
    }

    public void setFileBytes(byte[] fileBytes) {
        this.fileBytes = fileBytes;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * 完整构造方法
     *
     * @param name
     *            文件名字.
     * @param contentType
     *            文件内容类型
     * @param byteSize
     *            文件字节大小.
     * @param transferType
     *            文件传输类型.<br/>
     *            BASE64/URL/FILE_WSID
     * @param base64
     *            待签名文件（html/pdf/doc/docx/xls/xlsx/ppt/pptx）的base64表示形式的字符串，支持最大约10MB的文件数据
     * @param url
     *            待签名文件（html/pdf/doc/docx/xls/xlsx/ppt/pptx）的URL地址
     * @param fileWsid
     *            WSID表示的文件在易企签的唯一标识
     * @param fileBytes
     *            文件字节数组
     * @param enableSinglePage
     *            待签名的文件是否转换成单页的形式，否则，默认使用A4尺寸自动进行分页，注：待签名文件为html时该值有效，且此单页最大支持的高度为5000mm
     */
    public FileData(String name, String contentType, Long byteSize, TransferType transferType, String base64,
            String url, String fileWsid, byte[] fileBytes, Boolean enableSinglePage) {
        super();
        this.name = name;
        this.contentType = contentType;
        this.byteSize = byteSize;
        this.transferType = transferType;
        this.base64 = base64;
        this.url = url;
        this.fileWsid = fileWsid;
        this.fileBytes = fileBytes;
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
        /**
         * 文件名字.
         *
         * @since 1.4.0
         */
        private String name;
        /**
         * 文件内容类型
         * 
         * @since 1.4.0
         */
        private String contentType;
        /**
         * 文件字节大小.
         *
         * @since 1.4.0
         */
        private Long byteSize;
        /**
         * 文件传输类型.<br/>
         * 
         * BASE64/URL/FILE_WSID
         *
         * @since 1.4.0
         */
        private TransferType transferType;
        /**
         * BASE64编码表示的数据. <br>
         * 支持数据源方式（按优先级）：
         * 
         * <pre>
         * 1. BASE64
         * 2. URL
         * 3. FILE_WSID
         * 4.fileBytes
         * </pre>
         * 
         * @since 1.4.0
         */
        private String base64;
        /**
         * URL表示的数据地址. <br>
         * 支持数据源方式（按优先级）：
         * 
         * <pre>
         * 1. BASE64
         * 2. URL
         * 3. FILE_WSID
         * 4.fileBytes
         * </pre>
         * 
         * @since 1.4.0
         */
        private String url;
        /**
         * WSID表示的文件在易企签的唯一标识. <br>
         * 支持数据源方式（按优先级）：
         * 
         * <pre>
         * 1. BASE64
         * 2. URL
         * 3. FILE_WSID
         * 4.fileBytes
         * </pre>
         * 
         * @since 1.4.0
         */
        private String fileWsid;
        /**
         * 文件字节数组. <br>
         * 支持数据源方式（按优先级）：
         * 
         * <pre>
         * 1. BASE64
         * 2. URL
         * 3. FILE_WSID
         * 4.fileBytes
         * </pre>
         * 
         * @since 1.4.0
         */
        private byte[] fileBytes;
        /**
         * 待签名文件（HTML）是否转换成单页的形式，否则，默认使用A4尺寸自动进行分页.
         * 
         * @since 1.0.3
         */
        private Boolean enableSinglePage;

        /**
         * @param name
         *            文件名称
         * @since 2.5.0
         * @return 文件数据建造器
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * @param contentType
         *            文件内容类型
         * @since 2.5.0
         * @return 文件数据建造器
         */
        public Builder contentType(String contentType) {
            this.contentType = contentType;
            return this;
        }

        /**
         * @param byteSize
         *            文件字节大小.
         * @since 2.5.0
         * @return 文件数据建造器
         */
        public Builder byteSize(Long byteSize) {
            this.byteSize = byteSize;
            return this;
        }

        /**
         * @param transferType
         *            文件传输类型.<br/>
         *            BASE64/URL/FILE_WSID
         * @since 2.5.0
         * @return 文件数据建造器
         */
        public Builder transferType(TransferType transferType) {
            this.transferType = transferType;
            return this;
        }

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
         * @param fileBytes
         *            文件字节数组
         * @since 2.5.0
         * @return 文件数据建造器
         */
        public Builder fileBytes(byte[] fileBytes) {
            this.fileBytes = fileBytes;
            return this;
        }

        /**
         * @param fileWsid
         *            WSID表示的文件在易企签的唯一标识
         * @since 2.5.0
         * @return 文件数据建造器
         */
        public Builder fileWsid(String fileWsid) {
            this.fileWsid = fileWsid;
            return this;
        }

        /**
         * @since 2.5.0
         * @return 返回一个新的{@link FileData}对象
         */
        @Override
        public FileData build() {
            return new FileData(name, contentType, byteSize, transferType, base64, url, fileWsid, fileBytes,
                    enableSinglePage);
        }

    }

}
