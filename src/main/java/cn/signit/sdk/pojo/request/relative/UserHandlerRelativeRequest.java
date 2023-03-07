/*
 * Copyright © 2023 signit.cn. All rights reserved.
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
package cn.signit.sdk.pojo.request.relative;

import cn.signit.sdk.pojo.request.AbstractSignitRequest;
import cn.signit.sdk.pojo.response.relative.UserHandlerRelativeResponse;

/**
 * 描述： 相对方经办人管理响应对象
 * @author xiazhitao
 */
public class UserHandlerRelativeRequest extends AbstractSignitRequest<UserHandlerRelativeResponse> {

    @Override
    public Class<UserHandlerRelativeResponse> getResponseClass() {
        return UserHandlerRelativeResponse.class;
    }

}
