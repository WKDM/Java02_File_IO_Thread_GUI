package cn.itcast02;

import java.io.File;
import java.io.IOException;

public class FileDemo01 {
	/*
	 * public boolean createNewFile():����һ���ļ�
	 * public boolean mkdir():����һ���ļ���
	 * public boolean mkdirs():�����༶�ļ���
	 * */
	public static void main(String[] args) throws IOException {
		File file1 = new File("E://Lianxi//javademo01");
		System.out.println("mkdir:"+file1.mkdir());
		
		File file2 = new File("E://Lianxi//javademo01//a.txt");
		System.out.println("createNewFile��"+file2.createNewFile());
		
//		File file3 = new File("E://Lianxi//javademo01/test01//a.txt");
//		System.out.println("��û���ļ����в��ܼ��ļ�"+file3.createNewFile());
		
//		File file4 = new File("E://Lianxi//javademo01//aa//bb");
//		System.out.println("������û�е��ļ����н��ļ���"+file4.mkdir());
		
		File file5 = new File("E://Lianxi//javademo01//aa//bb");
		System.out.println("����ļ��еĴ�����"+file5.mkdirs());
	}

}
