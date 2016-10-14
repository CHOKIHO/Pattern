package com.myro.java.Bridge;

public class printMorseCode extends MorseCode {
	
	public printMorseCode(MorseCodAble codable) {
		super(codable);
	}

	//print a
	public void a() {
		dash();dot();dash();space();
	}
	
	//print b
	public void b() {
		dot();dash();dot();space();
	}

	//print c
	public void c() {
		dot();dash();dash();space();
	}
}
