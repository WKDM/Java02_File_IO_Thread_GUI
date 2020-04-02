package cn.itcast02;

public class Student {
	public String name;
	public int age;
	public boolean flag;
	
	public synchronized void set(String name,int age){
//		如果有数据，就等待
		if(this.flag){
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//设置数据
		this.name = name;
		this.age = age;
//		修改标记
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
