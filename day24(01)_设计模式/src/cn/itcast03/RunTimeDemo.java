package cn.itcast03;

import java.io.IOException;

/*
 * RunTime:ÿ��javaӦ�ó�����һ��RunTime��ʵ����ʹӦ�ó����ܹ�������Ӫ����������
 * exec(String command):
 * */
public class RunTimeDemo {

	public static void main(String[] args) throws IOException {
		Runtime r = Runtime.getRuntime();
//		r.exec("notepad");
//		r.exec("calc");
//		r.exec("shutdown -s -t 10000");
		r.exec("shutdown -a");
	}

}
/*
 * class RunTime(){
 * private RunTime(){};
 * 	private static Runtime currentRuntime = new Runtime();
 * 	public static Runtime getRuntime() {
        return currentRuntime;
    }
 * }
 * */
