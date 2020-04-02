package cn.itcast03;
public class setThread implements Runnable{
	private Student s;
	public setThread(Student s){
		this.s =s;
	}
	@Override
	public void run() {
//		Student s = new Student();
		s.name="ÀèÃ÷";
		s.age=20;
	}

}
