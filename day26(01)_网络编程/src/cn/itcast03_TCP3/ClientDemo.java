package cn.itcast03_TCP3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/*
 * 键盘录入
 * */
public class ClientDemo {

	public static void main(String[] args) throws IOException, IOException {
		//创建客户端Socket对象
		Socket s = new Socket("192.168.186.1",7399);
		//键盘录入
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//把通道内的流给封装一下
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		String line =null;
		while((line=br.readLine())!=null){
			if("886".equals(line)){
				break;
			}
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		
		//释放资源
//		bw.close();
		br.close();
		s.close();
		
	}

}
