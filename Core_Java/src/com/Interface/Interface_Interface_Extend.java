package com.Interface;
import java.util.*;
interface Add{
	void add();
}

interface Sub extends Add{
	void sub();
}



public class Interface_Interface_Extend implements Sub {
	
	int a,b;
	@Override
	public void add() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of a : ");
		a = sc.nextInt();
		
		System.out.println("Enter value of b : ");
		b = sc.nextInt();
		
		System.out.println("Addition is : "+(a+b));
	}

	@Override
	public void sub() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of a : ");
		a = sc.nextInt();
		
		System.out.println("Enter value of b : ");
		b = sc.nextInt();
		
		System.out.println("Substraction is : "+(a-b));
	}
	
	public static void main(String[] args) {
		Add a = new Interface_Interface_Extend();
		a.add();
		
		Sub s = new Interface_Interface_Extend();
		s.add();
		s.sub();
	}

}
