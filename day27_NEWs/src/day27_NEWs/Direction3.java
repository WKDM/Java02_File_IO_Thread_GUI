package day27_NEWs;

public class Direction3 {
	public static final Direction3 AFTER = new Direction3("��"){
		public void show(){
			System.out.println("��");
		}
	};
	public static final Direction3 BEFTER = new Direction3("ǰ"){
		public void show(){
			System.out.println("ǰ");
		}
	};
	public static final Direction3 LEFT = new Direction3("��"){
		public void show(){
			System.out.println("��");
		}
	};
	public static final Direction3 RIGHT = new Direction3("��"){
		public void show(){
			System.out.println("��");
		}
	};
	private String name;
	private Direction3(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void show(){
		System.out.println(getName());
	}
}