package cn.itcast01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/*
 * ���ʵ�����ݵĻ��У�
 * windows:\r\n
 * linux:\n
 * mac:\r
 * �����Ķ�����ʶ��
 * 
 * ���ʵ�����ݵ�׷��д�룿
 * 
 * 
 * 
 * */
public class IODemo02 {

	public static void main(String[] args) throws IOException {
		//�����ֽ�������	
		FileOutputStream ops = new FileOutputStream("txt2.txt",true);
		for(int i = 0;i<=10;i++){
			ops.write(("Hello"+i).getBytes());
			ops.write("\n".getBytes());
		}
		//�ر�����
		ops.close();
	}

}
