package com.n1k1ch.prototypes.unit_testing.openWeatherMap;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.n1k1ch.prototypes.unitTesting.openWeatherMap.OpenWeatherMapService;

@RunWith(MockitoJUnitRunner.class)
public class TestOpenWeatherMapWithMockito {

	@Mock
	OpenWeatherMapService openWeatherMapService;

	@Test
	public void testGetWeatherForKharkov() {
		
		when(openWeatherMapService.getWeatherForKharkov()).thenReturn("MOCKED");
		
		assertEquals("Mocked method doesn't returned \"MOCKED\"", "MOCKED", openWeatherMapService.getWeatherForKharkov());
	}

}
