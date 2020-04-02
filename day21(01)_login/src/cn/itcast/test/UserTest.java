package cn.itcast.test;

import java.time.Year;
import java.util.Scanner;

import cn.itcast.dao.UserDao;
import cn.itcast.dao.Ipml.UserDaoIpml;
import cn.itcast.game.GuessNumber;
import cn.itcast.pojo.User;

public class UserTest {

	public static void main(String[] args) {
		while(true){
			System.out.println("========������Ŀ==============");			
			System.out.println("1.��½");
			System.out.println("2.ע��");
			System.out.println("3.�˳�");
			System.out.println("============================");
			System.out.println("��ѡ����Ҫ��������Ŀ:");
			Scanner sc = new Scanner(System.in);
			String num = sc.nextLine();
			UserDao use = new UserDaoIpml();
			switch(num) {
			case "1":
				System.out.println("=======��ӭ�����½����================");				
				System.out.println("�������û�����");
				String username = sc.nextLine();
				System.out.println("�������û����룺");				
				String password = sc.nextLine();
				boolean flag = use.isLogin(username, password);
				if(flag){
					System.out.println("��½�ɹ�����ʼ��������Ϸ");
					System.out.println("��Ҫ����y/n");
					while(true){						
						String str = sc.nextLine();
						if("y".equals(str)){
							GuessNumber.start();
							System.out.println("����Ҫ����y/n");
						}else{
							break;
						}
					}
					System.out.println("ллʹ�ã���ӭ�´�����");
					System.exit(0);
				}
				break;
			case "2":
				while(true){
					System.out.println("=========��ӭ����ע�����=============");
					System.out.println("�������û�����");
					String name = sc.nextLine();
					System.out.println("�������û����룺");				
					String pwd = sc.nextLine();
					System.out.println("������ȷ�����룺");				
					String spwd = sc.nextLine();
					if(spwd.equals(pwd)){
						User user = new User();
						user.setName(name);
						user.setPassword(pwd);
						use.register(user);
						break;
					}
					System.out.println("�����������벻һ�£�������ע��");
				}
				break;				
			case "3":				
			default:
				System.err.println("ллʹ�ã���ӭ�´�����");
				System.exit(0);
			}
		}
	}

}
