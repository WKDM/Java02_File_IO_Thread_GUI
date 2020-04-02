package cn.itcast02;

import java.io.File;
import java.io.IOException;

public class FileDemo01 {
	/*
	 * public boolean createNewFile():创建一个文件
	 * public boolean mkdir():创建一个文件夹
	 * public boolean mkdirs():创建多级文件夹
	 * */
	public static void main(String[] args) throws IOException {
		File file1 = new File("E://Lianxi//javademo01");
		System.out.println("mkdir:"+file1.mkdir());
		
		File file2 = new File("E://Lianxi//javademo01//a.txt");
		System.out.println("createNewFile："+file2.createNewFile());
		
//		File file3 = new File("E://Lianxi//javademo01/test01//a.txt");
//		System.out.println("在没有文件夹中不能见文件"+file3.createNewFile());
		
//		File file4 = new File("E://Lianxi//javademo01//aa//bb");
//		System.out.println("不能在没有的文件夹中建文件夹"+file4.mkdir());
		
		File file5 = new File("E://Lianxi//javademo01//aa//bb");
		System.out.println("多层文件夹的创建："+file5.mkdirs());
	}

}
