
/* In method overloading the class created with different methods.
 * It can be accessible in main method by extending the class */

package com.polymorphisam;

class Parent{
	public void show() {
		System.out.println("This is default method");
	}
	public void show(int a) {
		System.out.println("The value of a is : "+a);
	}
	public void show(String add, int a, int b) {
		System.out.println(""+add+" : "+(a+b));
	}
}

public class Method_Overloading extends Parent {

	public static void main(String[] args) {
		Method_Overloading m = new Method_Overloading();
		m.show();
		m.show(10);
		m.show("Addition", 10, 10);

	}

}
