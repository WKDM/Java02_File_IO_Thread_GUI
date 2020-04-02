package cn.itcast04_��;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 * ����Ϊ�������һ����ť�����ð�ť��������ť�رմ���
 * A:�����������
 * B:���ô���
 * C:������ť����
 * D:�󶨰�ť
 * E:�ô�����ӻ�
 * */
public class FrameDemo {
	public static void main(String[] args) {
		//�����������
		Frame f = new Frame("��Ӱ�ť");
		//���ô���
		f.setBounds(400, 200, 400, 300);
		
		//���ô��岼��Ϊ��ʽ����
		f.setLayout(new FlowLayout());
		
		//������ť
		Button btn = new Button("����ѽ");		
		
		//���ð�ť
		btn.setSize(20,10);
		//��Ӱ�ť
		f.add(btn);
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);;
			}
		});
		
		//Ϊ��ť���ӵ����Ϊ�¼�����
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("���ٵ�������");
			}
		});
		
		//��ʾ����
		f.setVisible(true);
	}
}
