package cn.itcast05;
/*
 * public static void daemon(boolean b):将该线程标记为守护线程或用户线程。
 * 当正在运行的线程都是守护线程时，java虚拟机退出，该方法必须在启动线程前调用
 * */
public class ThreadDaemoDemo {
	public static void main(String[] args) {
		ThreadDaemo td1 = new ThreadDaemo();
		ThreadDaemo td2 = new ThreadDaemo();
		
		td1.setName("张飞");
		td2.setName("关羽");
		
		//设置收获线程
		td1.setDaemon(true);
		td2.setDaemon(true);
		
		td1.start();
		td2.start();
		Thread.currentThread().setName("刘备");
		for(int i=0;i<5;i++){
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
		
	}
}
