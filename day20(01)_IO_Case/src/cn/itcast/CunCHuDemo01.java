package cn.itcast;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 * 需求：把ArrayList中的字符串存储到文本文档中去
 * 
 * 分析：
 * ArrayList数据，遍历他得到每一个对象
 * 写入数据
 * */
public class CunCHuDemo01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		BufferedWriter fw =new BufferedWriter(new FileWriter("arraylist.txt"));
		al.add("Hello");
		al.add("java");
		al.add("您好");
		System.out.println(al);
		for(String date:al){
			fw.write(date);
			fw.newLine();
			fw.flush();
		}
		fw.close();
	}

}
