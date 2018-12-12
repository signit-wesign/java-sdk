package cn.signit.sdk.pojo.webhook.response;

/**
 * 
 * 企业实名认证初级认证完成事件webhook信息具体数据.
 * 
 * @since 1.0.2
 */
public class EnterpriseVerificationPrimaryCompleted extends AbstractWebhookResponseData {
    private String description;
    private String status;
    private Long handleDatetime;
    private Long submitDatetime;

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }

    public Long getHandleDatetime() {
        return handleDatetime;
    }

    public Long getSubmitDatetime() {
        return submitDatetime;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setHandleDatetime(Long handleDatetime) {
        this.handleDatetime = handleDatetime;
    }

    public void setSubmitDatetime(Long submitDatetime) {
        this.submitDatetime = submitDatetime;
    }

}
