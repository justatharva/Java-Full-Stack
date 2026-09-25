package com.multithreading;

class R implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println(i+ " : This is Runnable Thread Class");
		}
	}
	
}

public class Runnable_Interface {
	public static void main(String[] args) {
		R r = new R();
		Thread t1 = new Thread(r);
		t1.start();
		for(int i=0;i<=5;i++) {
			System.out.println(i+ " : This is Main Class");
		}
	}
}
