package com.stringmethods;

public class StringBufferAndStringBuilder {
	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("Hello Java");
		System.out.println(s);
		System.out.println(s.capacity());
		System.out.println(s.charAt(1));
		System.out.println(s.indexOf("e"));
		System.out.println(s.length());
		System.out.println(s.isEmpty());
		System.out.println(s.append(": Welcome"));
		System.out.println(s.insert(1, "Python"));
		System.out.println(s.delete(0, 1));
		System.out.println(s.deleteCharAt(1));
		System.out.println(s.reverse());
		
		System.out.println("===============================");
		
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.append("Hello Python"));
		System.out.println(sb.indexOf("p"));
		System.out.println(sb.insert(1,"p"));
		System.out.println(sb.codePointAt(1));
		System.out.println(sb.codePointBefore(1));
		System.out.println(sb.codePointCount(1, 2));
		System.out.println(sb.substring(1, 2));
		System.out.println(sb.replace(1, 2, "e"));
		
	}
}
