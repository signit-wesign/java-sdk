package cn.signit.sdk.pojo;

import java.util.Date;


public class Participant {

    // 参与者全局唯一ID
    private String participantWsid;
    // 参与者所属信封全局唯一ID
    private String envelopeWsid;
    // 参与者对应用户全局唯一ID
    private String authorWsid;
    // 参与者名字
    private String name;
    // 参与者在信封中的类型
    private String type;
    // 参与者要求的安全级别
    private String secureLevel;
    // 参与者在业务流程中的状态
    private String status;
    // 参与者接收通知的状态
    private String receiveNotificationStatus;
    // 分配给当前参与者的消息
    private String assignedMessage;
    // 分配给当前参与者的处理顺序（固定不变，1~n）
    private Integer assignedSequence;
    // 浏览信封时间
    private Date viewDatetime;
    // 处理信封时间
    private Date handleDatetime;
    // 处理原因
    private String handleReason;
    // 授权者的参与者全局唯一ID
    private String authorizerWsid;
    // 参与者信封展示状态类型
    private String envelopeDisplay;
    // 是否对处理顺序敏感
    private Boolean sequenceSensitive;
    // 参与者所属企业全局wsid
    private String enterpriseWsid;
    // 参与者别名
    private String alias;
    // 当前参与者是否进行了纠正
    private Boolean corrected;
    // 参与者在系统中的角色类型
    private String roleType;
    // 参与者元数据
    private String metadata;
    // 参与者联系方式
    private String contacts;
    private String enterpriseName;
    private String multiSendNum;
    private String authLevel;
    private String authType;
    // 参与者处理模式
    private String handleMode;
    private Boolean isExternal;
    /**
     * 参与者开放平台元数据.
     *
     * @since 1.3.0
     */
    private ParticipantOpenMetadata openMetadata;

    public String getMultiSendNum() {
        return multiSendNum;
    }

    public void setMultiSendNum(String multiSendNum) {
        this.multiSendNum = multiSendNum;
    }

    /**
     * 获取enterpriseName属性字段的值.
     *
     * @return 类型为String的enterpriseName属性字段的值.
     */
    public String getEnterpriseName() {
        return enterpriseName;
    }

    /**
     * 设置enterpriseName属性字段的值.
     *
     * @param enterpriseName
     *            待设置类型为String的enterpriseName属性字段的值.
     */
    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    /**
     * 获取participantWsid属性字段的值.
     *
     * @return 类型为String的participantWsid属性字段的值.
     */
    public String getParticipantWsid() {
        return participantWsid;
    }

    /**
     * 设置participantWsid属性字段的值.
     *
     * @param participantWsid
     *            待设置类型为String的participantWsid属性字段的值.
     */
    public void setParticipantWsid(String participantWsid) {
        this.participantWsid = participantWsid;
    }

    /**
     * 获取envelopeWsid属性字段的值.
     *
     * @return 类型为String的envelopeWsid属性字段的值.
     */
    public String getEnvelopeWsid() {
        return envelopeWsid;
    }

    /**
     * 设置envelopeWsid属性字段的值.
     *
     * @param envelopeWsid
     *            待设置类型为String的envelopeWsid属性字段的值.
     */
    public void setEnvelopeWsid(String envelopeWsid) {
        this.envelopeWsid = envelopeWsid;
    }

    /**
     * 获取authorWsid属性字段的值.
     *
     * @return 类型为String的authorWsid属性字段的值.
     */
    public String getAuthorWsid() {
        return authorWsid;
    }

    /**
     * 设置authorWsid属性字段的值.
     *
     * @param authorWsid
     *            待设置类型为String的authorWsid属性字段的值.
     */
    public void setAuthorWsid(String authorWsid) {
        this.authorWsid = authorWsid;
    }

    /**
     * 获取name属性字段的值.
     *
     * @return 类型为String的name属性字段的值.
     */
    public String getName() {
        return name;
    }

    /**
     * 获取assignedMessage属性字段的值.
     *
     * @return 类型为String的assignedMessage属性字段的值.
     */
    public String getAssignedMessage() {
        return assignedMessage;
    }

    /**
     * 设置assignedMessage属性字段的值.
     *
     * @param assignedMessage
     *            待设置类型为String的assignedMessage属性字段的值.
     */
    public void setAssignedMessage(String assignedMessage) {
        this.assignedMessage = assignedMessage;
    }

    /**
     * 设置name属性字段的值.
     *
     * @param name
     *            待设置类型为String的name属性字段的值.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取type属性字段的值.
     *
     * @return 类型为String的type属性字段的值.
     */
    public String getType() {
        return type;
    }

