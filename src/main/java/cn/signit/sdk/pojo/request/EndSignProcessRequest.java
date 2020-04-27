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

import cn.signit.sdk.pojo.response.EndSignProcessResponse;

/**
 * 结束整个签署流程请求数据
 *
 * @author dengwen
 * @since 3.6.0
 */
public class EndSignProcessRequest extends AbstractSignitRequest<EndSignProcessResponse> {

    @Override
    public Class<EndSignProcessResponse> getResponseClass() {
        return EndSignProcessResponse.class;
    }

}
