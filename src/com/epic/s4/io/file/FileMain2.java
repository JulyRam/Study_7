package com.epic.s4.io.file;

import java.io.File;
import java.util.Scanner;

public class FileMain2 {

	public static void main(String[] args) {
		
		File file = new File("D:\\test");
		Scanner sc = new Scanner(System.in);
		System.out.println("폴더명 입력");
		String name = sc.next();
		
		file = new File(file, name);
		
		if (file.exists()) {
			file.delete();
		} else {
			file .mkdir();
		}
		
		
		
		/*if (!file.exists()) {
			file.mkdirs();
		} */
		
	}

}
