package com.array;

import java.util.Scanner;
import java.util.*;
public class Array_Sort {
	public static void main(String[] args) {
		int a[] = new int[5];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Elements : ");
		for(int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Before Sorting : ");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("After sorting : ");
		Arrays.sort(a);
		System.out.println("Ascending Order: ");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("Smallest Element is : "+a[0]);
		System.out.println("Largest element is : "+a[4]);
		
		System.out.println("Descending Order: ");
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);
		}
	}
}
