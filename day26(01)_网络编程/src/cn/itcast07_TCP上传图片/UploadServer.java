package cn.itcast07_TCP上传图片;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class UploadServer {

	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(10086);
		Socket s = ss.accept();
		//封装通道
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("E:\\meinv6.jpg"));
		//封装图片文件
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("coptImg.jpg"));
		byte[] bys = new byte[1024];
		int len=0;
		while((len = bis.read(bys))!=-1){
			bos.write(bys);
			bos.flush();
		}		
		s.shutdownInput();
		//发送反馈
		OutputStream os = s.getOutputStream();
		os.write("图片上传成功".getBytes());
		
		bos.close();
		s.close();
	}

}
