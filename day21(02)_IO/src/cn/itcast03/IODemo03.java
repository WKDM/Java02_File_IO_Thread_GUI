package cn.itcast03;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class IODemo03 {
/*
 * ��ӡ����
 * �ֽڴ�ӡ����PrintStream
 * �ַ���ӡ����PrintWriter
 * 
 * 
 * ��ӡ�����ص㣺
 * 1.ֻ��д���ݵģ�û�ж����ݵģ�ֻ�ܲ���Ŀ�ĵأ����ܲ�������Դ
 * 2.���Բ����������͵�����
 * 3.����������Զ�ˢ�£����Ϳ����Զ�ˢ��
 * 4.��������ֱ�Ӳ����ı��ļ�
 * 		��Щ���������ֱ�Ӳ����ļ��أ�
 * 		FileOutputStream
 * 		FileInputStream
 * 		FileReader
 * 		FileWriter
 * 		PrintStream
 * 		PrintWriter
 * ��API��������Ļ������������ͬʱ��File��String�Ĳ�����һ����˵���ǿ���ֱ�Ӳ����ı��ļ�
 * 
 * 		������������ֱ�Ӷ��ı��ĵ����в��� 
 * 		�߼�����
 * */
	public static void main(String[] args) throws IOException {
		//��ΪWriter���������ʹ��
		PrintWriter pw =new PrintWriter("b.txt");
		pw.write("Hello");
		pw.write("java");
		pw.write("world");
		pw.close();		
	}

}
