package cn.itcast10;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;

public class CaseDemo02 {

	public static void main(String[] args) throws IOException {
		//��ȡĳ���ط������ݣ��������������5�����Լ����棬�������5�ξ���Ҫ�շ�
//		File file = new File("count.txt");
//		if(!file.exists()){
//			file.createNewFile();
//		}
		Properties prop = new Properties();
		Reader r = new FileReader("count.txt");
		prop.load(r);
		String number = prop.getProperty("count");
		r.close();
		int num =Integer.parseInt(number);
		if(num>5){
			System.out.println("���Ѿ����5���ˣ������븶��");
			System.exit(0);
		}else{
			num++;
			GuessNumber.start();
			Writer w =new FileWriter("count.txt");
			String value = number.valueOf(num);
			prop.setProperty("count", value);
			prop.store(w, null);
			w.close();
		}
		
	}

}
