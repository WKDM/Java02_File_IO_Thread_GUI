package cn.itcast09;

import java.util.*;
import java.util.Set;

import org.omg.PortableServer.POA;

/*
 * ���й��ܣ�
 * 	public Object setProperties(String key,String value):���Ԫ��
 * 	public String getProperty(String key):��ȡԪ��
 *  public String stringPropertyName():��ȡ���ļ���
 * 	
 * */
public class PropertiesDemo02 {

	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.setProperty("it1", "����");
		prop.setProperty("it2","java");
		prop.setProperty("it3", "����");
		Set<String> set = prop.stringPropertyNames();		
		for(String key:set){
			System.out.println(key+"***"+prop.getProperty(key));
		}
		
	}

}
