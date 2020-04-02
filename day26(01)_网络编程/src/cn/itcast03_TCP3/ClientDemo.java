package cn.itcast03_TCP3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/*
 * ����¼��
 * */
public class ClientDemo {

	public static void main(String[] args) throws IOException, IOException {
		//�����ͻ���Socket����
		Socket s = new Socket("192.168.186.1",7399);
		//����¼��
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//��ͨ���ڵ�������װһ��
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		String line =null;
		while((line=br.readLine())!=null){
			if("886".equals(line)){
				break;
			}
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		
		//�ͷ���Դ
//		bw.close();
		br.close();
		s.close();
		
	}

}
