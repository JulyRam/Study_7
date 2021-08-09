package com.epic.s2.list.ex1;

public class MemberView {
	
	public void view() {
		
		//mypage 선택시 실행
		//id , pw, age 출력
		//단, 메서드의 head는 변경 X
		//멤버변수 선언 X
		
		MemberDTO memberDTO = MemberSession.SESSION.get("member");
		
		System.out.println("ID : " + memberDTO.getId());
		System.out.println("PW : " + memberDTO.getPw());
		System.out.println("AGE : " + memberDTO.getAge());
	}
	
}
