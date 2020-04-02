package cn.itcast08;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;

import javax.sound.sampled.Line;

public class SequenceInputStreamDemo {
/*
 * 之前是：
 * 	a.txt------c.txt
 * 	b.txt------d.txt
 * 现在：
 * 	a.txt+b.txt-------c.txt
 * */
	public static void main(String[] args) throws IOException {
		InputStream is1 = new FileInputStream("UserDao.java");
		InputStream is2 = new FileInputStream("PrintWriterDemo01.java");
		
		SequenceInputStream sis = new SequenceInputStream(is1,is2);
		BufferedOutputStream bops = new BufferedOutputStream(new FileOutputStream("d.txt"));
		byte[] bys = new byte[1024];
		int len = 0;
		while((len = sis.read(bys))!=-1){
			bops.write(bys,0,len);
		}
		bops.close();
		sis.close();
	}
}
