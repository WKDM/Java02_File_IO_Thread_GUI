package cn.itcast05_Case;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.font.TextLayout;

public class FrameDemo {

	public static void main(String[] args) {
		//�����������
		Frame frame =new Frame("����ת��");
		//���ô�����ʽ
		frame.setBounds(400, 200, 400, 400);
		//���ô��岼��(��ʽ����)
		frame.setLayout(new FlowLayout());
		//�����ı������
		TextField tf = new TextField(20);
		//������ť����
		Button bt =new Button("����ת��");
		//���ð�ť��ʽ
		bt.setSize(20,10);
		//�����ı���
		TextArea ta = new TextArea(20,30);
		//���ı�����ӵ�����
		frame.add(tf);
		//�Ѱ�ť��ӵ�����
		frame.add(bt);
		//���ı�����ӵ�����
		frame.add(ta);
		//��Ӱ�ť�����¼�
		bt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//��ȡ�ı����е�����
				String t_str = tf.getText().trim();
				//�ύ������ı��������
				tf.setText("");
				//���õ��ı���
//				ta.setText(t_str);//�滻���ı����е�����
				ta.append(t_str+"\r\n");
				
				//��ȡ���
				tf.requestFocus();
				
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
