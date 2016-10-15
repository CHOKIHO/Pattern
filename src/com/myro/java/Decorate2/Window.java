package com.myro.java.Decorate2;

public interface Window {
	
	public void draw();
	public String getDescription();

}

class SimpleWindow implements Window {

	@Override
	public void draw() {
		
	}

	@Override
	public String getDescription() {
		return "Simple Window";
	}
	
}

