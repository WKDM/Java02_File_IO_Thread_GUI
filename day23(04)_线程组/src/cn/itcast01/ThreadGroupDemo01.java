package cn.itcast01;
/*
 * 线程组：把多个线程组合在一起
 * 他可以对一批线程进行管理，java允许直接对线程组进行控制* 
 * 
 * */
public class ThreadGroupDemo01 {
	public static void main(String[] args) {
//		method1();
//		我们如何修改现成的组呢？
//		创建一个线程组
//		创建其他线程的时候，把其他线程的组跟改为我们新建的线程组
		
		method2();
		
		
//		t1.start();
//		t2.start();
	}

	private static void method2() {
//		ThreadGroup(String name)
		ThreadGroup tg1 = new ThreadGroup("Group1");
		MyRunnable mr = new MyRunnable();
		Thread t1 = new Thread(tg1,mr,"王语嫣");
		Thread t2 = new Thread(tg1,mr,"王起");
		System.out.println(t1.getThreadGroup().getName());
		System.out.println(t2.getThreadGroup().getName());
		t1.setDaemon(true);
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		
	}

	private static void method1() {
		MyRunnable mr = new MyRunnable();
		Thread t1 = new Thread(mr,"王语嫣");
		Thread t2 = new Thread(mr,"王语琪");
		
//		获取线程组
//		线程类里的方法：public final ThreadGroup getThreadGroup()
		ThreadGroup tg1 =t1.getThreadGroup();
		ThreadGroup tg2 = t2.getThreadGroup();
//		获取线程组的名字public final String getName()
		String name1 = tg1.getName();
		String name2 = tg2.getName();
		System.out.println(name1);
		System.out.println(name2);
//		线程默认情况下组名为main
		System.out.println(Thread.currentThread().getThreadGroup().getName());
	}
		
}
