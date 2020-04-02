package cn.itcast02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

/*
 * UDPЭ�鷢�����ݣ�
 * 	A:�������Ͷ�UDP����
 * 	B:�������ݣ��������ݴ��
 * 	C:����Socket����ķ�����������
 * 	D:�ͷ���Դ 
 * 		
 * */
public class sendData {

	public static void main(String[] args) throws IOException {
//		A:�������Ͷ�UDP���� DatagramSocket
		DatagramSocket ds = new DatagramSocket();
		
//		B:�������ݣ��������ݴ�� DategramPacket(byte[] buf,int length,InetAddress address,int port)
		byte[] bys = "Hello,world,Upd,�����ˣ�".getBytes();
		int length = bys.length;
		InetAddress address = InetAddress.getByName("DESKTOP-GVBDHVG");
		int port = 10086;
		DatagramPacket	dp = new DatagramPacket(bys, length, address,port);
		
//		C:����Socket����ķ����������� public void send(DategramPacket dp)
		ds.send(dp);
//		D:�ͷ���Դ
		ds.close();
	}

}
