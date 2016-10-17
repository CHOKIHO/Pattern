package com.myro.java.Mediator;


public class ChatMediator extends Mediator {


	@Override
	protected void mediate(String data) {
		
		for (Colleague colleague : colleagues) {
			colleague.handler(data);
		}
			
	}


}
