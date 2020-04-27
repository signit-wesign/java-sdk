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
package cn.signit.sdk.pojo.request;

import cn.signit.sdk.pojo.response.RevokeSignProcessResopnse;

/**
 * 撤销指定签署流程请求数据
 *
 * @author dengwen
 * @since 3.6.0
 */
public class RevokeSignProcessRequest extends AbstractSignitRequest<RevokeSignProcessResopnse> {

    private String revokeReason;

    public String getRevokeReason() {
        return revokeReason;
    }

    public void setRevokeReason(String revokeReason) {
        this.revokeReason = revokeReason;
    }

    public RevokeSignProcessRequest() {
    }

    public RevokeSignProcessRequest(Builder builder) {
        this.revokeReason = builder.revokeReason;
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public Class<RevokeSignProcessResopnse> getResponseClass() {
        return RevokeSignProcessResopnse.class;
    }

    public static class Builder implements cn.signit.sdk.pojo.Builder<RevokeSignProcessRequest> {
        private String revokeReason;

        public Builder() {
        }
        
        public Builder(RevokeSignProcessRequest revokeSignProcessRequest) {
            this.revokeReason=revokeSignProcessRequest.revokeReason;
        }
        
        /**
         * 
         * @param revokeReason
         *            信撤销指定签署流程原因
         * @return 信撤销指定签署流程请求对象建造器{@link RevokeSignProcessRequest.Builder}
         * @since 3.6.0
         */
        public Builder revokeReason(String  revokeReason) {
            this.revokeReason = revokeReason;
            return this;
        }

        @Override
        public RevokeSignProcessRequest build() {
            return new RevokeSignProcessRequest(this);
        }

    }
}
