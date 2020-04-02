package cn.itcast04;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferInputStreamDeemo {

	public static void main(String[] args) throws IOException{
		
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("txt11.txt"));
//		int by = 0;
//		while((by=bis.read())!=-1){
//			System.out.print((char)by);
//		}
		
		byte[] bys = new byte[1024];
		int len=0;
		while((len = bis.read(bys))!=-1){
			System.out.print(new String(bys,0,len));
		}
		bis.close();
	}

}
