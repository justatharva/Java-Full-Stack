package com.accessModifires;

public class PrivateAM {

	private int a=10;
	public void show() {
		System.out.println("The value of a is "+ a);
	}
	public static void main(String[] args) {
		PrivateAM p = new PrivateAM();
		System.out.println("This is main method: ");
		p.show();
		
	}

}
