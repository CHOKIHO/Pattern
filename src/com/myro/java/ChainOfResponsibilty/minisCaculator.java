package com.myro.java.ChainOfResponsibilty;

public class minisCaculator extends Calculator {

	@Override
	protected boolean operate(int i, int j, String operator) {
		if (operator.equals("-")) {
			System.out.println(i-j);
			return true;
		}
		return false;
	}

}
