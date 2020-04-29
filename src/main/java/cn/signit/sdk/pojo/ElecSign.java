/*
 * Copyright © 2019 signit.cn. All rights reserved.
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

import java.util.List;

import cn.signit.sdk.type.AuthType;

/**
 * 电子签名数据.（印章/签字+证书）
 * 
 * @author RyanChang
 * @since 1.4.0
 */
public class ElecSign {
    /**
     * 电子签章/签字图像名称.
     * 
     * @since 1.4.0
     */
    private String name;
    /**
     * 电子签章/签字图像数据.
     * 
     * @since 1.4.0
     */
    private FileData data;
    /**
     * 电子签名证书数据信息.
     *
     * @since 1.4.0
     */
    private Certificate certificate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FileData getData() {
        return data;
    }

    public void setData(FileData data) {
        this.data = data;
    }

    public Certificate getCertificate() {
        return certificate;
    }

    public void setCertificate(Certificate certificate) {
        this.certificate = certificate;
    }

    /**
     * 电子签名证书数据信息.
     * 
     * @author RyanChang
     * @since 1.4.0
     */
    public static class Certificate {
        /**
         * 证书数据类型.<br/>
         * USBKEY/PFX_LOCAL/PFX_PIN/PFX_ON_TIME
         *
         * @since 1.4.0
         */
        private String type;
        /**
         * 证书数据.<br/>
         * type为PFX_PIN必填，type为USBKEY/PFX_PIN可填，其他type不填
         * 
         * @since 1.4.0
         */
        private FileData data;
        /**
         * 证书PIN码.<br/>
         * type为PFX_PIN必填，type为PFX_ON_TIME可填，其他type不填
         * 
         * @since 1.4.0
         */
        private String pin;
        /**
         * 实时请求证书时的请求数据信息，type为PFX_ON_TIME必填，其type非必填.
         * 
         * @since 1.4.0
         */
        private OnTimeRequestCertificateInfo onTimeRequestCertificateInfo;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public FileData getData() {
            return data;
        }

        public void setData(FileData data) {
            this.data = data;
        }

        public String getPin() {
            return pin;
        }

        public void setPin(String pin) {
            this.pin = pin;
        }

        public OnTimeRequestCertificateInfo getOnTimeRequestCertificateInfo() {
            return onTimeRequestCertificateInfo;
        }

        public void setOnTimeRequestCertificateInfo(OnTimeRequestCertificateInfo onTimeRequestCertificateInfo) {
            this.onTimeRequestCertificateInfo = onTimeRequestCertificateInfo;
        }

    }

    /**
     * 实时申请证书信息.
     * 
     * @author RyanChang
     * @since 1.4.0
     */
    public static class OnTimeRequestCertificateInfo {
        /** 
         * 可选择的签署意愿认证类型列表，可用类型：SMS_CODE-短信验证码；EMAIL_CODE-邮箱验证码；SIGN_PIN-签署密码；LIVING_AUTH-活体验证；USBKEY-USB key；MOBILE_SHIELD-手机盾，非必填.
         *
         * @since 1.4.0
         */
        private List<AuthType> selectedAuthTypes;
        /**
         * 身份信息，必填.
         * 
         * @since 1.4.0
         */
        private IdentityMetadata identity;
        /**
         * 企业信息，非必填.
         * 
         * @since 1.4.0
         */
        private EnterpriseMetadata enterprise;
        public List<AuthType> getSelectedAuthTypes() {
            return selectedAuthTypes;
        }
        public void setSelectedAuthTypes(List<AuthType> selectedAuthTypes) {
            this.selectedAuthTypes = selectedAuthTypes;
        }
        public IdentityMetadata getIdentity() {
            return identity;
        }
        public void setIdentity(IdentityMetadata identity) {
            this.identity = identity;
        }
        public EnterpriseMetadata getEnterprise() {
            return enterprise;
        }
        public void setEnterprise(EnterpriseMetadata enterprise) {
            this.enterprise = enterprise;
        }
        
    }

}
