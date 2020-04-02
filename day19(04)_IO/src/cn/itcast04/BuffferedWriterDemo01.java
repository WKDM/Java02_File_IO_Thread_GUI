package cn.itcast04;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class BuffferedWriterDemo01 {

	public static void main(String[] args) throws IOException {
//		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(new FileOutputStream("t1.txt")));
		BufferedWriter bw = new BufferedWriter(new FileWriter("t1.txt"));
		bw.write("ÄúºÃÂð");
		bw.flush();
		bw.close();
	}

}
