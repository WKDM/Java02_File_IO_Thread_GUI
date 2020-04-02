package cn.itcast09_TCP���������;

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
			// ��װͨ����������
			BufferedInputStream bis = new BufferedInputStream(s.getInputStream());
			// ��װͼƬ�ļ�
//			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.jpg"));
			String newname = System.currentTimeMillis()+"Img.jpg";
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(newname));
			byte[] bys = new byte[1024];
			int len = 0;
			while ((len = bis.read(bys)) != -1) {
				bos.write(bys);
				bos.flush();
			}
			// �����ϴ����
			s.shutdownInput();

			// ����������Ϣ
			OutputStream os = s.getOutputStream();
			os.write("ͼƬ�ϴ��ɹ�".getBytes());

			s.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
