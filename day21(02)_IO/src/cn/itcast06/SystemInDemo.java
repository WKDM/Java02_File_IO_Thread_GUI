package cn.itcast06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/*
 * ��׼�����������Լ�����������
 * 
 * ����¼�����ݵķ�����
 * 1.mainס�����е�args����
 * 2.Scanner��
 * 		2.1Scanner sc = new Scanner()
 * 			String str = sc.nextLine()
 * 			int i = sc.nextInt()
 * 3.ͨ���ַ�������װ��׼��ʵ�ּ���¼��
 * 			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 * 
 * */
public class SystemInDemo {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
/*		
		InputStream is = System.in;
		//�ַ�ת����
		InputStreamReader isr = new InputStreamReader(is);
		//�ַ�������
		BufferedReader br = new BufferedReader(isr);
*/		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("������һ���ַ�����");
		String line = br.readLine();
		System.out.println("��������ַ����ǣ�"+line);
		System.out.println("������һ��������");
		int Int = Integer.parseInt(br.readLine());
		System.out.println("�������������"+Int);
		
	}

}
