package cn.signit.sdk.pojo;

import java.util.List;

import cn.signit.sdk.type.AuthLevel;
import cn.signit.sdk.type.EnvelopeRoleType;
import cn.signit.sdk.type.ReceiverType;
import cn.signit.sdk.type.SecureLevel;
import cn.signit.sdk.util.ListBuilder;

/**
 * 接收方信息.
 * </p>
 * 包含接收方名字、接收方联系方式、安全等级、接收方类型、 接收方是否必须预分配表单域、设置接收方私人信息、接收方处理顺序、
 * 签署认证等级、接收方所在企业名称、信封自定义元数据信息、预设表单信息.
 *
 * @since 1.0.2
 */
public class Receiver {
    /**
     * 接收方名字.
     *
     * @since 1.0.2
     */
    private String name;
    /**
     * 接收方联系方式.
     *
     * @since 1.0.2
     */
    private Contact contact;
    /**
     * 安全等级.
     * </p>
     * 对应枚举：SecureLevel
     * 
     * @since 1.0.2
     */
    private SecureLevel secureLevel;
    /**
     * 接收方类型.
     * </p>
     * 接收方类型：ReceiverType
     * 
     * @since 1.0.2
     */
    private ReceiverType type;
    /**
     * 接收方是否必须预分配表单域.
     *
     * @since 1.0.2
     */
    private boolean needForm = false;
    /**
     * 设置接收方私人信息.
     *
     * @since 1.0.2
     */
    private String assignedMessage;
    /**
     * 接收方处理顺序.
     *
     * @since 1.0.2
     */
    private Integer assignedSequence;
    /**
     * 签署认证等级.
     * </p>
     * 对应枚举：AuthLevel
     * 
     * @since 1.0.2
     */
    private AuthLevel authLevel;
    /**
     * 接收方所在企业名称.
     *
     * @since 1.0.2
     */
    private String enterpriseName;
    /**
     * 信封自定义元数据信息.
     *
     * @since 1.0.2
     */
    private String metadata;
    /**
     * 预设表单信息.
     *
     * @since 1.0.2
     */
    private List<PresetForm> presetForms;

    private EnvelopeRoleType roleType;

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

    public SecureLevel getSecureLevel() {
        return secureLevel;
    }

    public void setSecureLevel(SecureLevel secureLevel) {
        this.secureLevel = secureLevel;
    }

    public ReceiverType getType() {
        return type;
    }

    public void setType(ReceiverType type) {
        this.type = type;
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

    public AuthLevel getAuthLevel() {
        return authLevel;
    }

    public void setAuthLevel(AuthLevel authLevel) {
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

    public List<PresetForm> getPresetForms() {
        return presetForms;
    }

    public void setPresetForms(List<PresetForm> presetForms) {
        this.presetForms = presetForms;
    }

    public EnvelopeRoleType getRoleType() {
        return roleType;
    }

    public void setRoleType(EnvelopeRoleType roleType) {
        this.roleType = roleType;
    }

    public Receiver() {
    }

    public Receiver(Builder builder) {
        this.name = builder.name;
        this.contact = builder.contact;
        this.secureLevel = builder.secureLevel;
        this.type = builder.type;
        this.needForm = builder.needForm;
        this.assignedMessage = builder.assignedMessage;
        this.assignedSequence = builder.assignedSequence;
        this.authLevel = builder.authLevel;
        this.enterpriseName = builder.enterpriseName;
        this.metadata = builder.metadata;
        this.presetForms = builder.presetForms;
        this.roleType = builder.roleType;
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder implements cn.signit.sdk.pojo.Builder<Receiver> {
        private String name;
        private Contact contact;
        private SecureLevel secureLevel;
        private ReceiverType type;
        private boolean needForm = false;
        private String assignedMessage;
        private Integer assignedSequence;
        private AuthLevel authLevel;
        private String enterpriseName;
        private String metadata;
        private List<PresetForm> presetForms;
        private EnvelopeRoleType roleType;

        public Builder() {
        }

        public Builder(Receiver receiver) {
            this.name = receiver.name;
            this.contact = receiver.contact;
            this.secureLevel = receiver.secureLevel;
            this.type = receiver.type;
            this.needForm = receiver.needForm;
            this.assignedMessage = receiver.assignedMessage;
            this.assignedSequence = receiver.assignedSequence;
            this.authLevel = receiver.authLevel;
            this.enterpriseName = receiver.enterpriseName;
            this.metadata = receiver.metadata;
            this.presetForms = receiver.presetForms;
            this.roleType = receiver.roleType;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder contact(Contact contact) {
            this.contact = contact;
            return this;
        }

        public Builder contact(Contact.Builder contactBuilder) {
            if (contactBuilder != null) {
                this.contact = contactBuilder.build();
            }
            return this;
        }

        public Builder secureLevel(SecureLevel secureLevel) {
            this.secureLevel = secureLevel;
            return this;
        }

        public Builder type(ReceiverType type) {
            this.type = type;
            return this;
        }

        public Builder needForm(boolean needForm) {
            this.needForm = needForm;
            return this;
        }

        public Builder assignedMessage(String assignedMessage) {
            this.assignedMessage = assignedMessage;
            return this;
        }

        public Builder assignedSequence(Integer assignedSequence) {
            this.assignedSequence = assignedSequence;
            return this;
        }

        public Builder authLevel(AuthLevel authLevel) {
            this.authLevel = authLevel;
            return this;
        }

        public Builder enterpriseName(String enterpriseName) {
            this.enterpriseName = enterpriseName;
            return this;
        }

        public Builder metadata(String metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder presetForms(List<PresetForm> presetForms) {
            this.presetForms = presetForms;
            return this;
        }

        public Builder presetForms(PresetForm.Builder... builders) {
            this.presetForms = ListBuilder.buildList(builders);
            return this;
        }

        public Builder roleType(EnvelopeRoleType roleType) {
            this.roleType = roleType;
            return this;
        }

        @Override
        public Receiver build() {
            return new Receiver(this);
        }

    }

}
