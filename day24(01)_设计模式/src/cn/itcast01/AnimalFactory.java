package cn.itcast01;

public class AnimalFactory {
	private AnimalFactory(){}
//	public static Dog createDog(){
//		return new Dog();
//	}
//	public static Cat createCat(){
//		return new Cat();
//	}

	
	//�Ľ�����ģʽ
	public static Animal createAnimal(String type){
		if("cat".equals(type)){
			return new Cat();
		}else if("dog".equals(type)){
			return new Dog();
		}else{
			return null;
		}
	}
	
	
}
