package cn.itcast03_TCP;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/*
 * 1.TCP协议发送数据 
 * 	A:创建发送端的Socket对象
 * 		这一步成功，就说明连接建立成功
 * 	B:获取输出流，写数据
 * 	C:释放资源
 * 
 * 
 * Connection refused: connect访问被拒绝
 * TCP协议：一定要先开服务器
 * */
public class ClientDemo {

	public static void main(String[] args) throws UnknownHostException, IOException {
		//创建发送端的Socket对象
//		Socket(InetAddress address, int port)
//		Socket(String host, int port)
//		Socket s =new Socket(InetAddress.getByName("M51-80"), 10086);
		Socket s =new Socket("192.168.186.1", 10086);
		
//		获取输出流，写数据
//		public void getOutputStream()
		OutputStream os = s.getOutputStream();
		os.write("Hello,TCP,我来了！".getBytes());
		
		//释放资源
		s.close();
				
				
	}

}
