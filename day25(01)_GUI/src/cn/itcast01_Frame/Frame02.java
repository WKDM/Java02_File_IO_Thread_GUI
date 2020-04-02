package cn.itcast01_Frame;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Point;

public class Frame02 {

	public static void main(String[] args) {
		Frame f = new Frame("调用方法的前后顺序");
		
		
//		//一般不用的顺序
//		f.setVisible(true);
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		f.setSize(400,300);
//		f.setLocation(400, 200);
		
		
		//正常使用顺序
		f.setSize(400,300);
		//与setSize()作用相同
//		Dimension d = new Dimension(400,300);
//		f.setSize(d);
		
		
		f.setLocation(400,200);
		//与setLocation()作用相同
//		Point p = new Point(400,200);
//		f.setLocation(p);
		
		
		
//		一个整体方法的调用
//		f.setBounds(400,200,400,300);
		
		
		f.setVisible(true);
		
	}

}
