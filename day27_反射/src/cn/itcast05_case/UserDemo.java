package cn.itcast05_case;

public class UserDemo {

	public static void main(String[] args) {
		//�������û�����
		UserDao ud = new UserDaoImpl();
		ud.add();
		ud.find();
		ud.delete();
		ud.update();
		System.out.println("-------------");
		
		//���Ƕ�����Ӧ���ǣ�
//		��ÿһ������ִ��ǰ����Ӧ�ÿ����Ƿ��в����ù��ܵ�Ȩ��
//		�ڹ��ܲ���ǰӦ����һ��Ȩ��У�飬�ڲ�������һ����־��¼
		UserDao ud2 = new UserDaoImpl2();
		ud2.add();
		ud2.find();
		ud2.delete();
		ud2.update();
	}

}
