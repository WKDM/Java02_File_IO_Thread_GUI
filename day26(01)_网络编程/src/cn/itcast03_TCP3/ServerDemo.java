package cn.itcast03_TCP3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {

	public static void main(String[] args) throws IOException {
		//创建ServerSocket对象
		ServerSocket ss = new ServerSocket(7399);
		//创建Socket对象
		Socket s = ss.accept();
		//包装通道输出流
		BufferedReader br= new BufferedReader(new InputStreamReader(s.getInputStream()));
		String line = null;
		while((line = br.readLine())!=null){
			System.out.println(line);
		}
//		br.close();
		s.close();
	}

}
