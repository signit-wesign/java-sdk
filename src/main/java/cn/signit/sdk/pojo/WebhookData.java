package cn.signit.sdk.pojo;

public class WebhookData {
    private String event;
    private Source source;
    private Target target;
    private SignatureResponse rawData;
    private Boolean needCallback;

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

    public SignatureResponse getRawData() {
        return rawData;
    }

    public void setRawData(SignatureResponse rawData) {
        this.rawData = rawData;
    }

    public Boolean getNeedCallback() {
        return needCallback;
    }

    public void setNeedCallback(Boolean needCallback) {
        this.needCallback = needCallback;
    }

}
