package com.example.CricketAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class cricketController extends cricketUtils{
	
	@GetMapping("/getdetails")
    public String Handler() {
		return getMatchesDetails();
    }
	@GetMapping("/getSeriesDetails")
    public String SeriesHandler() {
		return getSeriesDetails();
    }
}
