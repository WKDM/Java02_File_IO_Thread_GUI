package cn.itcast01_Frame;

import java.awt.Frame;

public class FrameDemo {

	public static void main(String[] args) {
		//����һ�����ڶ���
//		Frame f = new Frame();
		//������ͷ�ڶ��ַ�ʽ
		Frame f = new Frame("HelloWorld");
//		//������ͷ�ĵ�һ�ַ�ʽ��
//		f.setTitle("HelloWorld");
		
		//���ô����С
		f.setSize(400,300);
		//���ô����λ��
		f.setLocation(400,200);
		
		
		
		//ʹ����ɼ�
//		f.show();//��ʱ��
		f.setVisible(true);
	}

}
