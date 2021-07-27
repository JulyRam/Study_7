package com.epic.s1.wrapper;

public class WrapperMain3 {

	public static void main(String[] args) {
		
		String jumin = "960715-1041615";
		String n1 = jumin.substring(0, 1); String n2 = jumin.substring(1, 2);
		String n3 = jumin.substring(2, 3); String n4 = jumin.substring(3, 4);
		String n5 = jumin.substring(4, 5); String n6 = jumin.substring(5, 6);
		String n7 = jumin.substring(7, 8); String n8 = jumin.substring(8, 9);
		String n9 = jumin.substring(9, 10); String n10 = jumin.substring(10, 11);
		String n11 = jumin.substring(11, 12); String n12 = jumin.substring(12, 13);
		String n13 = jumin.substring(13, 14);
		
		int save = Integer.parseInt(n1)*2 + Integer.parseInt(n2)*3
				+ Integer.parseInt(n3)*4 + Integer.parseInt(n4)*5 
				+ Integer.parseInt(n5)*6 + Integer.parseInt(n6)*7
				+ Integer.parseInt(n7)*8 + Integer.parseInt(n8)*9
				+ Integer.parseInt(n9)*2 + Integer.parseInt(n10)*3
				+ Integer.parseInt(n11)*4 + Integer.parseInt(n12)*5;
		System.out.println(save);
		
		int num1 = save%11;
		int num2 = 11-num1;
		int num3 = Integer.parseInt(n13);
		
		if (num2 == num3) {
			System.out.println("정상입니다.");
		} else if (num2 == num3%10) {
			System.out.println("정상입니다.");
		} else {
			System.out.println("잘못된 정보입니다.");
		}
		
		
	}

}
