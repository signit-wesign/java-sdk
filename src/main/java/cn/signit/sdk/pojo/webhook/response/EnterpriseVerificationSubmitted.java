package cn.signit.sdk.pojo.webhook.response;

/**
 * 企业实名认证资料提交完成事件webhook信息具体数据.
 * 
 * @since 1.0.2
 */
public class EnterpriseVerificationSubmitted extends AbstractWebhookResponseData {
    private String status;
    private String actionUrl;

    public String getStatus() {
        return status;
    }

    public String getActionUrl() {
        return actionUrl;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setActionUrl(String actionUrl) {
        this.actionUrl = actionUrl;
    }

}
