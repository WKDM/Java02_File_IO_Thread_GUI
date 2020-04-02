package cn.itcast04_匿名多线程;
/*
 * 匿名类的格式：
 * 	new 匿名类名或接口名(){
 * 		重写方法
 * 	}
 * 本质：
 * 	是该类或子类的对象
 * */
public class ThreadDemo {
	public static void main(String[] args) {
		//继承Thread实现多线程
		new Thread(){
			public void run() {
				for(int x=0;x<10;x++){
					System.out.println(Thread.currentThread().getName()+":"+x);
				}
			};
		}.start();
		//实现接口Runable实现多线程
		new Thread(new Runnable(){
			public void run(){
				for(int x=0;x<10;x++){
					System.out.println("Hello"+":"+x);
				}
			};
		}){
			public void run(){
				for(int x=0;x<10;x++){
					System.out.println("world"+":"+x);
				}
			};
		}.start();
	}
}
