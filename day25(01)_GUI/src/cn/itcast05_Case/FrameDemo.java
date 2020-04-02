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
		//创建窗体对象
		Frame frame =new Frame("数据转移");
		//设置窗体样式
		frame.setBounds(400, 200, 400, 400);
		//设置窗体布局(流式布局)
		frame.setLayout(new FlowLayout());
		//创建文本框对象
		TextField tf = new TextField(20);
		//创建按钮对象
		Button bt =new Button("数据转移");
		//设置按钮样式
		bt.setSize(20,10);
		//创建文本域
		TextArea ta = new TextArea(20,30);
		//把文本框添加到窗体
		frame.add(tf);
		//把按钮添加到窗体
		frame.add(bt);
		//把文本域添加到窗体
		frame.add(ta);
		//添加按钮监听事件
		bt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//获取文本框中的内容
				String t_str = tf.getText().trim();
				//提交后清空文本框的内容
				tf.setText("");
				//设置到文本域
//				ta.setText(t_str);//替换了文本域中的内容
				ta.append(t_str+"\r\n");
				
				//获取光标
				tf.requestFocus();
				
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
