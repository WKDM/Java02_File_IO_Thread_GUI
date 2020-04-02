package cn.itcast01;
/*
 * �߳��飺�Ѷ���߳������һ��
 * �����Զ�һ���߳̽��й���java����ֱ�Ӷ��߳�����п���* 
 * 
 * */
public class ThreadGroupDemo01 {
	public static void main(String[] args) {
//		method1();
//		��������޸��ֳɵ����أ�
//		����һ���߳���
//		���������̵߳�ʱ�򣬰������̵߳������Ϊ�����½����߳���
		
		method2();
		
		
//		t1.start();
//		t2.start();
	}

	private static void method2() {
//		ThreadGroup(String name)
		ThreadGroup tg1 = new ThreadGroup("Group1");
		MyRunnable mr = new MyRunnable();
		Thread t1 = new Thread(tg1,mr,"������");
		Thread t2 = new Thread(tg1,mr,"����");
		System.out.println(t1.getThreadGroup().getName());
		System.out.println(t2.getThreadGroup().getName());
		t1.setDaemon(true);
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		
	}

	private static void method1() {
		MyRunnable mr = new MyRunnable();
		Thread t1 = new Thread(mr,"������");
		Thread t2 = new Thread(mr,"������");
		
//		��ȡ�߳���
//		�߳�����ķ�����public final ThreadGroup getThreadGroup()
		ThreadGroup tg1 =t1.getThreadGroup();
		ThreadGroup tg2 = t2.getThreadGroup();
//		��ȡ�߳��������public final String getName()
		String name1 = tg1.getName();
		String name2 = tg2.getName();
		System.out.println(name1);
		System.out.println(name2);
//		�߳�Ĭ�����������Ϊmain
		System.out.println(Thread.currentThread().getThreadGroup().getName());
	}
		
}
