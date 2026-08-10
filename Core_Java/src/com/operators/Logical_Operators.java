package com.operators;

public class Logical_Operators {
	public static void main(String[] args) {
		
		int a = 10, b = 20;
		
		System.out.println("This is Logical AND ( && )");
		System.out.println((a>b) && (a>b));
		System.out.println((a<b) && (a<b));
		System.out.println((a>b) && (a<b));
		
		System.out.println("This is Logical OR ( || )");
		System.out.println((a>b) || (a>b));
		System.out.println((a>b) || (a>b));
		System.out.println((a>b) || (a>b));
		
		System.out.println("This is Logical NOR ( != )");
		System.out.println((a>b) != (a<b)); // t
	}
}