    /**
     * 设置type属性字段的值.
     *
     * @param type
     *            待设置类型为String的type属性字段的值.
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取secureLevel属性字段的值.
     *
     * @return 类型为String的secureLevel属性字段的值.
     */
    public String getSecureLevel() {
        return secureLevel;
    }

    /**
     * 设置secureLevel属性字段的值.
     *
     * @param secureLevel
     *            待设置类型为String的secureLevel属性字段的值.
     */
    public void setSecureLevel(String secureLevel) {
        this.secureLevel = secureLevel;
    }

    /**
     * 获取status属性字段的值.
     *
     * @return 类型为String的status属性字段的值.
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置status属性字段的值.
     *
     * @param status
     *            待设置类型为String的status属性字段的值.
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取receiveNotificationStatus属性字段的值.
     *
     * @return 类型为String的receiveNotificationStatus属性字段的值.
     */
    public String getReceiveNotificationStatus() {
        return receiveNotificationStatus;
    }

    /**
     * 设置receiveNotificationStatus属性字段的值.
     *
     * @param receiveNotificationStatus
     *            待设置类型为String的receiveNotificationStatus属性字段的值.
     */
    public void setReceiveNotificationStatus(String receiveNotificationStatus) {
        this.receiveNotificationStatus = receiveNotificationStatus;
    }

    /**
     * 获取assignedSequence属性字段的值.
     *
     * @return 类型为Integer的assignedSequence属性字段的值.
     */
    public Integer getAssignedSequence() {
        return assignedSequence;
    }

    /**
     * 设置assignedSequence属性字段的值.
     *
     * @param assignedSequence
     *            待设置类型为Integer的assignedSequence属性字段的值.
     */
    public void setAssignedSequence(Integer assignedSequence) {
        this.assignedSequence = assignedSequence;
    }

    /**
     * 获取viewDatetime属性字段的值.
     *
     * @return 类型为Date的viewDatetime属性字段的值.
     */
    public Date getViewDatetime() {
        return viewDatetime;
    }

    /**
     * 设置viewDatetime属性字段的值.
     *
     * @param viewDatetime
     *            待设置类型为Date的viewDatetime属性字段的值.
     */
    public void setViewDatetime(Date viewDatetime) {
        this.viewDatetime = viewDatetime;
    }

    /**
     * 获取handleDatetime属性字段的值.
     *
     * @return 类型为Date的handleDatetime属性字段的值.
     */
    public Date getHandleDatetime() {
        return handleDatetime;
    }

    /**
     * 设置handleDatetime属性字段的值.
     *
     * @param handleDatetime
     *            待设置类型为Date的handleDatetime属性字段的值.
     */
    public void setHandleDatetime(Date handleDatetime) {
        this.handleDatetime = handleDatetime;
    }

    /**
     * 获取handleReason属性字段的值.
     *
     * @return 类型为String的handleReason属性字段的值.
     */
    public String getHandleReason() {
        return handleReason;
    }

    /**
     * 设置handleReason属性字段的值.
     *
     * @param handleReason
     *            待设置类型为String的handleReason属性字段的值.
     */
    public void setHandleReason(String handleReason) {
        this.handleReason = handleReason;
    }

    /**
     * 获取authorizerWsid属性字段的值.
     *
     * @return 类型为String的authorizerWsid属性字段的值.
     */
    public String getAuthorizerWsid() {
        return authorizerWsid;
    }

    /**
     * 设置authorizerWsid属性字段的值.
     *
     * @param authorizerWsid
     *            待设置类型为String的authorizerWsid属性字段的值.
     */
    public void setAuthorizerWsid(String authorizerWsid) {
        this.authorizerWsid = authorizerWsid;
    }

    /**
     * 获取envelopeDisplay属性字段的值.
     *
     * @return 类型为String的envelopeDisplay属性字段的值.
     */
    public String getEnvelopeDisplay() {
        return envelopeDisplay;
    }

    /**
     * 设置envelopeDisplay属性字段的值.
     *
     * @param envelopeDisplay
     *            待设置类型为String的envelopeDisplay属性字段的值.
     */
    public void setEnvelopeDisplay(String envelopeDisplay) {
        this.envelopeDisplay = envelopeDisplay;
    }

    /**
     * 获取sequenceSensitive属性字段的值.
     *
     * @return 类型为Boolean的sequenceSensitive属性字段的值.
     */
    public Boolean getSequenceSensitive() {
        return sequenceSensitive;
    }

