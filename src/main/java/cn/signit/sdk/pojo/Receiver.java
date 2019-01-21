package cn.signit.sdk.pojo;

import java.util.List;

import cn.signit.sdk.type.AuthLevel;
import cn.signit.sdk.type.EnvelopeRoleType;
import cn.signit.sdk.type.ReceiverType;
import cn.signit.sdk.type.SecureLevel;
import cn.signit.sdk.util.ListBuilder;

/**
 * 接收方信息。 包含接收方名字、接收方联系方式、安全等级、接收方类型、 接收方是否必须预分配表单域、设置接收方私人信息、接收方处理顺序、
 * 签署认证等级、接收方所在企业名称、信封自定义元数据信息、预设表单信息.
 *
 * @since 2.0.0
 */
public class Receiver {
    /**
     * 接收方名字.
     *
     * @since 2.0.0
     */
    private String name;
    /**
     * 接收方联系方式.
     *
     * @since 2.0.0
     */
    private Contact contact;
    /**
     * 安全等级.
     * </p>
     * 对应枚举：SecureLevel
     * 
     * @since 2.0.0
     */
    private SecureLevel secureLevel;
    /**
     * 接收方类型。 接收方类型：ReceiverType
     * 
     * @since 2.0.0
     */
    private ReceiverType type;
    /**
     * 接收方是否必须预分配表单域.
     *
     * @since 2.0.0
     */
    private boolean needForm = false;
    /**
     * 设置接收方私人信息.
     *
     * @since 2.0.0
     */
    private String assignedMessage;
    /**
     * 接收方处理顺序.
     *
     * @since 2.0.0
     */
    private Integer assignedSequence;
    /**
     * 签署认证等级.
     * </p>
     * 对应枚举：AuthLevel
     * 
     * @since 2.0.0
     */
    private AuthLevel authLevel;
    /**
     * 接收方所在企业名称.
     *
     * @since 2.0.0
     */
    private String enterpriseName;
    /**
     * 信封自定义元数据信息.
     *
     * @since 2.0.0
     */
    private String metadata;
    /**
     * 预设表单信息.
     *
     * @since 2.0.0
     */
    private List<PresetForm> presetForms;

    private EnvelopeRoleType roleType;

    /**
     * 流程完成后删除当前参与者的信封。 默认：false
     * 
     * @since 2.0.0
     */
    private boolean deleteCompletedEnvelope;

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

    public boolean isDeleteCompletedEnvelope() {
        return deleteCompletedEnvelope;
    }

    public void setDeleteCompletedEnvelope(boolean deleteCompletedEnvelope) {
        this.deleteCompletedEnvelope = deleteCompletedEnvelope;
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
        this.deleteCompletedEnvelope = builder.deleteCompletedEnvelope;
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    /**
     * 接收方信息对象构造器
     * 
     * @since 2.0.0
     */
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
        private boolean deleteCompletedEnvelope;

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
            this.deleteCompletedEnvelope = receiver.deleteCompletedEnvelope;
        }

        /**
         * 
         * @param name
         *            接收方姓名
         * @return 接收方信息对象构造器{@link Receiver.Builder}
         * @since 2.0.0
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * 
         * @param contact
         *            接收方联系方式(邮件/手机号) {@link Contact}
         * @return 接收方信息对象构造器{@link Receiver.Builder}
         * @since 2.0.0
         */
        public Builder contact(Contact contact) {
            this.contact = contact;
            return this;
        }

        /**
         * 
         * @param contactBuilder
         *            接收方联系方式(邮件/手机号)构造器 {@link Contact.Builder}
         * @return 接收方信息对象构造器{@link Receiver.Builder}
         * @since 2.0.0
         */
        public Builder contact(Contact.Builder contactBuilder) {
            if (contactBuilder != null) {
                this.contact = contactBuilder.build();
            }
            return this;
        }

        /**
         * 
         * @param secureLevel
         *            要求接收方签署需具备安全级别。 DISPOSABLE_CERT-一次性证书；
         *            标准证书-STANDARD_CERT。默认为DISPOSABLE_CERT {@link SecureLevel}
         * @return 接收方信息对象构造器{@link Receiver.Builder}
         * @since 2.0.0
         */
        public Builder secureLevel(SecureLevel secureLevel) {
            this.secureLevel = secureLevel;
            return this;
        }

