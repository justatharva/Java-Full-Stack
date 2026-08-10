package com.abstraction;
// Abstraction 
abstract class Parent{
	
	Parent(){
		System.out.println("This is Default Constructor");
	}
	public void show() {
		System.out.println("This is abstract class");
	}
	abstract void add();
}

public class Abstract_Class extends Parent {
	
	@Override // Anotation 
	void add() {
		System.out.println("This is abstract method");
	}
	
	public static void main(String[] args) {
		Abstract_Class a = new Abstract_Class();
		a.show();
		a.add();
	}
}
