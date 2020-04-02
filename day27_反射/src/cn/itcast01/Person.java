package cn.itcast01;

public class Person {
	private String name;
	int age;
	public String address;
	public Person(){}
	public Person(String name){
		this.name = name;
	}
	Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	public Person(String name,int age,String address){
		this.name = name;
		this.age = age;
		this.address = address;
	}
	public void show(){
		System.out.println("show");
	}
	public void method(String name){
		System.out.println("name:"+name);
	}
	public String getString(String name,int age){
		return "name:"+name+",age:"+age;
	}
	private void function(){
		System.out.println("Ë½ÓÐ·½·¨");
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
}
