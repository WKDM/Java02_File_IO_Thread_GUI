package cn.itcast;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class SuiJiChanSheng {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("b.txt"));
		ArrayList<String> list1 =new ArrayList<String>();
		String line =null;
		while((line = br.readLine())!=null){
			list1.add(line);
		}
		br.close();
		Random r = new Random();
		int index = r.nextInt(list1.size());
		String name = list1.get(index);
		System.out.println(name);		
	} 
}
