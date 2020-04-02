package cn.itcast03_TCP;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 1.TCPЭ���������� 
 * 	A:�������Ͷ˵�Socket����
 *	B:������������ӣ�����һ����Ӧ��Socket����
 * 	C:��ȡ����������ȡ���ݣ�����ʾ�ڿ���̨
 * 	D:�ͷ���Դ
 * 
 *
 * */
public class ServerData {

	public static void main(String[] args) throws IOException {
		//�������Ͷ˵�Socket����
//		ServerSocket(int port)
		ServerSocket ss = new ServerSocket(10086);		
//		������������ӣ�����һ����Ӧ��Socket����
//		public Socket accept()
		Socket s = ss.accept();		
//		��ȡ����������ȡ���ݣ�����ʾ�ڿ���̨
		InputStream is = s.getInputStream();
		byte[] bys = new byte[1024];
		int len = is.read(bys);
		String str = new String(bys,0,len);
//		�Է��ĵ�ַ
		String ip = s.getInetAddress().getHostAddress();	
		
		System.out.println(ip+"======"+str);
		
//		�ͷ���Դ
		s.close();//�ͻ��˹ر�
//		ss.close();//�������ر�
		
		
		

	}

}
