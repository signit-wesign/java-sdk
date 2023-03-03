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

import cn.signit.sdk.pojo.UserPersonRelativeInfo;
import cn.signit.sdk.pojo.response.AbstractSignitResponse;

/**
* 描述： 相对方个人信息响应对象
* @author xiazhitao
*/
public class UserPersonRelativeResponse extends AbstractSignitResponse {

    private UserPersonRelativeInfo userPersonRelativeInfo;


    public UserPersonRelativeResponse() {
    }

    public UserPersonRelativeResponse(Builder builder) {
        super();
        this.userPersonRelativeInfo = builder.userPersonRelativeInfo;
    }


    public UserPersonRelativeInfo getuserPersonRelativeInfo() {
        return userPersonRelativeInfo;
    }

    public void setuserPersonRelativeInfo(UserPersonRelativeInfo userPersonRelativeInfo) {
        this.userPersonRelativeInfo = userPersonRelativeInfo;
    }

    public UserPersonRelativeResponse(UserPersonRelativeInfo userPersonRelativeInfo) {
        this.userPersonRelativeInfo = userPersonRelativeInfo;
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    public static Builder Builder() {
        return new UserPersonRelativeResponse.Builder();
    }

    /**
     * 创建相对方企业流程响应对象建造器
     *
     * @since 2.6.0
     */
    public static class Builder implements cn.signit.sdk.pojo.Builder<UserPersonRelativeResponse> {

        private UserPersonRelativeInfo userPersonRelativeInfo;

        public Builder() {

        }

        public Builder(UserPersonRelativeResponse userPersonRelativeInfo) {
            this.userPersonRelativeInfo = userPersonRelativeInfo.userPersonRelativeInfo;
        }

        /**
         *
         * @param userPersonRelativeInfo
         *            相对方企业信息
         * @return 相对方个人流程业响应对象建造器{@link UserPersonRelativeResponse.Builder}
         * @since 2.6.0
         */
        public Builder userPersonRelativeInfo(UserPersonRelativeInfo userPersonRelativeInfo) {
            this.userPersonRelativeInfo = userPersonRelativeInfo;
            return this;
        }

        /**
         *
         * @return 相对方个人流程响应对象{@link UserPersonRelativeResponse}
         * @since 2.0.0
         */
        @Override
        public UserPersonRelativeResponse build() {
            return new UserPersonRelativeResponse(this);
        }
    }

}
