package cn.itcast;
/*
 * public final void getName():��ȡ�̵߳�����
 * public final void setName():�����߳�����
 * */
public class MyThreadDemo01 {

	public static void main(String[] args) {
//		MyThread mt1 = new MyThread();
//		MyThread mt2 = new MyThread();
//		mt1.setName("�޼���");
//		mt2.setName("����");
//		mt1.start();
//		mt2.start();
		System.out.println(Thread.currentThread().getName());
	}

}
