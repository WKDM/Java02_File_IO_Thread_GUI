package cn.itcast01;
import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 * ���һ����û�й��췽����
 * A:���еĳ�Ա�������Ǿ�̬��
 * B:����ģʽ��Runtime��
 * C:�����о�̬�������ظ���Ķ���InetAdress��
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
		//��ȡ��������IP��ַ
		//public String getHostName()
		String name = id.getHostName();
		//public String getHostAdress()
		String ip = id.getHostAddress();
		System.out.println(name+"======"+ip);	
	}

}
