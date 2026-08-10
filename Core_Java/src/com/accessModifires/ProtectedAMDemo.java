package com.accessModifires;

public class ProtectedAMDemo {
	public static void main(String[] args) {
		ProtectedAM p = new ProtectedAM();
		System.out.println("The value of a is : "+p.a);
		p.show();
	}
}
