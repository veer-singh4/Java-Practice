package oo.hasa;

public class Address {
	
	private Company company;
	private String address;
	public Address( String address) {
		super();
		this.address = address;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
