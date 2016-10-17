package com.myro.java.Mediator;

public abstract class Colleague {
	
	protected Mediator mediator;
	
	
	protected Boolean registerMediator(Mediator mediator) {
		this.mediator = mediator;
		return mediator.addColleague(this);
	}
	
	protected void send(String data) {
		mediator.mediate(data);
	}
	
	abstract public void handler(String data);
}
