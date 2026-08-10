package com.Interface;

interface A{
	public void show();
}

interface B{
	public void show();
}

public class Multiple_Inheritance implements A,B {

	@Override
	public void show() {
		System.out.println("This is multiple inheritance");
	}
	public static void main(String[] args) {
		Multiple_Inheritance m = new Multiple_Inheritance();
		m.show();
	}
}
