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

import java.util.List;

import cn.signit.sdk.pojo.Participant;

/**
 * 签署流程中追加新的签署方响应数据
 *
 * @author dengwen
 * @since 2.6.0
 */
public class AppendEnvelopeParticipantsResponse extends AbstractSignitResponse {

    private List<Participant> participants;

    public List<Participant> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Participant> participants) {
        this.participants = participants;
    }
}