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
 * NIO在JDK4中就出现了，提供了提供了IO流的操作效率
 * 
 * JDK7之后的nio
 * path：路径
 * paths：有一个静态方法返回一个路径
 *			public static Path get(URL url)：
 *Files：提供了静态方法供我们使用
 *	public static long copy(path source,OutStream out):复制文件
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
