package cn.itcast06;
/*
 * public final void stop():���߳�ֹͣ����ʱ�ˣ����ǻ�����ʹ�á�
 * public void interrupt():�ж��߳�,���ֳɵ�״̬��ֹ�����׳�һ��InterruptIoEx
 * */
public class ThreadStopDemo {

	public static void main(String[] args) {
		ThreadStop ts1 = new ThreadStop();
		ts1.setName("�߳�1");
		ts1.start();
		//������������Ҿ͸�����
		try {
			Thread.sleep(3000);
//			ts1.stop();
			ts1.interrupt();
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
	}

}
