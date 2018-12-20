package cn.signit.sdk.pojo.webhook.response;

/**
 * 个人实名认证完成事件.
 *
 * @since 2.0.0
 */
public class PersonVerificationCompleted extends AbstractWebhookResponseData {
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
