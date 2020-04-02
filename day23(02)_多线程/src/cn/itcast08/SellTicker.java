package cn.itcast08;

public class SellTicker extends Thread {
//	每个对象都会调用一次
	//private int tickers= 100;
	private static int tickers = 100;
	public void run() {
//		//放在这里妹创建一个线程对象就会重新调用100
//		int tickers = 100;
		//实现一直有票状态
		while(true){
			if(tickers>0){
				System.out.println(getName()+"正在出售第："+(tickers--)+"张票");
			}
		}
	}
}
