package cn.itcast08;

public class SellTickerDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SellTickers01 st = new SellTickers01();
		Thread t1 = new Thread(st,"����1");
		Thread t2 = new Thread(st,"����2");
		Thread t3 = new Thread(st,"����3");
		t1.start();
		t2.start();
		t3.start();
	}

}
