package cn.itcast01;

import java.util.concurrent.locks.ReentrantLock;

/*
 * jDK5中的锁：
 * Lock:
 * 	void lock():获取锁
 * 	void unlock():释放锁
 * 	ReentrantLock():锁的实现类
 * */
public class SellTickersDemo {

	public static void main(String[] args) {
		SellTickers st = new SellTickers();
		Thread t1 = new Thread(st,"窗口一");
		Thread t2 = new Thread(st,"窗口二");
		Thread t3 = new Thread(st,"窗口三");
		
		t1.start();
		t2.start();
		t3.start();
	}

}
