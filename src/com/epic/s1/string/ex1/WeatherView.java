package com.epic.s1.string.ex1;

public class WeatherView {
	
	public void view (String message) {
		System.out.println(message);
	}
	
	//WeatherDTO 하나의 정보를 메서드 생성
	public void view (WeatherDTO weatherDTO) {
		
		System.out.println("도시명 \t 기온 \t 습도 \t 날씨");
		System.out.println("================================");
		System.out.print(weatherDTO.getCity() + " \t");
		System.out.print(weatherDTO.getGion() + " \t");
		System.out.print(weatherDTO.getHumi() + " \t");
		System.out.println(weatherDTO.getCondition());
	}
	
	
	//모든 지역의 날씨정보를 출력
	public void view (WeatherDTO [] weathers) {
		System.out.println("도시명 \t 기온 \t 습도 \t 날씨");
		System.out.println("================================");

		for(int i=0;i<weathers.length;i++) {
			System.out.print(weathers[i].getCity() + " \t");
			System.out.print(weathers[i].getGion() + " \t");
			System.out.print(weathers[i].getHumi() + " \t");
			System.out.println(weathers[i].getCondition());
			System.out.println("-------------------------");
	}
	}
}
