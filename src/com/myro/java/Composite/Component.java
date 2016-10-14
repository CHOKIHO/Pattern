package com.myro.java.Composite;

abstract public class Component {
	public String name;
	
	
	public Component(String name) {
		this.name = name;
	}
	
	public void setId(String id) {
		this.name = id;
	}

	public String getId() {
		return name;
	}
}
