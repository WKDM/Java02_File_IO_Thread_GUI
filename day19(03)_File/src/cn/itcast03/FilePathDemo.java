package cn.itcast03;

import java.io.File;

/*
 * 使用递归
 * 需求：拿出E:\\Lianxi\\java\\目录下的所有以java结尾的文件
 * 
 * 分析：
 * 1.封装目录
 * 2.获取该目录下所有的文件或文件夹的File数组
 * 3.遍历数组得到每一个文件或文件夹对象，判断是否是文件夹
 * 		是：就以该文件夹为根目录
 * 		否：就去判断是否以java结尾
 * 			是：就输出文件名
 * 			否：就不管它
 * */
public class FilePathDemo {

	public static void main(String[] args) {
		File srcFolder = new File("E:\\Lianxi\\java\\");		
//		filePath(f);
		
		//调用一个递归功能
		getJavaAllPath(srcFolder);
	}

	private static void getJavaAllPath(File srcFolder) {
		File[] fileArray = srcFolder.listFiles();
		for(File file:fileArray){
//			System.out.println(file.getName());
			if(file.isDirectory()){
				getJavaAllPath(file);
			}else{
				if(file.getName().endsWith(".java")){
					System.out.println(file.getAbsolutePath());
				}
			}
		}
	}
	
	
	
//	public static String filePath(File f){
//		String str="";
//		File[] f1 = f.listFiles();
//		for(File fkey:f1){
//			if(fkey.isFile()){
//				if(fkey.getName().endsWith(".java")){
//					str = fkey.getName(); 
//				}
//			}else{
//				filePath(f);
//			}
//		}
//		return str;
//		
//	}

}
