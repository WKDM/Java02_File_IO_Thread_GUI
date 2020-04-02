package cn.itcast08;

public class SellTickers01 implements Runnable {
	private int tickers = 100;
	@Override
	public void run() {
		while(true){
			if(tickers>0){
				System.out.println(Thread.currentThread().getName()+"正在出售第"+(tickers--)+"张票");
			}
		}
	}

}
