package com.epic.s1.string;

public class StringMain6 {

	public static void main(String[] args) {
		
		String weather = "서울-대구-대전-광주-부산-제주";
		
		String [] citys = weather.split("-");
		
		for (int i=0; i<citys.length; i++) {
			System.out.println(citys[i]);
		}
		
		weather = "32 89 45 67";
		
		String [] city = weather.split(" ");
		
		for (int i=0; i<city.length; i++) {
			System.out.println(city[i]);
		}
		
		String name = "  T e s t                  ";
		name = name.trim();
		name = name.replace(" ", "");
		System.out.println(name.equals("Tess"));
		
	}

}
