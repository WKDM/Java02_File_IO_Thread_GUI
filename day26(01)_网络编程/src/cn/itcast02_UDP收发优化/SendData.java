package cn.itcast02_UDP�շ��Ż�;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class SendData {

	public static void main(String[] args) throws IOException {
		//�������Ͷ˵�Socket����
		DatagramSocket ds = new DatagramSocket();
		//�������͵�����
		byte[] bys = "Hello,������UDP��".getBytes();
		//���������󲢴��
		DatagramPacket dp = new DatagramPacket(bys, bys.length,InetAddress.getByName("DESKTOP-GVBDHVG"),10010);
		//���Ͱ�
		ds.send(dp);
		//�ͷ���Դ
		ds.close();
	}

}
