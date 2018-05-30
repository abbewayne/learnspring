package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		String[] ranlucky = {"You are No.1", "Try harder, then you will win", "Never give up"};
		Random random = new Random();
		int ran = random.nextInt(3);
		return ranlucky[ran];
	}

}
