package cn.itcast04;

import java.io.File;

/*
 * ���󣺵ݹ�ɾ���������ݵ�Ŀ¼
 * 
 * Ŀ¼�Ѿ���:
 * 
 * ������
 * 1.��װĿ¼
 * 2.��ȡ��Ŀ¼�µ������ļ������ļ��е�file����
 * 3.����File����õ������е�ÿһ��file����
 * 4.�жϸö����Ƿ�ΪĿ¼
 * 		�ǣ��ص�2
 * 		�񣺾�ɾ��
 * */
public class FileDeleteDemo {

	public static void main(String[] args) {
		File scrFolder = new File("E:\\Lianxi\\java\\ZZ_javaweb\\day19(03)_File\\Demo");
		FileDelete(scrFolder);
	}

	private static void FileDelete(File scrFolder) {
		File[] fileArray = scrFolder.listFiles();
		for(File file:fileArray){
			if(file.isDirectory()){
				FileDelete(file);
			}else{
				System.out.println("ɾ�����ļ��ǣ�"+file.getName()+file.delete());
			}
		}
		System.out.println("ɾ�����ļ��У�"+scrFolder+scrFolder.delete());
	}

}
