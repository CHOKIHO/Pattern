package com.myro.java.Bridge;

public class printMorseCode extends MorseCode {
	
	public printMorseCode(MorseCodAble codable) {
		super(codable);
	}

	//print a
	public printMorseCode a() {
		dash();dot();dash();space();
		return this;
	}
	
	//print b
	public printMorseCode b() {
		dot();dash();dot();space();
		return this;
	}

	//print c
	public printMorseCode c() {
		dot();dash();dash();space();
		return this;
		}
}
