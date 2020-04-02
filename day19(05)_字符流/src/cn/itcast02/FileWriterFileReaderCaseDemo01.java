package cn.itcast02;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterFileReaderCaseDemo01 {
/*
 * OutputStreamWriter  = OutputStream + ±àÂë±í£¨GDK£© = FileWriter
 * InputStreamReader  = InputeStream +±àÂë±í£¨GDK£© =FileReader
 * */
	public static void main(String[] args)throws IOException {
		FileReader fr =new FileReader("text02.txt");
		FileWriter fw =new FileWriter("c.txt");
		int ch = 0;
		while((ch=fr.read())!=-1){
			fw.write(ch);
			fw.flush();
		}
		fw.close();
		fr.close();
	}

}
