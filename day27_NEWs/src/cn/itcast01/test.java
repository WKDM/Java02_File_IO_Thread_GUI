package cn.itcast01;

public class test {
	public static void main(String[] args) {
		Direction4 d4 = Direction4.After;
		System.out.println(d4);
		System.out.println(d4.getName());
		d4.show();
		
		
		Direction4 d5 = Direction4.After;
		switch (d5) {
		case After:
			System.out.println("你选择了后");
			break;
		case Befter:
			System.out.println("你选择了前");
			break;
		case Left:
			System.out.println("你选择了左");
			break;
		case Right:
			System.out.println("你选择了右");
			break;
		}
	}
}
