package cn.itcast04;
/*
 * public static void yeild():ֹͣ��ǰ�Ľ��̣����������Ľ��̡�
 * �ý��̸���г
 * */
public class ThreadYeildDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadYeild ty1 = new ThreadYeild();
		ThreadYeild ty2 = new ThreadYeild();
		ty1.setName("�޼���");
		ty2.setName("����");
		ty1.start();
		ty2.start();
	}

}
