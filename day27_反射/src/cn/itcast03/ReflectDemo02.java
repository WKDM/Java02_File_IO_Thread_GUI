package cn.itcast03;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectDemo02 {

	public static void main(String[] args) throws Exception {
		//获取字节码对象 
		Class c = Class.forName("cn.itcast01.Person");
		
		//获取构造方法
		Constructor con = c.getConstructor();
		//创建对象
		Object obj = con.newInstance();
		
		
		Method m1 = c.getMethod("show");
		m1.invoke(obj);
		System.out.println(obj);
		
		Method m2 =c.getMethod("method",String.class);
		m2.invoke(obj, "罗家峪");
		System.out.println(obj);
		
		Method m3 = c.getMethod("getString", String.class,int.class);
		Object object = m3.invoke(obj, "王珂",23);
		System.out.println(object);
		
		//调用私有的方法
		Method m4 = c.getDeclaredMethod("function");
		m4.setAccessible(true);
		m4.invoke(obj);
		System.out.println(obj);
		
		

	}

}
