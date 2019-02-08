package com.aditya.springdemo;

public class WinFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "good day is yours!!!";
	}

}
