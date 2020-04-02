package cn.itcast03;

public class getThread implements Runnable {
	private Student s;
	public getThread(Student s) {
		this.s=s;
	}
	@Override
	public void run() {
//		Student s = new Student();
		System.out.println(s.name+"------"+s.age);
	}

}
