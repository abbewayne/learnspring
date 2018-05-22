package com.luv2code.springdemo;

public class BaseballCoach implements Coach{

	// define a private field for dependency
	private FortuneService fortuneService;
	
	// define a constructor for dependecy injection
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		
		// use my fortunService to get a fortune  
		return fortuneService.getFortune();
	}
	
	
}
