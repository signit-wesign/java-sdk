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
 * @since 1.0.2
 */
public class IdCardImage {

    /**
     * 图像名称.
     *
     * @since 1.0.2
     */
    public String imageName;

    /**
     * 图像标识码.
     *
     * @since 1.0.2
     */
    private String imageCode;
    /**
     * 图像标识码.
     *
     * @since 1.0.2
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

        public Builder imageName(String imageName) {
            this.imageName = imageName;
            return this;
        }

        public Builder imageCode(ImageCode imageCode) {
            if (imageCode != null) {
                this.imageCode = imageCode.getCode()
                        .toString();
            }
            return this;
        }

        public Builder imageData(IdCardImageData imageData) {
            this.imageData = imageData;
            return this;
        }

        public Builder imageData(IdCardImageData.Builder imageDataBuilder) {
            if (imageDataBuilder != null) {
                this.imageData = imageDataBuilder.build();
            }
            return this;
        }

        public IdCardImage build() {
            return new IdCardImage(this);
        }

    }

}
