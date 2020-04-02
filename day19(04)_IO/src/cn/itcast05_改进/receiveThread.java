package cn.itcast05_�Ľ�;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class receiveThread implements Runnable {
	private DatagramSocket ds;
	public receiveThread(DatagramSocket ds){
		this.ds = ds;
	}
	@Override
	public void run() {
		try {
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
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
