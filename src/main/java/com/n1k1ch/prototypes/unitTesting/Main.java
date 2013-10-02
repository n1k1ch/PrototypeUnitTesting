package com.n1k1ch.prototypes.unitTesting;

import com.n1k1ch.prototypes.unitTesting.openWeatherMap.OpenWeatherMapService;

public class Main {

	public static void main(String[] args) {
		System.out.println("main");
		
		String weatherForKharkov = new OpenWeatherMapService().getWeatherForKharkov();
		
		System.out.println(weatherForKharkov);
	}
}
