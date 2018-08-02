/*
 * Copyright © 2017 signit.cn. All rights reserved.
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
 * 命名风格的枚举.
 * 
 * @author zhd
 * @since 1.0.0
 */
public enum NamingStyle {
    /**
     * 小驼峰命名风格.如：nameStyle
     */
    CAMEL, 

    /**
     * 字母间均大写命名风格.如：NameStyle
     */
    PASCAL, 

    /**
     * 字母间均以下划线分隔命名风格（unix命名风格）.如：name_style
     */
    SNAKE,

    /**
     * 字母间均以连词符分隔命名风格.如：name-style
     */
    KEBAB
    ;
}