        /**
         * 
         * @param type
         *            SIGNER-签署者； CHECKER-审核员 {@link ReceiverType}
         * @return 接收方信息对象构造器{@link Receiver.Builder}
         * @since 2.0.0
         */
        public Builder type(ReceiverType type) {
            this.type = type;
            return this;
        }

        /**
         * 
         * @param needForm
         *            接收方是否必须预分配表单域 true-接收方必须分配表单域，false-接收方可以不分配表单域。默认为false
         * @return 接收方信息对象构造器{@link Receiver.Builder}
         * @since 2.0.0
         */
        public Builder needForm(boolean needForm) {
            this.needForm = needForm;
            return this;
        }

        /**
         * 
         * @param assignedMessage
         *            设置接收方私人信息；信封添加接收方时，允许给该接收方添加一段消息字符串内容，该ta签署时只有ta能看得到
         * @return 接收方信息对象构造器{@link Receiver.Builder}
         * @since 2.0.0
         */
        public Builder assignedMessage(String assignedMessage) {
            this.assignedMessage = assignedMessage;
            return this;
        }

        /**
         * 
         * @param assignedSequence
         *            设置接收方处理的排列顺序,从1开始，每次最多为100
         * @return 接收方信息对象构造器{@link Receiver.Builder}
         * @since 2.0.0
         */
        public Builder assignedSequence(Integer assignedSequence) {
            this.assignedSequence = assignedSequence;
            return this;
        }

        /**
         * 
         * @param authLevel
         *            参与者签署认证等级 {@link AuthLevel}
         * @return 接收方信息对象构造器{@link Receiver.Builder}
         * @since 2.0.0
         */
        public Builder authLevel(AuthLevel authLevel) {
            this.authLevel = authLevel;
            return this;
        }

        /**
         * 
         * @param enterpriseName
         *            接收方所在企业名称
         * @return 接收方信息对象构造器{@link Receiver.Builder}
         * @since 2.0.0
         */
        public Builder enterpriseName(String enterpriseName) {
            this.enterpriseName = enterpriseName;
            return this;
        }

        /**
         * 
         * @param metadata
         *            信封自定义元数据信息，会存储在易企签平台，仅支持JSON字符串
         * @return 接收方信息对象构造器{@link Receiver.Builder}
         * @since 2.0.0
         */
        public Builder metadata(String metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * 
         * @param presetForms
         *            预设表单信息对象列表 {@link PresetForm}
         * @return 接收方信息对象构造器{@link Receiver.Builder}
         * @since 2.0.0
         */
        public Builder presetForms(List<PresetForm> presetForms) {
            this.presetForms = presetForms;
            return this;
        }

        /**
         * 
         * @param builders
         *            预设表单信息对象构造器列表 {@link PresetForm.Builder}
         * @return 接收方信息对象构造器{@link Receiver.Builder}
         * @since 2.0.0
         */
        public Builder presetForms(PresetForm.Builder... builders) {
            this.presetForms = ListBuilder.buildList(builders);
            return this;
        }

        /**
         * 
         * @param roleType
         *            PERSON-个人； ENTERPRISE_MEMBER-企业成员；
         *            {@link EnvelopeRoleType}。默认为PERSON
         * @return 接收方信息对象构造器{@link Receiver.Builder}
         * @since 2.0.0
         */
        public Builder roleType(EnvelopeRoleType roleType) {
            this.roleType = roleType;
            return this;
        }

        /**
         * 
         * @param deleteCompletedEnvelope
         *            对于接收方，在签署完成之后是否删除签署文件（删除文件后接收方不可再下载）
         *            true-删除签署文件，false-保留签署文件在易企签平台；默认为false
         * @return 接收方信息对象建造器{@link Receiver.Builder}
         * @since 2.0.0
         */
        public Builder deleteCompletedEnvelope(boolean deleteCompletedEnvelope) {
            this.deleteCompletedEnvelope = deleteCompletedEnvelope;
            return this;
        }

        /**
         * 
         * @return 接收方信息对象 {@link Receiver}
         * @since 2.0.0
         */
        @Override
        public Receiver build() {
            return new Receiver(this);
        }

    }

}
