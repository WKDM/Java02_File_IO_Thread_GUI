package cn.itcast07;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameDemo {

	public static void main(String[] args) {
		//�����������
		Frame frame =new Frame("�������������������������");
		//���ô�����ʽ
		frame.setBounds(400, 200, 400, 400);
		//���ô��岼��(��ʽ����)
		frame.setLayout(new FlowLayout());
		
		//���ñ�ǩ
		Label lb = new Label("������һ��qq�ţ�ֻ�������֣�����������");
		TextField tf = new TextField(40);
		
		//�Ѷ�����ӵ�����
		frame.add(lb);
		frame.add(tf);
		
		
//		���ı�����Ӽ����¼�
		tf.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				//�����ȡ�õ��ַ����ַ���ȥȡ���¼�
				//˼·:�Ȼ�ȡ�ַ����ж��Ƿ�Ϊ����
				char ch = e.getKeyChar();
//				System.out.println(ch);
				if(!(ch>'0'&&ch<'9')){
					//ȡ���¼�
					e.consume();
				}
			}
		});
		
		//��ӹرմ���ļ����¼�
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		//��ʾ����
		frame.setVisible(true);
	}

}
