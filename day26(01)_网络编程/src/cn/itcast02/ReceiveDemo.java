package cn.itcast02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/*
 * UDP协议接收数据：
 * 	A:创建一个Socket对象
 * 	B:创建一个包对象（接收容器）
 * 	C:调用Socket中的方法，接收数据
 * 	D:解析数据包，并显示在屏幕上
 * 	E:释放资源 
 * */
public class ReceiveDemo {

	public static void main(String[] args) throws IOException {
		//A:创建一个Socket对象
		DatagramSocket ds = new DatagramSocket(10086);
		//B:创建一个包对象（接收数据包）
		byte[] bys = new byte[1024];
		int length = bys.length;
		DatagramPacket dp =new DatagramPacket(bys,length);		
		
		//C:调用Socket中的方法，接收数据包
//		public void receive(DategramPacket)
		ds.receive(dp);	//阻塞式方法	
		//D:解析数据包，并显示在屏幕上
//		获取对方发ip
		InetAddress address = dp.getAddress();
		String ip = address.getHostAddress();
		
		
//		public void getData():获取数据缓冲区
//		public void getLength():获取数据的实际长度
		byte[] by2 = dp.getData();
		int len = dp.getLength();
		String str = new String(by2,0,len);
		System.out.println(ip+":"+str);
		
		//E:释放资源

	}

}
