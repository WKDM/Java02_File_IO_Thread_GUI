package cn.itcast05;

public class RingPhoneDecorate extends PhoneDecorate {

	public RingPhoneDecorate(Phone p) {
		super(p);		
	}
	public void call(){
		System.out.println("≤ ¡Â");
		super.call();
	}

}
