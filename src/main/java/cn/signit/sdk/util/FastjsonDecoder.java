package cn.signit.sdk.util;

import java.util.Map;

import com.alibaba.fastjson.JSON;

public final class FastjsonDecoder {
	
	/**
	* 反序列化JSON字符串到指定的java对象
	*@param jsonStr JSON字符串
	*@return java对象
	*@since 0.0.2
	*@author Zhanghongdong
	*/
	public static Object decode(String jsonStr){
		return JSON.parse(jsonStr);
	}
	
	/**
	* 反序列化JSON字符串到指定的java bean对象
	*@param jsonStr JSON字符串
	*@param objectClass java bean对象字节码对象
	*@param <T> 泛型参数
	*@return java bean对象
	*@since 0.0.2
	*@author Zhanghongdong
	*/
	@SuppressWarnings("unchecked")
	public static <T> T decodeAsBean(String jsonStr,Class<?> objectClass){
		return (T) JSON.parseObject(jsonStr, objectClass);
	}
	
	/**
	* 反序列化JSON字符串到指定的java Map集合对象
	*@param jsonStr JSON字符串
	*@return java Map集合对象
	*@since 0.0.2
	*@author Zhanghongdong
	*/
	public static Map<String, Object> decodeAsMap(String jsonStr){
		return JSON.parseObject(jsonStr);
	}
}
