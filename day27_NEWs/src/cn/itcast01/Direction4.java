package cn.itcast01;

import day27_NEWs.Direction;

public enum Direction4 {
	Befter("前"){
		public void show(){
			System.out.println("前");
		}
	},
	After("后"){
		public void show(){
			System.out.println("后");
		}
	},
	Left("左"){
		public void show(){
			System.out.println("左");
		}
	},
	Right("右"){
		public void show(){
			System.out.println("右");
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
