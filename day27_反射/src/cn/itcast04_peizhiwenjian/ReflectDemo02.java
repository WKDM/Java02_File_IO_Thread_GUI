package cn.itcast04_peizhiwenjian;

import java.beans.MethodDescriptor;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;

/*
 * ���Ǹ�һ��ArrayList<Integer>��һ������,����������������ｨһ���ַ�������
 * */
public class ReflectDemo02 {

	public static void main(String[] args) throws Exception {
		ArrayList<Integer> array = new ArrayList<Integer>();
		
//		array.add("Hello");
//		array.add(100);
		
		Class c = array.getClass();
		Method m = c.getMethod("add",Object.class);
		m.invoke(array, "hello"); //����array��add����
		System.out.println(array);

	}

}
