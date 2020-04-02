package cn.itcast08_TCP对个客户端;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server1 {

	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(3333);
		Socket s = ss.accept();
		
		//封装通道接收数据
		BufferedInputStream bis = new BufferedInputStream(s.getInputStream());
		//封装图片文件
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.jpg"));
		byte[] bys = new byte[1024];
		int len = 0;
		while((len=bis.read(bys))!=-1){
			bos.write(bys);
			bos.flush();
		}
//		告诉上传完毕
		s.shutdownInput();
		
		//给出反馈信息
		OutputStream os = s.getOutputStream();
		os.write("图片上传成功".getBytes());
		
		bis.close();
		bos.close();
		s.close();
	}

}
