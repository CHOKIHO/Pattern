package com.myro.java.ChainOfResponsibilty;

public abstract class Calculator {

	private Calculator nextCalculator;

	
	public void setNextCaculator(Calculator nextcalculator) {
		this.nextCalculator = nextcalculator;
	}

	public boolean process(int i, int j, String operator){
		if (operate(i, j, operator)) {
			return true;
		} else if (nextCalculator != null) {
		
		    nextCalculator.process(i, j, operator);
		}
		return false;
		

	}

	abstract protected boolean operate(int i, int j, String operator);
	
}

