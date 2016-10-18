package com.myro.java.Observer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Observable;

public class EventSource extends Observable implements Runnable{
	
	public void run() {

		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);

			while (true) {
				String response = br.readLine();
				setChanged();
				notifyObservers(response);
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
