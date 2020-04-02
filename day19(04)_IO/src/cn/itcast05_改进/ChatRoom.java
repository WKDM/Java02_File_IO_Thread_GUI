package cn.itcast05_�Ľ�;

import java.io.IOException;
import java.net.DatagramSocket;
import java.net.SocketException;

/*
 * ���߳�ʵ�֣��������ֽ��ܵ�������
 * */
public class ChatRoom {

	public static void main(String[] args) throws IOException {
		DatagramSocket dssend = new DatagramSocket();
		DatagramSocket dsreceive = new DatagramSocket(12306);
		
		sendThread st = new sendThread(dssend);
		receiveThread rt = new receiveThread(dsreceive);
		
		Thread t1 = new Thread(st);
		Thread t2 = new Thread(rt);
		t1.start();
		t2.start();
	}

}
