package cn.itcast07;

import java.io.File;

/*
 * ��ȡ���ܣ�
 * 		public String[] list():��ȡָ��Ŀ¼�µ������ļ������ļ��е��������顣
 * 		public File[] listFiles():��ȡָ��Ŀ¼�µ������ļ������ļ����µ�File���顣
 * */
public class FileDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("e:\\");
//		public String[] list():��ȡָ��Ŀ¼�µ������ļ������ļ��е��������顣
		String[] strArray = file.list();
		for(String ml:strArray){
			System.out.println(ml);
		}
		System.out.println("------------");
		File[] fileArray = file.listFiles();
		for(File f:fileArray){
			System.out.println(f.getName());
		}
	}

}
