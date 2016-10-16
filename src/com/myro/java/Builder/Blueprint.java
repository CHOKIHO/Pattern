package com.myro.java.Builder;

public abstract class Blueprint {

	Computer computer;
	
	abstract public void setCpu();
	abstract public void setRam();
	abstract public void setStorage();
	abstract public Computer getComputer();

	
}
