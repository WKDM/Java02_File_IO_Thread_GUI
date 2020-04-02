package cn.itcast01;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SellTickers implements Runnable{
	private int ticker = 100;
	private Lock lock = new ReentrantLock();
	@Override	
	public void run() {
		while(true){
			//获取锁
			try {
				lock.lock();
				if(ticker>0){
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+"正在出售第"+(ticker--)+"张票");
				}
				
			} finally {
				//释放锁
				lock.unlock();
			}		
			
		}
	}
}
