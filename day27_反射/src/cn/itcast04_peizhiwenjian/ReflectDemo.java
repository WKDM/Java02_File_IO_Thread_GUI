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
 * ͨ�������ļ��������еķ���
 * 
 * ���䣺
 * 	��Ҫ�������ļ����ʹ��
 * 	��class.txt����
 * 	����֪����������
 * 		className
 * 		methodName
 * 
 * 
 * 
 * */
public class ReflectDemo {

	public static void main(String[] args) throws Exception {
		//����ǰ
//		Student s1 = new Student();
//		s1.love();
//		Teacher t1 = new Teacher();
//		t1.love();
		//�����
//		���ؼ�ֵ������
		Properties prop = new Properties();
		FileReader fr = new FileReader("class.txt");
		prop.load(fr);
		
		//��ȡ����
		String className = prop.getProperty("className");
		String methodName = prop.getProperty("methodName");
		
		
		//����
		Class c = Class.forName(className);
		Constructor con = c.getConstructor();
		Object obj = con.newInstance();
		
		//���÷���
		Method m = c.getMethod(methodName);
		m.invoke(obj);
	}

}
