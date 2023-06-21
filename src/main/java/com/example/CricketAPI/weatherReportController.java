package com.example.CricketAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class weatherReportController extends weatherUtil{
	
	 private static final String[] cities = {"Bangalore", "Delhi", "kolkata", "Mumbai", "Hyderabad"};

	    @GetMapping("/getweatherreport.json")
	    public String getWeather() {
	        StringBuilder result = new StringBuilder();
	        for (String city : cities) {
	            String weatherReport = getWeatherReport(city);
	            result.append(weatherReport).append(System.lineSeparator());
	        }
	        return result.toString();
	    }
	
}
 