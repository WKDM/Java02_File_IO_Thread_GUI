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
 * �Ѷ�������һ���ķ�ʽ�����ı��ĵ������������д��䣬	����--�����ݣ�ObjectOutputStream��
 * ���ı��е����������ݻ��������е����������ݻ�ԭ�ɶ��� ������---����ObjectInputStream��
 * */
	public static void main(String[] args) throws Exception {
		//��������Ҫ�Զ������л�����������Ҫ���������
		//���л���������д���ļ�
//		writer();
		//�����л�����
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
	Person p = new Person("����",23);
	oos.writeObject(p);
	oos.close();
}

}
