package com.luv2code.springdemo;

public class PingpongCoach implements Coach {

	private FortuneService fortuneService;
	
	
	public PingpongCoach(FortuneService fortuneService) {
		//super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Front hand and back hand for 30 mins each.";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
