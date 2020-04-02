package cn.itcast05;

import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

public class SystemDemo {
	/*
	 * 标准输入流：
	 * 	system中的两个成员变量
	 * 	public static final system in	标准输入流
	 * 	public static final system out	标准输出流
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
