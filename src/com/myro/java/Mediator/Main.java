package com.myro.java.Mediator;

public class Main {

	public static void main(String[] args) {

		Mediator mediator = new ChatMediator();
		
		Colleague colleague1 = new ChatColleague();
		Colleague colleague2 = new ChatColleague();
		Colleague colleague3 = new ChatColleague();
		
		colleague1.registerMediator(mediator);
		colleague2.registerMediator(mediator);
		colleague3.registerMediator(mediator);
		
		
		colleague1.send("hello");
		
	}

}
