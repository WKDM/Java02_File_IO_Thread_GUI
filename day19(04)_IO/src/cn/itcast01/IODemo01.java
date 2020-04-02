package cn.itcast01;

import java.io.*;


/*
 * 需求：
 * 	向文件中写入Hello，IO
 * 分析：
 * 	字节流：
 *		字节输入流：读入数据	InpitStream
 *		字节输出流：写出数据	OutputStream
 *查看OutputStream的构造方法
 *	FileOutputStream(File file)
 *	FileOutputSteam(String name)
 * */
public class IODemo01 {

	public static void main(String[] args) throws IOException {
////		FileOutputStream(File file)
//		File file = new File("text.txt");
//		OutputStream fos = new FileOutputStream(file);
		
//		相同的写法
//		FileOutputSteam(String name)
		OutputStream fos = new FileOutputStream("text.txt");
//		写文件
		fos.write("hello world IO".getBytes());
//		关闭资源
		fos.close();
		
		/*
		 * 为什么要关闭资源呢？有什么作用呢？
		 * A:让流对象变成垃圾，这样就可以被回收箱回收了
		 * B:通知系统释放相应的资源
		 * */
		fos.write("java".getBytes());
	}

}
