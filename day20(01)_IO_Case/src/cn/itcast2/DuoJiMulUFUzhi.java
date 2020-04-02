package cn.itcast2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import cn.itcast.CopyFileDemo01;

public class DuoJiMulUFUzhi {

	public static void main(String[] args) throws IOException{
		File srcFolder = new File("D:\\DW\\js√¿≈Æœ‡≤·");
		File destFolder = new File("E:\\Lianxi\\Demo");
		if(!destFolder.exists()){
			destFolder.mkdir();
		}
		DiGuiFolder(srcFolder,destFolder);		
	}

	private static void DiGuiFolder(File srcFolder,File destFolder) throws IOException{
		File[] fileArray = srcFolder.listFiles();
		for(File file:fileArray){
			if(file.isDirectory()){
				DiGuiFolder(file.getAbsoluteFile(),destFolder);
			}else{
				String strName = file.getName();
				File newFile = new File(destFolder+strName);
				CopyFile(file,newFile);
			}			
		}
	}

	private static void CopyFile(File file, File newFile)throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(newFile));
		int by = 0;
		while((by=bis.read())!=-1){
			bos.write(by);
		}
		bos.close();
		bis.close();
	}

}
