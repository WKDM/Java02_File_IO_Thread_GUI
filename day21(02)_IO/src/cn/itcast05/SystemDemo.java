package cn.itcast05;

import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

public class SystemDemo {
	/*
	 * ��׼��������
	 * 	system�е�������Ա����
	 * 	public static final system in	��׼������
	 * 	public static final system out	��׼�����
	 * 
	 * 	InputStream is = System.in
	 * 	PrintStream pw = System.out
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("HelloworldJava");
		
		PrintStream pw = System.out;
		pw.println("Helloworldjava");
		
	}

}
