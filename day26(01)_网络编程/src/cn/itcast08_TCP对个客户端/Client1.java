package cn.itcast08_TCP对个客户端;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class Client1 {

	public static void main(String[] args) throws IOException {
		Socket s = new Socket("192.168.186.1",3333);
//		封装图片文件
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("E:\\meinv6.jpg"));
//		本地复制图片
//		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copyImg1.jpg"));

//		封装上传通道文件
		BufferedOutputStream bos = new BufferedOutputStream(s.getOutputStream());
		byte[] bys = new byte[1024];
		int len = 0;
		while((len=bis.read(bys))!=-1){
//			写入本地
//			bos.write(bys);
			
//			上传服务器
			bos.write(bys);
			bos.flush();
		}
		
		//告知传输完毕
		s.shutdownOutput();
		
		//接受反馈信息
		InputStream is = s.getInputStream();
		byte[] bys2 = new byte[1024];
		int len2 = is.read(bys2);
		String data = new String(bys2,0,len2);
		System.out.println(data);
		bis.close();
		s.close();
	}

}
