package cn.itcast02_UDP�շ��Ż�;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Socket;
import java.net.SocketException;

public class ReceiveData {

	public static void main(String[] args) throws IOException {
		//����һ������Socket����(�����˿�)
		DatagramSocket ds = new DatagramSocket(10010);
		//����һ�����������ݰ�
		byte[] bys = new byte[1024];
//		int len = bys.length;
		DatagramPacket dp = new DatagramPacket(bys, bys.length);
		//��������
		ds.receive(dp);		
//		�������ݲ���ʾ����Ļ��(�õ�Ip��ַ������)
		String ip = dp.getAddress().getHostAddress();
		String data = new String(dp.getData(),0,dp.getLength());
		
		//���
		System.out.println("ip��ַ��"+ip+";\n"+"���͵���Ϣ��"+data);
		
		//�ͷ���Դ
		ds.close();
		
	}

}
