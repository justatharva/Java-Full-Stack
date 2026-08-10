package com.accessModifires;

public class ProtectedAM {
	protected int a = 10;
	public void show() {
		System.out.println("The value of a is : "+a);
	}
	
	public static void main(String[] args) {
		ProtectedAM p = new ProtectedAM();
		System.out.println("This is main method");
		p.show();
	}
}
