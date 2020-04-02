package cn.itcast02;
/*
 * public static void sleep(long miles){}
 * */
public class ThreadSleepDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread mt0 = new MyThread();
		MyThread mt1 = new MyThread();
		MyThread mt2 = new MyThread();
		mt0.setName("ÍÃ×Ó");
		mt1.setName("Ã¨ßä");
		mt2.setName("¹·×Ó");
		
		mt0.start();
		mt1.start();
		mt2.start();
		
	}

}
