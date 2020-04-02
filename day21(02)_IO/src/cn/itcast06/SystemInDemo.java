package cn.itcast06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/*
 * 标准输入流，是以键盘输入数据
 * 
 * 键盘录入数据的方法：
 * 1.main住方法中的args参数
 * 2.Scanner类
 * 		2.1Scanner sc = new Scanner()
 * 			String str = sc.nextLine()
 * 			int i = sc.nextInt()
 * 3.通过字符缓流包装标准流实现键盘录入
 * 			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 * 
 * */
public class SystemInDemo {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
/*		
		InputStream is = System.in;
		//字符转换流
		InputStreamReader isr = new InputStreamReader(is);
		//字符缓冲流
		BufferedReader br = new BufferedReader(isr);
*/		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("请输入一个字符出：");
		String line = br.readLine();
		System.out.println("您输入的字符串是："+line);
		System.out.println("请输入一个整数：");
		int Int = Integer.parseInt(br.readLine());
		System.out.println("您输入的整数："+Int);
		
	}

}
