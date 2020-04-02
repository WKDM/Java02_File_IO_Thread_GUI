package cn.itcast04;

public class SetThread implements Runnable {
	private int x=0;
	private Student s;
	public SetThread(Student s) {
		this.s =s;
	}
	@Override
	public void run() {
		while(true){
			synchronized (s) {
				if(x%2==0){
					s.name="ÀèÃ÷";
					s.age=30;
				}else{
					s.name="ÑöÌì";
					s.age=20;
				}
				x++;
			}
		}
	}

}
