package cn.itcast02;

import java.util.Date;

public class MyThread extends Thread{
	public void run(){
		for(int x=0;x<10;x++){
			System.out.println(getName() + ":"+x+",���ڣ�"+new Date());
			
			//�߳�˯��
			//˯��1��
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
