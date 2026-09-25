package com.encapsulation;
import com.accessModifires.DefaultAM;

public class DefaultAMTest extends DefaultAM {
	public static void main(String[] args) {
		DefaultAM p = new DefaultAM();
//		System.out.println("The value of a is : "+p.a); // Not Accessible out of package
		p.show();
	}
}
