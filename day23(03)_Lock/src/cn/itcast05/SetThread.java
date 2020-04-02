package cn.itcast05;

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
				//�ж���û������
				if(s.flag){
					try {
						s.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				if(x%2==0){
					s.name="����";
					s.age=30;
				}else{
					s.name="����";
					s.age=20;
				}
				x++;
				//�޸ı��
				s.flag=true;
				//�����߳�
				s.notify();
				
			}
		}
	}

}
