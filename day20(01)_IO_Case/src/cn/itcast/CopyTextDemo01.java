package cn.itcast;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.text.AbstractDocument.BranchElement;

/*
 * �����ı��ļ���
 * 	�ȶ���---InputStream------BufferedReader()
 * 	��д��---OutputStream-----BufferedWriter()
 * ԴĿ¼��D:\\a.doc\\
 * Ŀ�ĵأ�E:\\b.doc\\
 * */
public class CopyTextDemo01 {

	public static void main(String[] args) throws IOException {
		String string1 = "d:\\a.txt\\";
		String string2 = "E:\\b.txt\\";
		//�����ַ���һ��дһ���ַ�
//		method1(string1,string2);
		//�����ַ���һ��дһ������
//		method2(string1,string2);
		//�ַ�������һ��дһ���ַ�
//		method3(string1,string2);
		//�ַ�������һ��дһ������
//		method4(string1,string2);
		//�ַ�������һ��дһ���ַ���
//		method5(string1,string2);		
	}
	
	//�����ַ���һ�ζ�дһ���ַ�
	private static void method1(String string1, String string2) throws IOException {
		FileReader fr = new FileReader(string1);
		FileWriter fw = new FileWriter(string2);
		int ch = 0;
		while((ch=fr.read())!=-1){
			fw.write(ch);
		}
		fw.close();
		fr.close();
	}
	//�����ַ���һ�ζ�дһ������
	private static void method2(String string1, String string2) throws IOException {
		FileReader fr = new FileReader(string1);
		FileWriter fw = new FileWriter(string2);
		char[] chs = new char[1024];
		int len = fr.read();
		while((len=fr.read(chs))!=-1){
			fw.write(chs);
		}
		fw.close();
		fr.close();
	}
	//�ַ�������һ��дһ���ַ�
	private static void method3(String string1, String string2) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(string1));
		BufferedWriter bw = new BufferedWriter(new FileWriter(string2));
		int ch = 0;
		while((ch=br.read())!=-1){
			bw.write(ch);
		}
		bw.close();
		br.close();
	}
	//�ַ�������һ��дһ������
	private static void method4(String string1, String string2) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(string1));
		BufferedWriter bw = new BufferedWriter(new FileWriter(string2));
		char[] chs = new char[1024];
		int len = br.read();
		while((len=br.read(chs))!=-1){
			bw.write(chs);
		}
		bw.close();
		br.close();
	}
	//�ַ�������һ��дһ���ַ���
	private static void method5(String string1, String string2) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(string1));
		BufferedWriter bw = new BufferedWriter(new FileWriter(string2));
		String line = null;
		while((line = br.readLine())!=null){
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		bw.close();
		br.close();
	}

}
