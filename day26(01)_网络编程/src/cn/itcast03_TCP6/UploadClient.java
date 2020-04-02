package cn.itcast03_TCP6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class UploadClient {

	public static void main(String[] args) throws IOException {
		Socket s = new Socket("192.168.186.1",11111);
		BufferedReader br = new BufferedReader(new FileReader("ClientDemo.java"));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		String line = null;
		while((line=br.readLine())!=null){
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
//		//自定义一个终止服务器的字符
//		bw.write("over");
//		bw.newLine();
//		bw.flush();
		
		//Socket提供了一个终止功能
		s.shutdownOutput();
		
		
		//自定义一个反馈
		BufferedReader brClient = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String brLine = brClient.readLine();
		System.out.println(brLine);
		
		
//		bw.close();
		br.close();
		s.close();
	}

}
