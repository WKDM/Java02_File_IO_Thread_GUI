package cn.itcast03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * �����ļ���
 * 	A:����Դ
 * 		a.txt ------- ��������----InputStream
 * 	B:Ŀ�ĵ�
 * 		b.txt ------- д������----OutputStream
 * */
public class CopyDemo {

	public static void main(String[] args) throws IOException {
		//��װ����Դ
		FileInputStream fis =new FileInputStream("a.txt");
		//��װĿ�ĵ�
		FileOutputStream fos = new FileOutputStream("b.txt");
		
		int by = 0;
		while((by=fis.read())!=-1){
			fos.write(by);
		}
		fis.close();
		fos.close();
	}

}
