package cn.itcast01;

public class AnimalDemo {
	public static void main(String[] args) {
		//���������
		Dog dog =new Dog();
		dog.eat();
		Cat cat = new Cat();
		cat.eat();		
		System.out.println("--------------");
//		//�й����ӹ�����
//		Dog dd = AnimalFactory.createDog();
//		Cat cc = AnimalFactory.createCat();
//		dd.eat();
//		cc.eat();
		//�Ľ���Ĺ���ģʽ
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
			System.out.println("��������ʱ�������ö���");
		}
	}
}
