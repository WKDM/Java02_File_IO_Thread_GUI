package cn.itcast03;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo01 {
/*
 * 1.可以操作任意类型的数据
 * 		print
 * 		println
 * 2.启动自动换行
 * 		PrintWriter pw = new PrintWriter(new FileWriter("pw2.txt"),true);
 * 		还应该调用println()方法才能使用
 * 		这不仅仅实现了自动刷新，还实现了自动换行* 
 * 
 * 
 * 		println
 * 		相当于
 * 		bw.write
 * 		bw.newLine
 * 		bw.flush
 * 
 * */
	public static void main(String[] args) throws IOException {
/*		PrintWriter pw = new PrintWriter("pw2.txt");		
		pw.print(true);
		pw.print(100);
		pw.print(23.6);
		pw.print("您好");
		pw.close();
*/
		PrintWriter pw = new PrintWriter(new FileWriter("pw2.txt"),true);
		pw.println(true);
		pw.println(100);
		pw.println(23.6);
		pw.println("您好");
		pw.close();
	}
}
