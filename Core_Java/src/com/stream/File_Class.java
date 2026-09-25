package com.stream;

import java.io.File;
import java.io.IOException;

public class File_Class {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\sang0\\Documents\\DSA.txt");
		
		System.out.println(f.canExecute());
		System.out.println(f.canRead());
		System.out.println(f.canWrite());
		System.out.println(f.isFile());
		System.out.println(f.exists());
		System.out.println(f.getParent());
		System.out.println(f.createNewFile());
		System.out.println(f.lastModified());
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getName());
		System.out.println(f.getPath());
		System.out.println(f.isDirectory());
		System.out.println(f.isHidden());
		System.out.println(f.length());
		System.out.println(f.mkdir());
		System.out.println(f.renameTo(f));
	}
}
