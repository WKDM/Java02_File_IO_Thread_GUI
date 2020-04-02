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
 * 数据来源于键盘录入
 * */
public class sendData {

	public static void main(String[] args) throws IOException {
		//创建Socket对象发送
		DatagramSocket ds =new DatagramSocket();
		//封装键盘录入数据
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		while((line=br.readLine())!=null){
			if("886".equals(line)){
				break;
			}
			byte[] bys =line.getBytes();
			//数据打包
			DatagramPacket dp = new DatagramPacket(bys, bys.length,InetAddress.getByName("192.168.186.255"),12345);
			//发送数据
			ds.send(dp);
		}				
		//释放资源
		ds.close();
	}

}
