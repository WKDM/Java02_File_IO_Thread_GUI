package cn.itcast03;

import java.io.File;

/*
 * ʹ�õݹ�
 * �����ó�E:\\Lianxi\\java\\Ŀ¼�µ�������java��β���ļ�
 * 
 * ������
 * 1.��װĿ¼
 * 2.��ȡ��Ŀ¼�����е��ļ����ļ��е�File����
 * 3.��������õ�ÿһ���ļ����ļ��ж����ж��Ƿ����ļ���
 * 		�ǣ����Ը��ļ���Ϊ��Ŀ¼
 * 		�񣺾�ȥ�ж��Ƿ���java��β
 * 			�ǣ�������ļ���
 * 			�񣺾Ͳ�����
 * */
public class FilePathDemo {

	public static void main(String[] args) {
		File srcFolder = new File("E:\\Lianxi\\java\\");		
//		filePath(f);
		
		//����һ���ݹ鹦��
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
