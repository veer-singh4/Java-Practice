package oo.hasa;

public class Customer {
	
	private String name;

	public Customer(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Customer[name="+name+"]";
	}
	

}
