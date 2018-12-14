package cn.signit.sdk.pojo.response;

import java.util.regex.Pattern;

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
        if (code == null || code.isEmpty() || code.length() < 4) {
            return false;
        }
        String descCode = code.substring(code.length() - 4);
        if (!Pattern.compile("[0-9]{4,4}")
                .matcher(descCode)
                .find()) {
            return false;
        }
        int intCode = Integer.parseInt(descCode);
        return intCode >= 0 && intCode < 100;
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
