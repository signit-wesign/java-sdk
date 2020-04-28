/*
 * Copyright © 2019 signit.cn. All rights reserved.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
package cn.signit.sdk.pojo;

/**
 * 身份认证元数据.
 * 
 * @author RyanChang
 * @since 1.4.0
 */
public class IdentityMetadata {
    /** 
     * 用户姓名.
     *
     * @since 1.4.0
     */
    private String name;
    /** 
     * 手机号.
     *
     * @since 1.4.0
     */
    private String phone;
    /** 
     * 证件类型.
     *
     * @since 1.4.0
     */
    private String identityType;
    /** 
     * 证件号.
     *
     * @since 1.4.0
     */
    private String identityNo;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getIdentityType() {
        return identityType;
    }
    public void setIdentityType(String identityType) {
        this.identityType = identityType;
    }
    public String getIdentityNo() {
        return identityNo;
    }
    public void setIdentityNo(String identityNo) {
        this.identityNo = identityNo;
    }
}
