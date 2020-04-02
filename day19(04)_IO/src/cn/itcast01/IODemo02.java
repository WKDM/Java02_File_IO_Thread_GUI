package cn.itcast01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/*
 * 如何实现数据的换行？
 * windows:\r\n
 * linux:\n
 * mac:\r
 * 其他的都可以识别
 * 
 * 如何实现数据的追加写入？
 * 
 * 
 * 
 * */
public class IODemo02 {

	public static void main(String[] args) throws IOException {
		//串讲字节流对象	
		FileOutputStream ops = new FileOutputStream("txt2.txt",true);
		for(int i = 0;i<=10;i++){
			ops.write(("Hello"+i).getBytes());
			ops.write("\n".getBytes());
		}
		//关闭数据
		ops.close();
	}

}
