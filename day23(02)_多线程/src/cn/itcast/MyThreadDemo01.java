package cn.itcast;
/*
 * public final void getName():获取线程的名字
 * public final void setName():设置线程名字
 * */
public class MyThreadDemo01 {

	public static void main(String[] args) {
//		MyThread mt1 = new MyThread();
//		MyThread mt2 = new MyThread();
//		mt1.setName("罗家峪");
//		mt2.setName("王可");
//		mt1.start();
//		mt2.start();
		System.out.println(Thread.currentThread().getName());
	}

}
