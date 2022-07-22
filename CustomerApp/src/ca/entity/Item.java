package ca.entity;

public class Item {
	
	private String des;
	private double rate;
	
	
	public Item(String des, double rate) {
		super();
		this.des = des;
		this.rate = rate;
	}
	
	
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	
	

}
