package cn.signit.sdk.type;

/**
 * 
 * 图片类型编码枚举.
 *
 * @since 1.0.2
 */
public enum ImageCode {
    /**
     * 身份证正面。刻有“居民身份证”字样的一面
     */
    ID_CARD_FRONT(1000, "身份证正面"),
    /**
     * 身份证背面。具有人像的一面
     */
    ID_CARD_BACK(1001, "身份证背面"),
    /**
     * 企业营业执照
     */
    BUSINESS_LICENCE(2000, "企业营业执照"),
    /**
     * 组织机构代码照
     */
    ORG_CODE(2001, "组织机构代码照"),
    /**
     * 法人身份证正面。刻有“居民身份证”字样的一面
     */
    LEGAL_PERSON_ID_CARD_FRONT(2002, "法人身份证正面"),
    /**
     * 法人身份证背面。具有人像的一面
     */
    LEGAL_PERSON_ID_CARD_BACK(2003, "法人身份证背面"),
    /**
     * 经办人身份证正面。刻有“居民身份证”字样的一面
     */
    AGENT_ID_CARD_FRONT(2004, "经办人身份证正面"),
    /**
     * 经办人身份证背面。具有人像的一面
     */
    AGENT_ID_CARD_BACK(2005, "经办人身份证背面"),
    /**
     * 委托书图片
     */
    AGENT_TRUST(2006, "委托书图片"),
    /**
     * 未确切定义的其他认证所需图片
     */
    EXTRA(2100, "未确切定义的其他认证所需图片"),
    /**
     * 人脸图像
     */
    FACE_ID(2101, "人脸图像"),;

    Integer code;
    String description;

    private ImageCode(Integer code, String description) {
        this.code = code;
        this.description = description;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
