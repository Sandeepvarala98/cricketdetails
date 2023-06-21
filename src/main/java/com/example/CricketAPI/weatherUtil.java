package com.example.CricketAPI;

import org.apache.http.HttpEntity;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class weatherUtil {
	 private static final String API_KEY = "54fce905b5fd486dab024828232006";
	 public String getWeatherReport(String city) {
		
	        String apiUrl = "https://api.weatherapi.com/v1/current.json?key=" + API_KEY + "&q=" + city;

	        HttpClient httpClient = HttpClients.createDefault();
	        HttpGet request = new HttpGet(apiUrl);

	        try {
	            HttpResponse response = httpClient.execute(request);
	            HttpEntity entity = response.getEntity();
	            String responseString = EntityUtils.toString(entity);
	            
	            Gson gson = new Gson();
	            JsonObject jsonResponse = gson.fromJson(responseString, JsonObject.class);

	            return jsonResponse.toString();

	        } catch (Exception e) {
	            e.printStackTrace();
	            return "Error fetching weather report";
	        }
	    }
}
