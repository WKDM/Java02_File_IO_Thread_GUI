package cn.itcast02;

import java.lang.*;

import javax.xml.transform.Templates;

/*
 * �������ã�һ�����ӣ��ӵ������¿�ʼÿ����һ�����ӣ�֮ǰ�����Ӳ�������20���º��ж��ٶ����ӣ�
 * 				���Ӷ���
 * ��һ����			1
 * �ڶ�����			1
 * ��������			2
 * ���ĸ���			3
 * �������			5
 * ��������			8
 * ���߸���		����������������
 * ���ɣ��ӵ������¿�ʼ��ÿ���µĶ�������ǰ�����ĺ�
 * */
public class DiGui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����һ��
		int[] arr = new int[20];		
		/*
		 * arr[0] = 1;
		 * arr[1] = 1;
		 * arr[2] = arr[1]+arr[0];
		 * arr[3] = arr[2]+arr[1];
		 * ������������
		 * a[x] = arr[x-1]+arr[x-2]
		 * */
		arr[0] = 1;
		arr[1] = 1;
		for(int x=2;x<20;x++){
			arr[x] = arr[x-1]+arr[x-2];
		}
		System.out.println("����һ��20���º������ӣ�"+arr[19]+"��");
		System.out.println("----------------");
//		������
		/*���ڷ�	1	1	2	3	5	8������������
		 * ��һ���£��ڶ�����	 a=1	b=1
		 * �ڶ����£���������	 a=1	b=2
		 * �������£����ĸ���	 a=2	b=3
		 * ���ĸ��£��������	 a=3	b=5
		 * ������������
		 * ���ɣ��������¿�ʼ��a=b;b=a+b;
		 * */
		int a=1;
		int b=1;
		for(int i=3;i<=20;i++){
			int temp=a;
			a=b;
			b=temp+b;
		}
		System.out.println("��������20���º������ӣ�"+b+"��");
		System.out.println("----------------");
		
		
//		������
		/*
		 * �ݹ鷽����
		 * ����ֵ����int 
		 * �����б�int n
		 * 
		 * ���ڣ�m=1,n=1
		 * ���ɣ��ڸ��¿�ʼ��ÿ������ǰ�����µĺ�
		 * */
		System.out.println("��������20���º������ӣ�"+b+"��");
		System.out.println("----------------");
	}
	public static int fib(int j){
		if(j==1 || j==2){
			return 1;
		}else{
			return fib(j-1)+fib(j-2);
		}
	}

}
