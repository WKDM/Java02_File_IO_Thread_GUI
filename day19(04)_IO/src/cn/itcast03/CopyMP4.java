package cn.itcast03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ��D:\\DW\\Live.mp3\\���Ƶ����ļ���
 * */
public class CopyMP4 {

	public static void main(String[] args) throws IOException{
		//ԴĿ¼
		FileInputStream fis = new FileInputStream("D:\\DW\\Live.mp3\\");
		//Ŀ���ļ���
		FileOutputStream fos = new FileOutputStream("Live.mp3");
		//�����ļ�
		int by=0;
		while((by=fis.read())!=-1){
			fos.write(by);
		}
		
		fos.close();
		fis.close();
			
	}

}
