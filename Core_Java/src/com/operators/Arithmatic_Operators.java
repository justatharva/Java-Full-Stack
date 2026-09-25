package com.operators;

import java.util.Scanner;

public class Arithmatic_Operators {
	
	int num1,num2;
	int add,sub,mul,div,mode;
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num1: ");
		num1 = sc.nextInt();
		
		System.out.println("Enter the num2: ");
		num2 = sc.nextInt();
		
	}
	
	public void process() {
		add = num1+num2;
		sub = num1-num2;
		mul = num1*num2;
		div = num1/num2;
		mode = num1%num2;
	}
	
	public void output() {
		System.out.println("Addition: "+add);
		System.out.println("Substraction: "+sub);
		System.out.println("Multiplication: "+mul);
		System.out.println("Division: "+div);
		System.out.println("Modulus: "+mode);
	}
	
	public static void main(String[] args) {
		Arithmatic_Operators op = new Arithmatic_Operators();
		op.input();
		op.process();
		op.output();
	}

}
