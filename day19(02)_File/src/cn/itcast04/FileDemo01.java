package cn.itcast04;

import java.io.File;

/*
 * ��������
 * 		public boolean renameTo(File desc):������
 * ·���Դ��̿�ʼ������·����C:\\a.txt��
 * ·�����Դ��̿�ʼ�����·����a.txt��
 * */
public class FileDemo01 {

	public static void main(String[] args) {
		File f1 = new File("E:\\Lianxi\\mn01.jpg");
		File f2 = new File("mn02.jpg");
		System.out.println("renameTo:"+f1.renameTo(f2));
	}

}
