package cn.itcast02_cast;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class receiveData {

	public static void main(String[] args) throws IOException {
		//创建Socket对象
		DatagramSocket ds =new DatagramSocket(12345);
		while(true){
			byte[] bys = new byte[1024];
			//创建包对象
			DatagramPacket dp =new DatagramPacket(bys,bys.length);
			//接受数据
			ds.receive(dp);		
			//解析数据并显示大屏上(获取IP地址、获取接受的消息)
			String ip = dp.getAddress().getHostAddress();
			String data = new String(dp.getData(),0,dp.getLength());
			System.out.println("ip:"+ip+",\ndata:"+data);
		}
		//释放资源
//		ds.close();
	}

}
