package cn.itcast01;
import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 * 如果一个类没有构造方法：
 * A:所有的成员变量都是静态的
 * B:单例模式（Runtime）
 * C:类中有静态方法返回该类的对象（InetAdress）
 * 		class Demo(){
 * 			private Demo(){}
 * 			public static Demo getXxx(){
 * 				return new Demo();
 * 			}
 * 		}
 * 		
 * */
public class InteAdressDemo {

	public static void main(String[] args) throws UnknownHostException {
		
		InetAddress id =InetAddress.getByName("DESKTOP-GVBDHVG");
		//获取主机名、IP地址
		//public String getHostName()
		String name = id.getHostName();
		//public String getHostAdress()
		String ip = id.getHostAddress();
		System.out.println(name+"======"+ip);	
	}

}
