package cn.itcast02;
/*
 * 需求：求5的阶乘
 * 	A:for循环
 * 	B:递归实现
 * 		a:做递归要写一个方法
 * 		b:要有一个出口
 * 		c:规律
 * */
public class DiGuiDemo {
	public static void main(String[] args) {
		int jx = 1;
		for(int j=2;j<=5;j++){
			jx *=j;
		}
		System.out.println("5的阶乘为"+jx);
		
		System.out.println("5的阶乘是："+jiecheng(5));
	}
	/*
	 * 做递归要写一个方法
	 * 	1.返回值类型：int
	 * 	2.参数列表：int n
	 * 
	 * 出口条件：
	 * 	1.n==1;if(n==1) return n=1;
	 * 
	 * 规律：
	 * 	if(n!=1){return n*方法名(n-1)}
	 * */
	
	public static int jiecheng(int n){
		if(n==1){
			return n=1;
		}else{
			return n*jiecheng(n-1);
		}
	}
}
