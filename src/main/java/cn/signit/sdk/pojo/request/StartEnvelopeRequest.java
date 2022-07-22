package cn.signit.sdk.pojo.request;

import cn.signit.sdk.pojo.EnvelopeBasicInfo;
import cn.signit.sdk.pojo.EnvelopeContentInfo;
import cn.signit.sdk.pojo.EnvelopeParticipantInfo;
import cn.signit.sdk.pojo.response.StartEnvelopeResponse;
import cn.signit.sdk.type.AcceptDataType;

/**
 * 信封启动服务请求体. 包含信封基本信息、信封流程中的签署文件内容、签署参与者信息、自定义跳转URL、自定义可接受数据类型、自定义标识.
 * 
 * @since 2.0.0
 */
public class StartEnvelopeRequest extends AbstractSignitRequest<StartEnvelopeResponse> {

    /**
     * 信封基本信息.<br/>
     * 
     * 使用 {@link #basicInfo} 替换，后续版本会删除这个属性名称
     *
     * @since 2.0.0
     */
    @Deprecated
    private EnvelopeBasicInfo basicinfo;
    
    /**
     * 信封基本信息.
     *
     * @since 2.7.4
     */
    private EnvelopeBasicInfo basicInfo;

    /**
     * 信封流程中的签署文件内容.
     *
     * @since 2.0.0
     */
    private EnvelopeContentInfo contentInfo;
    /**
     * 签署参与者信息.
     *
     * @since 2.0.0
     */
    private EnvelopeParticipantInfo participantInfo;

    /**
     * 获取响应信息类
     * 
     * @return StartEnvelopeResponse.class
     * @since 2.0.0
     */
    @Override
    public Class<StartEnvelopeResponse> getResponseClass() {
        return StartEnvelopeResponse.class;
    }

    /**
     * 
     * 使用 {@link #getBasicInfo} 替换，后续版本会删除这个方法
     * @return 信封基础信息
     */
    @Deprecated
    public EnvelopeBasicInfo getBasicinfo() {
        return basicinfo;
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

    public String getCustomTag() {
        return customTag;
    }

    public StartEnvelopeRequest() {
    }

    public StartEnvelopeRequest(Builder builder) {
        this.basicinfo = builder.basicinfo;
        this.basicInfo = builder.basicInfo;
        this.contentInfo = builder.contentInfo;
        this.participantInfo = builder.participantInfo;
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
     * @since 2.0.0
     */
    public static class Builder implements cn.signit.sdk.pojo.Builder<StartEnvelopeRequest> {
        @Deprecated
        private EnvelopeBasicInfo basicinfo;
        private EnvelopeBasicInfo basicInfo;
        private EnvelopeContentInfo contentInfo;
        private EnvelopeParticipantInfo participantInfo;

        private String customTag;
        private String returnUrl;
        private AcceptDataType acceptDataType;

        public Builder() {
        }

        public Builder(StartEnvelopeRequest request) {
            this.basicinfo = request.basicinfo;
            this.basicInfo = request.basicInfo;
            this.contentInfo = request.contentInfo;
            this.participantInfo = request.participantInfo;
            this.customTag = request.customTag;
            this.returnUrl = request.returnUrl;
            this.acceptDataType = request.acceptDataType;
        }

        /**
         * 已过时，使用 {@link #basicInfo}替换，后续会删除这个方法
         * 
         * @param basicinfo
         *            信封基本信息对象 {@link EnvelopeBasicInfo}
         * @return 信封启动请求建筑器.{@link StartEnvelopeRequest.Builder}
         * @since 2.0.0
         */
        @Deprecated
        public Builder basicinfo(EnvelopeBasicInfo basicinfo) {
            this.basicinfo = basicinfo;
            return this;
        }
        
        /**
         * 
         * @param basicInfo
         *            信封基本信息对象 {@link EnvelopeBasicInfo}
         * @return 信封启动请求建筑器.{@link StartEnvelopeRequest.Builder}
         * @since 2.7.4
         */
        public Builder basicInfo(EnvelopeBasicInfo basicInfo) {
            this.basicInfo = basicInfo;
            return this;
        }

        /**
         * 已过时，使用 {@link #basicInfo}替换，后续会删除这个方法
         *
         * @param basicinfoBuilder
         *            信封基本信息对象建筑器 {@link EnvelopeBasicInfo.Builder}
         * @return 信封启动请求建筑器.{@link StartEnvelopeRequest.Builder}
         * @since 2.0.0
         */
        @Deprecated
        public Builder basicinfo(EnvelopeBasicInfo.Builder basicinfoBuilder) {
            if (basicinfoBuilder != null) {
                this.basicinfo = basicinfoBuilder.build();
            }
            return this;
        }
        
        /**
         * 
         *
         * @param basicInfoBuilder
         *            信封基本信息对象建筑器 {@link EnvelopeBasicInfo.Builder}
         * @return 信封启动请求建筑器.{@link StartEnvelopeRequest.Builder}
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
         * @return 信封启动请求建筑器.{@link StartEnvelopeRequest.Builder}
         * @since 2.0.0
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
         * @return 信封启动请求建筑器.{@link StartEnvelopeRequest.Builder}
         * @since 2.0.0
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
         * @return 信封启动请求建筑器.{@link StartEnvelopeRequest.Builder}
         * @since 2.0.0
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
         * @return 信封启动请求建筑器.{@link StartEnvelopeRequest.Builder}
         * @since 2.0.0
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
         * @param customTag
         *            调用方自定义标识，易企签会原封不动返回
         * @return 信封启动请求建筑器.{@link StartEnvelopeRequest.Builder}
         * @since 2.0.0
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
         * @return 信封启动请求建筑器.{@link StartEnvelopeRequest.Builder}
         * @since 2.0.0
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
         * @return 信封启动请求建筑器.{@link StartEnvelopeRequest.Builder}
         * @since 2.0.0
         */
        public Builder acceptDataType(AcceptDataType acceptDataType) {
            this.acceptDataType = acceptDataType;
            return this;
        }

        /**
         * 
         * @return 信封启动请求 {@link StartEnvelopeRequest}
         * @since 2.0.0
         */
        @Override
        public StartEnvelopeRequest build() {
            return new StartEnvelopeRequest(this);
        }
    }

}
