package cn.itcast02;

import java.util.concurrent.Callable;

public class MyCallable implements Callable {
	@Override
	public Object call() throws Exception {
		for(int x=0;x<10;x++){
			System.out.println(Thread.currentThread().getName()+":"+x);
		}
		return null;
	}
}
