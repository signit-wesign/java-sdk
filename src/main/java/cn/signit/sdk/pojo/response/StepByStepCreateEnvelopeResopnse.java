/*
 * Copyright © 2022 signit.cn. All rights reserved.
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
package cn.signit.sdk.pojo.response;

/**
 * 分步骤-创建单个签署流程响应数据
 *
 * @author zhd
 * @since 2.7.4
 */
public class StepByStepCreateEnvelopeResopnse extends AbstractSignitResponse {
    private String actionUrl;
    /** 
     * 创建成功的信封全局唯一ID.
     *
     * @since 2.5.5
     */
    private String envelopeWsid;
    
    public String getActionUrl() {
        return actionUrl;
    }

    public void setActionUrl(String actionUrl) {
        this.actionUrl = actionUrl;
    }

    public String getEnvelopeWsid() {
        return envelopeWsid;
    }

    public void setEnvelopeWsid(String envelopeWsid) {
        this.envelopeWsid = envelopeWsid;
    }

    public StepByStepCreateEnvelopeResopnse() {
    }

    public StepByStepCreateEnvelopeResopnse(Builder builder) {
        this.actionUrl = builder.actionUrl;
        this.envelopeWsid = builder.envelopeWsid;
        super.code = builder.code;
        super.message = builder.message;
        super.customTag = builder.customTag;
        super.invokeNo = builder.invokeNo;
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder implements cn.signit.sdk.pojo.Builder<StepByStepCreateEnvelopeResopnse> {
        private String actionUrl;
        /** 
         * 创建成功的信封全局唯一ID.
         *
         * @since 2.5.5
         */
        private String envelopeWsid;
        private String code;
        private String message;
        private String customTag;
        private String invokeNo;

        public Builder() {
        }

        public Builder(StepByStepCreateEnvelopeResopnse stepByStepCreateEnvelopeResopnse) {
            this.actionUrl = stepByStepCreateEnvelopeResopnse.actionUrl;
            this.envelopeWsid = stepByStepCreateEnvelopeResopnse.envelopeWsid;
            this.code = stepByStepCreateEnvelopeResopnse.code;
            this.message = stepByStepCreateEnvelopeResopnse.message;
            this.customTag = stepByStepCreateEnvelopeResopnse.customTag;
            this.invokeNo = stepByStepCreateEnvelopeResopnse.invokeNo;
        }
        
        public Builder actionUrl(String actionUrl) {
            this.actionUrl = actionUrl;
            return this;
        }
        
        public Builder envelopeWsid(String envelopeWsid) {
            this.envelopeWsid = envelopeWsid;
            return this;
        }

        public Builder code(String code) {
            this.code = code;
            return this;
        }

        public Builder message(String message) {
            this.message = message;
            return this;
        }

        public Builder customTag(String customTag) {
            this.customTag = customTag;
            return this;
        }

        public Builder invokeNo(String invokeNo) {
            this.invokeNo = invokeNo;
            return this;
        }

        @Override
        public StepByStepCreateEnvelopeResopnse build() {
            return new StepByStepCreateEnvelopeResopnse(this);
        }
    }

}
