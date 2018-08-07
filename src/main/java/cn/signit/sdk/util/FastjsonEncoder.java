package cn.signit.sdk.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.PropertyNamingStrategy;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;

import cn.signit.sdk.type.NamingStyle;

public final class FastjsonEncoder{
	
	/**
	* 将指定java对象序列化成相应字符串
	*@param obj java对象
	*@param namingStyle 命名风格
	*@param useUnicode 是否使用unicode编码（当有中文字段时）
	*@return 序列化后的json字符串
	*@author Zhanghongdong
	*/
	public static String encodeAsString(Object obj,NamingStyle namingStyle,boolean useUnicode){
		SerializeConfig config = SerializeConfig.getGlobalInstance();
		config.propertyNamingStrategy = getNamingStrategy(namingStyle);
		if(useUnicode){
			return JSON.toJSONString(obj,config,
							SerializerFeature.BrowserCompatible,
							SerializerFeature.WriteNullListAsEmpty,
							SerializerFeature.NotWriteDefaultValue
							);
		}
		return JSON.toJSONString(obj,config);
	}
	
	/**
	* 将指定java对象序列化成相应字符串<br>
	* (默认：使用unicode编码（当有中文字段时）)
	*@param obj java对象
	*@param namingStyle 命名风格
	*@return 序列化后的json字符串
	*@author Zhanghongdong
	*/
	public static String encodeAsString(Object obj,NamingStyle namingStyle){
		return encodeAsString(obj, namingStyle, true);
	}
	
	/**
	* 将指定java对象序列化成相应字符串<br>
	* (默认：使用NamingStyle.CAMEL命名风格)
	*@param obj java对象
	*@param useUnicode 是否使用unicode编码（当有中文字段时）
	*@return 序列化后的json字符串
	*@author Zhanghongdong
	*/
	public static String encodeAsString(Object obj,boolean useUnicode){
		return encodeAsString(obj, NamingStyle.CAMEL, useUnicode);
	}
	
	/**
	* 将指定java对象序列化成相应字符串<br>
	* (默认：使用unicode编码（当有中文字段时）;使用NamingStyle.CAMEL命名风格)
	*@param obj java对象
	*@return 序列化后的json字符串
	*@author Zhanghongdong
	*/
	public static String encodeAsString(Object obj){
		return encodeAsString(obj, NamingStyle.CAMEL, true);
	}
	
	private static PropertyNamingStrategy getNamingStrategy(NamingStyle namingStyle){
		switch (namingStyle) {
		case CAMEL:
			return PropertyNamingStrategy.CamelCase;
		case SNAKE:
			return PropertyNamingStrategy.SnakeCase;
		case PASCAL:
			return PropertyNamingStrategy.PascalCase;
		case KEBAB:
			return PropertyNamingStrategy.KebabCase;
		default:
			return PropertyNamingStrategy.CamelCase;
		}
	}
}
