package cn.itcast05_定时器;
/*
 * 需求：在制定的时间删除制定的目录
 * */

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.SimpleFormatter;

class deleteFolder extends TimerTask{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		File srcFolder = new File("demo1");
		deleteFile(srcFolder);
	}

	private void deleteFile(File srcFolder) {
		File[] arrayFile = srcFolder.listFiles();
		if(arrayFile!=null){
			for(File file:arrayFile){
				if(file.isDirectory()){
					deleteFile(file);
				}else{
					System.out.println(file.getName()+":"+file.delete());
				}
			}
			System.out.println(srcFolder.getName()+":"+srcFolder.delete());	
		}		
	}
	
}
public class TimerTest {
	public static void main(String[] args) throws ParseException {
		Timer t = new Timer();
		String s = "2020-01-04 23:42:00" ;
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date d = sf.parse(s);
		t.schedule(new deleteFolder(), d);
	}
}
