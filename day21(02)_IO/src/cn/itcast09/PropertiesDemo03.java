package cn.itcast09;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;

public class PropertiesDemo03 {
/*
 * ����ļ��ϱ�����Properties
 * public void load(Reader reader):���ļ��е����ݶ���������
 * public void store(Writer writer,String comments)���Ѽ����е����ݶ����ı��ļ���ȥ
 * 
 * */
	public static void main(String[] args) throws IOException{
		myload();
		mystore();
	}

private static void mystore() throws IOException {
	Properties p2 = new Properties();
	p2.setProperty("����","20");
	p2.setProperty("�޼���","22");
	p2.setProperty("����","21");
	Writer w = new FileWriter("mystore.txt");
	p2.store(w, "HelloWorld");
	w.close();
}

private static void myload() throws IOException {
	Properties p1 = new Properties();
	Reader r = new FileReader("Properties.txt");
	p1.load(r);
	System.out.println(p1);
	r.close();
}

}
