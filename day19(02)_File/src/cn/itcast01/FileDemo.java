package cn.itcast01;

import java.io.File;

/*
 * ����Ҫ��ʵ��IO�Ĳ������ͱ���֪��Ӳ�����ļ��ı�����ʽ��
 * ��java���ṩ��һ����File������ʹ��
 * 
 * File���ļ���Ŀ¼���ļ��У�·�����ĳ��������ʽ
 * ���췽����
 * 		File(String pathname) :����һ��·���õ�һ��File����
 * 		File(String parent,String child):����һ��Ŀ¼��һ�����ļ�/Ŀ¼�õ�һ��File����
 * 		File(File parent,String child):���ݸ��ļ������һ�����ļ�/Ŀ¼�õ�һ��File����
 * */
public class FileDemo {
	public static void main(String[] args) {
//		File(String pathname) :����һ��·���õ�һ��File����
		File f1 =new File("e:\\Lianxi\\a.txt");
//		File(String parent,String child):����һ��Ŀ¼��һ�����ļ�/Ŀ¼�õ�һ��File����
		File f2 =new File("e:\\Lianxi","a.txt");
//		File(File parent,String child):���ݸ��ļ������һ�����ļ�/Ŀ¼�õ�һ��File����
		File f3 = new File("e:\\Lianxi");
		File f4 = new File(f3,"a.txt");
	}
}
