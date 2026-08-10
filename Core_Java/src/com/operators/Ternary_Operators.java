package com.operators;

public class Ternary_Operators {
	public static void main(String[] args) {
		int a = 10, b = 20, c = 30;
		int max;
		
//		max = ((a>b) ? (a<c) ? a:c :(b>c) ? b:c);
		max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
		System.out.println(max);
	}
}
