package com.aditya.springdemo;

public class WrestlingCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public WrestlingCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}	

	@Override
	public String getDailyWorkout() {
		
		return "Hit the punching bag 50 times";
	}

	@Override
	public String getFortune() {
		
		return fortuneService.getFortune();
	}

}
