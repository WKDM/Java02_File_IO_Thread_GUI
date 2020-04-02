package cn.itcast03;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectDemo02 {

	public static void main(String[] args) throws Exception {
		//��ȡ�ֽ������ 
		Class c = Class.forName("cn.itcast01.Person");
		
		//��ȡ���췽��
		Constructor con = c.getConstructor();
		//��������
		Object obj = con.newInstance();
		
		
		Method m1 = c.getMethod("show");
		m1.invoke(obj);
		System.out.println(obj);
		
		Method m2 =c.getMethod("method",String.class);
		m2.invoke(obj, "�޼���");
		System.out.println(obj);
		
		Method m3 = c.getMethod("getString", String.class,int.class);
		Object object = m3.invoke(obj, "����",23);
		System.out.println(object);
		
		//����˽�еķ���
		Method m4 = c.getDeclaredMethod("function");
		m4.setAccessible(true);
		m4.invoke(obj);
		System.out.println(obj);
		
		

	}

}
