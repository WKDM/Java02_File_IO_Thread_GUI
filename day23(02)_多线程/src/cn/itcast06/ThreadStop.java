package cn.itcast06;

import java.util.Date;

public class ThreadStop extends Thread{
	public void run(){
		System.out.println("��ʼִ�У�"+new Date());
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("�߳���ֹ10��");
		}
		System.out.println("ִ�н�����"+new Date());
	}
}
