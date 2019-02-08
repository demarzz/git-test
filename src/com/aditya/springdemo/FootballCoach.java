package com.aditya.springdemo;

import org.springframework.stereotype.Component;

@Component("footyCoach")
public class FootballCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		
		return "try to score penalty";
	}
	
	public String getFortune() {
		return "Lucky day for u!!!";
	}

}
