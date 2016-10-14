package Decorate;

abstract public class AbsAdding implements IBeverage {
	
	private IBeverage beverage;
	
	public AbsAdding(IBeverage beverage) {
		super();
		this.beverage = beverage;
	}

	@Override
	public int getTotalPrice() {
		return beverage.getTotalPrice();
	}
	
//	public IBeverage getBase() {
//		return beverage;
//	}

}
