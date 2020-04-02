package cn.itcast06;

import java.util.Date;

public class ThreadStop extends Thread{
	public void run(){
		System.out.println("开始执行："+new Date());
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("线程中止10秒");
		}
		System.out.println("执行结束："+new Date());
	}
}
