package cn.itcast04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * Buffered的特殊方法：
 * 		BufferedWrite:
 * 			public void newWrite():根据系统来决定换行符
 * 		BufferedReader:
 * 			public void readLine():一次读取一行数据
 * */
public class BufferedDemo {

	public static void main(String[] args) throws IOException{
//		write();
		read();
	}

	private static void read() throws IOException {
		BufferedReader br2 = new BufferedReader(new FileReader("t2.txt"));
		String lines = null;
		while((lines = br2.readLine())!=null){
			System.out.println(lines);
		}
		br2.close();
	}

	private static void write() throws IOException{
		BufferedWriter bw2 = new BufferedWriter(new FileWriter("t2.txt"));
		for(int x=0;x<10;x++){
			bw2.write("hello"+x);
			bw2.newLine();
			bw2.flush();
		}
		bw2.close();
		
	}

}
