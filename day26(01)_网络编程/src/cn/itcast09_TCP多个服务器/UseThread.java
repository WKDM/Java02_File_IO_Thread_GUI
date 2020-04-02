package cn.itcast09_TCP多个服务器;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class UseThread implements Runnable {
	private Socket s;

	public UseThread(Socket s) {
		this.s = s;
	}

	@Override
	public void run() {
		try {
			// 封装通道接收数据
			BufferedInputStream bis = new BufferedInputStream(s.getInputStream());
			// 封装图片文件
//			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.jpg"));
			String newname = System.currentTimeMillis()+"Img.jpg";
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(newname));
			byte[] bys = new byte[1024];
			int len = 0;
			while ((len = bis.read(bys)) != -1) {
				bos.write(bys);
				bos.flush();
			}
			// 告诉上传完毕
			s.shutdownInput();

			// 给出反馈信息
			OutputStream os = s.getOutputStream();
			os.write("图片上传成功".getBytes());

			s.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
