package cn.itcast02_cast;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class receiveData {

	public static void main(String[] args) throws IOException {
		//����Socket����
		DatagramSocket ds =new DatagramSocket(12345);
		while(true){
			byte[] bys = new byte[1024];
			//����������
			DatagramPacket dp =new DatagramPacket(bys,bys.length);
			//��������
			ds.receive(dp);		
			//�������ݲ���ʾ������(��ȡIP��ַ����ȡ���ܵ���Ϣ)
			String ip = dp.getAddress().getHostAddress();
			String data = new String(dp.getData(),0,dp.getLength());
			System.out.println("ip:"+ip+",\ndata:"+data);
		}
		//�ͷ���Դ
//		ds.close();
	}

}
