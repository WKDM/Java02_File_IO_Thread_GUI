package cn.itcast01_Frame;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Point;

public class Frame02 {

	public static void main(String[] args) {
		Frame f = new Frame("���÷�����ǰ��˳��");
		
		
//		//һ�㲻�õ�˳��
//		f.setVisible(true);
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		f.setSize(400,300);
//		f.setLocation(400, 200);
		
		
		//����ʹ��˳��
		f.setSize(400,300);
		//��setSize()������ͬ
//		Dimension d = new Dimension(400,300);
//		f.setSize(d);
		
		
		f.setLocation(400,200);
		//��setLocation()������ͬ
//		Point p = new Point(400,200);
//		f.setLocation(p);
		
		
		
//		һ�����巽���ĵ���
//		f.setBounds(400,200,400,300);
		
		
		f.setVisible(true);
		
	}

}
