package cn.itcast08;

import java.io.File;

/*
 * �ж�E:\\Lianxi���Ƿ�����.jpg��β���ļ�������о����
 * 
 * 		A:��װE:\\LianxiĿ¼
 * 		B:��ȡ��Ŀ¼�������ļ������ļ��е�File����
 * 		C:������File���飬�ĵ�ÿһ��File����Ȼ���ж�
 * 		D:�Ƿ�Ϊ�ļ�
 * 			�ǣ��ж��Ƿ���.jpg��β
 * 				�ǣ�����ļ���
 * 				�񣺲�������
 * 			�񣺲�������
 * */
public class FileDemo01 {

	public static void main(String[] args) {
//		A:��װE:\\LianxiĿ¼
		File file = new File("E:\\Lianxi\\");
//		B:��ȡ��Ŀ¼�������ļ������ļ��е�File����
		File[] fileArray = file.listFiles();
//		C:������File���飬�ĵ�ÿһ��File����Ȼ���ж�
		for(File files : fileArray){
			if(files.isFile()){
				if(files.getName().endsWith(".jpg")){
					System.out.println(files.getName());
				}
			}
		}
	}

}
