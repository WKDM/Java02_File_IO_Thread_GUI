package cn.itcast03;
/*���⣺
 * �ӿڣ�����̫�ࣩ------ʵ���ࣨ�����Ҫʵ��һ�����ܣ�ҲҪ�������ķ���ʵ�֣�̫������
 *���������
 *	�ӿ� ������̫�ࣩ---�������ࣨʵ�ֽӿڣ�������ʵ�֣�----ʵ���ࣨ���ĸ���д�ĸ���
 * */
public class UserDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDao ud = new UserDaoImpl();
		ud.add();
		//˭˵�Ҷ�Ҫʵ�ַ���
		UserDao ud2 = new UserDaoImpl2();
		ud2.add();
		
	}

}
