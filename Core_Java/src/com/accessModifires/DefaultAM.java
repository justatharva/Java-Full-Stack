package com.accessModifires;

public class DefaultAM {
	
	int a = 10;
	public void show() {
		System.out.println("The value of a is "+a);
	}
	
	public static void main(String[] args) {
		DefaultAM d = new DefaultAM();
		System.out.println("This is main value of a : ");
		d.show();
	}
}
