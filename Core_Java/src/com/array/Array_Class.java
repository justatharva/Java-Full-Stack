package com.array;

public class Array_Class {
	public static void main(String[] args) {
		int a[] = new int[5];
		
		a[0] = 10;
		a[1] = 12;
		a[2] = 20;
		a[3] = 30;
		a[4] = 40;
		
		for(int i : a){
			System.out.println(i);
		}
		
		int ar[] = {1,2,3,4,5};
		
		for(int i: ar) {
			System.out.println(i);
		}
	}
}
