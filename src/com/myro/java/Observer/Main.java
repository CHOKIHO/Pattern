package com.myro.java.Observer;

public class Main {
	public static void main(String[] args) {
		
		System.out.println("Enter Text>");
		
		//이벤트 발행주체를 생성함
		EventSource evSrc = new EventSource();
		
		//옵저버를 생성함
		ResponseHandler resHandler = new ResponseHandler();
		
		evSrc.addObserver(resHandler);
		
		Thread thread = new Thread(evSrc);
		thread.start();
		
		
	}
}
