package com.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Set_Interface {
	public static void main(String[] args) {
		HashSet<Integer> h = new HashSet<Integer>();
		h.add(32);
		h.add(null);
		h.add(23);
		h.add(12);
		h.add(30);
		h.add(32);
		
		System.out.println(h);
		System.out.println("===========================================================");
		System.out.println(h.contains(23));
		System.out.println("===========================================================");
		System.out.println(h.hashCode());
		System.out.println("===========================================================");
		System.out.println(h.isEmpty());
		System.out.println("===========================================================");
		System.out.println(h.remove(null));
		System.out.println("===========================================================");
		System.out.println(h.removeIf(n->n<15));
		System.out.println("===========================================================");
		System.out.println(h.size());
		System.out.println("===========================================================");
		System.out.println(h);
		System.out.println("***********************************************************");
		System.out.println();
		System.out.println("=====================LinkedHashSet=========================");
		LinkedHashSet<Integer> l = new LinkedHashSet<Integer>();
		l.add(10);
		l.add(15);
		l.add(101);
		l.add(105);
		l.add(null);
		l.add(85);
		l.add(85);
		
		System.out.println(l);
		System.out.println("===========================================================");
		System.out.println(l.hashCode());
		System.out.println("===========================================================");
		System.out.println(l.isEmpty());
		System.out.println("===========================================================");
		System.out.println(l.getFirst());
		System.out.println("===========================================================");
		System.out.println(l.getLast());
		System.out.println("===========================================================");
		l.addFirst(155);
		l.addLast(122);
		System.out.println(l);
	}
}
