package com.myro.java.Bridge;

public class defaultMorseCodAble implements MorseCodAble {

	@Override
	public void iDot() {
		System.out.print(".");
	}

	@Override
	public void iDash() {
		System.out.print("-");

	}

	@Override
	public void iSpace() {
		System.out.print(" ");
	}

}
