package com.myro.java.Builder;

public class LGBlueprint extends Blueprint {

	private Computer computer;
	
	
	public LGBlueprint() {
		computer = new Computer("default", "default", "default");
	}

	@Override
	public void setCpu() {
		computer.setCpu("i8");
		
	}

	@Override
	public void setRam() {
		computer.setRam("16g");
	}

	@Override
	public void setStorage() {
		computer.setStorage("512g ssd");
	}

	public Computer getComputer() {
		return this.computer;
	}



}
