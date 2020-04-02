package cn.itcast;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class DuQuToArrayList {
	public static void main(String[] args) throws IOException {
		String srcString = "b.txt";
		ArrayList<String> list = new ArrayList<String>();
		BufferedReader br = new BufferedReader(new FileReader(srcString));
		String line = null;
		while((line = br.readLine())!=null){
			list.add(line);
		}
		br.close();
		System.out.println(list);
	}
}
