package cn.itcast08;
/*
 * 某电影院通过三个窗口出售电影票，总共有100张电影票
 * */
public class SellTickerDemo {

	public static void main(String[] args) {
		SellTicker st1 = new SellTicker();
		SellTicker st2 = new SellTicker();
		SellTicker st3 = new SellTicker();
		st1.setName("窗口1");
		st2.setName("窗口2");
		st3.setName("窗口3");
		st1.start();
		st2.start();
		st3.start();
	}

}
