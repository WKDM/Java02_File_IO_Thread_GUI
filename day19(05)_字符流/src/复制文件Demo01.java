import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ¸´ÖÆÎÄ¼þDemo01 {

	public static void main(String[] args) throws IOException{
		InputStreamReader isr =new InputStreamReader(new FileInputStream("text02.txt"));
		OutputStreamWriter osw =new OutputStreamWriter(new FileOutputStream("b.txt"));
		
		char[] chs = new char[1024];
		int len=0;
		while((len=isr.read(chs))!=-1){
			osw.write(chs, 0, len);
			osw.flush();
		}
		osw.close();
		isr.close();

	}

}
