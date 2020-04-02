package cn.itcast10;

import java.util.Scanner;
/**
 * @version 1.1
 * */
public class GuessNumber {

	private GuessNumber(){				
	}
	public static void start(){
		//产生一个随机数
		int number =((int) (Math.random()*10))+1;
		System.out.println("请输入您猜的数字(1-10)：");
		//定义一个统计变量
		int count=0;
		while(true){		
			Scanner sc = new Scanner(System.in);
			int userNum = sc.nextInt();
			count++;
			if(userNum==number){
				System.out.println("恭喜您猜对啦！使用了"+count+"次机会");
				break;
			}else if(userNum>number){
				System.out.println("您猜的太大了；请重新猜");
			}
			else if(userNum<number){
				System.out.println("您猜的太小了；请重新猜");
			}else{
				System.out.println("恐怕是您喝多了，没看清要求是（1-10）；请重新猜");
			}
		}		
	}
	
}
