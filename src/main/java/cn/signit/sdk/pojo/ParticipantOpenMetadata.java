package cn.signit.sdk.pojo;

import java.security.cert.Certificate;
import java.util.List;

public class ParticipantOpenMetadata {

    /**
     * 用户已选择的签署认证类型.
     *
     * @since 1.3.0
     */
    private List<String> selectedAuthTypes;
    /**
     * 客户端调用唯一标识.
     *
     * @since 1.3.0
     */
    private String clientId;
    /**
     * 启用嵌入模式，调用方系统中直接嵌入易企签WEB流程时设置为true，签署流程消息只会通过webhook事件消息方式通知，用户在易企签平台设置的短信/邮件等消息将自动屏蔽.
     *
     * @since 1.3.0
     */
    private Boolean enableEmbeddedMode = false;
    /**
     * 候选印章签名列表
     *
     * @since 2.2.0
     */
    private List<ElecSign> candidateSealSigns;
    
    /**
     * 候选手写签名列表
     *
     * @since 2.2.0
     */
    private List<ElecSign> candidateWriteSigns;
    /**
     * 电子签名证书数据信息（绑定到参与者身上）,
     */
    @Deprecated
    private Certificate certificate;
    /**
     * 电子签名证书数据列表信息（绑定到参与者身上）,
     * 
     *  @since 2.2.0
     */
    private List<Certificate> certificates;
    /** 
     * 无参构造方法.
     *
     */
    public ParticipantOpenMetadata() {
        
    }
    /**
     * 全参数构造方法.
     *
     * @param selectedAuthTypes
     *            用户已选择的签署认证类型
     * @param clientId
     *            客户端调用唯一标识
     * @param enableEmbeddedMode
     *            启用嵌入模式
     */
    public ParticipantOpenMetadata(List<String> selectedAuthTypes, String clientId, Boolean enableEmbeddedMode) {
        super();
        this.selectedAuthTypes = selectedAuthTypes;
        this.clientId = clientId;
        this.enableEmbeddedMode = enableEmbeddedMode;
    }

    public List<String> getSelectedAuthTypes() {
        return selectedAuthTypes;
    }

    public void setSelectedAuthTypes(List<String> selectedAuthTypes) {
        this.selectedAuthTypes = selectedAuthTypes;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public Boolean getEnableEmbeddedMode() {
        return enableEmbeddedMode;
    }

    public void setEnableEmbeddedMode(Boolean enableEmbeddedMode) {
        this.enableEmbeddedMode = enableEmbeddedMode;
    }
    public List<ElecSign> getCandidateSealSigns() {
        return candidateSealSigns;
    }
    public void setCandidateSealSigns(List<ElecSign> candidateSealSigns) {
        this.candidateSealSigns = candidateSealSigns;
    }
    public List<ElecSign> getCandidateWriteSigns() {
        return candidateWriteSigns;
    }
    public void setCandidateWriteSigns(List<ElecSign> candidateWriteSigns) {
        this.candidateWriteSigns = candidateWriteSigns;
    }
    public Certificate getCertificate() {
        return certificate;
    }
    public void setCertificate(Certificate certificate) {
        this.certificate = certificate;
    }
    public List<Certificate> getCertificates() {
        return certificates;
    }
    public void setCertificates(List<Certificate> certificates) {
        this.certificates = certificates;
    }

}