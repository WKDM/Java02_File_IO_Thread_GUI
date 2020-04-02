package cn.itcast03_TCP2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientDemo {

	public static void main(String[] args) throws IOException, IOException {
//		创建客户端Socket对象
		Socket s = new Socket("192.168.186.1",9999);
		//创建输出流
		OutputStream os = s.getOutputStream();
		os.write("今天适合睡觉".getBytes());
		
		//获取输入流
		InputStream is = s.getInputStream();
		byte[] bys = new byte[1024];
		int len = is.read(bys);
		String string = new String(bys,0,len);
		System.out.println("Server的反馈："+string);
		
		s.close();
	}

}
