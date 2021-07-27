package com.epic.s1.string.ex1;

import java.util.Scanner;

public class WeatherController {
	private WeatherInfo weatherInfo;
	private WeatherView weatherView;

	public WeatherController() {
		weatherInfo = new WeatherInfo();
		weatherView = new WeatherView();
	}

	
	public void start () {
		
		System.out.println("Start");
		
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		
		WeatherDTO [] weathers = weatherInfo.makeWeather();
		
		while (check) {
			
			//메뉴 생성
			System.out.println("1. 날씨정보전체출력");
			System.out.println("2. 지역검색정보출력");
			System.out.println("3. 지역정보 추가");
			System.out.println("4. 종료");
			int select = sc.nextInt();
			
			if (select == 1) {
				this.weatherView.view(weathers);
			}else if (select == 2) {
				WeatherDTO weatherDTO = this.weatherInfo.searchWeather(weathers);
				if (weatherDTO !=null) {
					this.weatherView.view(weatherDTO);
				} else {
					this.weatherView.view("정보가없어요");
				}
				
				
			} else if (select == 3) {
				System.out.println("3");
			} else {
				break;
			}
			
		}
		
		
		
		
		System.out.println("Finish");
	}
}
