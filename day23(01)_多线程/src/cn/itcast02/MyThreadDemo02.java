package cn.itcast02;

import javax.xml.ws.soap.MTOM;

public class MyThreadDemo02 {
/*
 * ��������Ҫʵ�ֶ��̵߳ĳ���
 * ���ʵ���أ�
 * �����߳������ݽ��̴��ڵģ���������Ӧ���ȴ���һ�����̳�����
 * �����������̴߳����ģ���������Ӧ��ȥ����ϵͳ���ܴ���һ������
 * java�ǲ���ֱ�ӵ���ϵͳ���ܵģ����ԣ�����û�а취ֱ��ʵ�ֶ��̳߳���
 * �����أ�java����ȥ����c/c++д�õĳ�����ʵ�ֶ��̳߳���
 * ��C/C++ȥ����ϵͳ���ܴ������̣�Ȼ����javaȥ���������Ķ�����Ȼ���ṩһЩ�๩���ǾͿ���ʵ�ֶ��̳߳����ˡ�
 * 
 * ��ôjava���ṩ��ʲô�أ�
 * Thread
 * ͨ��API�����Ƿ��������ŷ�ʽ
 * 
 * ����һ���̳�Thread��
 * 
 * 	���裺A:����MyThread��ΪThread������
 * 		B:MyThread������дrun()����
 * 		C:��������
 * 		D:�����߳�
 * */
	//�����߳�
	public static void main(String[] args) {
//		MyThread mt = new MyThread();
//		mt.run();
//		mt.run();
//		mt.run();
		
		/*
		 * ����run()����Ϊʲô�������߳�
		 * ��Ϊrun()����ֱ�ӵ�����ʵ���൱����ͨ�ķ������ã������㿴���ľ��ǵ��̵߳Ľ����
		 * Ҫ�뿴�����̵߳�Ч�����ͱ���˵˵��һ��������start()
		 * �����⣺run()��start()������
		 * 	run():�����Ƿ�װ���߳�ִ�еĴ��룬ֱ�ӵ�������ͨ����
		 * 	start():�����������̣߳�Ȼ������JVMȥ���ø��̵߳�run()
		 * 	
		 * */
		
//		MyThread mt = new MyThread();
//		mt.start();
//		mt.start();
//		//java.lang.IllegalThreadStateException
		MyThread mt1 = new MyThread();
		MyThread mt2 = new MyThread();
		mt1.start();
		mt2.start();
	}
}
