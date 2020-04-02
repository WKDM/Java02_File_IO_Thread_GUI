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
				//判断有没有数据
				if(s.flag){
					try {
						s.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				if(x%2==0){
					s.name="黎明";
					s.age=30;
				}else{
					s.name="仰天";
					s.age=20;
				}
				x++;
				//修改标记
				s.flag=true;
				//唤醒线程
				s.notify();
				
			}
		}
	}

}
