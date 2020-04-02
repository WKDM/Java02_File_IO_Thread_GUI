package cn.itcast09;

public class SafeThread implements Runnable {
	private int tickers = 100;
	private Object obj = new Object();
	// 创建锁对象
	@Override
	public void run() {
		while (true) {
			synchronized (obj) {
				if (tickers > 0) {
					/*
					 * 休眠10秒
					 */
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						System.out.println("休息1秒");
					}
					System.out.println(Thread.currentThread().getName() + "正在出售第" + (tickers--) + "张票");
				}
			}
		}

	}

}
