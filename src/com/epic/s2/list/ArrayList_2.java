package com.epic.s2.list;

import java.util.ArrayList;

import java.util.List;

public class ArrayList_2 {

	public static void main(String[] args) {
		
		//type이 안전하지 않다
		ArrayList<String> ar = new ArrayList<String>();
		
		ar.add("1");
		
		ArrayList<Integer> ar2 = new ArrayList<>();
		
		//List는 ArrayList의 super class(Interface)
		//단, generic type도 일치
		//List<Integer> list = ar;
		//List<Object> list = ar;
		
		String s = ar.get(0);
	}

}
