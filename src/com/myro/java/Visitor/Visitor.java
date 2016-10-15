package com.myro.java.Visitor;

public interface Visitor {
	public void visit(Visitable visitable);
}

class VisitorA implements Visitor {
	private int ageSum;
	
	public VisitorA() {
		ageSum=0;
	}
	
	@Override
	public void visit(Visitable visitable) {
		if (visitable instanceof VisitableA) {
			ageSum += ((VisitableA) visitable).getAge();
		}
	}
	
	public int getAgeSum() {
		return ageSum;
	}
}
