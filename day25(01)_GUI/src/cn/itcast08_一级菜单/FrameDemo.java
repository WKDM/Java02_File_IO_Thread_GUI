package cn.itcast08_һ���˵�;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FrameDemo {

	public static void main(String[] args) {
		//�������ڶ���
		Frame f = new Frame("һ���˵�");		
		//���ô���
		f.setBounds(400,200, 400,300);
		
		//�����˵���
		MenuBar mb =new MenuBar();
		//�����˵�
		Menu m1 = new Menu("�ļ�");
//		Menu m2 = new Menu("�༭");
		//�����˵���
		MenuItem mi1 = new MenuItem("�˳�ϵͳ");
		//˭���˭��
		mb.add(m1);
		m1.add(mi1);
		
		//���ò˵���
		f.setMenuBar(mb);
		
		//��Ӳ˵�����Ӽ�������
		mi1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);				
			}
		});
		
		
		
		
		//�رմ���
		//��Ӽ����¼�
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		
		//��ʾ����
		f.setVisible(true);

	}

}

