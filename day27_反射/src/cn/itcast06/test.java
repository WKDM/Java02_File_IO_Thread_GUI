package cn.itcast06;

import java.io.ObjectStreamException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.logging.Handler;

public class test {
	public static void main(String[] args) {
		//基本调用
		UserDao ud = new UserDaoImpl();
		ud.add();
		ud.delete();
		ud.find();
		ud.update();
		System.out.println("------------");
		
		
		MyInvocationHandler handler = new MyInvocationHandler(ud);
		UserDao proxy = (UserDao)Proxy.newProxyInstance(ud.getClass().getClassLoader(),ud.getClass().getInterfaces(), handler);
		proxy.add();
		proxy.find();
		proxy.delete();
		proxy.update();
	}

}
