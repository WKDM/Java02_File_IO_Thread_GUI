package cn.itcast01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 字节输出流家异常处理
 * */
public class FileOutputStreamDemo03 {

	public static void main(String[] args) {
//		方法一
//		FileOutputStream fos =null;
//		try {
//			fos = new FileOutputStream("txt4.txt");
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		try {
//			fos.write("java".getBytes());
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		try {
//			fos.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		方法二：		
//		try {
//			FileOutputStream fos = new FileOutputStream("txt4.txt");
//			fos.write("java".getBytes());
//			fos.close();
//		} catch (FileNotFoundException e) {			
//			e.printStackTrace();
//		}catch (IOException e) {
//			e.printStackTrace();
//		}
		
		
//		方法三：
//		NullPointerException
//		解决方法
		FileOutputStream fos =null;
		try {
			fos = new FileOutputStream("z:\\txt4.txt");
			fos.write("java".getBytes());
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace(); 
		}finally {
			if(fos!=null){
				try { 
					fos.close();
				} catch (IOException e) {				
					e.printStackTrace();
				}
			}
		}
		
		
	}

}
