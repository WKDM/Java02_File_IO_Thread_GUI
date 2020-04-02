package cn.itcast04;

import java.io.File;

/*
 * 重命名：
 * 		public boolean renameTo(File desc):重命名
 * 路径以磁盘开始：绝对路径（C:\\a.txt）
 * 路径不以磁盘开始：相对路径（a.txt）
 * */
public class FileDemo01 {

	public static void main(String[] args) {
		File f1 = new File("E:\\Lianxi\\mn01.jpg");
		File f2 = new File("mn02.jpg");
		System.out.println("renameTo:"+f1.renameTo(f2));
	}

}
