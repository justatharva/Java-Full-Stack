package com.multithreading;

class S extends Thread{
	public void run() {
		String name = Thread.currentThread().getName();
		for(int i=0; i<=3;i++) {
			System.out.println(name);
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class Sleep_Method {
	public static void main(String[] args) {
		S t1 = new S();
		S t2 = new S();
		S t3 = new S();
		
		t1.setName("Thread - 1");
		t2.setName("Thread - 2");
		t3.setName("Thread - 3");
		
		t1.start();
		t2.start();
		t3.start();
	}
}
