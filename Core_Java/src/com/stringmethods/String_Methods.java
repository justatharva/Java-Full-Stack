package com.stringmethods;

import java.util.*;

public class String_Methods {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = "Hello Java";
		String s1 = new String("Welcome");
		
		System.out.println(s);
		System.out.println(s1);
		
		System.out.println(s.charAt(4));
		System.out.println(s.compareTo("Hello Java"));
		System.out.println(s.trim());
		System.out.println(s.concat(": HTML & CSS"));
		System.out.println(s1.equals(s));
		System.out.println(s.equalsIgnoreCase("hello java"));
		System.out.println(s.length());
		System.out.println(s.contains(s1));
		System.out.println(s.hashCode());
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.compareToIgnoreCase("Hello java"));
		String s2 = " ";
		System.out.println(s2.isBlank());
		System.out.println(s2.isEmpty());
		
		String s3 = "Hello world";
		String ar[] = s3.split(" ");
		for(String s4 : ar) {
			System.out.println(s4);
		}
		
//		String name = "Atharva";
//		String arr[] = name.split("",-1);
//		for(String n : arr) {
//			System.out.println(n);
//		}
		System.out.println("Enter String : ");
		String name = sc.next();
		String arr[] = name.split("",-1);
		
		for(int i=name.length();i>=0;i--) {
			System.out.print(arr[i]);
		}
		sc.close();
		
//		String s5 = "*=*=*=*=*=*==***===*";
//		String arr[] = s5.split("*");
//		for(String s6 : arr) {
//			System.out.println(s6);
//		}
	}
}
