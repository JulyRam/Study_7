package com.epic.s2.list.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberController {
	private Scanner sc;
	private MemberDAO memberDAO;
	private ArrayList<MemberDTO> ar;
	private MemberView memberView;
	
	public MemberController() {
		sc = new Scanner(System.in);
		memberDAO = new MemberDAO();
		//init - 초기화
		ar = memberDAO.memberInit();
	}
	
	
	public void start() {
		
		
		boolean check=true;
		while(check) {
			if(MemberSession.SESSION.get("member") != null) {
				//로그인 성공한 후
				afterLogin();
			}else
			check=beforeLogin();
			//로그인 전, 또는 실패
		}
		//1. 회원가입
		//2. 로그인
		//3. 종   료
		
		
	}//start
	
	private void afterLogin() {
		System.out.println("1. Mypage");
		System.out.println("2. Logout");
		
		int select = sc.nextInt();
		
		if(select == 1) {
			System.out.println("자기 정보 출력");
			MemberView memberView = new MemberView();
			memberView.view();
		} else {
			//1. 수정
			//MemberSession.SESSION.put("member", null);
			//2. 삭제
			//MemberSession.SESSION.remove("member");
			//3. 전체 삭제
			MemberSession.SESSION.clear();
		}
		
	}
	
	private boolean beforeLogin() {
		System.out.println("1. 회원 가입");
		System.out.println("2. 로 그 인");
		System.out.println("3. 종    료");
		int select=sc.nextInt();
		boolean flag=true;
		switch(select) {
		case 1:
			memberDAO.memberAdd(ar);
			break;
		case 2:
			MemberDTO memberDTO = memberDAO.memberLogin(ar);
			if(memberDTO != null) {
				System.out.println("로그인 성공");
				MemberSession.SESSION.put("member", memberDTO);
			}else {
				System.out.println("로그인 실패");
			}
			break;
		default :
			flag=false;
		}
		
		return flag;
	}

}