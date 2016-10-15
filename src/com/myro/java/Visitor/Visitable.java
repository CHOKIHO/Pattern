package com.myro.java.Visitor;

public interface Visitable {
	public void accept(Visitor visitor);
}


class VisitableA implements Visitable {

	private int age;
	
	public VisitableA(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
		
	}
	
}