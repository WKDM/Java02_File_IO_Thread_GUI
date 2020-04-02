package cn.itcast03;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class IODemo03 {
/*
 * 打印流：
 * 字节打印流：PrintStream
 * 字符打印流：PrintWriter
 * 
 * 
 * 打印流的特点：
 * 1.只有写数据的，没有读数据的；只能操作目的地，不能操作数据源
 * 2.可以操作任意类型的数据
 * 3.如果启动了自动刷新，他就可以自动刷新
 * 4.该流可以直接操作文本文件
 * 		哪些流对象可以直接操作文件呢？
 * 		FileOutputStream
 * 		FileInputStream
 * 		FileReader
 * 		FileWriter
 * 		PrintStream
 * 		PrintWriter
 * 看API查流对象的基本方法，如果同时有File和String的参数，一般来说就是可以直接操作文本文件
 * 
 * 		基础流：可以直接对文本文档进行操作 
 * 		高级流：
 * */
	public static void main(String[] args) throws IOException {
		//作为Writer的子类进行使用
		PrintWriter pw =new PrintWriter("b.txt");
		pw.write("Hello");
		pw.write("java");
		pw.write("world");
		pw.close();		
	}

}
