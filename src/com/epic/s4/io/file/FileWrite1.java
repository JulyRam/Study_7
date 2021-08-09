package com.epic.s4.io.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWrite1 {
	
	Scanner sc = new Scanner(System.in);
	
	public void Write2 () {
		sc = new Scanner(System.in);
		File file2 = new File("d:\\test", "member.txt");
		
		System.out.println("ID, PW, AGE 입력");
		for (int i=0; i<3; i++) {
			String message = sc.nextLine();
			try {
				FileWriter fw2 = new FileWriter(file2, true);
				fw2.write("ID \t PW \t AGE");
				fw2.write(message + " ");
				fw2.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
			finally {
				//자원 해제 : 자원과 연결된 역순으로 해제
				
			}
		}
		System.out.print("ID \t PW \t AGE");
		
	}
	
	/*public void write () {
		sc = new Scanner(System.in);
		File file = new File("d:\\test", "tt.txt");
		
		System.out.println("메세지를 입력하세요");
		String message = sc.nextLine();
		
		try {
			FileWriter fw = new FileWriter(file, true);
			fw.write(message + "\n\r");
			fw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}*/
	
}
