import java.util.Properties;
import java.util.Set;

public class PropertiesDemo01 {
	/*
	 * Properties:属性集合类，是一个可以和IO流相结合使用的属性类
	 * Properties可以保存在流中或从流中加载，属性列表中每个键及其对应值都是一个字符串
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
