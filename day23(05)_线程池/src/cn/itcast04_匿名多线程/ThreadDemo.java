package cn.itcast04_�������߳�;
/*
 * ������ĸ�ʽ��
 * 	new ����������ӿ���(){
 * 		��д����
 * 	}
 * ���ʣ�
 * 	�Ǹ��������Ķ���
 * */
public class ThreadDemo {
	public static void main(String[] args) {
		//�̳�Threadʵ�ֶ��߳�
		new Thread(){
			public void run() {
				for(int x=0;x<10;x++){
					System.out.println(Thread.currentThread().getName()+":"+x);
				}
			};
		}.start();
		//ʵ�ֽӿ�Runableʵ�ֶ��߳�
		new Thread(new Runnable(){
			public void run(){
				for(int x=0;x<10;x++){
					System.out.println("Hello"+":"+x);
				}
			};
		}){
			public void run(){
				for(int x=0;x<10;x++){
					System.out.println("world"+":"+x);
				}
			};
		}.start();
	}
}
