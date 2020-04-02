package cn.itcast05;

import java.io.File;
import java.io.IOException;

/*
 * 判断功能：
* public boolean isDirectory():判断是否为目录
* public boolean isFile():判断是否为文件
* public boolean exists():判断是否存在
* public boolean canRead():判断是否可读
* public boolean canWrite():判断是否可写
* public boolean isHidden():判断是否隐藏
 * */
public class FileDemo01 {

	public static void main(String[] args){
		File f1 = new File("a.txt");
		System.out.println("isDirectory()"+f1.isDirectory());
		System.out.println("isFile()"+f1.isFile());
		System.out.println("exists()"+f1.exists());
		System.out.println("canRead()"+f1.canRead());
		System.out.println("canWrite()"+f1.canWrite());
		System.out.println("isHidden()"+f1.isHidden());
	}

}
