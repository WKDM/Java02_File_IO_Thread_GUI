package cn.itcast01;

import java.io.*;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

public class CastDemo01 {

	public static void main(String[] args) throws IOException{
		FileInputStream fis = new FileInputStream("txt01.txt");
//		int by =0;
//		while((by = fis.read())!=-1){
//			System.out.print((char)by);		
//		}
		byte[] bys = new byte[1024];
		int len=0;
		while((len=fis.read(bys))!=-1){
			System.out.println(new String(bys));
		}
		
		String str= "ฤ๚บร";
		byte[] by1 = str.getBytes("utf-8");
		System.out.println(Arrays.toString(by1));
	}

}
