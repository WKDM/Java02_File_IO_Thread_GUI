package cn.itcast;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 使用字节流复制图片
 * 读入-------InputStream---FileInputStream------BufferedInputStream
 * 写出-------OutputStream--FileOutputStream------BufferedOutputStream
 * */
public class CopyImage {

	public static void main(String[] args) throws IOException {
		String srcString = "D:\\meinv6.jpg";
		String dateString = "E:\\meinv6.jpg";
//		method1(srcString,dateString);
		method2(srcString,dateString);
//		method3(srcString,dateString);
//		method4(srcString,dateString);
	}

	private static void method1(String srcString, String dateString) throws IOException {
		FileInputStream fis = new FileInputStream(srcString);
		FileOutputStream fos = new FileOutputStream(dateString);
		int by = 0;
		while((by = fis.read())!=-1){
			fos.write(by);
		}
		fos.close();
		fis.close();
	}
	private static void method2(String srcString, String dateString) throws IOException {
		FileInputStream fis = new FileInputStream(srcString);
		FileOutputStream fos = new FileOutputStream(dateString);
		byte[] bys = new byte[1024];
		int len = 0;
		while((len = fis.read(bys))!=-1){
			fos.write(bys);
		}
		fos.close();
		fis.close();
	}
	private static void method3(String srcString, String dateString) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcString));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dateString));
		byte[] bys = new byte[1024];
		int len = 0;
		while((len = bis.read(bys))!=-1){
			bos.write(bys);
		}
		bos.close();
		bis.close();
	}
	private static void method4(String srcString, String dateString) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcString));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dateString));
		int by = 0;
		while((by = bis.read())!=-1){
			bos.write(by);
		}
		bos.close();
		bis.close();
	}
}
