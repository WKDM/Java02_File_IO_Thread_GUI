package cn.itcast02;

import java.lang.reflect.Constructor;

import org.omg.CORBA.PUBLIC_MEMBER;

public class ReflectDemo {

	public static void main(String[] args) throws Exception {
		//获取字节码对象
		Class c = Class.forName("cn.itcast01.Person");
		//获取构造方法
//		public Constructor[] constructors()
		//只能看public的构造
//		Constructor[] cons = c.getConstructors();
//		Constructor[] cons = c.getDeclaredConstructors();
//		for(Constructor con:cons){
//			System.out.println(con);
//		}	
		
		//获取单个构造方法
//		public Constructor<> getConstructor(<Class……>)
		Constructor con = c.getConstructor();
		Object obj = con.newInstance();
		
		System.out.println(obj);
	}

}
