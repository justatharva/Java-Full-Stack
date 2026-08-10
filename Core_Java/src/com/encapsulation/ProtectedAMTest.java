package com.encapsulation;
import com.accessModifires.ProtectedAM;

public class ProtectedAMTest extends ProtectedAM{
	public static void main(String[] args) {
		ProtectedAMTest p = new ProtectedAMTest();
		System.out.println("The value of a is : "+p.a);
		p.show();
	}
}
