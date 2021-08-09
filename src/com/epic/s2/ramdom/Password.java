package com.epic.s2.ramdom;

import java.util.HashSet;
import java.util.Random;

public class Password {
	
	//메서드 : makePassword - 랜덤한 패스워드 생성
	//대문자, 소문자, 숫자 조합, 8글자
	//(65~90) (97~112) (48~57) 
	
	//1. 대문자, 소문자, 숫자 결정 : random.nextInt(3);
	//2. 글자 랜덤 : 아스키코드
	
	
	public HashSet<Integer> makePassword () {
		Random random = new Random();
		HashSet<Integer> hashSet = new HashSet<>();
		
		for (int j=0; j<4; j++) {
			int select=random.nextInt(3);
			if (select == 0) {
				
				int num = random.nextInt(26)+65;
				char ch = (char)num;
				System.out.print(ch);
			} else if (select == 1) {
				
				int num = random.nextInt(26)+97;
				char ch = (char)num;
				System.out.print(ch);
			} else {
				
				int num = random.nextInt(10);
				System.out.print(num);
			}
			
		}
		
		return hashSet;
	}
	
	
	/*public HashSet<Integer> makePassword () {
		
		HashSet<Integer> hashSet = new HashSet<>();
		Random random = new Random();
		
		while (hashSet.size() != 8) {
			int pw = random.nextInt(3);
			hashSet.add(pw);
			if(pw == 0) {
				int pw2 = random.nextInt(9)+39;
			} else if (pw == 1) {
				int pw3 = random.nextInt(25)+40;
				int pw2 = (char)pw3;
			} else {
				int pw3 = random.nextInt(25)+72;
				int pw2 = (char)pw3;
			}
		}
		
		return hashSet;
	}*/

}
