package cn.itcast3;

public class ThreadJoin extends Thread {
	public void run(){
		for (int i = 0; i < 10; i++) {
			System.out.println(getName()+":"+i);
		}
	}
}
