
/* Single level Inheritance : Parent Class - 1
 * 							  Child Class - 1
 * Access Through extends keyword */

package com.inheritance;

class Parent{
	public void add() {
		System.out.println("This is parent class");
	}
}

public class Single_Inheritance extends Parent {
	
	public void show() {
		System.out.println("This is child class");
	}
	
	public static void main(String[] args) {
		Single_Inheritance s = new Single_Inheritance();
		s.add();
		s.show();
	}
}
