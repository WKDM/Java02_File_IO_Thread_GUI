package cn.itcast05;

public class GetThread implements Runnable {
	private Student s;
	public GetThread(Student s) {
		this.s = s;
	}
	@Override
	public void run() {
		while(true){
			synchronized (s) {
				if(!s.flag){
					try {
						s.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println(s.name+"----"+s.age);
				//�޸ı��
				s.flag =false;
				//�����߳�
				s.notify();
			}
		}

	}

}
