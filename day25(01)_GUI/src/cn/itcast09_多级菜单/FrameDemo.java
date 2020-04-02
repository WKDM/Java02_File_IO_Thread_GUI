package cn.itcast09_多级菜单;
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
		//创建窗口对象
		Frame f = new Frame("多级菜单");		
		//设置窗口
		f.setBounds(400,200, 400,300);
		//获取标题名
		String name = f.getTitle();
		//创建菜单栏
		MenuBar mb =new MenuBar();
		//创建菜单
		Menu m1 = new Menu("文件");
		Menu m2 = new Menu("更改标题");
		//创建菜单项
		MenuItem mi1 = new MenuItem("好好学习");
		MenuItem mi2 = new MenuItem("天天向上");
		MenuItem mi3 = new MenuItem("回复标题");
		MenuItem mi4 = new MenuItem("打开记事本");
		MenuItem mi5 = new MenuItem("退出系统");
		//谁添加谁呢
		mb.add(m1);		
		m2.add(mi1);
		m2.add(mi2);
		m2.add(mi3);
		m2.add(mi4);
		m1.add(m2);
		m1.add(mi4);
		m1.add(mi5);
		
		
		//设置菜单栏
		f.setMenuBar(mb);
		
		
		//添加菜单项填加监听机制
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
				f.setTitle("好好学习");
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
		
		
		
		
		//关闭窗体
		//添加监听事件
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		
		//显示窗体
		f.setVisible(true);

	}

}


