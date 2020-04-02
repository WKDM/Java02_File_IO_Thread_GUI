package cn.itcast05;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IPhoneDemo {

	public static void main(String[] args) {
		Phone p = new IPhone();
		p.call();
		System.out.println("------------------");
		
		
		//需求：在打电话前彩铃响
		PhoneDecorate pd = new RingPhoneDecorate(p);
		pd.call();
		System.out.println("-------------------");
		//需求：打完电话听歌
		pd = new MusicDecorate(p);
		pd.call();
		System.out.println("-------");
		//需求：先打电话又听音乐
		pd = new RingPhoneDecorate(new MusicDecorate(p));
		pd.call();
		System.out.println("--------------");
		//想想我们在IO流中的使用
		
//		InputStream is = System.in;
//		InputStreamReader isr = new InputStreamReader(is);
//		BufferedReader br =  new BufferedReader(isr);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
	}

}
