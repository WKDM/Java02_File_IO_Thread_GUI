package cn.itcast04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CaseDemo01 {
	public static void main(String[] args) throws IOException {
		
		//·½·¨Ò»£º
/*		BufferedReader br = new BufferedReader(new FileReader("PrintWriterDemo01.java"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("copy.java"));
		String line = null;
		while((line = br.readLine())!=null){
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		bw.close();
		br.close();
*/
		BufferedReader br = new BufferedReader(new FileReader("PrintWriterDemo01.java"));
		PrintWriter pw = new PrintWriter(new FileWriter("copy1.java"),true);
		String line = null;
		while((line =br.readLine())!=null){
			pw.println(line);
		}
		pw.close();
		br.close();
		
		
	}
}
