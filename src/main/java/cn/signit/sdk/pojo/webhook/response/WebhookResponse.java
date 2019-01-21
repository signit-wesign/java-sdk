package cn.signit.sdk.pojo.webhook.response;

import cn.signit.sdk.util.Case;
import cn.signit.sdk.util.FastjsonDecoder;

/**
 * 
 * 推送给调用方的webhook事件数据结构.
 *
 * @since 2.0.0
 */
public class WebhookResponse {
    private String event;
    private Source source;
    private Target target;
    private Boolean needCallback;
    private String rawData;

    public static class Source {
        private String platform;
        private String destination;

        public String getPlatform() {
            return platform;
        }

        public void setPlatform(String platform) {
            this.platform = platform;
        }

        public String getDestination() {
            return destination;
        }

        public void setDestination(String destination) {
            this.destination = destination;
        }

    }

    public static class Target {
        private String webhookWsid;
        private String destination;

        public String getWebhookWsid() {
            return webhookWsid;
        }

        public void setWebhookWsid(String webhookWsid) {
            this.webhookWsid = webhookWsid;
        }

        public String getDestination() {
            return destination;
        }

        public void setDestination(String destination) {
            this.destination = destination;
        }

    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }

    public Boolean getNeedCallback() {
        return needCallback;
    }

    public void setNeedCallback(Boolean needCallback) {
        this.needCallback = needCallback;
    }

    public String getRawData() {
        return rawData;
    }

    public void setRawData(String rawData) {
        this.rawData = rawData;
    }

    public AbstractWebhookResponseData rawDataAsBean() {
        return FastjsonDecoder.decodeAsBean(this.rawData, parseWebhookResponseDataClass(this.event));
    }

    public <T extends AbstractWebhookResponseData> T rawDataAsBean(Class<T> rawDataClass) {
        return FastjsonDecoder.decodeAsBean(this.rawData, rawDataClass);
    }

    private static Class<? extends AbstractWebhookResponseData> parseWebhookResponseDataClass(String event) {
        String eventStr = null;
        String fullClassName = null;
        if (event != null && event instanceof String) {
            eventStr = ((String) event).trim();
            String className = Case.toUpperCamel(eventStr);

            String packageName = AbstractWebhookResponseData.class.getPackage()
                    .getName();
            fullClassName = packageName + "." + className;
        }

        try {
            return (Class<? extends AbstractWebhookResponseData>) Class.forName(fullClassName);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(
                    String.format("无法根据事件名称[%s]自动生成对应的webhook响应数据[%s]，请选择重新解析方法", eventStr, fullClassName));
        }
    }
}
