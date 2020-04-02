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
 * ����һ���ı��ļ���user.txt��,��֪�������Ǽ�ֵ�����Ƶģ����ǲ�֪��������ʲô��
 * ��бһ���ж��Ƿ��С�lisi�������Ľ����ڣ�����иı���Ϊ"100"
 * 
 *������
 *	A:���ļ��е����ݼ��ص�������
 *	B:�������ϣ���ȡ��
 *	C:�жϼ����Ƿ�Ϊ��lisi���ļ����оͽ����Ϊ��100��
 *	D:�Ѽ����е��������´洢���ļ���
 * */
	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		Reader r =new FileReader("user.txt");
		prop.load(r);
		r.close();
		//�������ϵõ�lisi��
		Set<String> set=prop.stringPropertyNames();
		for(String key:set){
			//�ж�lisi���Ƿ����
			if("lisi".equals(key)){
				//���ھ��޸�Ϊ��100
				prop.setProperty(key, "100");
				break;
			}
		}
		Writer w = new FileWriter("user.txt");
		//�Ѽ����еļ�ֵ���´�洢���ı��ļ���ȥ
		prop.store(w, null);
	}

}
