package cn.itcast08;

import java.io.File;

public class FileDemo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		A:��װ·����
		File file = new File("E:\\Lianxi\\");
//		B:��ȡ��·�������е�FileĿ¼
		File[] strPath = file.listFiles();
//		C:����File����õ�File�е�ÿһ������
		for(File path:strPath){
			if(path.isFile()){
//				System.out.println(path);
				String name = path.getName();
//				System.out.println(name);
				int index = name.indexOf("_");
				String numberString = name.substring(index+1,index+4);
//				System.out.println(numberString);
				int endIndex = name.lastIndexOf("_");
				String nameString = name.substring(endIndex+1);
//				int endIndex = name.lastIndexOf(".");
//				String nameString = name.substring(startIndex,endIndex);
				String strname = numberString.concat("_").concat(nameString);
				
				File newname = new File(path,strname);
				path.renameTo(newname);
//				System.out.println(strname);
			}
		}
		
	}

}
