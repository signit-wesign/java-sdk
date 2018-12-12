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

}
