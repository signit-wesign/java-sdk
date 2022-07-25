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
package cn.signit.sdk.pojo.request;

import java.util.List;

import cn.signit.sdk.pojo.EnvelopeBasicInfo;
import cn.signit.sdk.pojo.EnvelopeContentInfo;
import cn.signit.sdk.pojo.EnvelopeParticipantInfo;
import cn.signit.sdk.pojo.response.StepByStepCreateEnvelopeResopnse;
import cn.signit.sdk.type.AcceptDataType;
import cn.signit.sdk.type.EditableScope;

/**
 * 分步骤-创建单个签署流程请求数据
 *
 * @author zhd
 * @since 2.7.4
 */
public class StepByStepCreateEnvelopeRequest extends AbstractSignitRequest<StepByStepCreateEnvelopeResopnse> {

    /**
     * 信封基本信息.
     *
     * @since 2.7.4
     */
    private EnvelopeBasicInfo basicInfo;

    /**
     * 信封流程中的签署文件内容.
     *
     * @since 2.7.4
     */
    private EnvelopeContentInfo contentInfo;
    /**
     * 签署参与者信息.
     *
     * @since 2.7.4
     */
    private EnvelopeParticipantInfo participantInfo;
    /**
     * 可编辑范围.
     *
     * @since 2.5.5
     */
    private List<EditableScope> editableScopes;

    /**
     * 获取响应信息类
     * 
     * @return StepByStepCreateEnvelopeResopnse.class
     * @since 2.7.4
     */
    @Override
    public Class<StepByStepCreateEnvelopeResopnse> getResponseClass() {
        return StepByStepCreateEnvelopeResopnse.class;
    }

    public EnvelopeBasicInfo getBasicInfo() {
        return basicInfo;
    }

    public EnvelopeContentInfo getContentInfo() {
        return contentInfo;
    }

    public EnvelopeParticipantInfo getParticipantInfo() {
        return participantInfo;
    }

    public List<EditableScope> getEditableScopes() {
        return editableScopes;
    }

    public String getCustomTag() {
        return customTag;
    }

    public StepByStepCreateEnvelopeRequest() {
    }

