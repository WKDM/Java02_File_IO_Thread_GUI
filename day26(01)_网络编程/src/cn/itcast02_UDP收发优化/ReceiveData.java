package cn.itcast02_UDP收发优化;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Socket;
import java.net.SocketException;

public class ReceiveData {

	public static void main(String[] args) throws IOException {
		//创建一个接受Socket对象(包含端口)
		DatagramSocket ds = new DatagramSocket(10010);
		//创建一个包接收数据包
		byte[] bys = new byte[1024];
//		int len = bys.length;
		DatagramPacket dp = new DatagramPacket(bys, bys.length);
		//接收数据
		ds.receive(dp);		
//		解析数据并显示在屏幕上(得到Ip地址和内容)
		String ip = dp.getAddress().getHostAddress();
		String data = new String(dp.getData(),0,dp.getLength());
		
		//输出
		System.out.println("ip地址："+ip+";\n"+"发送的消息："+data);
		
		//释放资源
		ds.close();
		
	}

}
