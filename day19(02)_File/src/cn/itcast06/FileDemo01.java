package cn.itcast06;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.xml.crypto.Data;

/*
 * public String getAbsolutePath()��ȡ����·��
 *public String getPath()��ȡ���·��
 *public String getName()��ȡ����
 *public long length()��ȡ���ȣ��ַ����ࣩ
 *public long lastModified()��ȡ���һ�ε��޸�ʱ��(���غ���ֵ)
 * */
public class FileDemo01 {
	public static void main(String[] args) {
		File f1 = new File("text.txt");
		System.out.println("getAbsolutePath:"+f1.getAbsolutePath());
		System.out.println("getPath:"+f1.getPath());
		System.out.println("getName:"+f1.getName());
		System.out.println("length:"+f1.length());
		System.out.println("lastModified:"+f1.lastModified());	
		Date date = new Date(1574607216901L);
		SimpleDateFormat spf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String d =spf.format(date);
		System.out.println(d);
		
	}

}
