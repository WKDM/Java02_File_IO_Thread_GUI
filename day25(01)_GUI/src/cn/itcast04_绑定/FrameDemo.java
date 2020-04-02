package cn.itcast04_绑定;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 * 需求：为窗体添加一个按钮，设置按钮，监听按钮关闭窗口
 * A:创建窗体对象
 * B:设置窗体
 * C:创建按钮对象
 * D:绑定按钮
 * E:让窗体可视化
 * */
public class FrameDemo {
	public static void main(String[] args) {
		//创建窗体对象
		Frame f = new Frame("添加按钮");
		//设置窗体
		f.setBounds(400, 200, 400, 300);
		
		//设置窗体布局为流式布局
		f.setLayout(new FlowLayout());
		
		//创建按钮
		Button btn = new Button("点我呀");		
		
		//设置按钮
		btn.setSize(20,10);
		//添加按钮
		f.add(btn);
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);;
			}
		});
		
		//为按钮增加点击行为事件监听
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("你再点我试试");
			}
		});
		
		//显示窗体
		f.setVisible(true);
	}
}
