package cn.itcast03;
/*
 * �����⣺
 * ����ģʽ��˼����ʲô?��������ʵ��
 * 	����������ʽ����������ⵥ��ģʽ��
 * 	���ԣ�����ʽ�����ܻ������ĵ���ģʽ��
 * 		A:�����أ��ӳټ��أ�
 * 		B:�̰߳�ȫ����
 * 			a:�Ƿ���߳�����	��
 * 			b:�Ƿ��й�������	��
 * 			c:�Ƕ��ж�����������������	��
 * 
 * */
public class Teacher {
	private Teacher(){};
	private static Teacher t =null;
	
	public synchronized static Teacher getTeacher(){
		//t1��t2��t3
		if(t==null){
			t = new Teacher();
		}
		return t;
	}
}
