package cn.itcast03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 复制文件：
 * 	A:数据源
 * 		a.txt ------- 读入数据----InputStream
 * 	B:目的地
 * 		b.txt ------- 写出数据----OutputStream
 * */
public class CopyDemo {

	public static void main(String[] args) throws IOException {
		//封装数据源
		FileInputStream fis =new FileInputStream("a.txt");
		//封装目的地
		FileOutputStream fos = new FileOutputStream("b.txt");
		
		int by = 0;
		while((by=fis.read())!=-1){
			fos.write(by);
		}
		fis.close();
		fos.close();
	}

}
