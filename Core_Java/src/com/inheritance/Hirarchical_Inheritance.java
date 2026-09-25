package com.inheritance;

public class Hirarchical_Inheritance {

	public static void main(String[] args) {
		Addition a = new Addition();
		a.add();
		System.out.println("====================");
		
		Substraction s = new Substraction();
		s.sub();
		System.out.println("====================");
		
		Multiplication m = new Multiplication();
		m.mul();
		System.out.println("====================");
		
		Division d = new Division();
		d.div();
		System.out.println("====================");
	}

}
