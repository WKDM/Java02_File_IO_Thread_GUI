package cn.itcast09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Writer;

public class ObjectOutputStreamDemo {
/*
 * 把对象按照流一样的方式存入文本文档或者在网络中传输，	对象--流数据（ObjectOutputStream）
 * 把文本中的流对象数据或者网络中的流对象数据还原成对象 流数据---对象（ObjectInputStream）
 * */
	public static void main(String[] args) throws Exception {
		//由于我们要对对象序列化，所以我们要创建类对象
		//序列化基本对象写入文件
//		writer();
		//反序列化解析
		reader();

	}

private static void reader() throws Exception {
	ObjectInputStream ois = new ObjectInputStream(new FileInputStream("oos.txt"));
	Object ob = ois.readObject();
	System.out.println(ob);
	ois.close();
}

private static void writer() throws IOException {
	ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("oos.txt"));
	Person p = new Person("杨紫",23);
	oos.writeObject(p);
	oos.close();
}

}
