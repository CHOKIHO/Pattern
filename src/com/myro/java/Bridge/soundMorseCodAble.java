package com.myro.java.Bridge;

public class soundMorseCodAble implements MorseCodAble {

	@Override
	public void iDot() {
		System.out.print("삑");

	}

	@Override
	public void iDash() {
		System.out.print("삐이익");

	}

	@Override
	public void iSpace() {
		System.out.print(" ");

	}

}
