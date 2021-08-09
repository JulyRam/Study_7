package com.epic.s4.io.file;

import java.io.File;

public class FileMain {

	public static void main(String[] args) {
		
		//File file = new File("D:\\test\\test.txt");
		
		File file = new File("D:\\\\test");
		boolean result = file.exists();
		result = file.isFile();
		System.out.println(result);
		
		file = new File(file, "test.txt");
		
		result = file.exists();
		System.out.println(result);
		
		
		
		
	}

}
