package cn.itcast03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyImage {

	public static void main(String[] args) throws IOException{
		// 把E:\\meinv6.jpg复制到本目录下
		FileInputStream fis =new FileInputStream("E:\\meinv6.jpg");
		FileOutputStream fos =new FileOutputStream("mn.jpg");
		int by=0;
		while((by = fis.read())!=-1){
			fos.write(by);
		}
		//关闭资源
		fos.close();
		fis.close();
	}

}
