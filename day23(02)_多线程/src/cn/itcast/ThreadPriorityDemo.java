package cn.itcast;
/*
 * 线程拥有默认的优先级？那么优先级是什么呢？
 * 优先级为：5
 * 	级别：1-10；
 * 
 * 如何获取线程的优先级呢？public final void getPriority():返回线程对象的优先级
 * 如何设置线程的优先级呢？public final void setPriority(int newPriority):更改现成的优先级
 * */
public class ThreadPriorityDemo {
	public static void main(String[] args) {
		MyThread mt1 =new MyThread();
		MyThread mt2 =new MyThread();
		MyThread mt3 =new MyThread();
		mt1.setName("王可");
		mt2.setName("罗家峪");
		mt3.setName("拔萝卜");
		mt3.setPriority(1);;
		mt1.setPriority(10);
//		System.out.println(mt1.getPriority());
//		System.out.println(mt2.getPriority());
//		System.out.println(mt3.getPriority());
		mt1.start();
		mt2.start();
		mt3.start();
	}
	
}
