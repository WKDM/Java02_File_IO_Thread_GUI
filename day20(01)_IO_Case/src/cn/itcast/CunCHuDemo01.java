package cn.itcast;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 * ���󣺰�ArrayList�е��ַ����洢���ı��ĵ���ȥ
 * 
 * ������
 * ArrayList���ݣ��������õ�ÿһ������
 * д������
 * */
public class CunCHuDemo01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		BufferedWriter fw =new BufferedWriter(new FileWriter("arraylist.txt"));
		al.add("Hello");
		al.add("java");
		al.add("����");
		System.out.println(al);
		for(String date:al){
			fw.write(date);
			fw.newLine();
			fw.flush();
		}
		fw.close();
	}

}
