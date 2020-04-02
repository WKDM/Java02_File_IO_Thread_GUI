package cn.itcast02;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.omg.CORBA.BooleanSeqHelper;

/*
 * �ڴ�����������ڴ�����ʱ�洢��Ϣ�ģ�������������ݾʹ��ڴ�����ʧ
 * 1.�����ֽ�����
 * 	ByteArrayOutputStream
 * 	ByteArrayInputStream
 * 2.�����ַ�����
 * CharArrayWriter
 * CharArrayReader
 * 3.�����ַ�������
 * StringWriter
 * StringReader
 * */
public class IoDemo01 {

	public static void main(String[] args) throws IOException {
		
		//д����
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		for(int x=0;x<5;x++){
			baos.write(("Hello"+x).getBytes());
		}
//		//�����close������û�����õ�
//		baos.close();
		byte[] bys = baos.toByteArray();
		//������
		ByteArrayInputStream bais = new ByteArrayInputStream(bys);
		int by = 0;
		while((by=bais.read())!=-1){
			System.out.print((char)by);
		}
		bais.close();
	}

}
