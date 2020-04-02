package cn.itcast02;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderDemo02 {
/*
 * public int read(ch):
 * public int read(char[] ch)
 * */
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(new FileInputStream("text02.txt"));
//		int ch = 0;
//		while((ch=isr.read())!=-1){
//			System.out.print((char)ch);
//		}
		
		char[] chs = new char[1024];
		int len = 0;
		while((len=isr.read(chs))!=-1){
			System.out.println(new String(chs,0,len));
		}
		
		
		
		isr.close();
	}

}
