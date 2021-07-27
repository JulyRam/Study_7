package com.epic.s1.string;

import java.util.Scanner;

public class StringMain5 {

	public static void main(String[] args) {
		
		String n = "Hello World";
		String n2 = n.replace('l', 'z');
		System.out.println(n);
		System.out.println(n2);
		
		String n3 = n.substring(6);
		System.out.println(n3);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("저장할 파일명을 입력");
		String fileName = sc.next();
		
		String [] files = {"jpg", "gif", "png", "svg"};
		
		//1. . 인덱스 번호 찾기
		int idx = fileName.lastIndexOf('.');
		String ext = fileName.substring(idx + 1);
		boolean check = false;
		
		for (int i=0; i<files.length; i++) {
			if (ext.equals(files[i])) {
				check=true;
				break;
				}
			}
		if (check) {
			System.out.println("이미지 파일");
		} else {
			System.out.println("이미지 파일 아님");
		}
	}

}
