package cn.itcast03;

import java.io.File;
import java.io.IOException;

/*
 * public boolean delete():ɾ���ļ��л��ļ�
 * 
 * ע�⣺
 * 		A:����㴴���ļ�������д�̷�����Ĭ���ڱ��ļ�����
 * 		B:javaɾ�����߻���վ 
 * 		C:Ҫɾ��һ���ļ��У�����ļ����ڲ��ܰ����ļ����ļ���
 * */
public class FileDeemo01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f1 = new File("a.txt");
		System.out.println(f1.createNewFile());
		File f2 =new File("aaa\\bbb\\ccc");
		System.out.println(f2.mkdirs());
		
		
		System.out.println(f1.delete());
		System.out.println(f2.delete());
	}

}
