package com.myro.java.Bridge;

public class Main {
	
	public static void main(String[] args) {
		
		printMorseCode print = new printMorseCode(new defaultMorseCodAble());
		
//		print.a();
//		print.b();
//		print.c();
		
		print.a().b().c();
	}
}