    public StepByStepCreateEnvelopeRequest(Builder builder) {
        this.basicInfo = builder.basicInfo;
        this.contentInfo = builder.contentInfo;
        this.participantInfo = builder.participantInfo;
        this.editableScopes = builder.editableScopes;
        this.customTag = builder.customTag;
        this.returnUrl = builder.returnUrl;
        this.acceptDataType = builder.acceptDataType;
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    /**
     * 信封启动请求对象建筑器.
     * 
     * @since 2.7.4
     */
    public static class Builder implements cn.signit.sdk.pojo.Builder<StepByStepCreateEnvelopeRequest> {
        private EnvelopeBasicInfo basicInfo;
        private EnvelopeContentInfo contentInfo;
        private EnvelopeParticipantInfo participantInfo;
        private List<EditableScope> editableScopes;

        private String customTag;
        private String returnUrl;
        private AcceptDataType acceptDataType;

        public Builder() {
        }

        public Builder(StepByStepCreateEnvelopeRequest request) {
            this.basicInfo = request.basicInfo;
            this.contentInfo = request.contentInfo;
            this.participantInfo = request.participantInfo;
            this.editableScopes = request.editableScopes;
            this.customTag = request.customTag;
            this.returnUrl = request.returnUrl;
            this.acceptDataType = request.acceptDataType;
        }

        /**
         * 
         * @param basicInfo
         *            信封基本信息对象 {@link EnvelopeBasicInfo}
         * @return 信封启动请求建筑器.{@link StepByStepCreateEnvelopeRequest.Builder}
         * @since 2.7.4
         */
        public Builder basicInfo(EnvelopeBasicInfo basicInfo) {
            this.basicInfo = basicInfo;
            return this;
        }

        /**
         * 
         *
         * @param basicInfoBuilder
         *            信封基本信息对象建筑器 {@link EnvelopeBasicInfo.Builder}
         * @return 信封启动请求建筑器.{@link StepByStepCreateEnvelopeRequest.Builder}
         * @since 2.7.4
         */
        public Builder basicInfo(EnvelopeBasicInfo.Builder basicInfoBuilder) {
            if (basicInfoBuilder != null) {
                this.basicInfo = basicInfoBuilder.build();
            }
            return this;
        }

        /**
         * 
         *
         * @param contentInfo
         *            签署文件内容对象 {@link EnvelopeContentInfo }
         * @return 信封启动请求建筑器.{@link StepByStepCreateEnvelopeRequest.Builder}
         * @since 2.7.4
         */
        public Builder contentInfo(EnvelopeContentInfo contentInfo) {
            this.contentInfo = contentInfo;
            return this;
        }

        /**
         * 
         *
         * @param contentInfoBuilder
         *            签署文件内容对象建筑器 {@link EnvelopeContentInfo.Builder}
         * @return 信封启动请求建筑器.{@link StepByStepCreateEnvelopeRequest.Builder}
         * @since 2.7.4
         */
        public Builder contentInfo(EnvelopeContentInfo.Builder contentInfoBuilder) {
            if (contentInfoBuilder != null) {
                this.contentInfo = contentInfoBuilder.build();
            }
            return this;
        }

        /**
         * 
         *
         * @param participantInfo
         *            参与文件签署人员的信息对象 {@link EnvelopeParticipantInfo}
         * @return 信封启动请求建筑器.{@link StepByStepCreateEnvelopeRequest.Builder}
         * @since 2.7.4
         */
        public Builder participantInfo(EnvelopeParticipantInfo participantInfo) {
            this.participantInfo = participantInfo;
            return this;
        }

        /**
         * 
         *
         * @param participantInfoBuilder
         *            参与文件签署人员的信息对象建筑器 {@link EnvelopeParticipantInfo.Builder}
         * @return 信封启动请求建筑器.{@link StepByStepCreateEnvelopeRequest.Builder}
         * @since 2.7.4
         */
        public Builder participantInfo(EnvelopeParticipantInfo.Builder participantInfoBuilder) {
            if (participantInfoBuilder != null) {
                this.participantInfo = participantInfoBuilder.build();
            }
            return this;
        }

        /**
         * 
         *
         * @param editableScopes
         *            可编辑范围的信息对象 {@link EnvelopeParticipantInfo}
         * @return 信封启动请求建筑器.{@link StepByStepCreateEnvelopeRequest.Builder}
         * @since 2.7.4
         */
        public Builder editableScopes(List<EditableScope> editableScopes) {
            this.editableScopes = editableScopes;
            return this;
        }

        /**
         * 
         *
         * @param customTag
         *            调用方自定义标识，易企签会原封不动返回
         * @return 信封启动请求建筑器.{@link StepByStepCreateEnvelopeRequest.Builder}
         * @since 2.7.4
         */
        public Builder customTag(String customTag) {
            this.customTag = customTag;
            return this;
        }

        /**
         * 
         *
         * @param returnUrl
         *            调用方自定义要求易企签的WEB平台在流程结束后需要跳转的指定URL地址
         * @return 信封启动请求建筑器.{@link StepByStepCreateEnvelopeRequest.Builder}
         * @since 2.7.4
         */
        public Builder returnUrl(String returnUrl) {
            this.returnUrl = returnUrl;
            return this;
        }

        /**
         * 
         *
         * @param acceptDataType
         *            调用方接受的数据类型，支持：BASE64/URL {@link AcceptDataType}；默认是BASE64
         * @return 信封启动请求建筑器.{@link StepByStepCreateEnvelopeRequest.Builder}
         * @since 2.7.4
         */
        public Builder acceptDataType(AcceptDataType acceptDataType) {
            this.acceptDataType = acceptDataType;
            return this;
        }

        /**
         * 
         * @return 信封启动请求 {@link StepByStepCreateEnvelopeRequest}
         * @since 2.7.4
         */
        @Override
        public StepByStepCreateEnvelopeRequest build() {
            return new StepByStepCreateEnvelopeRequest(this);
        }
    }

}
