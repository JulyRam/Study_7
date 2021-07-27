package com.epic.s1.string.ex1;

import java.util.Scanner;
import java.util.Spliterator;

public class WeatherInfo {
	
	private String info;
	private StringBuffer sb;
	
	public WeatherInfo() {
		sb = new StringBuffer();
		sb.append("seoul, 37, 80, 맑음,");
		sb.append("daegu, 43, 90, 지옥,");
		sb.append("busan, -32, 10, 눈,");
		sb.append("jeju, 3, 40, 비");
	}
	
	public WeatherDTO searchWeather (WeatherDTO [] weathers) {
		Scanner sc = new Scanner(System.in);
		System.out.println("검색할 도시명 입력");
		String cityName = sc.next();
		
		WeatherDTO weatherDTO = null;
		for (int i=0; i<weathers.length; i++) {
			if (weathers [i].getCity().equals(cityName)) {
				weatherDTO = weathers[i];
				break;
			}
		}
		return weatherDTO;
	}
	
	public WeatherDTO [] makeWeather() {
		
		//StringBuffer에 있는 Data를 String으로 변환
		info = sb.toString();
		System.out.println(info);
		
		//파싱(parsing, 문자열을 자르는 작업)
		String [] strings = info.split(",");
		System.out.println(strings.length);
		WeatherDTO [] weathers = new WeatherDTO[strings.length/4];
		
		for (int i=0; i<strings.length; i++) {
			WeatherDTO weatherDTO = new WeatherDTO();
			weatherDTO.setCity(strings[i].trim());
			weatherDTO.setGion(strings[++i].trim());
			weatherDTO.setHumi(strings[++i].trim());
			weatherDTO.setCondition(strings[++i].trim());
			weathers [i/4] = weatherDTO;
		}
			
		 
		return weathers;
	}
	
}
