package cn.signit.sdk.pojo.webhook.response;

import java.util.List;

/**
 * 信封启动事件webhook信息具体数据.
 * 
 * @since 1.0.2
 */
public class EnvelopeStarted extends AbstractWebhookResponseData {
    private String actionUrl;// 执行的动作对应的URL地址
    private List<String> actions;// 流程允许在易企签WEB执行的动作
    private String account;// 接收方对应的在易企签的帐号
    private String customTag;// 自定义标识
    private String invokeNo;// 服务调用唯一标识
    private BasicInfo basicInfo;// 信封基本信息
    private ParticipantInfo participantInfo;// 参与签署方信息

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

    public BasicInfo getBasicInfo() {
        return basicInfo;
    }

    public void setBasicInfo(BasicInfo basicInfo) {
        this.basicInfo = basicInfo;
    }

    public ParticipantInfo getParticipantInfo() {
        return participantInfo;
    }

    public void setParticipantInfo(ParticipantInfo participantInfo) {
        this.participantInfo = participantInfo;
    }

    /**
     * 信封基本信息.
     * </p>
     *
     * 
     * @since 1.0.2
     */
    public static class BasicInfo {
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
     * 参与签署方信息.
     * </p>
     *
     * 
     * @since 1.0.2
     */
    public static class ParticipantInfo {
        private Sender sender;// 发送方信息
        private Receiver receiver;// 当前需要签署的接收方信息

        public Sender getSender() {
            return sender;
        }

        public void setSender(Sender sender) {
            this.sender = sender;
        }

        public Receiver getReceiver() {
            return receiver;
        }

        public void setReceiver(Receiver receiver) {
            this.receiver = receiver;
        }
    }

    /**
     * 当前需要签署的接收方信息.
     * </p>
     *
     * 
     * @since 1.0.2
     */
    public static class Receiver {
        private String name;// 接收方信息
        private Contact contact;// 接收方联系方式
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

        public Contact getContact() {
            return contact;
        }

        public void setContact(Contact contact) {
            this.contact = contact;
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
     * </p>
     *
     * 
     * @since 1.0.2
     */
    public static class Sender {// 和Receiver同级
        private String name;// 发送者姓名
        private Contact contact;// 发送者联系方式

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Contact getContact() {
            return contact;
        }

        public void setContact(Contact contact) {
            this.contact = contact;
        }

    }

    /**
     * 联系方式.
     * </p>
     *
     * 
     * @since 1.0.2
     */
    public static class Contact {// sender和Receiver都有
        private String email;// 邮箱
        private String phone;// 手机号

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

    }

}
