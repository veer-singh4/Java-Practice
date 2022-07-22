package oo.hasa;

import java.util.ArrayList;
import java.util.List;

public class Company {
	private String companyName;
	private List<Customer> customers = new ArrayList<Customer>();
	private Address address;
	private List<Product> product = new ArrayList<Product>();


	public Company(String companyName) {
		
		this.companyName=companyName;
		
	}
	

	public String getCompanyName() {
		return companyName;
	}


	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}


	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}
	
	
	
	
	

}
