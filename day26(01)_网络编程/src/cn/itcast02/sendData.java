package cn.itcast02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

/*
 * UDP协议发送数据：
 * 	A:创建发送端UDP对象
 * 	B:创建数据，并把数据打包
 * 	C:调用Socket对象的方法发送数据
 * 	D:释放资源 
 * 		
 * */
public class sendData {

	public static void main(String[] args) throws IOException {
//		A:创建发送端UDP对象 DatagramSocket
		DatagramSocket ds = new DatagramSocket();
		
//		B:创建数据，并把数据打包 DategramPacket(byte[] buf,int length,InetAddress address,int port)
		byte[] bys = "Hello,world,Upd,我来了！".getBytes();
		int length = bys.length;
		InetAddress address = InetAddress.getByName("DESKTOP-GVBDHVG");
		int port = 10086;
		DatagramPacket	dp = new DatagramPacket(bys, length, address,port);
		
//		C:调用Socket对象的方法发送数据 public void send(DategramPacket dp)
		ds.send(dp);
//		D:释放资源
		ds.close();
	}

}
