package cn.itcast02;
/*
 * ΪʲôҪ��дrun()�����أ�
 * �������ô��붼��Ҫ���߳�ִ�еģ�
 * �����ʱ��Ϊ��������Щ����Ҫ�߳�ִ�У�java���ṩ��Thread���е�run���������߳�ִ��
 * */
public class MyThread extends Thread{

	public void run(){
		//System.out.println("�ú�ѧϰ��������");
		//һ����˵���߳�ִ�еĶ��Ǻ�ʱ�ĳ���
		for(int x=0;x<100;x++){
			System.out.println(x);
		}
	}

}
