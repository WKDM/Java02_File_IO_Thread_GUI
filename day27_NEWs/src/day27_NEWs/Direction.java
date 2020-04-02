package day27_NEWs;

public class Direction {
	//创建四个实例
	public static final Direction BEFTER = new Direction();
	public static final Direction AFTER = new Direction();
	public static final Direction LEFT = new Direction();
	public static final Direction RIGHT = new Direction();
	//构建私有方法，防止无限构造对象
	private Direction(){
		
	}
}
