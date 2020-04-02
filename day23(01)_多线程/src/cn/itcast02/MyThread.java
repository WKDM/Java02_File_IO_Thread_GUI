package cn.itcast02;
/*
 * 为什么要重写run()方法呢？
 * 不是所得代码都需要被线程执行的，
 * 而这个时候为了区分那些代码要线程执行，java就提供了Thread类中的run方法进行线程执行
 * */
public class MyThread extends Thread{

	public void run(){
		//System.out.println("好好学习天天向上");
		//一般来说被线程执行的都是耗时的程序
		for(int x=0;x<100;x++){
			System.out.println(x);
		}
	}

}
