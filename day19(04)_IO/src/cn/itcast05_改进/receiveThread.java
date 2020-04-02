package cn.itcast05_改进;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class receiveThread implements Runnable {
	private DatagramSocket ds;
	public receiveThread(DatagramSocket ds){
		this.ds = ds;
	}
	@Override
	public void run() {
		try {
			while(true){
				byte[] bys = new byte[1024];
				//创建包对象
				DatagramPacket dp =new DatagramPacket(bys,bys.length);
				//接受数据
				ds.receive(dp);		
				//解析数据并显示大屏上(获取IP地址、获取接受的消息)
				String ip = dp.getAddress().getHostAddress();
				String data = new String(dp.getData(),0,dp.getLength());
				System.out.println("ip:"+ip+",\ndata:"+data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
