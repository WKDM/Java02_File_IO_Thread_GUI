package cn.itcast05;

public class MusicDecorate extends PhoneDecorate {

	public MusicDecorate(Phone p) {
		super(p);
	}
	public void call(){		
		super.call();
		System.out.println("ÌıÒôÀÖ");
	}

}
