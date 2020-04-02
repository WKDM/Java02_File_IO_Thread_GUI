package cn.itcast01;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * �̳߳أ�
 * 	�̳߳صĺô����̳߳����ÿһ���̴߳�������󣬶����������������ٴλص��̳߳��д��ڿ���״̬���ȴ���һ��������ʹ��
 * 	��δ����̳߳أ�
 * 		A:����һ���̳߳ض��󣬿���Ҫ���������߳�
 * 			public static ExecutorService new FixedThreadPool(int nThread)
 * 		B:�����̳߳ص��߳̿���ִ�У�
 * 			����ִ��Runnable����Callable���������̡߳�
 * 			��һ����ʵ��Runnable�ӿ�
 * 		C:�������·�������
 * 			Future<?> submit(Runable task)
 * 			<T>Future<T> submit(Callable<T> task)
 * */
public class ExecutorDemo {

	public static void main(String[] args) {
//		A:����һ���̳߳ض��󣬿���Ҫ���������߳�
//		 public static ExecutorService new FixedThreadPool(int nThread)
		ExecutorService pool = Executors.newFixedThreadPool(2);
//		����ִ��Runnable����Callable���������̡߳�
		pool.submit(new MyRunnable());
		pool.submit(new MyRunnable());
//		�����̳߳�
		pool.shutdown();
	}

}
