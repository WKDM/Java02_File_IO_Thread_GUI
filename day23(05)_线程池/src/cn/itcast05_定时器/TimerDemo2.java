package cn.itcast05_��ʱ��;

import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;

/*
 * ��ʱ����������������ָ����ʱ����ĳ�����飬�������ظ�����ĳ������
 * ������Timer��TimerTask������
 * 
 * Timer:��ʱ��
 * 		public Timer():
 * 		public void schedule(TimerTask task,long delay):
 * 		public void schedule(TimerTask task,long delay,long period):
 * 		public void cancel():ִ����ֹ
 * TimerTask:������
 * */
public class TimerDemo2 {

	public static void main(String[] args) {
//		����һ����ʱ������
		Timer t = new Timer();
//		3���ִ�б�ը����,������ɹ�2����ں�ըһ��
		t.schedule(new MyTask2(),3000,200);
		
	}

}
class MyTask2 extends TimerTask{
	
	@Override
	public void run() {
		System.out.println("�ԣ���ը��");		
	}
	
}
