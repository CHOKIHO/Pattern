package com.myro.java.Decorate2;

public class Main {
	public static void main(String[] args) {
		
		// create a decorated Window with horizontal and vertical scrollbars
        Window decoratedWindow = 
        		new HorizontalWindowScrollbar (new VerticalWindowScrollbar(new SimpleWindow()));
        
        System.out.println(decoratedWindow.getDescription());
	}

}
