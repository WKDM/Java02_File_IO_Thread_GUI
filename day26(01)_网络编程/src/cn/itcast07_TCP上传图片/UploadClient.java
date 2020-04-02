package cn.itcast07_TCP�ϴ�ͼƬ;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class UploadClient {

	public static void main(String[] args) throws IOException {
		Socket s = new Socket("192.168.186.1",10086);
		//��װͼƬ�ļ�
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("E:\\meinv6.jpg"));
		//��װͨ���ļ�
		BufferedOutputStream bos = new BufferedOutputStream(s.getOutputStream());
		byte[] bys = new byte[1024];
		int len =0;
		while((len=bis.read(bys))!=-1){
			bos.write(bys,0,len);
			bos.flush();
		}
		s.shutdownOutput();
		//��ȡ����
		InputStream is = s.getInputStream();
		byte[] bys2 = new byte[1024];
		int len2 = is.read(bys2);
		String client = new String(bys2,0,len2);
		System.out.println(client);		
		bis.close();
		s.close();
	}

}
