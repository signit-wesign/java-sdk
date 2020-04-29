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

import java.util.Date;

import cn.signit.sdk.pojo.response.EntrustSignProcess2WeSignResponse;

/**
 * 托管签署流程到易企签请求数据
 *
 * @author dengwen
 * @since 2.6.0
 */
public class EntrustSignProcess2WeSignRequest extends AbstractSignitRequest<EntrustSignProcess2WeSignResponse> {

    /**
     * 需要托管的流程深度.<br/>
     * 默认：0，即：本层 <br/>
     * 
     * <pre>
     *   O     <-- depth = 0 , 默认，表示本层
     *  / \
     * O   O   <-- depth = 1
     * |
     * O       <-- depth = 2
     * </pre>
     *
     * @since 2.6.0
     */
    private Integer depth = 0;
    /**
     * 托管流程过期日期.
     *
     * @since 2.2.0
     */
    private Date expireDatetime;

    public Integer getDepth() {
        return depth;
    }

    public void setDepth(Integer depth) {
        this.depth = depth;
    }

    public Date getExpireDatetime() {
        return expireDatetime;
    }

    public void setExpireDatetime(Date expireDatetime) {
        this.expireDatetime = expireDatetime;
    }

    public EntrustSignProcess2WeSignRequest() {
    }

    public EntrustSignProcess2WeSignRequest(Builder builder) {
        this.depth = builder.depth;
        this.expireDatetime = builder.expireDatetime;
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public Class<EntrustSignProcess2WeSignResponse> getResponseClass() {
        return EntrustSignProcess2WeSignResponse.class;
    }

    public static class Builder implements cn.signit.sdk.pojo.Builder<EntrustSignProcess2WeSignRequest> {
        private Integer depth = 0;
        private Date expireDatetime;

        public Builder() {
        }

        public Builder(EntrustSignProcess2WeSignRequest entrustSignProcess2WeSignRequest) {
            this.depth = entrustSignProcess2WeSignRequest.depth;
            this.expireDatetime = entrustSignProcess2WeSignRequest.expireDatetime;
        }

        public Builder depth(Integer depth) {
            this.depth = depth;
            return this;
        }

        public Builder expireDatetime(Date expireDatetime) {
            this.expireDatetime = expireDatetime;
            return this;
        }

        @Override
        public EntrustSignProcess2WeSignRequest build() {
            return new EntrustSignProcess2WeSignRequest(this);
        }

    }

}
