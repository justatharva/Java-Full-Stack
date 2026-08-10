package com.multithreading;

class T extends Thread{
	public void run() {
		for(int i = 1; i <= 5; i++) {
			System.out.println(i+" : This is Thread Class");
		}
	}
}

public class Thread_Class{
	public static void main(String[] args) {
		T t = new T();
		Thread t1 = new Thread(t);
		t1.start();
		
		for(int i = 1; i <= 5; i++) {
			System.out.println(i+" : This is Main Class");
		}
	}
}
