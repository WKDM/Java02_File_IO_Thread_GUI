package cn.itcast09_�༶�˵�;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;

public class FrameDemo {

	public static void main(String[] args) {
		//�������ڶ���
		Frame f = new Frame("�༶�˵�");		
		//���ô���
		f.setBounds(400,200, 400,300);
		//��ȡ������
		String name = f.getTitle();
		//�����˵���
		MenuBar mb =new MenuBar();
		//�����˵�
		Menu m1 = new Menu("�ļ�");
		Menu m2 = new Menu("���ı���");
		//�����˵���
		MenuItem mi1 = new MenuItem("�ú�ѧϰ");
		MenuItem mi2 = new MenuItem("��������");
		MenuItem mi3 = new MenuItem("�ظ�����");
		MenuItem mi4 = new MenuItem("�򿪼��±�");
		MenuItem mi5 = new MenuItem("�˳�ϵͳ");
		//˭���˭��
		mb.add(m1);		
		m2.add(mi1);
		m2.add(mi2);
		m2.add(mi3);
		m2.add(mi4);
		m1.add(m2);
		m1.add(mi4);
		m1.add(mi5);
		
		
		//���ò˵���
		f.setMenuBar(mb);
		
		
		//��Ӳ˵�����Ӽ�������
		mi3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				f.setTitle(name);				
			}
		});
		mi2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				f.setTitle(mi2.getLabel());
			}
		});
		mi1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				f.setTitle("�ú�ѧϰ");
			}
		});
		
		mi4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Runtime r = Runtime.getRuntime();
				try {
					r.exec("notepad");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		
		mi5.addActionListener(new ActionListener() {
			
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


