package cn.itcast05;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IPhoneDemo {

	public static void main(String[] args) {
		Phone p = new IPhone();
		p.call();
		System.out.println("------------------");
		
		
		//�����ڴ�绰ǰ������
		PhoneDecorate pd = new RingPhoneDecorate(p);
		pd.call();
		System.out.println("-------------------");
		//���󣺴���绰����
		pd = new MusicDecorate(p);
		pd.call();
		System.out.println("-------");
		//�����ȴ�绰��������
		pd = new RingPhoneDecorate(new MusicDecorate(p));
		pd.call();
		System.out.println("--------------");
		//����������IO���е�ʹ��
		
//		InputStream is = System.in;
//		InputStreamReader isr = new InputStreamReader(is);
//		BufferedReader br =  new BufferedReader(isr);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
	}

}
