package cn.itcast10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;
import java.util.Set;

public class CaseDemo01 {
/*
 * 我有一个文本文件（user.txt）,我知道数据是键值对形势的，但是不知道内容是什么，
 * 倾斜一个判断是否有‘lisi’这样的健存在，如果有改变其为"100"
 * 
 *分析：
 *	A:把文件中的数据加载到集合中
 *	B:遍历集合，获取键
 *	C:判断键中是否为“lisi”的键，有就将其改为“100”
 *	D:把集合中的数据重新存储到文件中
 * */
	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		Reader r =new FileReader("user.txt");
		prop.load(r);
		r.close();
		//遍历集合得到lisi键
		Set<String> set=prop.stringPropertyNames();
		for(String key:set){
			//判断lisi键是否存在
			if("lisi".equals(key)){
				//存在就修改为：100
				prop.setProperty(key, "100");
				break;
			}
		}
		Writer w = new FileWriter("user.txt");
		//把集合中的键值重新存存储的文本文件中去
		prop.store(w, null);
	}

}
