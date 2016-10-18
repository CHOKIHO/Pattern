package com.myro.java.Observer3;

import java.util.Observable;

public class Button extends Observable {
	
	public void onclick() {
		setChanged();
		notifyObservers();
	}
	

}
