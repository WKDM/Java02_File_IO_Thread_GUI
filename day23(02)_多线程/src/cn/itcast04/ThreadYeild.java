package cn.itcast04;

public class ThreadYeild extends Thread{
	public  void run(){
		for(int x=0;x<100;x++){
			System.out.println(getName()+":"+x);
			Thread.yield();
		}
	}
}
