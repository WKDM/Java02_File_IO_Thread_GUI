package cn.itcast01;

import java.io.*;


/*
 * ����
 * 	���ļ���д��Hello��IO
 * ������
 * 	�ֽ�����
 *		�ֽ�����������������	InpitStream
 *		�ֽ��������д������	OutputStream
 *�鿴OutputStream�Ĺ��췽��
 *	FileOutputStream(File file)
 *	FileOutputSteam(String name)
 * */
public class IODemo01 {

	public static void main(String[] args) throws IOException {
////		FileOutputStream(File file)
//		File file = new File("text.txt");
//		OutputStream fos = new FileOutputStream(file);
		
//		��ͬ��д��
//		FileOutputSteam(String name)
		OutputStream fos = new FileOutputStream("text.txt");
//		д�ļ�
		fos.write("hello world IO".getBytes());
//		�ر���Դ
		fos.close();
		
		/*
		 * ΪʲôҪ�ر���Դ�أ���ʲô�����أ�
		 * A:���������������������Ϳ��Ա������������
		 * B:֪ͨϵͳ�ͷ���Ӧ����Դ
		 * */
		fos.write("java".getBytes());
	}

}
