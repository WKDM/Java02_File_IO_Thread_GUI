package cn.itcast07;
/*
 * ʵ��Runable()�ӿڣ�
 * A:�Զ���MyRunnable()�࣬ʵ��Runnable�ӿ�
 * B:��дrun()����
 * C:����MyRunnable()����
 * D:����Thread��ķ���������C����������
 * */
public class MyThreadRunableDemo {

	public static void main(String[] args) {
		MyRunnable my = new MyRunnable();
//		 Thread t1 = new Thread(my);
//		 Thread t2 = new Thread(my);
//		 t1.setName("���");
//		 t2.setName("��ΰ��");
//		 t1.start();
//		 t2.start();
		
		 Thread t3 = new Thread(my,"������");
		 Thread t4 = new Thread(my,"������");
		 t3.start();
		 t4.start();
		 
		 
		 
	}

}
