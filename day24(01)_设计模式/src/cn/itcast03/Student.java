package cn.itcast03;

public class Student {
	//����˽�з���
	private Student(){};
	
	//��������
	//��̬����ֻ�ܷ��ʾ�̬��Ա����
	//Ϊ�˲������ֱ�ӷ����޸ı���ֵ����private
	private static Student s = new Student();
	
	//�ṩ��������������
	//Ϊ�˱�֤����ܹ�ֱ�ӵ��÷���������Ӧ���Ǿ�̬����
	public static Student getStudent(){
		return s;
	}
}
