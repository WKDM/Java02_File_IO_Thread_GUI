package cn.itcast02;

public class Student {
	public String name;
	public int age;
	public boolean flag;
	
	public synchronized void set(String name,int age){
//		��������ݣ��͵ȴ�
		if(this.flag){
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//��������
		this.name = name;
		this.age = age;
//		�޸ı��
		this.flag =true;
		this.notify();
	}
	
	
	public synchronized void get(){
		if(!this.flag){
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(this.name+"====="+this.age);
		
		this.flag = false;
		this.notify();
	}
}
