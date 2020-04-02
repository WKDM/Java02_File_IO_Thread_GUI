package cn.itcast08;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class SequenceInputStreamDemo02 {

	public static void main(String[] args) throws IOException {
		InputStream is1 = new FileInputStream("UserDao.java");
		InputStream is2 = new FileInputStream("PrintWriterDemo01.java");
		InputStream is3 = new FileInputStream("b.txt");
		
		Vector<InputStream> v = new Vector<InputStream>();
		v.add(is1);
		v.add(is2);
		v.add(is3);
		Enumeration<InputStream> en = v.elements();
		SequenceInputStream sis =new SequenceInputStream(en);
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy22.java"));
		byte[] bys = new byte[1024];
		int len = 0;
		while((len = sis.read(bys))!=-1){
			bos.write(bys,0,len);
		}
		bos.close();
		sis.close();
		
	}

}
