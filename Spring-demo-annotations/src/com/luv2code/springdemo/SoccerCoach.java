package com.luv2code.springdemo;

public class SoccerCoach implements Coach {

	private FortuneService fortuneService;
	
	public SoccerCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Run 2k and play defense & attack";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
