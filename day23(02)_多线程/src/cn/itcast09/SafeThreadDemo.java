package cn.itcast09;
/*
 * �̰߳�ȫ���⣺
 * A:�Ƿ�Ϊ���̻߳�����
 * B:�Ƿ��й�������
 * C:�Ƿ��ж����������������ݣ�
 * 
 * ������˼��
 * 	�Ѷ����������������ݵĴ��������һ�����壬��ĳ���߳���ִ�е�ʱ�򣬱��˲���ִ��
 * ��ô�������أ�
 * 	ͬ������
 * ͬ������飺
 * 		synchronized(����){
 * 			��Ҫͬ���Ĵ���
 * 		}
 * 		A:������ʲô�أ�
 * 
 * 		B:��Ҫ�Ĵ�����ʲô��
 * 	
 * */
public class SafeThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SafeThread st = new SafeThread();
		Thread t1 = new Thread(st,"����1");
		Thread t2 = new Thread(st,"����2");
		Thread t3 = new Thread(st,"����3");
		t1.start();
		t2.start();
		t3.start();
	}

}
