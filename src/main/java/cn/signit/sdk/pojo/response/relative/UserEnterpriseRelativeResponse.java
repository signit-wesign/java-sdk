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
package cn.signit.sdk.pojo.response.relative;

import cn.signit.sdk.pojo.UserEnterpriseRelativeInfo;
import cn.signit.sdk.pojo.response.AbstractSignitResponse;

/**
* 描述： 相对方企业信息响应对象
* @author xiazhitao
*/
public class UserEnterpriseRelativeResponse extends AbstractSignitResponse {

    private UserEnterpriseRelativeInfo enterpriseRelativeInfo;


    public UserEnterpriseRelativeResponse() {
    }

    public UserEnterpriseRelativeResponse(Builder builder) {
        super();
        this.enterpriseRelativeInfo = builder.enterpriseRelativeInfo;
    }


    public UserEnterpriseRelativeInfo getEnterpriseRelativeInfo() {
        return enterpriseRelativeInfo;
    }

    public void setEnterpriseRelativeInfo(UserEnterpriseRelativeInfo enterpriseRelativeInfo) {
        this.enterpriseRelativeInfo = enterpriseRelativeInfo;
    }

    public UserEnterpriseRelativeResponse(UserEnterpriseRelativeInfo enterpriseRelativeInfo) {
        this.enterpriseRelativeInfo = enterpriseRelativeInfo;
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    public static Builder Builder() {
        return new UserEnterpriseRelativeResponse.Builder();
    }

    /**
     * 创建相对方企业流程响应对象建造器
     *
     * @since 2.6.0
     */
    public static class Builder implements cn.signit.sdk.pojo.Builder<UserEnterpriseRelativeResponse> {

        private UserEnterpriseRelativeInfo enterpriseRelativeInfo;

        public Builder() {

        }

        public Builder(UserEnterpriseRelativeResponse enterpriseRelativeInfo) {
            this.enterpriseRelativeInfo = enterpriseRelativeInfo.enterpriseRelativeInfo;
        }

        /**
         *
         * @param enterpriseRelativeInfo
         *            相对方企业信息
         * @return 创建向对方企流程业响应对象建造器{@link UserEnterpriseRelativeResponse.Builder}
         * @since 2.6.0
         */
        public Builder enterpriseRelativeInfo(UserEnterpriseRelativeInfo enterpriseRelativeInfo) {
            this.enterpriseRelativeInfo = enterpriseRelativeInfo;
            return this;
        }

        /**
         *
         * @return 创建向对方企业流程响应对象{@link UserEnterpriseRelativeResponse}
         * @since 2.0.0
         */
        @Override
        public UserEnterpriseRelativeResponse build() {
            return new UserEnterpriseRelativeResponse(this);
        }
    }

}
