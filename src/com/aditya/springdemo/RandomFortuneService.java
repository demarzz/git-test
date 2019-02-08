package com.aditya.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	String[] str = {"beware","of","dogs"};
	
	//create a random generator
	private Random random = new Random();

	@Override
	public String getFortune() {
		//pick a random string
		int index = random.nextInt(str.length);
		String theFortune = str[index];
		return theFortune;
	}

}
