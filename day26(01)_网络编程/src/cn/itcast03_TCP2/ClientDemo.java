package cn.itcast03_TCP2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientDemo {

	public static void main(String[] args) throws IOException, IOException {
//		�����ͻ���Socket����
		Socket s = new Socket("192.168.186.1",9999);
		//���������
		OutputStream os = s.getOutputStream();
		os.write("�����ʺ�˯��".getBytes());
		
		//��ȡ������
		InputStream is = s.getInputStream();
		byte[] bys = new byte[1024];
		int len = is.read(bys);
		String string = new String(bys,0,len);
		System.out.println("Server�ķ�����"+string);
		
		s.close();
	}

}
