package day27_NEWs;

public class Direction2 {
	public static final Direction2 AFTER = new Direction2("ºó");
	public static final Direction2 BEFTER = new Direction2("Ç°");
	public static final Direction2 LEFT = new Direction2("×ó");
	public static final Direction2 RIGHT = new Direction2("ÓÒ");
	private String name;
	private Direction2(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
}
