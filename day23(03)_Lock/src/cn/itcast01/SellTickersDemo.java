package cn.itcast01;

import java.util.concurrent.locks.ReentrantLock;

/*
 * jDK5�е�����
 * Lock:
 * 	void lock():��ȡ��
 * 	void unlock():�ͷ���
 * 	ReentrantLock():����ʵ����
 * */
public class SellTickersDemo {

	public static void main(String[] args) {
		SellTickers st = new SellTickers();
		Thread t1 = new Thread(st,"����һ");
		Thread t2 = new Thread(st,"���ڶ�");
		Thread t3 = new Thread(st,"������");
		
		t1.start();
		t2.start();
		t3.start();
	}

}
