package cn.itcast05;
/*
 * public static void daemon(boolean b):�����̱߳��Ϊ�ػ��̻߳��û��̡߳�
 * ���������е��̶߳����ػ��߳�ʱ��java������˳����÷��������������߳�ǰ����
 * */
public class ThreadDaemoDemo {
	public static void main(String[] args) {
		ThreadDaemo td1 = new ThreadDaemo();
		ThreadDaemo td2 = new ThreadDaemo();
		
		td1.setName("�ŷ�");
		td2.setName("����");
		
		//�����ջ��߳�
		td1.setDaemon(true);
		td2.setDaemon(true);
		
		td1.start();
		td2.start();
		Thread.currentThread().setName("����");
		for(int i=0;i<5;i++){
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
		
	}
}
