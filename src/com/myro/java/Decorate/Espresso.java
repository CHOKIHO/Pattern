package com.myro.java.Decorate;

public class Espresso extends AbsAdding {
	
	protected static int espressoCount = 0;

	public Espresso(IBeverage base) {
		super(base);
	}

	@Override
	public int getTotalPrice() {
		return super.getTotalPrice() + getAddPrice();
	}

	private int getAddPrice() {
		System.out.println("에스프레소 카운트 :" + espressoCount);
		espressoCount += 1;
		int addPrice = 100;
		
		if (espressoCount > 1) {
			addPrice = 70;
		}
		return addPrice;
	}
	
	

	
}
