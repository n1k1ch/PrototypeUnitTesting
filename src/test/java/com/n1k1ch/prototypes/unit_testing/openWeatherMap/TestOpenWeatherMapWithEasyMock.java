package com.n1k1ch.prototypes.unit_testing.openWeatherMap;
import static org.easymock.EasyMock.expect;
import static org.junit.Assert.assertEquals;

import org.easymock.EasyMock;
import org.easymock.IMocksControl;
import org.junit.Test;

import com.n1k1ch.prototypes.unitTesting.openWeatherMap.OpenWeatherMapService;

public class TestOpenWeatherMapWithEasyMock {

	IMocksControl control = EasyMock.createControl();
	
	@Test
	public void testGetWeatherForKharkov() {
		final OpenWeatherMapService service = control.createMock(OpenWeatherMapService.class);
		
		expect(service.getWeatherForKharkov()).andReturn("MOCKED");
		control.replay();
		
		assertEquals("Mocked method doesn't returned \"MOCKED\"", service.getWeatherForKharkov(), "MOCKED");
	}
}
