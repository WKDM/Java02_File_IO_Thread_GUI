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
			System.out.println("========操作项目==============");			
			System.out.println("1.登陆");
			System.out.println("2.注册");
			System.out.println("3.退出");
			System.out.println("============================");
			System.out.println("请选择您要操作的项目:");
			Scanner sc = new Scanner(System.in);
			String num = sc.nextLine();
			UserDao use = new UserDaoIpml();
			switch(num) {
			case "1":
				System.out.println("=======欢迎进入登陆界面================");				
				System.out.println("请输入用户名：");
				String username = sc.nextLine();
				System.out.println("请输入用户密码：");				
				String password = sc.nextLine();
				boolean flag = use.isLogin(username, password);
				if(flag){
					System.out.println("登陆成功，开始猜数字游戏");
					System.out.println("您要玩吗？y/n");
					while(true){						
						String str = sc.nextLine();
						if("y".equals(str)){
							GuessNumber.start();
							System.out.println("您还要玩吗？y/n");
						}else{
							break;
						}
					}
					System.out.println("谢谢使用，欢迎下次在玩");
					System.exit(0);
				}
				break;
			case "2":
				while(true){
					System.out.println("=========欢迎进入注册界面=============");
					System.out.println("请输入用户名：");
					String name = sc.nextLine();
					System.out.println("请输入用户密码：");				
					String pwd = sc.nextLine();
					System.out.println("请输入确认密码：");				
					String spwd = sc.nextLine();
					if(spwd.equals(pwd)){
						User user = new User();
						user.setName(name);
						user.setPassword(pwd);
						use.register(user);
						break;
					}
					System.out.println("两次密码输入不一致，请重新注册");
				}
				break;				
			case "3":				
			default:
				System.err.println("谢谢使用，欢迎下次再来");
				System.exit(0);
			}
		}
	}

}
