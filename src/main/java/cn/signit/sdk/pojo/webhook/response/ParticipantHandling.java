package cn.signit.sdk.pojo.webhook.response;

import java.util.List;

import cn.signit.sdk.pojo.webhook.response.EnvelopeStarted.RawDataBasicInfo;
import cn.signit.sdk.pojo.webhook.response.EnvelopeStarted.Receiver;
import cn.signit.sdk.pojo.webhook.response.EnvelopeStarted.Sender;
import cn.signit.sdk.pojo.webhook.response.EnvelopeStarted.SignData;

/**
 * 
 * 参与者处理信封事件.
 *
 * @since 2.1.0
 */
public class ParticipantHandling extends AbstractWebhookResponseData{
    private String actionUrl;// 执行的动作对应的URL地址
    private List<String> actions;// 流程允许在易企签WEB执行的动作
    private String account;// 接收方对应的在易企签的帐号
    private String customTag;// 自定义标识
    private String invokeNo;// 服务调用唯一标识
    private RawDataBasicInfo basicEnvelope;// 信封基本信息
    private Sender senderParticipant;
    private Receiver receiverParticipant;
    private SignData signData;// 已完成的签署数据
    private String returnUrl;// 客户端回调地址
    public String getActionUrl() {
        return actionUrl;
    }
    public void setActionUrl(String actionUrl) {
        this.actionUrl = actionUrl;
    }
    public List<String> getActions() {
        return actions;
    }
    public void setActions(List<String> actions) {
        this.actions = actions;
    }
    public String getAccount() {
        return account;
    }
    public void setAccount(String account) {
        this.account = account;
    }
    public String getCustomTag() {
        return customTag;
    }
    public void setCustomTag(String customTag) {
        this.customTag = customTag;
    }
    public String getInvokeNo() {
        return invokeNo;
    }
    public void setInvokeNo(String invokeNo) {
        this.invokeNo = invokeNo;
    }
    public RawDataBasicInfo getBasicEnvelope() {
        return basicEnvelope;
    }
    public void setBasicEnvelope(RawDataBasicInfo basicEnvelope) {
        this.basicEnvelope = basicEnvelope;
    }
    public Sender getSenderParticipant() {
        return senderParticipant;
    }
    public void setSenderParticipant(Sender senderParticipant) {
        this.senderParticipant = senderParticipant;
    }
    public Receiver getReceiverParticipant() {
        return receiverParticipant;
    }
    public void setReceiverParticipant(Receiver receiverParticipant) {
        this.receiverParticipant = receiverParticipant;
    }
    public SignData getSignData() {
        return signData;
    }
    public void setSignData(SignData signData) {
        this.signData = signData;
    }
    public String getReturnUrl() {
        return returnUrl;
    }
    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }
    
}
