package cn.itcast03;
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
 * */
public class StudentDemo {

	public static void main(String[] args) {
		Student s = new Student();
		//
		getThread gt = new getThread(s);
		setThread st = new setThread(s);
		
		Thread t1 = new Thread(st);
		Thread t2 = new Thread(gt);
		
		t1.start();
		t2.start();
	}

}
