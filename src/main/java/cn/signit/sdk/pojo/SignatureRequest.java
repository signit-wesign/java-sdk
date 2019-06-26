package cn.signit.sdk.pojo;

import java.util.List;

import cn.signit.sdk.pojo.request.AbstractSignitRequest;
import cn.signit.sdk.type.AcceptDataType;

public class SignatureRequest extends AbstractSignitRequest<SignatureResponse> {
    private FileData fileData;
    private AcceptDataType acceptDataType;
    private String returnUrl;
    private String customTag;
    private List<Signer> signDetails;

    public SignatureRequest() {
    }

    public SignatureRequest(FileData fileData, AcceptDataType acceptDataType, String returnUrl, String customTag,
            List<Signer> signDetails) {
        super();
        this.fileData = fileData;
        this.acceptDataType = acceptDataType;
        this.returnUrl = returnUrl;
        this.customTag = customTag;
        this.signDetails = signDetails;
    }

    public static SignatureRequestBuilder builder() {
        return new SignatureRequestBuilder();
    }

    public static class SignatureRequestBuilder {
        private FileData fileData;
        private AcceptDataType acceptDataType;
        private String returnUrl;
        private String customTag;
        private List<Signer> signDetails;

        public SignatureRequestBuilder withFileData(FileData fileData) {
            this.fileData = fileData;
            return this;
        }

        public SignatureRequestBuilder withAcceptDataType(AcceptDataType acceptDataType) {
            this.acceptDataType = acceptDataType;
            return this;
        }

        public SignatureRequestBuilder withReturnUrl(String returnUrl) {
            this.returnUrl = returnUrl;
            return this;
        }

        @Deprecated
        public SignatureRequestBuilder withFileData(String returnUrl) {
            this.returnUrl = returnUrl;
            return this;
        }

        public SignatureRequestBuilder withCustomTag(String customTag) {
            this.customTag = customTag;
            return this;
        }

        public SignatureRequestBuilder withSignDetails(List<Signer> signDetails) {
            this.signDetails = signDetails;
            return this;
        }

        public SignatureRequest build() {
            return new SignatureRequest(fileData, acceptDataType, returnUrl, customTag, signDetails);
        }
    }
 
    public FileData getFileData() {
        return fileData;
    }

    public void setFileData(FileData fileData) {
        this.fileData = fileData;
    }

    public AcceptDataType getAcceptDataType() {
        return acceptDataType;
    }

    public void setAcceptDataType(AcceptDataType acceptDataType) {
        this.acceptDataType = acceptDataType;
    }

    public String getReturnUrl() {
        return returnUrl;
    }

    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }

    public String getCustomTag() {
        return customTag;
    }

    public void setCustomTag(String customTag) {
        this.customTag = customTag;
    }

    public List<Signer> getSignDetails() {
        return signDetails;
    }

    public void setSignDetails(List<Signer> signDetails) {
        this.signDetails = signDetails;
    }

    @Override
    public Class<SignatureResponse> getResponseClass() {
        return SignatureResponse.class;
    }

}
