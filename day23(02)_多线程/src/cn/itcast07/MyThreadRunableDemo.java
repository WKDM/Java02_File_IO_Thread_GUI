package cn.itcast07;
/*
 * 实现Runable()接口：
 * A:自定义MyRunnable()类，实现Runnable接口
 * B:重写run()方法
 * C:创建MyRunnable()对象
 * D:创建Thread类的方法，并把C对象当作参数
 * */
public class MyThreadRunableDemo {

	public static void main(String[] args) {
		MyRunnable my = new MyRunnable();
//		 Thread t1 = new Thread(my);
//		 Thread t2 = new Thread(my);
//		 t1.setName("李飞");
//		 t2.setName("康伟明");
//		 t1.start();
//		 t2.start();
		
		 Thread t3 = new Thread(my,"康可欣");
		 Thread t4 = new Thread(my,"张坤杰");
		 t3.start();
		 t4.start();
		 
		 
		 
	}

}
