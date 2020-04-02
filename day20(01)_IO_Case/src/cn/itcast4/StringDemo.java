package cn.itcast4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

/*
 * 已知s.txt文件中有这样的一个字符串："hcexfgijkamdnoqrzstuvwybpl"
 * 请编写程序读取数据内容，把数据排序后写入ss.txt中
 * 
 * 分析：
 * 		A：把s.txt这个文件给做出来
 * 		B：读取该文本的内容，存储到一个字符串中
 * 		C：把字符串转换为字符数组
 * 		D：对字符进行排序
 * 		E：把排序好的字符数组转为字符串
 * 		F：把字符串再次写入ss.txt中
 * */
public class StringDemo {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new FileReader("s.txt"));
		BufferedWriter bw=new BufferedWriter(new FileWriter("ss.txt"));
		/*
		String line = null;
		while((line=br.readLine())!=null){
			String strData =line;
			char[] chs = strData.toCharArray();
			Arrays.sort(chs);
			String newStr = new String(chs);
			bw.write(newStr);
		}
		bw.close();
		br.close();
		*/
		String line = br.readLine();
		char[] chs = line.toCharArray();
		br.close();
		Arrays.sort(chs);
		String s = new String(chs);
		bw.write(s);
		bw.newLine();
		bw.flush();
		bw.close();
	}
}
