import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/*
 * NIO��JDK4�оͳ����ˣ��ṩ���ṩ��IO���Ĳ���Ч��
 * 
 * JDK7֮���nio
 * path��·��
 * paths����һ����̬��������һ��·��
 *			public static Path get(URL url)��
 *Files���ṩ�˾�̬����������ʹ��
 *	public static long copy(path source,OutStream out):�����ļ�
 *	public static Path write(Path path,Iterable<? extends Charquence> line,Charset)
 *
 * */
public class NIODemo01 {
	public static void main(String[] args) throws IOException {
		//Files.copy(Paths.get("copy1.java"),new FileOutputStream("filedome01.txt"));
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("world");
		arrayList.add("java");
		arrayList.add("hello");
		Files.write(Paths.get("arrayList.txt"), arrayList, Charset.forName("GBK"));
	}
}
