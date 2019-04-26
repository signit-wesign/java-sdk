package cn.signit.sdk.pojo.webhook.response;

/**
 * 快捷签署完成事件webhook信息具体数据.
 * 
 * @since 1.0.2
 */
public class QuickSignCompleted extends AbstractWebhookResponseData {
    private String url;
    private String base64;

    public String getBase64() {
        return base64;
    }

    public void setBase64(String base64) {
        this.base64 = base64;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
