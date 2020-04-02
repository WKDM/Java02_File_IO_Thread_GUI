package cn.itcast09_TCP多个服务器;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class UpLoadServer {

	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(33333);
		while(true){
			Socket s = ss.accept();
			new Thread(new UseThread(s)).start();
		}
	}

}
