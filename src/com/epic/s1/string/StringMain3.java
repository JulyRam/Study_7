package com.epic.s1.string;

public class StringMain3 {

	public static void main(String[] args) {
		
		String name = "hello World";
		
		boolean check = true;
		int num = 0;
		int count = 0;
		
		while (check) {
			num = name.indexOf('o', num);
			
			if (num > 0) {
				num = num +1;
				count++;
			} else {
				System.out.println("검색이 종료");
				break;
			}
		}
		System.out.println(count);
	}

}
