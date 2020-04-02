package cn.itcast03;

import java.io.File;
import java.io.IOException;

/*
 * public boolean delete():删除文件夹或文件
 * 
 * 注意：
 * 		A:如果你创建文件忘记了写盘符，则默认在本文件夹下
 * 		B:java删除不走回收站 
 * 		C:要删除一个文件夹，这个文件夹内不能包含文件或文件夹
 * */
public class FileDeemo01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f1 = new File("a.txt");
		System.out.println(f1.createNewFile());
		File f2 =new File("aaa\\bbb\\ccc");
		System.out.println(f2.mkdirs());
		
		
		System.out.println(f1.delete());
		System.out.println(f2.delete());
	}

}
