package cn.itcast02;

public class GetThread implements Runnable {
	private Student s;
	public GetThread(Student s) {
		this.s = s;
	}
	@Override
	public void run() {
		while(true){
			synchronized (s) {
				s.get();
			}
		}

	}

}
