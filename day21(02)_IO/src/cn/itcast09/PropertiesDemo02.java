package cn.itcast09;

import java.util.*;
import java.util.Set;

import org.omg.PortableServer.POA;

/*
 * 特有功能：
 * 	public Object setProperties(String key,String value):添加元素
 * 	public String getProperty(String key):获取元素
 *  public String stringPropertyName():获取键的集合
 * 	
 * */
public class PropertiesDemo02 {

	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.setProperty("it1", "您好");
		prop.setProperty("it2","java");
		prop.setProperty("it3", "世界");
		Set<String> set = prop.stringPropertyNames();		
		for(String key:set){
			System.out.println(key+"***"+prop.getProperty(key));
		}
		
	}

}
