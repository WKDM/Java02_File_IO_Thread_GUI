package cn.itcast05;

import java.io.File;
import java.io.IOException;

/*
 * �жϹ��ܣ�
* public boolean isDirectory():�ж��Ƿ�ΪĿ¼
* public boolean isFile():�ж��Ƿ�Ϊ�ļ�
* public boolean exists():�ж��Ƿ����
* public boolean canRead():�ж��Ƿ�ɶ�
* public boolean canWrite():�ж��Ƿ��д
* public boolean isHidden():�ж��Ƿ�����
 * */
public class FileDemo01 {

	public static void main(String[] args){
		File f1 = new File("a.txt");
		System.out.println("isDirectory()"+f1.isDirectory());
		System.out.println("isFile()"+f1.isFile());
		System.out.println("exists()"+f1.exists());
		System.out.println("canRead()"+f1.canRead());
		System.out.println("canWrite()"+f1.canWrite());
		System.out.println("isHidden()"+f1.isHidden());
	}

}
