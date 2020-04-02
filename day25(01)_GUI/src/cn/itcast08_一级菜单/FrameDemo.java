package cn.itcast08_一级菜单;

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
		//创建窗口对象
		Frame f = new Frame("一级菜单");		
		//设置窗口
		f.setBounds(400,200, 400,300);
		
		//创建菜单栏
		MenuBar mb =new MenuBar();
		//创建菜单
		Menu m1 = new Menu("文件");
//		Menu m2 = new Menu("编辑");
		//创建菜单项
		MenuItem mi1 = new MenuItem("退出系统");
		//谁添加谁呢
		mb.add(m1);
		m1.add(mi1);
		
		//设置菜单栏
		f.setMenuBar(mb);
		
		//添加菜单项填加监听机制
		mi1.addActionListener(new ActionListener() {
			
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

