import java.util.Properties;
import java.util.Set;

public class PropertiesDemo01 {
	/*
	 * Properties:���Լ����࣬��һ�����Ժ�IO������ʹ�õ�������
	 * Properties���Ա��������л�����м��أ������б���ÿ���������Ӧֵ����һ���ַ���
	 * */
	public static void main(String[] args) {
		Properties pt =new Properties();
		pt.put("it001", "Hello");
		pt.put("it002", "world");
		pt.put("it003", "java");
//		System.out.println("pt:"+pt);
		Set<Object> set = pt.keySet();
		for(Object key:set){
			System.out.println(key+"==="+pt.get(key));
		}
	}

}
