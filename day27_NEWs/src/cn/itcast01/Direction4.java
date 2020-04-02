package cn.itcast01;

import day27_NEWs.Direction;

public enum Direction4 {
	Befter("ǰ"){
		public void show(){
			System.out.println("ǰ");
		}
	},
	After("��"){
		public void show(){
			System.out.println("��");
		}
	},
	Left("��"){
		public void show(){
			System.out.println("��");
		}
	},
	Right("��"){
		public void show(){
			System.out.println("��");
		}
	};
	
	private String name;
	private Direction4(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public abstract void show();
}
