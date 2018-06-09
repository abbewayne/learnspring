package com.luv2code.springdemo;

import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	// create an array of strings
	private String[] data = new String[3];
	
	@Value("${lucky1}")
	private String luck1;
	
	@Value("${lucky2}")
	private String luck2;
	
	@Value("${lucky3}")
	private String luck3;
	
	@PostConstruct
	public void setupMyData() {
		
		data[0] = luck1;
		data[1] = luck2;
		data[2] = luck3;
	}
	
	//private String[] data = {luck1, luck2, luck3};
	
	
	/*
	private String[] data = {
			"Beware",
			"Diligence",
			"Journey"
	};*/
	
	// create a random number generator
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		// pick a  random string from the array
		setupMyData();
		int index = myRandom.nextInt(data.length);
		
		String theFortune = data[index];
		
		return theFortune;
	}

}
