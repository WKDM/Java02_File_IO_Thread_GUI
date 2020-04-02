package cn.itcast07;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Reader;

/*
 * 随机访问流：
 * RandomAccessFile不属于数据流，他属于object的子类
 * 但是他融合了InputStream和OutputStream的读写功能
 *  public RandomAccessFile(String name,String mode)：第一个参数是操作文件的路径，第二个参数是操作文件的模式。
 *  	r:只读
 *  	rw：即读又写
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
		System.out.println("当前文件的指针位置是："+raf.getFilePointer());
		char ch = raf.readChar();
		System.out.println(ch);
		System.out.println("当前文件的指针位置是："+raf.getFilePointer());
		String string = raf.readUTF();		
		System.out.println(string);
		System.out.println("当前文件的指针位置是："+raf.getFilePointer());
		System.out.println("");
		
		
		//我不想从头开始，我就想找到a：使用seek
		raf.seek(4); 
		ch = raf.readChar();
		System.out.println(ch);
		
		raf.close();
		
	}

	private static void writer() throws IOException {
		RandomAccessFile raf = new RandomAccessFile("raf.txt", "rw");
		raf.writeInt(100);
		raf.writeChar('a');
		raf.writeUTF("您好China");
		raf.close();
	}

}
