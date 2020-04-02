package cn.itcast02_UDP收发优化;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class SendData {

	public static void main(String[] args) throws IOException {
		//创建发送端的Socket对象
		DatagramSocket ds = new DatagramSocket();
		//创建发送的数据
		byte[] bys = "Hello,我来了UDP！".getBytes();
		//创建包对象并打包
		DatagramPacket dp = new DatagramPacket(bys, bys.length,InetAddress.getByName("DESKTOP-GVBDHVG"),10010);
		//发送包
		ds.send(dp);
		//释放资源
		ds.close();
	}

}
