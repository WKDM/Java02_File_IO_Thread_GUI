package cn.itcast03;

public class Student {
	//构造私有方法
	private Student(){};
	
	//创建对象
	//静态方法只能访问静态成员变量
	//为了不让外界直接访问修改变量值，加private
	private static Student s = new Student();
	
	//提供公共类让外界访问
	//为了保证外界能够直接调用方法，所以应该是静态方法
	public static Student getStudent(){
		return s;
	}
}
