package cn.itcast;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ���󣺸��Ƶ����ļ���
 * ������
 * A:��װĿ¼
 * B:��ȡ��Ŀ¼�������ı���File����
 * C:������File���飬�õ�ÿһ��File����
 * D:�Ѹ�File������и���
 * */
public class CopyFileDemo01 {
	public static void main(String[] args) throws IOException {
//		��װĿ¼
		File srcFolder = new File("E:\\Lianxi\\demo");
		File destFolder = new File("E:\\Lianxi\\test");
//		�ж��Ƿ���ڣ���������ھʹ���
		if(!destFolder.exists()){
			destFolder.mkdir();
		}
//		��ȡ��Ŀ¼�������ı���File����
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
