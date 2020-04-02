package cn.itcast02;
/*
 * 线程池：
 * 	线程池的好处：线程池里的每一个线程代码结束后，都不会死亡，而是再次回到线程池中处于空闲状态，等待先一个对象来使用
 * 	如何创建线程池：
 * 		A:创建一个线程池对象，控制要创建几个线程
 * 			public static ExecutorService new FixedThreadPool(int nThread)
 * 		B:这种线程池的线程可以执行：
 * 			可以执行Runnable或者Callable对象代理的线程。
 * 			做一个类实现Runnable接口
 * 		C:调用如下方法即可
 * 			Future<?> submit(Runable task)
 * 			<T>Future<T> submit(Callable<T> task)
 * 
 * 
 * 创建线程的第三中方法：实现callable接口
 * */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyCallableDemo {
	public static void main(String[] args) {
		ExecutorService pool = Executors.newFixedThreadPool(2);
		pool.submit(new MyCallable());
		pool.submit(new MyCallable());
		pool.shutdown();
	}

}
