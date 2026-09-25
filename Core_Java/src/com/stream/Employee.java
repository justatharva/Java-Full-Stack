package com.stream;

import java.io.Serializable;

public class Employee implements Serializable {
	private int id;
	private String name;
	private String city;
	private int age;
	
	public Employee(int id, String name, String city, int age) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + ", age=" + age + "]";
	}
	
	
}
