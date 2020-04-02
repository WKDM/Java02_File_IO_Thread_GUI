package cn.itcast03_TCP4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {

	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(11122);
		Socket s = ss.accept();
		
		//封装通道内的数据流
		BufferedReader br  = new BufferedReader(new InputStreamReader(s.getInputStream()));
		//封装文本文件
		BufferedWriter bw = new BufferedWriter(new FileWriter("a.txt"));
		String line = br.readLine();
		while((line=br.readLine())!=null){
			System.out.println(line);
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		bw.close();
//		br.close();
		s.close();
	}

}
