package cn.itcast03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyImage {

	public static void main(String[] args) throws IOException{
		// ��E:\\meinv6.jpg���Ƶ���Ŀ¼��
		FileInputStream fis =new FileInputStream("E:\\meinv6.jpg");
		FileOutputStream fos =new FileOutputStream("mn.jpg");
		int by=0;
		while((by = fis.read())!=-1){
			fos.write(by);
		}
		//�ر���Դ
		fos.close();
		fis.close();
	}

}
