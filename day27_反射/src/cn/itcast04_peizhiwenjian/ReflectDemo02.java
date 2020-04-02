package cn.itcast04_peizhiwenjian;

import java.beans.MethodDescriptor;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;

/*
 * 我们给一个ArrayList<Integer>的一个对象,我想在这个集合中田建一个字符串对象
 * */
public class ReflectDemo02 {

	public static void main(String[] args) throws Exception {
		ArrayList<Integer> array = new ArrayList<Integer>();
		
//		array.add("Hello");
//		array.add(100);
		
		Class c = array.getClass();
		Method m = c.getMethod("add",Object.class);
		m.invoke(array, "hello"); //调用array的add方法
		System.out.println(array);

	}

}
