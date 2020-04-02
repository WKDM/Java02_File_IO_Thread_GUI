package cn.itcast06;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.xml.crypto.Data;

/*
 * public String getAbsolutePath()获取绝对路径
 *public String getPath()获取相对路径
 *public String getName()获取名称
 *public long length()获取长度（字符长多）
 *public long lastModified()获取最后一次的修改时间(返回毫秒值)
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
