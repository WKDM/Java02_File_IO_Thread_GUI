package cn.itcast3;

public class Student {
	private String name;
	private int chiness;
	private int math;
	private int english;
	public Student(String name, int chiness, int math, int english) {
		super();
		this.name = name;
		this.chiness = chiness;
		this.math = math;
		this.english = english;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getChiness() {
		return chiness;
	}
	public void setChiness(int chiness) {
		this.chiness = chiness;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getSum(){
		return this.chiness+this.english+this.math;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", chiness=" + chiness + ", math=" + math + ", english=" + english + "]";
	}	
}
