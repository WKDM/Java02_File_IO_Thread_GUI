package cn.itcast02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("fis.txt");
//		int by = fis.read();
//		System.out.print((char)by);		
//		by = fis.read();
//		System.out.print((char)by);
//		by = fis.read();
//		System.out.print((char)by);
//		by = fis.read();
//		System.out.print((char)by);
//		by = fis.read();
//		System.out.print(by);
//		by = fis.read();
//		System.out.print(by);
		
		
//		int by = fis.read();
//		while(by!=-1){
//			System.out.print((char)by);
//			by =fis.read();
//		}
		
		
		int by=0;
		while((by=fis.read())!=-1){
			System.out.print((char)by);
		}
		
		//ÊÍ·Å×ÊÔ´
		fis.close();
	}

}
