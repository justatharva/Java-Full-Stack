package com.Interface;

interface cli{
	void webDesign();
	void webDevelopment();
}

abstract class Dev1 implements cli{

	@Override
	public void webDesign() {
		System.out.println("This is front end");
	}
}

class Dev2 extends Dev1{

	@Override
	public void webDevelopment() {
		System.out.println("This is Backend");
	}
	
}

public class Interface_Abstract_Class {
	public static void main(String[] args) {
		Dev2 d = new Dev2();
		d.webDesign();
		d.webDevelopment();
	}
}
