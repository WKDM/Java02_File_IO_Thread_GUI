package cn.itcast02;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.omg.CORBA.BooleanSeqHelper;

/*
 * 内存操作流：用于处置临时存储信息的，程序结束，数据就从内存中消失
 * 1.操作字节数组
 * 	ByteArrayOutputStream
 * 	ByteArrayInputStream
 * 2.操作字符数组
 * CharArrayWriter
 * CharArrayReader
 * 3.操作字符串数组
 * StringWriter
 * StringReader
 * */
public class IoDemo01 {

	public static void main(String[] args) throws IOException {
		
		//写数据
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		for(int x=0;x<5;x++){
			baos.write(("Hello"+x).getBytes());
		}
//		//这里的close（）是没有作用的
//		baos.close();
		byte[] bys = baos.toByteArray();
		//读数据
		ByteArrayInputStream bais = new ByteArrayInputStream(bys);
		int by = 0;
		while((by=bais.read())!=-1){
			System.out.print((char)by);
		}
		bais.close();
	}

}
