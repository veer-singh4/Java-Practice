package ca.entity;

import java.util.ArrayList;
import java.util.List;

public class Order {
	
	private int ordId;
	private String ordName;

	private List<OrderedItem> ordereditems= new ArrayList<OrderedItem>();
	
	private Customer customer;

	public Order(int ordId, String ordName, Customer customer) {
		super();
		this.ordId = ordId;
		this.ordName = ordName;
		this.customer = customer;
	}

	public int getOrdId() {
		return ordId;
	}

	public void setOrdId(int ordId) {
		this.ordId = ordId;
	}

	public String getOrdName() {
		return ordName;
	}

	public void setOrdName(String ordName) {
		this.ordName = ordName;
	}

	public List<OrderedItem> getOrdereditems() {
		return ordereditems;
	}

	public void setOrdereditems(List<OrderedItem> ordereditems) {
		this.ordereditems = ordereditems;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
	
}
