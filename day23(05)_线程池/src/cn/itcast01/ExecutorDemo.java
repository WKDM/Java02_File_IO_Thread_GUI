package cn.itcast01;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

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
 * */
public class ExecutorDemo {

	public static void main(String[] args) {
//		A:创建一个线程池对象，控制要创建几个线程
//		 public static ExecutorService new FixedThreadPool(int nThread)
		ExecutorService pool = Executors.newFixedThreadPool(2);
//		可以执行Runnable或者Callable对象代理的线程。
		pool.submit(new MyRunnable());
		pool.submit(new MyRunnable());
//		结束线程池
		pool.shutdown();
	}

}
