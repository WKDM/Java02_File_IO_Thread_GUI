package cn.itcast;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 需求：复制单击文件夹
 * 分析：
 * A:封装目录
 * B:获取该目录下所有文本的File数组
 * C:遍历该File数组，得到每一个File对象
 * D:把该File对象进行复制
 * */
public class CopyFileDemo01 {
	public static void main(String[] args) throws IOException {
//		封装目录
		File srcFolder = new File("E:\\Lianxi\\demo");
		File destFolder = new File("E:\\Lianxi\\test");
//		判断是否存在；如果不存在就创建
		if(!destFolder.exists()){
			destFolder.mkdir();
		}
//		获取该目录下所有文本的File数组
		File[] fileArray = srcFolder.listFiles();
		for(File file:fileArray){
			if(file.isFile()){
				String strName = file.getName();
				File newFile = new File(destFolder,strName);
				CopyFile(file,newFile);
			}
		}
	}

	private static void CopyFile(File file, File newFile) throws IOException{
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(newFile));
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
		byte[] bys = new byte[1024];
		int len = 0;
		while((len = bis.read(bys))!=-1){
			bos.write(bys);
		}
		bos.close();
		bis.close();
	}
	
}
