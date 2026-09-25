package com.stream;
// Needs to be dry run
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectTypeData {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Employee e = new Employee(101,"John","Pune",30);
		FileOutputStream fout = new FileOutputStream("Demo1.txt");
		System.out.println("File is created");
		
		ObjectOutputStream o = new ObjectOutputStream(fout);
		o.writeObject(e);
		o.close();
		FileInputStream fin = new FileInputStream("Demo1.txt");
		ObjectInputStream o1 = new ObjectInputStream(fin);
		
		e = (Employee) o1.readObject();
		System.out.println(e);
		o1.close();
	}
}
