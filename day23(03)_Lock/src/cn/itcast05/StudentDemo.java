package cn.itcast05;



/*
 * ���������ߣ�������ģʽ
 * ������
 * 		��Դ�ࣺStudent
 * 		����ѧ�����ݣ�setThread(������)
 * 		��ȡѧ�����ݣ�getThread�������ߣ�
 * 		�����ࣺStudentDemo
 * 
 * 
 * ����1:	��������ÿ�ζ���null---0
 * ԭ��1������ÿ���߳��ж�������һ����Դ��������Ҫ���ʱ�����úͻ�ȡ����ԴӦ����ͬһ��
 * ���ʵ���أ�
 * 		������������ݴ���������ͨ�����췽�����ݸ���������
 * 
 * 
 * ���ʵ�ֵȴ����ѻ���
 * 	Object�����ṩ�����ַ�����
 * 		wait:�̵߳ȴ�
 * 		notify:���ѵ����߳�
 * 		notifyAll:���������߳�
 * ��Щ����Ϊʲô��������Thread�������أ�
 * 	
 * 		
 * */
public class StudentDemo {

	public static void main(String[] args) {
		Student s = new Student();
		//
		GetThread gt = new GetThread(s);
		SetThread st = new SetThread(s);
		 
		Thread t1 = new Thread(st);
		Thread t2 = new Thread(gt);
		
		t1.start();
		t2.start();
	}

}
