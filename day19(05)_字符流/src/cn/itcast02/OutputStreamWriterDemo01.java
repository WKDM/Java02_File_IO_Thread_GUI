package cn.itcast02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class OutputStreamWriterDemo01 {

	public static void main(String[] args) throws IOException{
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("txt02.txt"));
//		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("txt03.txt"),"utf-8");
		osw.write("ÄúºÃ£¬ÖÐ¹úChina");
		osw.close();
	}

}
