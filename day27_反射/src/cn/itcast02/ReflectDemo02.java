package cn.itcast02;

import java.lang.reflect.Constructor;

/*
 * ����ͨ������ȥ��ȡ�ù��췽����ʹ��
 * 
 * Person p = new Person("�޼���",23,"ʯ��ɽ")
 * system/.out.print(p);
 * 
 * 
 * 
 * 
 * */
public class ReflectDemo02 {

	public static void main(String[] args) throws Exception {
		//��ȡ�ֽ����ļ�����
		Class c = Class.forName("cn.itcast01.Person");
		
		//��ȡ���ι��췽��
		Constructor con = c.getConstructor(String.class,int.class,String.class);
		
		//ͨ�����ι��췽����������
		Object obj = con.newInstance("�޼���",23,"ʯ��ɽ");
		System.out.println(obj);
	}

}
