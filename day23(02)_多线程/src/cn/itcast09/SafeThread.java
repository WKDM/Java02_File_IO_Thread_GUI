package cn.itcast09;

public class SafeThread implements Runnable {
	private int tickers = 100;
	private Object obj = new Object();
	// ����������
	@Override
	public void run() {
		while (true) {
			synchronized (obj) {
				if (tickers > 0) {
					/*
					 * ����10��
					 */
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						System.out.println("��Ϣ1��");
					}
					System.out.println(Thread.currentThread().getName() + "���ڳ��۵�" + (tickers--) + "��Ʊ");
				}
			}
		}

	}

}
