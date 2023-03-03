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

import cn.signit.sdk.pojo.UserHandlerRelativeInfo;
import cn.signit.sdk.pojo.response.AbstractSignitResponse;

/**
* 描述： 相对方经办人信息响应对象
* @author xiazhitao
*/
public class UserHandlerRelativeResponse extends AbstractSignitResponse {

    private UserHandlerRelativeInfo handlerRelativeInfo;


    public UserHandlerRelativeResponse() {
    }

    public UserHandlerRelativeResponse(Builder builder) {
        super();
        this.handlerRelativeInfo = builder.handlerRelativeInfo;
    }

    public UserHandlerRelativeInfo getHandlerRelativeInfo() {
        return handlerRelativeInfo;
    }

    public void setHandlerRelativeInfo(UserHandlerRelativeInfo handlerRelativeInfo) {
        this.handlerRelativeInfo = handlerRelativeInfo;
    }

    public UserHandlerRelativeResponse(UserHandlerRelativeInfo handlerRelativeInfo) {
        this.handlerRelativeInfo = handlerRelativeInfo;
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    public static Builder Builder() {
        return new UserHandlerRelativeResponse.Builder();
    }

    /**
     * 创建相对方企业流程响应对象建造器
     *
     * @since 2.6.0
     */
    public static class Builder implements cn.signit.sdk.pojo.Builder<UserHandlerRelativeResponse> {

        private UserHandlerRelativeInfo handlerRelativeInfo;

        public Builder() {

        }

        public Builder(UserHandlerRelativeResponse handlerRelativeResponse) {
            this.handlerRelativeInfo = handlerRelativeResponse.handlerRelativeInfo;
        }

        /**
         *
         * @param handlerRelativeInfo
         *            相对方经办人信息
         * @return 相对方经办人操作流程业响应对象建造器{@link UserHandlerRelativeResponse.Builder}
         * @since 2.6.0
         */
        public Builder handlerRelativeInfo(UserHandlerRelativeInfo handlerRelativeInfo) {
            this.handlerRelativeInfo = handlerRelativeInfo;
            return this;
        }

        /**
         *
         * @return 相对方经办人操作流程响应对象{@link UserHandlerRelativeResponse}
         * @since 2.0.0
         */
        @Override
        public UserHandlerRelativeResponse build() {
            return new UserHandlerRelativeResponse(this);
        }
    }

}
