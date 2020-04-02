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
					s.set("ÑîæÃ", 25);
				}else{
					s.set("ÀîÃô", 28);
				}
				x++;
				
				
			}
		}
	}

}
