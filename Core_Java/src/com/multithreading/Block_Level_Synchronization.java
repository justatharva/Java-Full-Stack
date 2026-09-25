package com.multithreading;
// Block Level Synchronization
class Table{
	public void printTable(int n) {
		//Executes Before code
		System.out.println("?????????????????");
		synchronized (this) {
			for(int i=1;i<=10;i++) {
				System.out.println(n*i);
			}
		}
		System.out.println("_________________");
	}
}

class Thread1 extends Thread{
	Table t;
	Thread1(Table t){
		this.t = t;
	}
	public void run() {
		t.printTable(5);
	}
}

class Thread2 extends Thread{
	Table t;
	Thread2(Table t){
		this.t = t;
	}
	public void run() {
		t.printTable(7);
	}
}

public class Block_Level_Synchronization {
	public static void main(String[] args) {
		Table t = new Table();
		Thread1 t1 = new Thread1(t);
		Thread2 t2 = new Thread2(t);
		
		t1.start();
		t2.start();
	}
}
