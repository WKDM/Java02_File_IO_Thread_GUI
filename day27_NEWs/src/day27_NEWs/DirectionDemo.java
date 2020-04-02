package day27_NEWs;

public class DirectionDemo {

	public static void main(String[] args) {
		Direction d = Direction.BEFTER;
		System.out.println(d);
		
		Direction2 d2 = Direction2.AFTER;
		System.out.println(d2);
		System.out.println(d2.getName());
		
		
		Direction3 d3= Direction3.AFTER;
		System.out.println(d3);
		System.out.println(d3.getName());
		d3.show();
	}

}
