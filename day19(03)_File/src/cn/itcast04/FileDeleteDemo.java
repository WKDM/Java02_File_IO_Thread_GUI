package cn.itcast04;

import java.io.File;

/*
 * 需求：递归删除带有内容的目录
 * 
 * 目录已经定:
 * 
 * 分析：
 * 1.封装目录
 * 2.获取该目录下的所有文件或者文件夹的file数组
 * 3.遍历File数组得到数组中的每一个file对象
 * 4.判断该对象是否为目录
 * 		是：回到2
 * 		否：就删除
 * */
public class FileDeleteDemo {

	public static void main(String[] args) {
		File scrFolder = new File("E:\\Lianxi\\java\\ZZ_javaweb\\day19(03)_File\\Demo");
		FileDelete(scrFolder);
	}

	private static void FileDelete(File scrFolder) {
		File[] fileArray = scrFolder.listFiles();
		for(File file:fileArray){
			if(file.isDirectory()){
				FileDelete(file);
			}else{
				System.out.println("删除的文件是："+file.getName()+file.delete());
			}
		}
		System.out.println("删除的文件夹："+scrFolder+scrFolder.delete());
	}

}
