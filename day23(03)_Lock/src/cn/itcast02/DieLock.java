package cn.itcast02;

public class DieLock extends Thread{
	private Boolean flag;
	public DieLock(Boolean flag) {
		this.flag = flag;
	}
	@Override
	public void run() {
			if(flag){
				synchronized (MyLock.objA) {
					System.out.println("if objA");
					synchronized (MyLock.objB) {						
						System.out.println("if obgB");
					}
					
				}
			}else{
				synchronized (MyLock.objB) {
					System.out.println("else objB");
					synchronized (MyLock.objA) {						
						System.out.println("else obgA");
					}
					
				}
			}
	}	
}
