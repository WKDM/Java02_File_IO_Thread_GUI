package cn.itcast03_TCP;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 1.TCP协议服务端数据 
 * 	A:创建发送端的Socket对象
 *	B:监听服务端连接，返回一个对应的Socket对象
 * 	C:获取输入流，读取数据，并显示在控制台
 * 	D:释放资源
 * 
 *
 * */
public class ServerData {

	public static void main(String[] args) throws IOException {
		//创建发送端的Socket对象
//		ServerSocket(int port)
		ServerSocket ss = new ServerSocket(10086);		
//		监听服务端连接，返回一个对应的Socket对象
//		public Socket accept()
		Socket s = ss.accept();		
//		获取输入流，读取数据，并显示在控制台
		InputStream is = s.getInputStream();
		byte[] bys = new byte[1024];
		int len = is.read(bys);
		String str = new String(bys,0,len);
//		对方的地址
		String ip = s.getInetAddress().getHostAddress();	
		
		System.out.println(ip+"======"+str);
		
//		释放资源
		s.close();//客户端关闭
//		ss.close();//服务器关闭
		
		
		

	}

}
