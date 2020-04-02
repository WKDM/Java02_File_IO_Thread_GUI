package cn.itcast03;
/*问题：
 * 接口（功能太多）------实现类（如果我要实现一个功能，也要把其他的方法实现，太繁琐）
 *解决方法：
 *	接口 （功能太多）---适配器类（实现接口，仅仅空实现）----实现类（用哪个重写哪个）
 * */
public class UserDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDao ud = new UserDaoImpl();
		ud.add();
		//谁说我都要实现方法
		UserDao ud2 = new UserDaoImpl2();
		ud2.add();
		
	}

}
