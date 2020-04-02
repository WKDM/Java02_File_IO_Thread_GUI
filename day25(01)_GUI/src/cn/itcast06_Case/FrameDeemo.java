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
		//创建窗体对象
		Frame frame =new Frame("数据转移");
		//设置窗体样式
		frame.setBounds(400, 200, 400, 400);
		//设置窗体布局(流式布局)
		frame.setLayout(new FlowLayout());
		
		//创建按钮
		Button b1 = new Button("红色");
		Button b2 = new Button("绿色");
		Button b3 = new Button("橙色");
		Button b4 = new Button("黄色");
		Button b5 = new Button("粉色");
		Button b6 = new Button("蓝色");
		
		
		//添加按钮
		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.add(b4);
		frame.add(b5);
		frame.add(b6);
		
		//添加按钮监听事件
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setBackground(Color.RED);				
			}
		});
		//添加鼠标的点击事件
		b2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setBackground(Color.GREEN);
			}
		});
		//添加鼠标的进入与退出事件
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
		
		
		
		//添加关闭窗体的监听事件
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		//显示窗体
		frame.setVisible(true);
	}

}
