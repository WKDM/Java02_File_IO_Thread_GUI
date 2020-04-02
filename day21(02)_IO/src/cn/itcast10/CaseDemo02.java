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
		//读取某个地方的数据，如果次数不大于5，可以继续玩，如果超过5次就需要收费
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
			System.out.println("您已经玩过5次了，想玩请付费");
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
