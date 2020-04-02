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
 * 这里的集合必须是Properties
 * public void load(Reader reader):把文件中的内容读到集合中
 * public void store(Writer writer,String comments)：把集合中的数据读到文本文件中去
 * 
 * */
	public static void main(String[] args) throws IOException{
		myload();
		mystore();
	}

private static void mystore() throws IOException {
	Properties p2 = new Properties();
	p2.setProperty("王可","20");
	p2.setProperty("罗家峪","22");
	p2.setProperty("淮安","21");
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
