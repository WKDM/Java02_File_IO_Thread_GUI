package cn.itcast02;

public class AnimalDemo {

	public static void main(String[] args) {
		//����Ҫ��һֻ��
		Factory f = new DogFactory();
		Animal a = f.createAnimal();
		a.eat();
		System.out.println("-------");
		//����Ҫ��һֻè
		f = new CatFactory();
		a = f.createAnimal();
		a.eat();
	}

}
