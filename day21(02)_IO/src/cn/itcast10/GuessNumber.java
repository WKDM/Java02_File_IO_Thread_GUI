package cn.itcast10;

import java.util.Scanner;
/**
 * @version 1.1
 * */
public class GuessNumber {

	private GuessNumber(){				
	}
	public static void start(){
		//����һ�������
		int number =((int) (Math.random()*10))+1;
		System.out.println("���������µ�����(1-10)��");
		//����һ��ͳ�Ʊ���
		int count=0;
		while(true){		
			Scanner sc = new Scanner(System.in);
			int userNum = sc.nextInt();
			count++;
			if(userNum==number){
				System.out.println("��ϲ���¶�����ʹ����"+count+"�λ���");
				break;
			}else if(userNum>number){
				System.out.println("���µ�̫���ˣ������²�");
			}
			else if(userNum<number){
				System.out.println("���µ�̫С�ˣ������²�");
			}else{
				System.out.println("���������ȶ��ˣ�û����Ҫ���ǣ�1-10���������²�");
			}
		}		
	}
	
}
