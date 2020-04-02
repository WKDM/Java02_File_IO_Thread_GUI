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
		//创建窗体对象
		Frame frame =new Frame("不能输入数字以外的其他数据");
		//设置窗体样式
		frame.setBounds(400, 200, 400, 400);
		//设置窗体布局(流式布局)
		frame.setLayout(new FlowLayout());
		
		//设置标签
		Label lb = new Label("请输入一个qq号，只能是数字，不行你试试");
		TextField tf = new TextField(40);
		
		//把对象添加到窗体
		frame.add(lb);
		frame.add(tf);
		
		
//		给文本框添加键盘事件
		tf.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				//如果你取得的字符是字符就去取消事件
				//思路:先获取字符，判断是否为数字
				char ch = e.getKeyChar();
//				System.out.println(ch);
				if(!(ch>'0'&&ch<'9')){
					//取消事件
					e.consume();
				}
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
