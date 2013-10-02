package com.n1k1ch.prototypes.unitTesting.openWeatherMap;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.util.Scanner;

public class OpenWeatherMapService {

	private static final String URL = "http://api.openweathermap.org/data/2.5/weather?q=Kharkov";

	public String getWeatherForKharkov() {
		String result = "ERROR";
		
		try(InputStream response = new java.net.URL(URL).openStream()) {
			try(Scanner scanner = new Scanner(response,"UTF-8")) {
				result = scanner.useDelimiter("\\A").next();
			} catch (Exception e) {
			}
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return result;
	}
}
