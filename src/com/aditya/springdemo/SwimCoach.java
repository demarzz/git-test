package com.aditya.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	
	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String emai;
	
	@Value("${foo.team}")
	private String team;
	
	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	@Override
	public String getDailyWorkout() {
		return "swim 1000m as warmup";
	}

	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}
	public String getEmai() {
		return emai;
	}
	
	
	public String getTeam() {
		return team;
	}
	

}
