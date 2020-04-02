package cn.itcast03_TCP6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.text.DefaultEditorKit.CopyAction;

import cn.itcast03_TCP5.ServerDemo;

public class UploadServer {

	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(11111);
		Socket s = ss.accept();
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		BufferedWriter bw = new BufferedWriter(new FileWriter("copy.java"));
		String line =null;
		while((line=br.readLine())!=null){
//			if("over".equals(line)){
//				break;
//			}
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		//Socket提供的终止功能
		s.shutdownInput();
		
		//上传后给出反馈
		BufferedWriter bwServer = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		bwServer.write("文件上传成功");
		bwServer.newLine();
		bwServer.flush();
		
		
		
		br.close();
		bw.close();
		s.close();
	}

}
