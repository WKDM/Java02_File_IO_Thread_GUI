package cn.itcast03;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class ReflectDemo {

	public static void main(String[] args) throws Exception {
		//获取字节码文件对象
		Class c = Class.forName("cn.itcast01.Person");
		//获取所有的成员变量
//		(只能获取公共成员)
//		Field[] fields = c.getFields();
//		(获取所有的变量)
//		Field[] fields = c.getDeclaredFields();
//		for(Field field:fields){
//			System.out.println(field);
//		}
		
		/*
		 * Person p =new Person()
		 * p.address("北京");
		 * System.out.println(p)
		 * */
		
//		通过无参构造创建对象
		Constructor conn = c.getConstructor();
		Object obj = conn.newInstance();
		System.out.println(obj);
		//获取单个成员变量
		//获取地址
		Field fieldAddress = c.getField("address");
//		public void set(Object obj,Object value)
		fieldAddress.set(obj, "北京");
		System.out.println(obj);
		Field fieldName = c.getField("name");
		fieldName.set(obj, "网名");
		
	}

}
