package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class List_Interface {
	public static void main(String[] args) {
		List l = new ArrayList();
		l.add(10);
		l.add(22);
		l.add(null);
		l.add("Hello");
		System.out.println(l);
		
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(23);
		l1.add(null);
		l1.add(23);
		l1.add(30);
		l1.add(20);
		l1.add(25);
		System.out.println("===========================================================");
		System.out.println("ArrayList Elements : "+l1);
		System.out.println("===========================================================");
		System.out.println("Check contains() element in ArrayList : "+l1.contains(30));
		System.out.println("===========================================================");
		System.out.println("return hashCode() of ArrayList : "+l1.hashCode());
		System.out.println("===========================================================");
		System.out.println("return indexOf() ArrayList : "+l1.indexOf(23));
		System.out.println("===========================================================");
		System.out.println("Check isEmpty() : "+l1.isEmpty());
		System.out.println("===========================================================");
		System.out.println("return lastIndexOf() ArrayList : "+l1.lastIndexOf(23));
		System.out.println("===========================================================");
		System.out.println("remove() Perticular Element : "+l1.remove(null));
		System.out.println("===========================================================");
		System.out.println("removeFirst() Element : "+l1.removeFirst());
		System.out.println("===========================================================");
		System.out.println("removeLast() Element : "+l1.removeLast());
		System.out.println("===========================================================");
		System.out.println("Remaining Elements in ArrayList : "+l1);
		System.out.println("===========================================================");
		
		l1.addFirst(20);
		l1.addLast(100);
		System.out.println("After adding First and Last Element in ArrayList : "+l1);
		System.out.println("===========================================================");
		System.out.println("Size : "+l1.size());
		System.out.println("===========================================================");
		System.out.println("getFirst() Element : "+l1.getFirst());
		System.out.println("===========================================================");
		System.out.println("getLast() Element: "+l1.getLast());
		System.out.println("===========================================================");
		System.out.println("reversed() Elements : "+l1.reversed());
		System.out.println("===========================================================");
		l1.stream().filter(n-> n%2==0).forEach(System.out::println);
		System.out.println("===========================================================");
		Iterator<Integer> i = l1.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("===========================================================");
		for(int i1 : l1) {
			System.out.println(i1);
		}
		System.out.println("===========================================================");
		
		ListIterator<Integer> l2 = l1.listIterator();
		while(l2.hasNext()) {
			System.out.println(l2.next());
		}
		System.out.println("***********************************************************");
		System.out.println();
		System.out.println("========================LinkedList=========================");
		LinkedList<Integer> l3 = new LinkedList<Integer>();
		l3.add(10);
		l3.add(23);
		l3.add(11);
		l3.add(65);
		l3.add(45);
		l3.add(100);
		l3.add(null);
		l3.add(25);
		l3.add(96);
		
		System.out.println(l3);
		System.out.println("====================Predefined-Methods=====================");
		System.out.println(l3.contains(25));
		System.out.println("===========================================================");
		System.out.println(l3.equals(23));
		System.out.println("===========================================================");
		System.out.println(l3.hashCode());
		System.out.println("===========================================================");
		System.out.println(l3.indexOf(65));
		System.out.println("===========================================================");
		System.out.println(l3.lastIndexOf(100));
		System.out.println("===========================================================");
		System.out.println(l3.remove(null));
		System.out.println(l3);
		System.out.println("===========================================================");
		System.out.println(l3.offer(65));
		System.out.println("===========================================================");
		System.out.println(l3.offerFirst(52));
		System.out.println("===========================================================");
		System.out.println(l3.offerLast(45));
		System.out.println(l3);
		System.out.println("===========================================================");
		System.out.println(l3.size());
		System.out.println("===========================================================");
		System.out.println(l3.get(5));
		System.out.println("===========================================================");
		System.out.println(l3.getFirst());
		System.out.println("===========================================================");
		System.out.println(l3.getLast());
		System.out.println("===========================================================");
		System.out.println(l3.peek());
		System.out.println(l3);
		System.out.println("===========================================================");
		System.out.println(l3.peekFirst());
		System.out.println("===========================================================");
		System.out.println(l3.peekLast());
		System.out.println(l3);
		System.out.println("===========================================================");
		System.out.println(l3.poll());
		System.out.println(l3.pollFirst());
		System.out.println(l3.pollLast());
		System.out.println(l3);
		System.out.println("===========================================================");
		System.out.println(l3.pop());
		System.out.println("===========================================================");
		System.out.println(l3.reversed());
		System.out.println("===========================================================");
		System.out.println(l3.set(4, 85));
		System.out.println("===========================================================");
		l3.push(101);
		System.out.println(l3);
		System.out.println("===========================================================");
		l3.addFirst(102);
		l3.addLast(202);
		System.out.println(l3);
		System.out.println("===========================================================");
		l3.stream().filter(n-> n>=50).forEach(System.out::println);
		System.out.println("===========================================================");
		Iterator<Integer> i2 = l3.iterator();
		while(i2.hasNext()) {
			System.out.println(i2.next());
		}
		System.out.println("===========================================================");
	}
}
