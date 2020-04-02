package cn.itcast02;
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
 * 
 * 
 * �����̵߳ĵ����з�����ʵ��callable�ӿ�
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
