package cn.itcast;
/*
 * �߳�ӵ��Ĭ�ϵ����ȼ�����ô���ȼ���ʲô�أ�
 * ���ȼ�Ϊ��5
 * 	����1-10��
 * 
 * ��λ�ȡ�̵߳����ȼ��أ�public final void getPriority():�����̶߳�������ȼ�
 * ��������̵߳����ȼ��أ�public final void setPriority(int newPriority):�����ֳɵ����ȼ�
 * */
public class ThreadPriorityDemo {
	public static void main(String[] args) {
		MyThread mt1 =new MyThread();
		MyThread mt2 =new MyThread();
		MyThread mt3 =new MyThread();
		mt1.setName("����");
		mt2.setName("�޼���");
		mt3.setName("���ܲ�");
		mt3.setPriority(1);;
		mt1.setPriority(10);
//		System.out.println(mt1.getPriority());
//		System.out.println(mt2.getPriority());
//		System.out.println(mt3.getPriority());
		mt1.start();
		mt2.start();
		mt3.start();
	}
	
}
