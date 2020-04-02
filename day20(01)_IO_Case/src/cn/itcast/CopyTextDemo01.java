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
 * 复制文本文件：
 * 	先读入---InputStream------BufferedReader()
 * 	再写出---OutputStream-----BufferedWriter()
 * 源目录：D:\\a.doc\\
 * 目的地：E:\\b.doc\\
 * */
public class CopyTextDemo01 {

	public static void main(String[] args) throws IOException {
		String string1 = "d:\\a.txt\\";
		String string2 = "E:\\b.txt\\";
		//基本字符流一次写一个字符
//		method1(string1,string2);
		//基本字符流一次写一个数组
//		method2(string1,string2);
		//字符缓冲流一次写一个字符
//		method3(string1,string2);
		//字符缓冲流一次写一个数组
//		method4(string1,string2);
		//字符缓冲流一次写一个字符串
//		method5(string1,string2);		
	}
	
	//基本字符流一次都写一个字符
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
	//基本字符流一次都写一个数组
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
	//字符缓冲流一次写一个字符
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
	//字符缓冲流一次写一个数组
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
	//字符缓冲流一次写一个字符串
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
