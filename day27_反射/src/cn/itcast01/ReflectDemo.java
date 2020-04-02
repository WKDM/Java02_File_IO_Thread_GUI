package cn.itcast01;
/*
 * 反射：就是通过class文件对象，去使用该文件中的成员变量，构造方法，成员方法
 * 
 * Person p = new Person()
 * p.使用
 * 
 * 
 * 获取Class类
 * Class类：
 * 		成员变量：Field
 * 		构造方法：Constructor
 * 		成员方法：Method
 * 
 * Class的获取方法：
 * 		A:Object类的获取方式：getClass()
 * 		B:数据类型的静态属性：class
 * 		C:Class类中的静态方法：
 * 			public static Class forName(String className)
 * 
 * 怎么选择使用呢？
 * 	自己玩：任选一种，第二种比较方便
 * 	开发：第三种，是一个字符串可以直接写到配置文件中
 * */
public class ReflectDemo {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
//		A:Object类的获取方式：getClass()
		Person p = new Person();
		Class c = p.getClass();
		Person p1 = new Person();
		Class c1 = p1.getClass();
		System.out.println(p==p1);
		System.out.println(c==c1);
//		B:数据类型的静态属性：class
		Class c2 = Person.class;
//		int.class;
//		String.class;
		System.out.println(c==c2);
//		C:Class类中的静态方法
		Class c3 = Class.forName("cn.itcast01.Person");
		System.out.println(c==c3);
	}
}
