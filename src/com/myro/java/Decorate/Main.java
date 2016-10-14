package com.myro.java.Decorate;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		IBeverage beverage = new Base();
		
		boolean done = false;
		
		while(!done) {
			System.out.println("현재 음료 가격 :" + beverage.getTotalPrice());
			
			System.out.println("선택 : 0.종료 / 1.샷추가 / 2.우유추가 ");
			
			switch (sc.nextInt()) {
			case 0:
					done = true;
				break;
			case 1:
				//이부분이 데코레이터의 핵심인듯...
				beverage = new Espresso(beverage);
			break;
			case 2:
				beverage = new Milk(beverage);
				break;
			}
		}
		
		System.out.println("음료가격 : "+beverage.getTotalPrice());
		sc.close();
		
		
		
		
	}
}
