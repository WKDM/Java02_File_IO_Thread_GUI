package cn.itcast02;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class InputStreamDemo01 {

	public static void main(String[] args) throws IOException{
//		InputStreamReader isr = new InputStreamReader(new FileInputStream("txt03.txt"));
		InputStreamReader isr = new InputStreamReader(new FileInputStream("txt03.txt"),"utf-8");
		
//		//方法一
//		int ch = 0;
//		while((ch=isr.read())!=-1){
//			System.out.print((char)ch);
//		}
		
		//方法二：
		char[] chs =new char[1024];
		int len = 0;
		while((len=isr.read(chs))!=-1){
			System.out.print(new String(chs,0,len));
		}
		
		
	}

}
