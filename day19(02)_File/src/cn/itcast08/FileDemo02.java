package cn.itcast08;

import java.io.File;
import java.io.FilenameFilter;

/*
 * �ж�E:\\Lianxi���Ƿ�����.jpg��β���ļ�������о����
 * 	A:�Ȼ�ȡ���еģ�Ȼ���ж��Ƿ���
 * 	B:��ȡ��ʱ����Ѿ�����������Ȼ�����
 * public String[] list(FilenameFilter filter):
 * public File[] listFiles(FilenameFilter filter):
 * */
public class FileDemo02 {

	public static void main(String[] args) {		
//		��װE:\\Lianxi\\Ŀ¼
		File file = new File("E:\\Lianxi\\");
//		public String[] list(FilenameFilter filter):
		String[] strArray = file.list(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
//				System.out.println(dir+"---------------"+name);
				
				
//				File f1 = new File(dir,name);
//				boolean flag = f1.isFile();
//				boolean flag2 = name.endsWith(".jpg");
//				return flag&&flag2;
				
				
				
				return new File(dir,name).isFile() && name.endsWith(".jpg");
				
				
				
				
//				return true;
			}
		});
		//����
		for(String str:strArray){
			System.out.println(str);
		}
	}

}
