package cn.itcast04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.FieldPosition;

public class BufferedReaderDemo02 {

	
	public static void main(String[] args) throws IOException{
		BufferedReader br =new BufferedReader(new FileReader("t1.txt"));
		char[] ch = new char[1024];
		int len=0;
		while((len=br.read(ch))!=-1){
			System.out.println(new String(ch,0,len));
		}
		br.close();
	}

}
