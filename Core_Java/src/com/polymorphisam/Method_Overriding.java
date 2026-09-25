
/* Super Keyword used to Access the parent method from another class. 
 * It can be only accessible in child methods of another class ( Not Accessible in main method ).
 * The method names of child and parent class can be same. */

package com.polymorphisam;

class parent{
	public void msg() { //parent method
		System.out.println("This is parent class");
	}
	public void add() { //parent method
		System.out.println("This is parent add method");
	}
}

public class Method_Overriding extends parent{
	public void msg() { //child method
		super.msg(); //Access the parent methods
		System.out.println("This is child class method");
	}
	public void add() {	//child method
		super.add(); //Access the parent Methods
		System.out.println("This is child class add method");
	}
	
	public static void main(String[] args) {
		Method_Overriding m = new Method_Overriding();
		m.msg(); //Access the child methods in same class
		m.add(); //Access the child method in same class
	}
}
