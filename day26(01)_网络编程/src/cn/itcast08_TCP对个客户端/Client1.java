package cn.itcast08_TCP�Ը��ͻ���;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class Client1 {

	public static void main(String[] args) throws IOException {
		Socket s = new Socket("192.168.186.1",3333);
//		��װͼƬ�ļ�
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("E:\\meinv6.jpg"));
//		���ظ���ͼƬ
//		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copyImg1.jpg"));

//		��װ�ϴ�ͨ���ļ�
		BufferedOutputStream bos = new BufferedOutputStream(s.getOutputStream());
		byte[] bys = new byte[1024];
		int len = 0;
		while((len=bis.read(bys))!=-1){
//			д�뱾��
//			bos.write(bys);
			
//			�ϴ�������
			bos.write(bys);
			bos.flush();
		}
		
		//��֪�������
		s.shutdownOutput();
		
		//���ܷ�����Ϣ
		InputStream is = s.getInputStream();
		byte[] bys2 = new byte[1024];
		int len2 = is.read(bys2);
		String data = new String(bys2,0,len2);
		System.out.println(data);
		bis.close();
		s.close();
	}

}
