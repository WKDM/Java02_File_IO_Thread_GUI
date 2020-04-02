package cn.itcast04;
/*
 * public static void yeild():停止当前的进程，进行其他的进程。
 * 让进程更和谐
 * */
public class ThreadYeildDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadYeild ty1 = new ThreadYeild();
		ThreadYeild ty2 = new ThreadYeild();
		ty1.setName("罗家峪");
		ty2.setName("王可");
		ty1.start();
		ty2.start();
	}

}
