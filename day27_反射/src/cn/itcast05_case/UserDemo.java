package cn.itcast05_case;

public class UserDemo {

	public static void main(String[] args) {
		//基本的用户操作
		UserDao ud = new UserDaoImpl();
		ud.add();
		ud.find();
		ud.delete();
		ud.update();
		System.out.println("-------------");
		
		//真是恶需求应该是：
//		在每一个操作执行前，你应该看看是否有操作该功能的权限
//		在功能操作前应该有一个权限校验，在操作后有一个日志记录
		UserDao ud2 = new UserDaoImpl2();
		ud2.add();
		ud2.find();
		ud2.delete();
		ud2.update();
	}

}
