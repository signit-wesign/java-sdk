package cn.signit.sdk.pojo.webhook.response;

import java.util.List;

/**
 * 信封启动事件webhook信息具体数据.
 * 
 * @since 2.0.0
 */
public class EnvelopeStarted extends AbstractWebhookResponseData {
    private String actionUrl;// 执行的动作对应的URL地址
    private List<String> actions;// 流程允许在易企签WEB执行的动作
    private String account;// 接收方对应的在易企签的帐号
    private String customTag;// 自定义标识
    private String invokeNo;// 服务调用唯一标识
    private RawDataBasicInfo basicEnvelope;// 信封基本信息
    private Sender senderParticipant;
    private Receiver receiverParticipant;
    private SignData signData;// 已完成的签署数据
    private String returnUrl;// 客户端回调地址

    public Sender getSenderParticipant() {
        return senderParticipant;
    }

    public void setSenderParticipant(Sender senderParticipant) {
        this.senderParticipant = senderParticipant;
    }

    public Receiver getReceiverParticipant() {
        return receiverParticipant;
    }

    public void setReceiverParticipant(Receiver receiverParticipant) {
        this.receiverParticipant = receiverParticipant;
    }

    public String getReturnUrl() {
        return returnUrl;
    }

    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }

    public SignData getSignData() {
        return signData;
    }

    public void setSignData(SignData signData) {
        this.signData = signData;
    }

    public String getActionUrl() {
        return actionUrl;
    }

    public void setActionUrl(String actionUrl) {
        this.actionUrl = actionUrl;
    }

    public List<String> getActions() {
        return actions;
    }

    public void setActions(List<String> actions) {
        this.actions = actions;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
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

    public RawDataBasicInfo getBasicEnvelope() {
        return basicEnvelope;
    }

    public void setBasicEnvelope(RawDataBasicInfo basicEnvelope) {
        this.basicEnvelope = basicEnvelope;
    }

    /**
     * 信封基本信息.
     *
     * @since 2.0.0
     */
    public static class RawDataBasicInfo {
        private String wsid;// 信封全局唯一ID
        private String status;// 信封状态
        private Long createdDatetime;// 信封创建时间
        private Long expireDatetime;// 信封过期时间
        private Long statusDatetime;// 信封最新状态时间
        private String statusReason;// 信封最新状态原因
        private Integer currentSequence;// 当前签署方的序号

        public String getWsid() {
            return wsid;
        }

        public void setWsid(String wsid) {
            this.wsid = wsid;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public Long getCreatedDatetime() {
            return createdDatetime;
        }

        public void setCreatedDatetime(Long createdDatetime) {
            this.createdDatetime = createdDatetime;
        }

        public Long getExpireDatetime() {
            return expireDatetime;
        }

        public void setExpireDatetime(Long expireDatetime) {
            this.expireDatetime = expireDatetime;
        }

        public Long getStatusDatetime() {
            return statusDatetime;
        }

        public void setStatusDatetime(Long statusDatetime) {
            this.statusDatetime = statusDatetime;
        }

        public String getStatusReason() {
            return statusReason;
        }

        public void setStatusReason(String statusReason) {
            this.statusReason = statusReason;
        }

        public Integer getCurrentSequence() {
            return currentSequence;
        }

        public void setCurrentSequence(Integer currentSequence) {
            this.currentSequence = currentSequence;
        }
    }

    /**
     * 当前需要签署的接收方信息.
     *
     * @since 2.0.0
     */
    public static class Receiver {
        private String name;// 接收方信息
        private BoContactMetadata contactMetadata;// 接收方联系方式
        private String secureLevel;// 安全级别
        private String type;// 接收方类型
        private String roleType;// 接收方角色类型
        private boolean needForm;// 接收方是否必须预分配表单域
        private String assignedMessage;// 设置接收方私人信息
        private Integer assignedSequence;// 设置接收方处理顺序
        private String authLevel;// 签署认证等级
        private String enterpriseName;// 接收方所在企业名称
        private String metadata;// 信封自定义元数据信息
        private String status;// 签署状态
        private String wsid;// 接收方全局唯一标识
        private Long handleDatetime;// 处理时间
        private String handleReason;// 处理原因

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public BoContactMetadata getContactMetadata() {
            return contactMetadata;
        }

        public void setContactMetadata(BoContactMetadata contactMetadata) {
            this.contactMetadata = contactMetadata;
        }

        public String getSecureLevel() {
            return secureLevel;
        }

        public void setSecureLevel(String secureLevel) {
            this.secureLevel = secureLevel;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getRoleType() {
            return roleType;
        }

        public void setRoleType(String roleType) {
            this.roleType = roleType;
        }

        public boolean isNeedForm() {
            return needForm;
        }

        public void setNeedForm(boolean needForm) {
            this.needForm = needForm;
        }

        public String getAssignedMessage() {
            return assignedMessage;
        }

        public void setAssignedMessage(String assignedMessage) {
            this.assignedMessage = assignedMessage;
        }

        public Integer getAssignedSequence() {
            return assignedSequence;
        }

        public void setAssignedSequence(Integer assignedSequence) {
            this.assignedSequence = assignedSequence;
        }

        public String getAuthLevel() {
            return authLevel;
        }

        public void setAuthLevel(String authLevel) {
            this.authLevel = authLevel;
        }

        public String getEnterpriseName() {
            return enterpriseName;
        }

        public void setEnterpriseName(String enterpriseName) {
            this.enterpriseName = enterpriseName;
        }

        public String getMetadata() {
            return metadata;
        }

        public void setMetadata(String metadata) {
            this.metadata = metadata;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getWsid() {
            return wsid;
        }

        public void setWsid(String wsid) {
            this.wsid = wsid;
        }

        public Long getHandleDatetime() {
            return handleDatetime;
        }

        public void setHandleDatetime(Long handleDatetime) {
            this.handleDatetime = handleDatetime;
        }

        public String getHandleReason() {
            return handleReason;
        }

        public void setHandleReason(String handleReason) {
            this.handleReason = handleReason;
        }
    }

    /**
     * 发送方信息.
     *
     * @since 2.0.0
     */
    public static class Sender {// 和Receiver同级
        private String name;// 发送者姓名
        private BoContactMetadata contactMetadata;// 发送者联系方式

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public BoContactMetadata getContactMetadata() {
            return contactMetadata;
        }

        public void setContactMetadata(BoContactMetadata contactMetadata) {
            this.contactMetadata = contactMetadata;
        }

    }

    /**
     * 已成功完成签署流程的文件数据.
     * 
     *
     * @since 2.0.0
     */
    public static class SignData {
        private String fileWsid;// 文件ID
        private String url;// 已签署的文件数据的URL地址
        private String base64;// 已签署的文件数据数据的base64表示形式的字符串

        public String getFileWsid() {
            return fileWsid;
        }

        public void setFileWsid(String fileWsid) {
            this.fileWsid = fileWsid;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getBase64() {
            return base64;
        }

        public void setBase64(String base64) {
            this.base64 = base64;
        }

    }

    /**
     * 联系方式元数据.
     *
     * @since 2.0.0
     */
    public static class BoContactMetadata {
        List<BoContact> contacts;

        public List<BoContact> getContacts() {
            return contacts;
        }

        public void setContacts(List<BoContact> contacts) {
            this.contacts = contacts;
        }

    }

    /**
     * 联系方式详细数据.
     *
     * @since 2.0.0
     */
    public static class BoContact {
        private String authorWsid;
        private String email;
        private String sms;

        public String getAuthorWsid() {
            return authorWsid;
        }

        public void setAuthorWsid(String authorWsid) {
            this.authorWsid = authorWsid;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getSms() {
            return sms;
        }

        public void setSms(String sms) {
            this.sms = sms;
        }

    }

}
