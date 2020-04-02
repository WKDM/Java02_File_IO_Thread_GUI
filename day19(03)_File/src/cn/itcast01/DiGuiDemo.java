package cn.itcast01;
/*
 * 递归：方法定义中调用本身方法的对象
 * 
 * 方法的嵌套调用不是递归：
 * 		Math.max(Math.max(a,b),c)
 * 
 * 
 * public void show(int n){
 * 		if(n==0){
 * 			System.exit(0)
 * 		}
 * 		System.out.println(n);
 * 		show(--n);
 * }
 * 
 * 注意事项：
 * 		A:递归一定要有出口，否则就是死递归。
 * 		B:递归的次数不能太多。否则就会出现内存溢出。
 * 		D:构造方法不能递归使用
 * */
public class DiGuiDemo {
//	public DiGuiDemo(){
//		DiGuiDemo();
//	}
	
	
}
