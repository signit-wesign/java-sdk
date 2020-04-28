/*
 * Copyright © 2020 signit.cn. All rights reserved.
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
 * 结束整个签署流程响应数据
 *
 * @author dengwen
 * @since 3.6.0
 */
public class EndSignProcessResponse extends AbstractSignitResponse {
    private String actionUrl;
    private String tokenWsid;

    public String getActionUrl() {
        return actionUrl;
    }

    public void setActionUrl(String actionUrl) {
        this.actionUrl = actionUrl;
    }

    public String getTokenWsid() {
        return tokenWsid;
    }

    public void setTokenWsid(String tokenWsid) {
        this.tokenWsid = tokenWsid;
    }

    public EndSignProcessResponse() {
    }

    public EndSignProcessResponse(Builder builder) {
        this.actionUrl = builder.actionUrl;
        this.tokenWsid = builder.tokenWsid;
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

    public static class Builder implements cn.signit.sdk.pojo.Builder<EndSignProcessResponse> {
        private String actionUrl;
        private String tokenWsid;
        private String code;
        private String message;
        private String customTag;
        private String invokeNo;

        public Builder() {
        }

        public Builder(EndSignProcessResponse endSignProcessResponse) {
            this.actionUrl = endSignProcessResponse.actionUrl;
            this.tokenWsid = endSignProcessResponse.tokenWsid;
            this.code = endSignProcessResponse.code;
            this.message = endSignProcessResponse.message;
            this.customTag = endSignProcessResponse.customTag;
            this.invokeNo = endSignProcessResponse.invokeNo;
        }

        public Builder actionUrl(String actionUrl) {
            this.actionUrl = actionUrl;
            return this;
        }

        public Builder tokenWsid(String tokenWsid) {
            this.tokenWsid = tokenWsid;
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
        public EndSignProcessResponse build() {
            return new EndSignProcessResponse(this);
        }
    }

}
