/*
 * Copyright © 2022 signit.cn. All rights reserved.
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
package cn.signit.sdk.type;

/**
* 描述： 当前相对方企业的同步规则
* @author xiazhitao
* @since 1.0.0
*/
public enum UserEnterpriseRelativeSyncRule {

    UNKNOWN(-1, "未知类型"),
    REGISTER_ENTERPRISE(0, "签章平台自动完成机构帐号注册"),
    REGISTER_ENTERPRISE_AUTHENTICATION(1, "签章平台自动完成机构帐号注册+自动机构实名认证"),
    //签章平台自动完成机构帐号注册+自动个人帐号注册（基于法人信息，如果没有，创建临时帐号）+自动加入机构
    REGISTER_ENTERPRISE_AUTHENTICATION_JOIN(2, "签章平台自动完成机构帐号注册+自动个人帐号注册+自动加入机构"),
    //签章平台自动完成机构帐号注册+自动机构实名认证+自动个人帐号注册（基于法人信息，此规则，法人信息必填）+自动个人实名认证（基于法人信息，此规则，法人信息必填）+自动加入机构
    REGISTER_ENTERPRISE_PERSON_AUTHENTICATION_JOIN(3, "签章平台自动完成机构帐号注册+自动机构实名认证+自动个人帐号注册+自动个人实名认证+自动加入机构"),
    ;
    private Integer code;
    private String description;

    private UserEnterpriseRelativeSyncRule(Integer code, String description) {
        this.code = code;
        this.description = description;
    }

    /**
     * 根据枚举code获取枚举类型.
     *
     * @param code
     *            枚举整型code
     * @return 枚举具体类型
     * @author xiazhitao
     */
    public static UserEnterpriseRelativeSyncRule parse(Integer code) {
        if (code == null) {
            return UserEnterpriseRelativeSyncRule.UNKNOWN;
        }
        for (UserEnterpriseRelativeSyncRule formType : values()) {
            if (formType.getCode().intValue() == code.intValue()) {
                return formType;
            }
        }
        return UserEnterpriseRelativeSyncRule.UNKNOWN;
    }

    /**
     * 转换字符串中(比如：filters)包含的枚举英文为code.
     *
     * @param str
     *            需要转化的字符串
     * @return 转换完成的字符串
     * @author xiazhitao
     */
    public static String transferFilters(String str) {
        if (str == null) {
            return null;
        }
        String result = str;
        for (UserEnterpriseRelativeSyncRule val : values()) {
            if (result.contains("=" + val.toString())) {
                result = result.replace("=" + val.toString(), "=" + val.getCode());
            }
        }
        return result;
    }

    /**
     * 判断是否是当前枚举.
     *
     * @param code
     *            类型码
     * @return true 是当前枚举；false 不是当前枚举
     * @author xiazhitao
     */
    public boolean is(int code) {
        return this.getCode() == code;
    }

    /**
     * 获取code属性字段的值.
     *
     * @return 类型为Integer的code属性字段的值.
     */
    public Integer getCode() {
        return code;
    }

    /**
     * 获取description属性字段的值.
     *
     * @return 类型为String的description属性字段的值.
     */
    public String getDescription() {
        return description;
    }

}
