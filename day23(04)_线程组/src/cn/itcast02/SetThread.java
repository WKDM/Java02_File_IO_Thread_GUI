package cn.itcast02;

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
					s.set("����", 25);
				}else{
					s.set("����", 28);
				}
				x++;
				
				
			}
		}
	}

}
