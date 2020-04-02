package cn.itcast04_peizhiwenjian;

public class ToolDemo {

	public static void main(String[] args) throws Exception {
		Dog dog = new Dog();
		Tool tool = new Tool();
		tool.setProperty(dog,"sex","ÄÐ");
		tool.setProperty(dog, "price",23.23f);
		System.out.println(dog);
	}

}
class Dog{
	String sex;
	float price;
	
	public String toString(){
		return sex+"---"+price;
	}
}