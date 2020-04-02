package cn.itcast03;
/*
 * 面试题：
 * 单利模式的思想是什么?举例代码实现
 * 	开发：饿汉式（不会出问题单例模式）
 * 	面试：懒汉式（可能会出问题的单例模式）
 * 		A:懒加载（延迟加载）
 * 		B:线程安全问题
 * 			a:是否多线程问题	是
 * 			b:是否有共享数据	是
 * 			c:是都有多条语句操作共享数据	是
 * 
 * */
public class Teacher {
	private Teacher(){};
	private static Teacher t =null;
	
	public synchronized static Teacher getTeacher(){
		//t1、t2、t3
		if(t==null){
			t = new Teacher();
		}
		return t;
	}
}
