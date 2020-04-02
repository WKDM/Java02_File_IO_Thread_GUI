package cn.itcast02;

public class DieLockDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DieLock dl1 = new DieLock(true);
		DieLock dl2 = new DieLock(false);
		dl1.start();
		dl2.start();
	}

}
