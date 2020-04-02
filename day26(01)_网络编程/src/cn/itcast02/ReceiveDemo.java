package cn.itcast02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/*
 * UDPЭ��������ݣ�
 * 	A:����һ��Socket����
 * 	B:����һ�������󣨽���������
 * 	C:����Socket�еķ�������������
 * 	D:�������ݰ�������ʾ����Ļ��
 * 	E:�ͷ���Դ 
 * */
public class ReceiveDemo {

	public static void main(String[] args) throws IOException {
		//A:����һ��Socket����
		DatagramSocket ds = new DatagramSocket(10086);
		//B:����һ�������󣨽������ݰ���
		byte[] bys = new byte[1024];
		int length = bys.length;
		DatagramPacket dp =new DatagramPacket(bys,length);		
		
		//C:����Socket�еķ������������ݰ�
//		public void receive(DategramPacket)
		ds.receive(dp);	//����ʽ����	
		//D:�������ݰ�������ʾ����Ļ��
//		��ȡ�Է���ip
		InetAddress address = dp.getAddress();
		String ip = address.getHostAddress();
		
		
//		public void getData():��ȡ���ݻ�����
//		public void getLength():��ȡ���ݵ�ʵ�ʳ���
		byte[] by2 = dp.getData();
		int len = dp.getLength();
		String str = new String(by2,0,len);
		System.out.println(ip+":"+str);
		
		//E:�ͷ���Դ

	}

}
