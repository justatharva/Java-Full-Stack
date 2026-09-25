package com.multithreading;

class Y1 extends Thread{
	public void run() {
		for(int i=1;i<=3;i++) {
			System.out.println(Thread.currentThread().getName());
//			Thread.yield();
		}
	}
}

class Y2 extends Thread{
	public void run() {
		String name = Thread.currentThread().getName();
		for(int i=1;i<=3;i++) {
			System.out.println(name);
			Thread.yield();
		}
	}
}

public class Yeild_Method {
	public static void main(String[] args) {
		Y1 t1 = new Y1();
		Y2 t2 = new Y2();
		
		t1.start();t2.start();
	}
}
