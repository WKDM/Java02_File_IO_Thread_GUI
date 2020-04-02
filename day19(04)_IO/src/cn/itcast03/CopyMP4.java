package cn.itcast03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 把D:\\DW\\Live.mp3\\复制到本文件下
 * */
public class CopyMP4 {

	public static void main(String[] args) throws IOException{
		//源目录
		FileInputStream fis = new FileInputStream("D:\\DW\\Live.mp3\\");
		//目的文件夹
		FileOutputStream fos = new FileOutputStream("Live.mp3");
		//读出文件
		int by=0;
		while((by=fis.read())!=-1){
			fos.write(by);
		}
		
		fos.close();
		fis.close();
			
	}

}
