package com.multithreading;

class P extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
	}
}

public class Priority_Class extends P {
	public static void main(String[] args) {
		P t1 = new P();
		P t2 = new P();
		P t3 = new P();
		
		t1.setName("Thread - 1");
		t2.setName("Thread - 2");
		t3.setName("Thread - 3");
		
//		t1.setPriority(4);
//		t2.setPriority(6);
//		t3.setPriority(9);
		
		t1.setPriority(NORM_PRIORITY);
		t2.setPriority(MAX_PRIORITY);
		t3.setPriority(MIN_PRIORITY);
		
		
		t1.start();
		t2.start();
		t3.start();
	}
}
