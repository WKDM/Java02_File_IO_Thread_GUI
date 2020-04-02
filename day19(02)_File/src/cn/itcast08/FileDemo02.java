package cn.itcast08;

import java.io.File;
import java.io.FilenameFilter;

/*
 * 判断E:\\Lianxi中是否有以.jpg结尾的文件，如果有就输出
 * 	A:先获取所有的，然后判断是否有
 * 	B:获取的时候就已经满足条件，然后输出
 * public String[] list(FilenameFilter filter):
 * public File[] listFiles(FilenameFilter filter):
 * */
public class FileDemo02 {

	public static void main(String[] args) {		
//		封装E:\\Lianxi\\目录
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
		//遍历
		for(String str:strArray){
			System.out.println(str);
		}
	}

}
