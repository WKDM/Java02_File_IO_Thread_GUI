package cn.itcast03;
/*
 * ����ģʽ����֤�����ڴ���ֻ��һ������
 * 
 * ��α�֤�����ڴ���ֻ��һ�������أ�
 * 	A:�ѹ��췽��˽��
 * 	B:�ڳ�Աλ���Լ�����һ������
 * 	C:ͨ��һ�������ķ����ṩ����
 * */
public class StudentDemo {

	public static void main(String[] args) {
//		Student s1 = new Student();
//		Student s2 = new Student();
//		//�����true�����ڴ�����һ������
//		System.out.println(s1==s2);
		
		Student s1 = Student.getStudent();
		Student s2 = Student.getStudent();
		System.out.println(s1==s2);
		System.out.println(s1);
		System.out.println(s2);
	}

}
