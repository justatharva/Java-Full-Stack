package com.multithreading;

class Bus implements Runnable{

	int availableseats = 1;
	int passenger;
	
	Bus(int passenger){
		this.passenger = passenger;
	}
	
	@Override
	public synchronized void run() {
		String name = Thread.currentThread().getName();
		
		if(availableseats>=passenger) {
			System.out.println(name+" : Seat Reserved...");
			System.out.println("Seats Before Reservation : "+availableseats);
			availableseats -= passenger;
			System.out.println("Seats After Reservation : "+availableseats);
		}
		else {
			System.out.println(name+" : Sorry Seats Are Not Available");
		}
	}
	
}

public class Method_Level_Synchronization {
	public static void main(String[] args) {
		Bus b = new Bus(1);
		Thread t1 = new Thread(b);
		Thread t2 = new Thread(b);
		Thread t3 = new Thread(b);
		
		t1.setName("Raju");
		t2.setName("Anu");
		t3.setName("Anushree");
		
		t1.start();t2.start();t3.start();
	}
}
