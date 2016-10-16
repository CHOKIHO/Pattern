package com.myro.java.Builder;

public class ComputerBuilder {
	private Blueprint print;

	public Blueprint getPrint() {
		return print;
	}

	public void setPrint(Blueprint print) {
		this.print = print;
	}

	public Computer makeAndGet() {
		print.setCpu();
		print.setRam();
		print.setStorage();
		return print.getComputer();
		
	}
	

	
	

}