    /**
     * 设置sequenceSensitive属性字段的值.
     *
     * @param sequenceSensitive
     *            待设置类型为Boolean的sequenceSensitive属性字段的值.
     */
    public void setSequenceSensitive(Boolean sequenceSensitive) {
        this.sequenceSensitive = sequenceSensitive;
    }

    /**
     * 获取enterpriseWsid属性字段的值.
     *
     * @return 类型为String的enterpriseWsid属性字段的值.
     */
    public String getEnterpriseWsid() {
        return enterpriseWsid;
    }

    /**
     * 设置enterpriseWsid属性字段的值.
     *
     * @param enterpriseWsid
     *            待设置类型为String的enterpriseWsid属性字段的值.
     */
    public void setEnterpriseWsid(String enterpriseWsid) {
        this.enterpriseWsid = enterpriseWsid;
    }

    /**
     * 获取alias属性字段的值.
     *
     * @return 类型为String的alias属性字段的值.
     */
    public String getAlias() {
        return alias;
    }

    /**
     * 设置alias属性字段的值.
     *
     * @param alias
     *            待设置类型为String的alias属性字段的值.
     */
    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * 获取corrected属性字段的值.
     *
     * @return 类型为Boolean的corrected属性字段的值.
     */
    public Boolean getCorrected() {
        return corrected;
    }

    /**
     * 设置corrected属性字段的值.
     *
     * @param corrected
     *            待设置类型为Boolean的corrected属性字段的值.
     */
    public void setCorrected(Boolean corrected) {
        this.corrected = corrected;
    }

    /**
     * 获取roleType属性字段的值.
     *
     * @return 类型为String的roleType属性字段的值.
     */
    public String getRoleType() {
        return roleType;
    }

    /**
     * 设置roleType属性字段的值.
     *
     * @param roleType
     *            待设置类型为String的roleType属性字段的值.
     */
    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }

    /**
     * 获取metadata属性字段的值.
     *
     * @return 类型为String的metadata属性字段的值.
     */
    public String getMetadata() {
        return metadata;
    }

    /**
     * 设置metadata属性字段的值.
     *
     * @param metadata
     *            待设置类型为String的metadata属性字段的值.
     */
    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    /**
     * 获取contacts属性字段的值.
     *
     * @return 类型为String的contacts属性字段的值.
     */
    public String getContacts() {
        return contacts;
    }

    /**
     * 设置contacts属性字段的值.
     *
     * @param contacts
     *            待设置类型为String的contacts属性字段的值.
     */
    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    /**
     * 获取authLevel属性字段的值.
     *
     * @return 类型为String的authLevel属性字段的值.
     */
    public String getAuthLevel() {
        return authLevel;
    }

    /**
     * 设置authLevel属性字段的值.
     *
     * @param authLevel
     *            待设置类型为String的authLevel属性字段的值.
     */
    public void setAuthLevel(String authLevel) {
        this.authLevel = authLevel;
    }

    /**
     * 获取authType属性字段的值.
     *
     * @return 类型为String的authType属性字段的值.
     */
    public String getAuthType() {
        return authType;
    }

    /**
     * 设置authType属性字段的值.
     *
     * @param authType
     *            待设置类型为String的authType属性字段的值.
     */
    public void setAuthType(String authType) {
        this.authType = authType;
    }

    /**
     * 获取handleMode属性字段的值.
     *
     * @return 类型为String的handleMode属性字段的值.
     */
    public String getHandleMode() {
        return handleMode;
    }

    /**
     * 设置handleMode属性字段的值.
     *
     * @param handleMode
     *            待设置类型为String的handleMode属性字段的值.
     */
    public void setHandleMode(String handleMode) {
        this.handleMode = handleMode;
    }

    /**
     * 获取openMetadata属性字段的值.
     *
     * @return 类型为VoParticipantOpenMetadata的openMetadata属性字段的值.
     */
    public ParticipantOpenMetadata getOpenMetadata() {
        return openMetadata;
    }

    /**
     * 设置openMetadata属性字段的值.
     *
     * @param openMetadata
     *            待设置类型为VoParticipantOpenMetadata的openMetadata属性字段的值.
     */
    public void setOpenMetadata(ParticipantOpenMetadata openMetadata) {
        this.openMetadata = openMetadata;
    }

    public Boolean getIsExternal() {
        return isExternal;
    }

    public void setIsExternal(Boolean isExternal) {
        this.isExternal = isExternal;
    }
}