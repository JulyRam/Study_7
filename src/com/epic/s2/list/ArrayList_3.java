package com.epic.s2.list;

import java.util.ArrayList;

public class ArrayList_3 {

	public static void main(String[] args) {
		
		ArrayList<Member> ar = new ArrayList<Member>();
		Member member = new Member();
		member.setId("id");
		member.setPw("pw");
		ar.add(member);
		
		ar.add(new Member()); //1
		ar.get(1).setId("id"); //Member
		
		Member member2 =  ar.get(0);
		
		
	}

}
