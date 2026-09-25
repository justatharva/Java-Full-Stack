package com.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Byte_Stream {
	public static void main(String[] args) throws IOException {
		FileInputStream fin = new FileInputStream("C:\\Users\\sang0\\Documents\\DSA.txt");
		System.out.println("File Found");
//		int ch;
//		ch = fin.read();
//		System.out.println(ch);
		
//		while((ch=fin.read())!=-1) {
//			System.out.print((char)ch);
//		}
		
		FileOutputStream fout = new FileOutputStream("Test.txt");
		System.out.println("File is Created");
		//fout.write(65);
		
		String a = "Hello Its a Testing File";
		byte b[] = a.getBytes();
		fout.write(b);
		fout.flush();
	}
}
