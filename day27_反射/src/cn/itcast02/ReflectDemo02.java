package cn.itcast02;

import java.lang.reflect.Constructor;

/*
 * 需求：通过反射去获取该构造方法并使用
 * 
 * Person p = new Person("罗家峪",23,"石嘴山")
 * system/.out.print(p);
 * 
 * 
 * 
 * 
 * */
public class ReflectDemo02 {

	public static void main(String[] args) throws Exception {
		//获取字节码文件对象
		Class c = Class.forName("cn.itcast01.Person");
		
		//获取带参构造方法
		Constructor con = c.getConstructor(String.class,int.class,String.class);
		
		//通过带参构造方法创建对象
		Object obj = con.newInstance("罗佳玉",23,"石嘴山");
		System.out.println(obj);
	}

}
