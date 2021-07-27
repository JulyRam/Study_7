package com.epic.s1.string;

public class StringMain7 {

	public static void main(String[] args) {
		
		String n = "abc";
		String m = "def";
		
		StringBuffer sb = new StringBuffer();
		sb.append(n);
		sb.append(m);
		sb.append(3);
		
		System.out.println(sb);
		
	}

}
