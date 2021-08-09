package com.epic.s4.io;

import java.util.Calendar;
import java.util.UUID;

public class IoMain2 {

	public static void main(String[] args) {
		
		String fileName = "";
		
		//fileName을 생성하는 코드
		
		Calendar calendar = Calendar.getInstance();
		
		long t = calendar.getTimeInMillis();
		
		fileName = String.valueOf("fileName : " + t);
		
		//몇번을 돌리든 중복 X 보장
		System.out.println(fileName);
		
		fileName = UUID.randomUUID().toString();
		System.out.println(fileName);
		
	}

}
