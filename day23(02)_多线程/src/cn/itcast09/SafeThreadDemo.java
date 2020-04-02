package cn.itcast09;
/*
 * 线程安全问题：
 * A:是否为多线程环境？
 * B:是否有共享数据
 * C:是否有多条语句操作共享数据？
 * 
 * 方案：思想
 * 	把多天语句操作共享数据的代码给包成一个整体，让某个线程在执行的时候，别人不能执行
 * 怎么包起来呢？
 * 	同步机制
 * 同步代码块：
 * 		synchronized(对象){
 * 			需要同步的代码
 * 		}
 * 		A:对象是什么呢？
 * 
 * 		B:需要的代码是什么呢
 * 	
 * */
public class SafeThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SafeThread st = new SafeThread();
		Thread t1 = new Thread(st,"窗口1");
		Thread t2 = new Thread(st,"窗口2");
		Thread t3 = new Thread(st,"窗口3");
		t1.start();
		t2.start();
		t3.start();
	}

}
