package cn.itcast02;

import java.lang.reflect.Constructor;

import org.omg.CORBA.PUBLIC_MEMBER;

public class ReflectDemo {

	public static void main(String[] args) throws Exception {
		//��ȡ�ֽ������
		Class c = Class.forName("cn.itcast01.Person");
		//��ȡ���췽��
//		public Constructor[] constructors()
		//ֻ�ܿ�public�Ĺ���
//		Constructor[] cons = c.getConstructors();
//		Constructor[] cons = c.getDeclaredConstructors();
//		for(Constructor con:cons){
//			System.out.println(con);
//		}	
		
		//��ȡ�������췽��
//		public Constructor<> getConstructor(<Class����>)
		Constructor con = c.getConstructor();
		Object obj = con.newInstance();
		
		System.out.println(obj);
	}

}
