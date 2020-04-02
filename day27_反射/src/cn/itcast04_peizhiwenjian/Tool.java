package cn.itcast04_peizhiwenjian;

import java.lang.reflect.Field;

public class Tool {
	public void setProperty(Object obj,String propertyName,Object value) throws Exception{
//		根据对象获取字节码文件对象
		Class c = obj.getClass();
//		获取该对象的propertName成员变量
		Field field = c.getDeclaredField(propertyName);
//		取消访问检查
		field.setAccessible(true);
//		给成员变量赋指定的值
		field.set(obj, value);
	}
}
