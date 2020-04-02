package cn.itcast03;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class ReflectDemo {

	public static void main(String[] args) throws Exception {
		//��ȡ�ֽ����ļ�����
		Class c = Class.forName("cn.itcast01.Person");
		//��ȡ���еĳ�Ա����
//		(ֻ�ܻ�ȡ������Ա)
//		Field[] fields = c.getFields();
//		(��ȡ���еı���)
//		Field[] fields = c.getDeclaredFields();
//		for(Field field:fields){
//			System.out.println(field);
//		}
		
		/*
		 * Person p =new Person()
		 * p.address("����");
		 * System.out.println(p)
		 * */
		
//		ͨ���޲ι��촴������
		Constructor conn = c.getConstructor();
		Object obj = conn.newInstance();
		System.out.println(obj);
		//��ȡ������Ա����
		//��ȡ��ַ
		Field fieldAddress = c.getField("address");
//		public void set(Object obj,Object value)
		fieldAddress.set(obj, "����");
		System.out.println(obj);
		Field fieldName = c.getField("name");
		fieldName.set(obj, "����");
		
	}

}
