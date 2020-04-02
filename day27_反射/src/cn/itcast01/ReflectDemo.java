package cn.itcast01;
/*
 * ���䣺����ͨ��class�ļ�����ȥʹ�ø��ļ��еĳ�Ա���������췽������Ա����
 * 
 * Person p = new Person()
 * p.ʹ��
 * 
 * 
 * ��ȡClass��
 * Class�ࣺ
 * 		��Ա������Field
 * 		���췽����Constructor
 * 		��Ա������Method
 * 
 * Class�Ļ�ȡ������
 * 		A:Object��Ļ�ȡ��ʽ��getClass()
 * 		B:�������͵ľ�̬���ԣ�class
 * 		C:Class���еľ�̬������
 * 			public static Class forName(String className)
 * 
 * ��ôѡ��ʹ���أ�
 * 	�Լ��棺��ѡһ�֣��ڶ��ֱȽϷ���
 * 	�����������֣���һ���ַ�������ֱ��д�������ļ���
 * */
public class ReflectDemo {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
//		A:Object��Ļ�ȡ��ʽ��getClass()
		Person p = new Person();
		Class c = p.getClass();
		Person p1 = new Person();
		Class c1 = p1.getClass();
		System.out.println(p==p1);
		System.out.println(c==c1);
//		B:�������͵ľ�̬���ԣ�class
		Class c2 = Person.class;
//		int.class;
//		String.class;
		System.out.println(c==c2);
//		C:Class���еľ�̬����
		Class c3 = Class.forName("cn.itcast01.Person");
		System.out.println(c==c3);
	}
}
