package cn.itcast06;
/*
 * public final void stop():让线程停止，过时了，但是还可以使用。
 * public void interrupt():中断线程,把现成的状态中止，并抛出一个InterruptIoEx
 * */
public class ThreadStopDemo {

	public static void main(String[] args) {
		ThreadStop ts1 = new ThreadStop();
		ts1.setName("线程1");
		ts1.start();
		//如果超过三妙我就干死他
		try {
			Thread.sleep(3000);
//			ts1.stop();
			ts1.interrupt();
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
	}

}
