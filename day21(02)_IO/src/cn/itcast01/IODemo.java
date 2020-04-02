package cn.itcast01;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class IODemo {
/*
 * 数据输入流：DataInputStream
 * 数据输出流：DataOutputStream
 * */
	public static void main(String[] args) throws IOException{
		//写
//		Writer();
		//读
		Reader();
	}

private static void Reader() throws IOException {
	DataInputStream dis = new DataInputStream(new FileInputStream("a.txt"));
	byte a=dis.readByte();
	int b=dis.readInt();
	short c=dis.readShort();
	long d=dis.readLong();
	float e=dis.readFloat();
	double f=dis.readDouble();
	boolean g=dis.readBoolean();
	dis.close();
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	System.out.println(e);
	System.out.println(f);
	System.out.println(g);
}

private static void Writer() throws IOException {
	DataOutputStream dos = new DataOutputStream(new FileOutputStream("a.txt"));
	dos.writeByte(10);
	dos.writeInt(10);
	dos.writeShort(100);
	dos.writeLong(1000);
	dos.writeFloat(1.20f);
	dos.writeDouble(110.236);
	dos.writeBoolean(true);
	dos.close();	
}

}
