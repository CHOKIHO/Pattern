package com.myro.java.Builder;

public class Main {

	public static void main(String[] args) {
		
		Computer computer = new Computer("i7", "16g", "256g ssd");
		computer.toString();
		
		
		//객체생성
		ComputerBuilder builder = new ComputerBuilder();
		
		builder.setPrint(new LGBlueprint());
		
		Computer computer1 = builder.makeAndGet();
		
		computer1.toString();
	}
}