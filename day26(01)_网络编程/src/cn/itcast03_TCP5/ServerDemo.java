package cn.itcast03_TCP5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {

	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(11222);
		Socket s = ss.accept();
		//��װͨ������
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
//		//��ס�ı�����
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter())
		String line = null;
		while((line=br.readLine())!=null){
			System.out.println(line);			
		}
		br.close();
		s.close();
	}

}
