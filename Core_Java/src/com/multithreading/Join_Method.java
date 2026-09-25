package com.multithreading;

class J extends Thread{
	public void run() {
		String name = Thread.currentThread().getName();
		for(int i=1;i<=3;i++) {
			System.out.println(name);
		}
	}
}

public class Join_Method {
	public static void main(String[] args) throws InterruptedException {
		J t1 = new J();
		J t2 = new J();
		J t3 = new J();
		
		t1.setName("Thread - 1");
		t2.setName("Thread - 2");
		t3.setName("Thread - 3");
		
		t1.start();t2.start();t3.start();
		t2.join();
	}
}
