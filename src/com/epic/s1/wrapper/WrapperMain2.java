package com.epic.s1.wrapper;

import java.util.Scanner;

public class WrapperMain2 {

	public static void main(String[] args) {
		
		//주민번호 입력
		//9912224-1234567
		
		String num = "991224-1234567";
		
		String year = num.substring(0, 2);
		int y = Integer.parseInt(year);
		
		y = 1900+y;
		int age = 2021-y;
		System.out.println(age);
		
		String m = num.substring(2, 4);
		int month = Integer.parseInt(m);
		System.out.println(month);
		
		if  (month>=3 &&  month<6) {
			System.out.println("봄");
		} else if (month>=6 &&  month<9) {
			System.out.println("여룸");
		} else if (month>=9 &&  month<12) {
			System.out.println("가을");
		} else {
			System.out.println("겨울");
		}
	}

}
