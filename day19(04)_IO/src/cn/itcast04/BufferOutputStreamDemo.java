package cn.itcast04;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferOutputStreamDemo {

	public static void main(String[] args) throws IOException{
		BufferedOutputStream bos =new BufferedOutputStream(new FileOutputStream("txt11.txt"));
		bos.write("Hello".getBytes());
		bos.close();
		
	}

}
