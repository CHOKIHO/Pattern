package com.myro.java.ChainOfResponsibilty;

public class Main {

	public static void main(String[] args) {
		
		Calculator plus = new plusCaclulator();
		Calculator minus = new minisCaculator();
		Calculator multiple = new multipleCaculator();
		
		plus.setNextCaculator(minus);
		minus.setNextCaculator(multiple);
		
		
		plus.process(1, 9, "*");
		plus.process(10,3, "-");
		plus.process(10,3, "+");
		plus.process(10,3, "/");
		
		
	}
}
