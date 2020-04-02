package cn.itcast01;

public class AnimalDemo {
	public static void main(String[] args) {
		//具体类调用
		Dog dog =new Dog();
		dog.eat();
		Cat cat = new Cat();
		cat.eat();		
		System.out.println("--------------");
//		//有工厂加工调用
//		Dog dd = AnimalFactory.createDog();
//		Cat cc = AnimalFactory.createCat();
//		dd.eat();
//		cc.eat();
		//改进后的工厂模式
		Animal a = AnimalFactory.createAnimal("cat");
		a.eat();
		a = AnimalFactory.createAnimal("dog");
		a.eat();
//		//java.lang.NullPointerException
//		a = AnimalFactory.createAnimal("pig");
//		a.eat();
		a = AnimalFactory.createAnimal("pig");
		if(a!=null){
			a.eat();
		}else{
			System.out.println("本工厂暂时不生产该动物");
		}
	}
}
