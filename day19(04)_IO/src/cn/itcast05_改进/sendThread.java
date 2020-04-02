package cn.itcast05_�Ľ�;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class sendThread implements Runnable {
	private DatagramSocket ds;
	public sendThread(DatagramSocket ds){
		this.ds = ds;
	}
	@Override
	public void run() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String line = null;
			while((line=br.readLine())!=null){
				if("886".equals(line)){
					break;
				}
				byte[] bys =line.getBytes();
				//���ݴ��
				DatagramPacket dp = new DatagramPacket(bys, bys.length,InetAddress.getByName("192.168.186.255"),12306);
				//��������
				ds.send(dp);
			}			
		}catch (IOException e) {
			e.printStackTrace();
		} 
	}

}
