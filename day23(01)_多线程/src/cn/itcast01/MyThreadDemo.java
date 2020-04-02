package cn.itcast01;
/*
 * 进程：
 * 正在进行的程序，是系统进行资源分配和调用的独立单位。
 * 每一个进程都有它自己的内存空间和系统资源
 * 
 * 线程：
 * 是进程中的单个顺序控制流，是一条执行路径
 * 一个进程只有一条执行路径，则称为单线程程序
 * 一个进程有多条执行路径，则称为多线程程序
 * 
 * 举例：
 * 扫雷程序，迅雷下载
 * 
 * 
 * 注意：（并行与并发）
 * 
 * 并行：是逻辑上同时发生，指在某一个时间内同时运行多个程序
 * 并发：是物理上同时发生，指在某一个时间内同时运行多个程序
 * 
 * */
public class MyThreadDemo {
	public static void main(String[] args) {
		System.out.println("---hello---");
		new Object();
		new Object();
		new Object();
		System.out.println("---world---");
	}
}
