package ca.entity;

public class RegCustomer extends Customer{
	private double spDiscount;

	public RegCustomer(int id, String name, double spDiscount) {
		super(id, name);
		this.spDiscount = spDiscount;
	}

	public double getSpDiscount() {
		return spDiscount;
	}

	public void setSpDiscount(double spDiscount) {
		this.spDiscount = spDiscount;
	}
	
}
