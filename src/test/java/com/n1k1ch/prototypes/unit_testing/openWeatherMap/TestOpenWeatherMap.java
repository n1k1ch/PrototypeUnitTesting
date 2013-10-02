package com.n1k1ch.prototypes.unit_testing.openWeatherMap;

import org.junit.Before;
import org.junit.Test;

import com.n1k1ch.prototypes.unitTesting.openWeatherMap.OpenWeatherMapService;

public class TestOpenWeatherMap {
	
	OpenWeatherMapService openWeatherMapService;
	
	@Before
	public void setup() {
		openWeatherMapService = new OpenWeatherMapService();
	}

	@Test
	public void testGetWeatherForKharkov() {
		System.out.println(openWeatherMapService.getWeatherForKharkov());
	}
}
