package cn.itcast01_Frame;

import java.awt.Frame;

public class FrameDemo {

	public static void main(String[] args) {
		//创建一个窗口对象
//		Frame f = new Frame();
		//设置题头第二种方式
		Frame f = new Frame("HelloWorld");
//		//设置题头的第一种方式：
//		f.setTitle("HelloWorld");
		
		//设置窗体大小
		f.setSize(400,300);
		//设置窗体打开位置
		f.setLocation(400,200);
		
		
		
		//使窗体可见
//		f.show();//过时了
		f.setVisible(true);
	}

}
