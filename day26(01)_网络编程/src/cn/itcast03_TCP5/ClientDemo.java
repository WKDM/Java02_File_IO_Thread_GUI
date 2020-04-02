package cn.itcast03_TCP5;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/*
 * �ͻ��˶�ȡ�ı��ļ�����������̨���
 * */
public class ClientDemo {

	public static void main(String[] args) throws IOException {
		Socket s = new Socket("192.168.186.1",11222);
		//��װ��ȡ�ı�����
		BufferedReader br = new BufferedReader(new FileReader("a.txt"));
		//��װͨ������
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		String line = null;
		while((line=br.readLine())!=null){
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		bw.close();
		br.close();
		s.close();
	}

}
