package com.myro.java.Mediator;

public class ChatColleague extends Colleague {

	@Override
	public void handler(String data) {
		System.out.println(this + " " + data);

	}
}
