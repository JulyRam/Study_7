package com.epic.s2.calendar;

import java.util.Calendar;
import java.util.Date;

public class CalendarMain_1 {

	public static void main(String[] args) {
		
		Calendar ca = Calendar.getInstance();
		System.out.println(ca);
		
		int year = ca.get(Calendar.YEAR);
		System.out.println("Yeat : " + year);
		int month = ca.get(Calendar.MONTH);
		System.out.println("Month : " + month);
		int date = ca.get(Calendar.DATE);
		System.out.println("Date : " + date);
		int hour = ca.get(Calendar.HOUR_OF_DAY);
		System.out.println("Hour : " + hour);
		int minute = ca.get(Calendar.MINUTE);
		System.out.println("Minute : " + minute);
		int second = ca.get(Calendar.SECOND);
		System.out.println("Second : " + second);
		
		Date d = ca.getTime();
		System.out.println(d);
		
	}

}
