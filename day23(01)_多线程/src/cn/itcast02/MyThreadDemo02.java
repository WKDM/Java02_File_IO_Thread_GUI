package cn.itcast02;

import javax.xml.ws.soap.MTOM;

public class MyThreadDemo02 {
/*
 * 需求：我们要实现多线程的程序
 * 如何实现呢？
 * 由于线程是依据进程存在的，所以我们应该先穿件一个进程出来。
 * 而进程是由线程创建的，所以我们应该去调用系统功能创建一个进程
 * java是不能直接调用系统功能的，所以，我们没有办法直接实现多线程程序。
 * 但是呢？java可以去调用c/c++写好的程序来实现多线程程序。
 * 由C/C++去调用系统功能创建进程，然后由java去调用这样的东西，然后提供一些类供我们就可以实现多线程程序了。
 * 
 * 那么java类提供了什么呢？
 * Thread
 * 通过API，我们发现有两张方式
 * 
 * 方法一：继承Thread类
 * 
 * 	步骤：A:定义MyThread类为Thread的子类
 * 		B:MyThread里面重写run()方法
 * 		C:创建对象
 * 		D:启动线程
 * */
	//创建线程
	public static void main(String[] args) {
//		MyThread mt = new MyThread();
//		mt.run();
//		mt.run();
//		mt.run();
		
		/*
		 * 调用run()方法为什么启动单线程
		 * 因为run()方法直接调用其实就相当于普通的方法调用，所以你看到的就是单线程的结果。
		 * 要想看到多线程的效果，就必须说说另一个方法：start()
		 * 面试题：run()和start()的区别？
		 * 	run():仅仅是封装被线程执行的代码，直接调用是普通方法
		 * 	start():首先启动了线程，然后再由JVM去调用该线程的run()
		 * 	
		 * */
		
//		MyThread mt = new MyThread();
//		mt.start();
//		mt.start();
//		//java.lang.IllegalThreadStateException
		MyThread mt1 = new MyThread();
		MyThread mt2 = new MyThread();
		mt1.start();
		mt2.start();
	}
}
