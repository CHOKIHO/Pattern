package com.myro.java.Bridge;

public class MorseCode {

	MorseCodAble codable;
	
	public MorseCode(MorseCodAble codable) {
		this.codable = codable;
	}
	
	public void dot(){
		codable.iDot();
		//System.out.print(".");

	}
	public void dash(){
		codable.iDash();
//		System.out.print("-");
	}
	public void space(){
		codable.iSpace();
//		System.out.print(" ");
		
	}
}
