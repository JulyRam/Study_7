package com.epic.s2.token;

import java.util.StringTokenizer;

public class TokenMain2 {

	public static void main(String[] args) {
		
		String str="korea-USA-caina*france*UK-canada-germany";
		
		str = str.replace("-", "*");
		str = str.toUpperCase();
		
		StringTokenizer st = new StringTokenizer(str, "*");
		
		while(st.hasMoreElements()) { 
			String s = st.nextToken();
			System.out.println(s);
		}
	}

}
