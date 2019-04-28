package cn.signit.sdk.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;
import cn.signit.sdk.type.NamingStyle;

public final class FastjsonEncoder {

    private FastjsonEncoder() {
    }

    // 初始化配置
    private static SerializeConfig initConfig(NamingStyle namingStyle) {
        SerializeConfig config = SerializeConfig.getGlobalInstance();
        String classNotFoundWarn = "[WARN] 您当前使用的fastjson版本较低，不支持自定义字段命名风格"
                + "（即：com.alibaba.fastjson.PropertyNamingStrategy 不存在）" + "来进行序列化操作，如果您设置了["
                + NamingStyle.class.getName() + "]，则该设置将不会起效，fastjson将使用默认命名风格进行序列化操作，如需自定义序列化字段命名风格，"
                + "请使用fastjson 1.2.15+版本";
        try {
            if (null != Class.forName("com.alibaba.fastjson.PropertyNamingStrategy")) {
                config = configNamingStrategy(config, namingStyle);
            } else {
                System.err.println(classNotFoundWarn);
            }
        } catch (ClassNotFoundException e) {
            System.err.println(classNotFoundWarn);
        }
        return config;
    }

    /**
     * 将指定java对象序列化成相应字符串
     * 
     * @param obj
     *            java对象
     * @param namingStyle
     *            命名风格
     * @param useUnicode
     *            是否使用unicode编码（当有中文字段时）
     * @return 序列化后的json字符串
     * @author Zhanghongdong
     */
    public static String encodeAsString(Object obj, NamingStyle namingStyle, boolean useUnicode) {
        SerializeConfig config = initConfig(namingStyle);
        if (useUnicode) {
            return JSON.toJSONString(obj, config, SerializerFeature.BrowserCompatible,
                    SerializerFeature.WriteNullListAsEmpty, SerializerFeature.NotWriteDefaultValue);
        }
        return JSON.toJSONString(obj, config);
    }

    /**
     * 将指定java对象序列化成相应字符串<br>
     * (默认：使用unicode编码（当有中文字段时）)
     * 
     * @param obj
     *            java对象
     * @param namingStyle
     *            命名风格
     * @return 序列化后的json字符串
     * @author Zhanghongdong
     */
    public static String encodeAsString(Object obj, NamingStyle namingStyle) {
        return encodeAsString(obj, namingStyle, true);
    }

    /**
     * 将指定java对象序列化成相应字符串<br>
     * (默认：使用NamingStyle.CAMEL命名风格)
     * 
     * @param obj
     *            java对象
     * @param useUnicode
     *            是否使用unicode编码（当有中文字段时）
     * @return 序列化后的json字符串
     * @author Zhanghongdong
     */
    public static String encodeAsString(Object obj, boolean useUnicode) {
        return encodeAsString(obj, NamingStyle.CAMEL, useUnicode);
    }

    /**
     * 将指定java对象序列化成相应字符串<br>
     * (默认：使用unicode编码（当有中文字段时）;使用NamingStyle.CAMEL命名风格)
     * 
     * @param obj
     *            java对象
     * @return 序列化后的json字符串
     * @author Zhanghongdong
     */
    public static String encodeAsString(Object obj) {
        return encodeAsString(obj, NamingStyle.CAMEL, true);
    }

    private static SerializeConfig configNamingStrategy(SerializeConfig config, NamingStyle namingStyle) {
        switch (namingStyle) {
        case CAMEL:
            config.propertyNamingStrategy = com.alibaba.fastjson.PropertyNamingStrategy.CamelCase;
            return config;
        case SNAKE:
            config.propertyNamingStrategy = com.alibaba.fastjson.PropertyNamingStrategy.SnakeCase;
            return config;
        case PASCAL:
            config.propertyNamingStrategy = com.alibaba.fastjson.PropertyNamingStrategy.PascalCase;
            return config;
        case KEBAB:
            config.propertyNamingStrategy = com.alibaba.fastjson.PropertyNamingStrategy.KebabCase;
            return config;
        default:
            config.propertyNamingStrategy = com.alibaba.fastjson.PropertyNamingStrategy.CamelCase;
            return config;
        }
    }
}
