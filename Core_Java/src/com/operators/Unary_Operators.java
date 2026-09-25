package com.operators;

public class Unary_Operators {

	public static void main(String[] args) {
		int a = 10;
		
		System.out.println("Pre/Post increment");
		System.out.println(a++);// 10 11
		System.out.println(++a);// 11 12
		
		System.out.println("Pre/Post decrement");
		System.out.println(a--);// 12 11
		System.out.println(--a);// 11 10
	}

}
