package cn.itcast02;



/*
 * 需求：生产者，消费者模式
 * 分析：
 * 		资源类：Student
 * 		设置学生数据：setThread(生产者)
 * 		获取学生数据：getThread（消费者）
 * 		测试类：StudentDemo
 * 
 * 
 * 问题1:	发现数据每次都是null---0
 * 原因1：我们每个线程中都创建了一个资源，而我们要求的时候设置和获取的资源应该是同一个
 * 如何实现呢？
 * 		在外界把这个数据创建出来，通过构造方法传递给其他的类
 * 
 * 
 * 如何实现等待唤醒机制
 * 	Object类中提供了三种方法：
 * 		wait:线程等待
 * 		notify:唤醒单个线程
 * 		notifyAll:唤醒所有线程
 * 这些方法为什么不定义在Thread方法中呢？
 * 
 * 
 * 最终版：
 * 在student中把成员变量给私有了的
 * 把设置和获取封装成功能，并加了同步
 * 设置或获取里面只需要调用方法即可
 * 
 * 	
 * 		
 * */
public class StudentDemo {

	public static void main(String[] args) {
		Student s = new Student();
		//
		GetThread gt = new GetThread(s);
		SetThread st = new SetThread(s);
		 
		Thread t1 = new Thread(st);
		Thread t2 = new Thread(gt);
		
		t1.start();
		t2.start();
	}

}
