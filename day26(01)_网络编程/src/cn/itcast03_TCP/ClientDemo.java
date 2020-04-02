package cn.itcast03_TCP;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/*
 * 1.TCPЭ�鷢������ 
 * 	A:�������Ͷ˵�Socket����
 * 		��һ���ɹ�����˵�����ӽ����ɹ�
 * 	B:��ȡ�������д����
 * 	C:�ͷ���Դ
 * 
 * 
 * Connection refused: connect���ʱ��ܾ�
 * TCPЭ�飺һ��Ҫ�ȿ�������
 * */
public class ClientDemo {

	public static void main(String[] args) throws UnknownHostException, IOException {
		//�������Ͷ˵�Socket����
//		Socket(InetAddress address, int port)
//		Socket(String host, int port)
//		Socket s =new Socket(InetAddress.getByName("M51-80"), 10086);
		Socket s =new Socket("192.168.186.1", 10086);
		
//		��ȡ�������д����
//		public void getOutputStream()
		OutputStream os = s.getOutputStream();
		os.write("Hello,TCP,�����ˣ�".getBytes());
		
		//�ͷ���Դ
		s.close();
				
				
	}

}
