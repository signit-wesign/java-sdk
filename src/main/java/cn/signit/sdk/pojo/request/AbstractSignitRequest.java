package cn.signit.sdk.pojo.request;

import cn.signit.sdk.pojo.response.AbstractSignitResponse;
import cn.signit.sdk.type.AcceptDataType;

public abstract class AbstractSignitRequest<T extends AbstractSignitResponse> {
    /**
     * 调用方自定义标识，易企签会原封不动返回.
     *
     * @since 1.0.2
     */
    protected String customTag;

    /**
     * 调用方自定义要求易企签的WEB平台在流程结束后需要跳转的指定URL地址.
     *
     * @since 1.0.2
     */
    protected String returnUrl;

    /**
     * 调用方接受的响应数据类型，支持：BASE64/URL.
     *
     * @since 1.0.2
     */
    protected AcceptDataType acceptDataType;

    public String getCustomTag() {
        return customTag;
    }

    public String getReturnUrl() {
        return returnUrl;
    }

    public AcceptDataType getAcceptDataType() {
        return acceptDataType;
    }

    public void setCustomTag(String customTag) {
        this.customTag = customTag;
    }

    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }

    public void setAcceptDataType(AcceptDataType acceptDataType) {
        this.acceptDataType = acceptDataType;
    }

    public abstract Class<T> getResponseClass();

}
