package cn.itcast07;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Reader;

/*
 * �����������
 * RandomAccessFile��������������������object������
 * �������ں���InputStream��OutputStream�Ķ�д����
 *  public RandomAccessFile(String name,String mode)����һ�������ǲ����ļ���·�����ڶ��������ǲ����ļ���ģʽ��
 *  	r:ֻ��
 *  	rw��������д
 * */
public class RandomAccessDemo {

	public static void main(String[] args) throws IOException {
//		writer();
		reader();
	}

	private static void reader() throws IOException {
		RandomAccessFile raf = new RandomAccessFile("raf.txt", "rw");
		int x = raf.readInt();
		System.out.println(x);
		System.out.println("��ǰ�ļ���ָ��λ���ǣ�"+raf.getFilePointer());
		char ch = raf.readChar();
		System.out.println(ch);
		System.out.println("��ǰ�ļ���ָ��λ���ǣ�"+raf.getFilePointer());
		String string = raf.readUTF();		
		System.out.println(string);
		System.out.println("��ǰ�ļ���ָ��λ���ǣ�"+raf.getFilePointer());
		System.out.println("");
		
		
		//�Ҳ����ͷ��ʼ���Ҿ����ҵ�a��ʹ��seek
		raf.seek(4); 
		ch = raf.readChar();
		System.out.println(ch);
		
		raf.close();
		
	}

	private static void writer() throws IOException {
		RandomAccessFile raf = new RandomAccessFile("raf.txt", "rw");
		raf.writeInt(100);
		raf.writeChar('a');
		raf.writeUTF("����China");
		raf.close();
	}

}
