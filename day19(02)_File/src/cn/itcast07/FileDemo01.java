package cn.itcast07;

import java.io.File;

/*
 * 获取功能：
 * 		public String[] list():获取指定目录下的所有文件或者文件夹的名称数组。
 * 		public File[] listFiles():获取指定目录下的所有文件或者文件夹下的File数组。
 * */
public class FileDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("e:\\");
//		public String[] list():获取指定目录下的所有文件或者文件夹的名称数组。
		String[] strArray = file.list();
		for(String ml:strArray){
			System.out.println(ml);
		}
		System.out.println("------------");
		File[] fileArray = file.listFiles();
		for(File f:fileArray){
			System.out.println(f.getName());
		}
	}

}
