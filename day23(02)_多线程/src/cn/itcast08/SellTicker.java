package cn.itcast08;

public class SellTicker extends Thread {
//	ÿ�����󶼻����һ��
	//private int tickers= 100;
	private static int tickers = 100;
	public void run() {
//		//���������ô���һ���̶߳���ͻ����µ���100
//		int tickers = 100;
		//ʵ��һֱ��Ʊ״̬
		while(true){
			if(tickers>0){
				System.out.println(getName()+"���ڳ��۵ڣ�"+(tickers--)+"��Ʊ");
			}
		}
	}
}
