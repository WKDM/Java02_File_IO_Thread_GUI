package cn.itcast04_peizhiwenjian;

import java.lang.reflect.Field;

public class Tool {
	public void setProperty(Object obj,String propertyName,Object value) throws Exception{
//		���ݶ����ȡ�ֽ����ļ�����
		Class c = obj.getClass();
//		��ȡ�ö����propertName��Ա����
		Field field = c.getDeclaredField(propertyName);
//		ȡ�����ʼ��
		field.setAccessible(true);
//		����Ա������ָ����ֵ
		field.set(obj, value);
	}
}
