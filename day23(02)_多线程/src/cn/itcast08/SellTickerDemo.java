package cn.itcast08;
/*
 * ĳ��ӰԺͨ���������ڳ��۵�ӰƱ���ܹ���100�ŵ�ӰƱ
 * */
public class SellTickerDemo {

	public static void main(String[] args) {
		SellTicker st1 = new SellTicker();
		SellTicker st2 = new SellTicker();
		SellTicker st3 = new SellTicker();
		st1.setName("����1");
		st2.setName("����2");
		st3.setName("����3");
		st1.start();
		st2.start();
		st3.start();
	}

}
