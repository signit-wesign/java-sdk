package cn.signit.sdk.pojo;

import cn.signit.sdk.type.ImageCode;

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

/**
 * 证件图像数据.
 * 
 * @since 2.0.0
 */
public class IdCardImage {

    /**
     * 图像名称.
     *
     * @since 2.0.0
     */
    public String imageName;

    /**
     * 图像标识码.
     *
     * @since 2.0.0
     */
    private String imageCode;
    /**
     * 图像标识码.
     *
     * @since 2.0.0
     */
    private IdCardImageData imageData;

    public String getImageName() {
        return imageName;
    }

    public String getImageCode() {
        return imageCode;
    }

    public IdCardImageData getImageData() {
        return imageData;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public void setImageCode(String imageCode) {
        this.imageCode = imageCode;
    }

    public void setImageData(IdCardImageData imageData) {
        this.imageData = imageData;
    }

    public IdCardImage() {
    }

    public IdCardImage(Builder builder) {
        this.imageCode = builder.imageCode;
        this.imageName = builder.imageName;
        this.imageData = builder.imageData;

    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    /**
     * 证件图片对象建造器
     * 
     * @since 2.0.0
     */
    public static class Builder implements cn.signit.sdk.pojo.Builder<IdCardImage> {
        private String imageName;
        private String imageCode;
        private IdCardImageData imageData;

        public Builder() {
        }

        public Builder(IdCardImage idCardImage) {
            this.imageCode = idCardImage.imageCode;
            this.imageName = idCardImage.imageName;
            this.imageData = idCardImage.imageData;
        }

        /**
         * 
         * @param imageName
         *            证件照名称
         * @return 证件图片对象建造器{@link IdCardImage.Builder}
         * @since 2.0.0
         */
        public Builder imageName(String imageName) {
            this.imageName = imageName;
            return this;
        }

        /**
         * 
         * @param imageCode
         *            2004-经办人证件照正面；2005-经办人证件照背面；2000-营业执照图片；2001-组织机构代码证照片；2100-额外认证所需照片
         *            {@link ImageCode}
         * @return 证件图片对象建造器{@link IdCardImage.Builder}
         * @since 2.0.0
         */
        public Builder imageCode(ImageCode imageCode) {
            if (imageCode != null) {
                this.imageCode = imageCode.getCode()
                        .toString();
            }
            return this;
        }

        /**
         * 
         * @param imageData
         *            {@link IdCardImageData} 证件照数据对象
         * @return 证件图片对象建造器{@link IdCardImage.Builder}
         * @since 2.0.0
         */
        public Builder imageData(IdCardImageData imageData) {
            this.imageData = imageData;
            return this;
        }

        /**
         * 
         * @param imageDataBuilder
         *            {@link IdCardImageData.Builder} 证件照数据对象构造器
         * @return 证件图片对象建造器{@link IdCardImage.Builder}
         * @since 2.0.0
         */
        public Builder imageData(IdCardImageData.Builder imageDataBuilder) {
            if (imageDataBuilder != null) {
                this.imageData = imageDataBuilder.build();
            }
            return this;
        }

        /**
         * 
         * @return 证件图片对象
         * @since 2.0.0
         */
        public IdCardImage build() {
            return new IdCardImage(this);
        }

    }

}
