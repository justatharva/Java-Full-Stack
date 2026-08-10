package com.stream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStream {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("C:\\Users\\sang0\\Documents\\DSA.txt");
		System.out.println("File Found");
		
		int ch;
		ch = fr.read();
		System.out.println(ch);
//		
//		while((ch=fr.read())!=-1) {
//			System.out.print((char)ch);
//		}
		
		FileWriter fw = new FileWriter("Demo.txt");
		fw.write("This is Demo.txt file");
		fw.flush();
	}
}
