package cn.itcast08;

import java.io.File;

/*
 * 判断E:\\Lianxi中是否有以.jpg结尾的文件，如果有就输出
 * 
 * 		A:封装E:\\Lianxi目录
 * 		B:获取该目录下所有文件或者文件夹的File数组
 * 		C:遍历该File数组，的到每一个File对象，然后判断
 * 		D:是否为文件
 * 			是：判断是否以.jpg结尾
 * 				是：输出文件名
 * 				否：不搭理他
 * 			否：不搭理他
 * */
public class FileDemo01 {

	public static void main(String[] args) {
//		A:封装E:\\Lianxi目录
		File file = new File("E:\\Lianxi\\");
//		B:获取该目录下所有文件或者文件夹的File数组
		File[] fileArray = file.listFiles();
//		C:遍历该File数组，的到每一个File对象，然后判断
		for(File files : fileArray){
			if(files.isFile()){
				if(files.getName().endsWith(".jpg")){
					System.out.println(files.getName());
				}
			}
		}
	}

}
