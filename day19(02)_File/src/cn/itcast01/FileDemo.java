package cn.itcast01;

import java.io.File;

/*
 * 我们要想实现IO的操作，就必须知道硬盘上文件的表现形式。
 * 而java就提供了一个类File供我们使用
 * 
 * File：文件和目录（文件夹）路径名的抽象表现形式
 * 构造方法：
 * 		File(String pathname) :根据一个路径得到一个File对象
 * 		File(String parent,String child):根据一个目录和一个子文件/目录得到一个File对象
 * 		File(File parent,String child):根据父文件对象和一个子文件/目录得到一个File对象
 * */
public class FileDemo {
	public static void main(String[] args) {
//		File(String pathname) :根据一个路径得到一个File对象
		File f1 =new File("e:\\Lianxi\\a.txt");
//		File(String parent,String child):根据一个目录和一个子文件/目录得到一个File对象
		File f2 =new File("e:\\Lianxi","a.txt");
//		File(File parent,String child):根据父文件对象和一个子文件/目录得到一个File对象
		File f3 = new File("e:\\Lianxi");
		File f4 = new File(f3,"a.txt");
	}
}
