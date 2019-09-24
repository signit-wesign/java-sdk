package cn.signit.sdk.pojo.request;

import java.util.List;

import cn.signit.sdk.pojo.CountersignatureData;
import cn.signit.sdk.pojo.CountersignaturePosition;
import cn.signit.sdk.pojo.FileData;
import cn.signit.sdk.pojo.response.CountersignatureSignResponse;
import cn.signit.sdk.type.AcceptDataType;
import cn.signit.sdk.util.ListBuilder;

/**
 * 快捷会签
 *
 * @author zhangbo
 * @since 1.2.0
 */
public class CountersignatureSignRequest extends AbstractSignitRequest<CountersignatureSignResponse> {

    private FileData fileData;

    private CountersignaturePosition position;

    private List<CountersignatureData> sign;

    public FileData getFileData() {
        return fileData;
    }

    public void setFileData(FileData fileData) {
        this.fileData = fileData;
    }

    public CountersignaturePosition getPosition() {
        return position;
    }

    public void setPosition(CountersignaturePosition position) {
        this.position = position;
    }

    public List<CountersignatureData> getSign() {
        return sign;
    }

    public void setSign(List<CountersignatureData> sign) {
        this.sign = sign;
    }

    public CountersignatureSignRequest() {
        super();
    }

    /**
     * @param fileData
     *            待签名文件数据
     * @param position
     *            签名区域位置
     * @param sign
     *            签名信息
     * @param customTag
     *            调用方自定义标识，易企签会原封不动返回
     * @param acceptDataType
     *            调用方接受的响应数据类型，支持：BASE64/URL {@link AcceptDataType} 默认为BASE64
     */
    public CountersignatureSignRequest(FileData fileData, CountersignaturePosition position,
            List<CountersignatureData> sign, String customTag, AcceptDataType acceptDataType) {
        super();
        this.fileData = fileData;
        this.position = position;
        this.sign = sign;
        this.customTag = customTag;
        this.acceptDataType = acceptDataType;
    }

    /**
     * @since 2.5.0
     * @return 返回一个新的{@link Builder}对象
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * 快捷会签请求对象建造器
     * 
     * @since 2.5.0
     */
    public static class Builder implements cn.signit.sdk.pojo.Builder<CountersignatureSignRequest> {

        private FileData fileData;

        private CountersignaturePosition position;

        private List<CountersignatureData> sign;

        protected String customTag;

        protected AcceptDataType acceptDataType;

        /**
         * 
         * @param fileData
         *            待签名文件数据
         * @since 2.5.0
         * @return 快捷会签请求对象建造器
         */
        public Builder fileData(FileData fileData) {
            this.fileData = fileData;
            return this;
        }

        /**
         * 
         * @param fileDataBuilder
         *            待签名文件数据建造器 {@link cn.signit.sdk.pojo.FileData.Builder}
         * @since 2.5.0
         * @return 快捷会签请求对象建造器
         */
        public Builder fileData(FileData.Builder fileDataBuilder) {
            this.fileData = fileDataBuilder.build();
            return this;
        }

        /**
         * 
         * @param position
         *            签名区域位置
         * @since 2.5.0
         * @return 快捷会签请求对象建造器
         */
        public Builder position(CountersignaturePosition position) {
            this.position = position;
            return this;
        }

        /**
         * 
         * @param positionBuilder
         *            签名区域位置建造器
         *            {@link cn.signit.sdk.pojo.CountersignaturePosition.Builder}
         * @since 2.5.0
         * @return 快捷会签请求对象建造器
         */
        public Builder position(CountersignaturePosition.Builder positionBuilder) {
            this.position = positionBuilder.build();
            return this;
        }

        /**
         * 
         * @param sign
         *            签名信息
         * @since 2.5.0
         * @return 快捷会签请求对象建造器
         */
        public Builder sign(List<CountersignatureData> sign) {
            this.sign = sign;
            return this;
        }

        /**
         * 
         * @param signBuilders
         *            多个签名信息建造器
         *            {@link cn.signit.sdk.pojo.CountersignatureData.Builder}
         * @since 2.5.0
         * @return 快捷会签请求对象建造器
         */
        public Builder sign(CountersignatureData.Builder... signBuilders) {
            this.sign = ListBuilder.buildList(signBuilders);
            return this;
        }

        /**
         * 
         * @param customTag
         *            调用方自定义标识，易企签会原封不动返回。
         * @return 企业实名认证请求对象建筑器{@link EnterpriseVerifyRequest.Builder}
         * @since 2.5.0
         */
        public Builder customTag(String customTag) {
            this.customTag = customTag;
            return this;
        }

        /**
         * 
         * @param acceptDataType
         *            调用方接受的响应数据类型，支持：BASE64/URL {@link AcceptDataType}
         *            默认为BASE64
         * @return 企业实名认证请求对象建筑器{@link EnterpriseVerifyRequest.Builder}
         * @since 2.5.0
         */
        public Builder acceptDataType(AcceptDataType acceptDataType) {
            this.acceptDataType = acceptDataType;
            return this;
        }

        /**
         * 
         * @since 2.5.0
         * @return 返回一个新的{@link CountersignatureSignRequest}对象
         */
        @Override
        public CountersignatureSignRequest build() {
            return new CountersignatureSignRequest(fileData, position, sign, customTag, acceptDataType);
        }

    }

    @Override
    public Class<CountersignatureSignResponse> getResponseClass() {
        return CountersignatureSignResponse.class;
    }

}
