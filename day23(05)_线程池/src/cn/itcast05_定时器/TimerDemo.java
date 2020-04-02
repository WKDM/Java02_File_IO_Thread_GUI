package cn.itcast05_定时器;

import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;

/*
 * 定时器：可以让我们在指定的时间做某个事情，还可以重复的做某件事情
 * 依赖：Timer和TimerTask两个类
 * 
 * Timer:定时器
 * 		public Timer():
 * 		public void schedule(TimerTask task,long delay):
 * 		public void schedule(TimerTask task,long delay,long period):
 * 		public void cancel():执行终止
 * TimerTask:任务类
 * */
public class TimerDemo {

	public static void main(String[] args) {
//		创建一个定时器对象
		Timer t = new Timer();
//		3秒后执行爆炸任务
//		t.schedule(new MyTask(), 3000);
		t.schedule(new MyTask(t), 3000);

	}

}
class MyTask extends TimerTask{
	private Timer t;
	public MyTask() {
		
	}
	public MyTask(Timer t){
		this.t = t;
	}
	@Override
	public void run() {
		System.out.println("嘣，爆炸了");
		t.cancel();
	}
	
}
