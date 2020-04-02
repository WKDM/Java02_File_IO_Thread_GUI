package cn.itcast04_peizhiwenjian;

import java.awt.event.MouseWheelEvent;
import java.beans.MethodDescriptor;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

/*
 * 通过配置文件进行类中的方法
 * 
 * 反射：
 * 	需要有配置文件配合使用
 * 	用class.txt代替
 * 	并且知道有两个键
 * 		className
 * 		methodName
 * 
 * 
 * 
 * */
public class ReflectDemo {

	public static void main(String[] args) throws Exception {
		//反射前
//		Student s1 = new Student();
//		s1.love();
//		Teacher t1 = new Teacher();
//		t1.love();
		//反射后
//		加载键值对数据
		Properties prop = new Properties();
		FileReader fr = new FileReader("class.txt");
		prop.load(fr);
		
		//获取数据
		String className = prop.getProperty("className");
		String methodName = prop.getProperty("methodName");
		
		
		//反射
		Class c = Class.forName(className);
		Constructor con = c.getConstructor();
		Object obj = con.newInstance();
		
		//调用方法
		Method m = c.getMethod(methodName);
		m.invoke(obj);
	}

}
