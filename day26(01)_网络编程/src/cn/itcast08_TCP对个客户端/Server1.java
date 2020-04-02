package cn.itcast08_TCP�Ը��ͻ���;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server1 {

	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(3333);
		Socket s = ss.accept();
		
		//��װͨ����������
		BufferedInputStream bis = new BufferedInputStream(s.getInputStream());
		//��װͼƬ�ļ�
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.jpg"));
		byte[] bys = new byte[1024];
		int len = 0;
		while((len=bis.read(bys))!=-1){
			bos.write(bys);
			bos.flush();
		}
//		�����ϴ����
		s.shutdownInput();
		
		//����������Ϣ
		OutputStream os = s.getOutputStream();
		os.write("ͼƬ�ϴ��ɹ�".getBytes());
		
		bis.close();
		bos.close();
		s.close();
	}

}
