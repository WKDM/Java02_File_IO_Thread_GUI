package cn.itcast02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
/*
 * public void Write(int c):
 * public void Write(char[] chuf):
 * public void Write(char[] chuf,int off,int len):
 * public void Write(String str):
 * public void Write(String str,int off,int len):
 * 面试题：
 * 	flush与close的区别：
 * 		close：关闭资源，先刷新缓冲区
 * 		flush：值刷新缓冲区，不关闭流资源
 * */
public class OutputStreamWriteDemo02 {

	public static void main(String[] args) throws IOException{
		OutputStreamWriter osw =new OutputStreamWriter(new FileOutputStream("text01.txt"));
//		osw.write("您好");
		char[] chuf ={'1','2','3','4','5','7'};
//		osw.write(chuf);
//		osw.write(chuf,2,3);
		
		String str="我爱罗驾驭";
//		osw.write(str);
		osw.write(str, 2, 3);
//		osw.flush();
		
		osw.close();
	}

}
