package cn.itcast04;

public class test {
	public static void main(String[] args) {
		GetTime gt = new ForDome();
		System.out.println(gt.getTime()+"����");
		gt = new IODemo();
		System.out.println(gt.getTime()+"����");
	}
}
