import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Vector;

public class ThreadDemo {

	public static void main(String[] args) {
		//�̰߳�ȫ����
		StringBuffer sb = new StringBuffer();
		Vector<String> v = new Vector<String>();
		Hashtable<String,String> ht =new Hashtable<String,String>();
		
		//Vector���̰߳�ȫ�ſ����ã����ǰ�ȫҲ��ʹ�á�
//		public static <T> List<T> synchronized(List<T> list):
		List<String> list = Collections.synchronizedList(new ArrayList<String>());
		list.add("Hello");list.add("java");System.out.println(list);
	}

}
