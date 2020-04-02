package cn.itcast02;

import java.lang.*;

import javax.xml.transform.Templates;

/*
 * 不死神兔：一对兔子，从第三个月开始每月生一对兔子，之前的兔子不死，问20个月后有多少对兔子？
 * 				兔子对数
 * 第一个月			1
 * 第二个月			1
 * 第三个月			2
 * 第四个月			3
 * 第五个月			5
 * 第六个月			8
 * 第七个月		……………………
 * 规律：从第三个月开始，每个月的对数都是前两个的和
 * */
public class DiGui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//方法一：
		int[] arr = new int[20];		
		/*
		 * arr[0] = 1;
		 * arr[1] = 1;
		 * arr[2] = arr[1]+arr[0];
		 * arr[3] = arr[2]+arr[1];
		 * ………………
		 * a[x] = arr[x-1]+arr[x-2]
		 * */
		arr[0] = 1;
		arr[1] = 1;
		for(int x=2;x<20;x++){
			arr[x] = arr[x-1]+arr[x-2];
		}
		System.out.println("方法一：20个月后有兔子："+arr[19]+"对");
		System.out.println("----------------");
//		方法二
		/*相邻发	1	1	2	3	5	8………………
		 * 第一个月，第二个月	 a=1	b=1
		 * 第二个月，第三个月	 a=1	b=2
		 * 第三个月，第四个月	 a=2	b=3
		 * 第四个月，第五个月	 a=3	b=5
		 * ………………
		 * 规律：第三个月开始：a=b;b=a+b;
		 * */
		int a=1;
		int b=1;
		for(int i=3;i<=20;i++){
			int temp=a;
			a=b;
			b=temp+b;
		}
		System.out.println("方法二：20个月后有兔子："+b+"对");
		System.out.println("----------------");
		
		
//		方法三
		/*
		 * 递归方法：
		 * 返回值类型int 
		 * 参数列表：int n
		 * 
		 * 出口：m=1,n=1
		 * 规律：第个月开始：每个月是前两个月的和
		 * */
		System.out.println("方法三：20个月后有兔子："+b+"对");
		System.out.println("----------------");
	}
	public static int fib(int j){
		if(j==1 || j==2){
			return 1;
		}else{
			return fib(j-1)+fib(j-2);
		}
	}

}
