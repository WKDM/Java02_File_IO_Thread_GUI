package cn.itcast03;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo01 {
/*
 * 1.���Բ����������͵�����
 * 		print
 * 		println
 * 2.�����Զ�����
 * 		PrintWriter pw = new PrintWriter(new FileWriter("pw2.txt"),true);
 * 		��Ӧ�õ���println()��������ʹ��
 * 		�ⲻ����ʵ�����Զ�ˢ�£���ʵ�����Զ�����* 
 * 
 * 
 * 		println
 * 		�൱��
 * 		bw.write
 * 		bw.newLine
 * 		bw.flush
 * 
 * */
	public static void main(String[] args) throws IOException {
/*		PrintWriter pw = new PrintWriter("pw2.txt");		
		pw.print(true);
		pw.print(100);
		pw.print(23.6);
		pw.print("����");
		pw.close();
*/
		PrintWriter pw = new PrintWriter(new FileWriter("pw2.txt"),true);
		pw.println(true);
		pw.println(100);
		pw.println(23.6);
		pw.println("����");
		pw.close();
	}
}
