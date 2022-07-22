package oo.uses;



public class Customer {

	private int custId;

	public Customer() {
		super();
		this.custId = IdGenerator.getCustId();
	}

	
	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}
	
}
