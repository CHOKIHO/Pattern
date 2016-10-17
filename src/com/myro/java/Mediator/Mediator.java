package com.myro.java.Mediator;

import java.util.ArrayList;
import java.util.List;

public abstract class Mediator {
	
	protected List<Colleague> colleagues;
	
	public Mediator() {
		colleagues = new ArrayList<Colleague>();
	}
	
	protected Boolean addColleague(Colleague colleague) {
		
		return colleagues.add(colleague);
		
	}
	
	abstract protected void mediate(String data);

}
