package cn.signit.sdk.pojo.response;

/**
 * 开放平台应用公共响应信息.
 *
 * @since 1.0.2
 */
public abstract class AbstractSignitResponse {
    protected String code;
    protected String message;
    protected String customTag;
    protected String invokeNo;

    public Boolean isSuccess() {
        if (code != null && code.equals("100550001")) {
            return true;
        } else {
            return false;
        }
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
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
}
