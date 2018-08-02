package cn.signit.sdk.pojo;

public class ErrorResp {
    private String code;
    private String errorWsid;
    private String userMessage;
    private String developerMessage;
    private String moreInfo;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getErrorWsid() {
        return errorWsid;
    }

    public void setErrorWsid(String errorWsid) {
        this.errorWsid = errorWsid;
    }

    public String getUserMessage() {
        return userMessage;
    }

    public void setUserMessage(String userMessage) {
        this.userMessage = userMessage;
    }

    public String getDeveloperMessage() {
        return developerMessage;
    }

    public void setDeveloperMessage(String developerMessage) {
        this.developerMessage = developerMessage;
    }

    public String getMoreInfo() {
        return moreInfo;
    }

    public void setMoreInfo(String moreInfo) {
        this.moreInfo = moreInfo;
    }

}
