package cn.itcast06_Case;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameDeemo {

	public static void main(String[] args) {
		//�����������
		Frame frame =new Frame("����ת��");
		//���ô�����ʽ
		frame.setBounds(400, 200, 400, 400);
		//���ô��岼��(��ʽ����)
		frame.setLayout(new FlowLayout());
		
		//������ť
		Button b1 = new Button("��ɫ");
		Button b2 = new Button("��ɫ");
		Button b3 = new Button("��ɫ");
		Button b4 = new Button("��ɫ");
		Button b5 = new Button("��ɫ");
		Button b6 = new Button("��ɫ");
		
		
		//��Ӱ�ť
		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.add(b4);
		frame.add(b5);
		frame.add(b6);
		
		//��Ӱ�ť�����¼�
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setBackground(Color.RED);				
			}
		});
		//������ĵ���¼�
		b2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setBackground(Color.GREEN);
			}
		});
		//������Ľ������˳��¼�
		b3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				frame.setBackground(Color.ORANGE);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				frame.setBackground(Color.WHITE);
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
