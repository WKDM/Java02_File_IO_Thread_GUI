package cn.itcast01;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo02 {

	public static void main(String[] args) throws IOException {
		FileInputStream bis = new FileInputStream("b.txt");
		byte[] bys = new byte[1024];
		int len =0;
		while((len = bis.read(bys))!=-1){
			System.out.print(new String(bys,0,len));
		}
	}

}
