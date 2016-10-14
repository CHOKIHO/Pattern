package Decorate;

public class Milk extends AbsAdding {

	public Milk(IBeverage meterial) {
		super(meterial);
	}

	@Override
	public int getTotalPrice() {
		return super.getTotalPrice()+50;
	}

}
