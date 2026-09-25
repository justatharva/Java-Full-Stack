
/* Constructor can be created in class with same class name.
 * In this program there are multiple constructor with same name but different parameter.
 * It can ve accessible in main method by creating objects with different name and parameter.
 * This method is called as Constructor Overloading */

package com.polymorphisam;

class Test{
	Test(){
		System.out.println("This is default Constructor");
	}
	Test(int a){
		System.out.println("The value of a is "+a);
	}
	Test(String add, int a, int b){
		System.out.println(""+add+" : "+(a+b));
	}
	public void show() {
		System.out.println("This is normal method");
	}
}

public class Constructor_Overloading {

	public static void main(String[] args) {
		Test t = new Test();
		Test t1 = new Test(10);
		Test t2 = new Test("Addition is",10,20);
		t.show();
	}

}
