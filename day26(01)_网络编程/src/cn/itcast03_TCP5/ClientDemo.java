package cn.itcast03_TCP5;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/*
 * 客户端读取文本文件服务器控制台输出
 * */
public class ClientDemo {

	public static void main(String[] args) throws IOException {
		Socket s = new Socket("192.168.186.1",11222);
		//封装读取文本数据
		BufferedReader br = new BufferedReader(new FileReader("a.txt"));
		//封装通道数据
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		String line = null;
		while((line=br.readLine())!=null){
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		bw.close();
		br.close();
		s.close();
	}

}
