package cn.itcast02_cast;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
/*
 * ������Դ�ڼ���¼��
 * */
public class sendData {

	public static void main(String[] args) throws IOException {
		//����Socket������
		DatagramSocket ds =new DatagramSocket();
		//��װ����¼������
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		while((line=br.readLine())!=null){
			if("886".equals(line)){
				break;
			}
			byte[] bys =line.getBytes();
			//���ݴ��
			DatagramPacket dp = new DatagramPacket(bys, bys.length,InetAddress.getByName("192.168.186.255"),12345);
			//��������
			ds.send(dp);
		}				
		//�ͷ���Դ
		ds.close();
	}

}
