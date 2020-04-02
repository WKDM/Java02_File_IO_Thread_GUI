package cn.itcast5;

import java.io.IOException;
import java.io.Reader;

public class MyBufferedReader {
	private Reader r;

	public MyBufferedReader(Reader r) {
		super();
		this.r = r;
	}
	
	public void close() throws IOException {
		this.r.close();
	}
	
	
}

