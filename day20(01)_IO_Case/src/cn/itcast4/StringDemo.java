package cn.itcast4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

/*
 * ��֪s.txt�ļ�����������һ���ַ�����"hcexfgijkamdnoqrzstuvwybpl"
 * ���д�����ȡ�������ݣ������������д��ss.txt��
 * 
 * ������
 * 		A����s.txt����ļ���������
 * 		B����ȡ���ı������ݣ��洢��һ���ַ�����
 * 		C�����ַ���ת��Ϊ�ַ�����
 * 		D�����ַ���������
 * 		E��������õ��ַ�����תΪ�ַ���
 * 		F�����ַ����ٴ�д��ss.txt��
 * */
public class StringDemo {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new FileReader("s.txt"));
		BufferedWriter bw=new BufferedWriter(new FileWriter("ss.txt"));
		/*
		String line = null;
		while((line=br.readLine())!=null){
			String strData =line;
			char[] chs = strData.toCharArray();
			Arrays.sort(chs);
			String newStr = new String(chs);
			bw.write(newStr);
		}
		bw.close();
		br.close();
		*/
		String line = br.readLine();
		char[] chs = line.toCharArray();
		br.close();
		Arrays.sort(chs);
		String s = new String(chs);
		bw.write(s);
		bw.newLine();
		bw.flush();
		bw.close();
	}
}
