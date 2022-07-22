package ca.entity;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	
	private int Id;
	private String Name;
	private List<Order> ordereds= new ArrayList<Order>();
	public Customer(int id, String name) {
		super();
		Id = id;
		Name = name;
	}
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public List<Order> getOrdereds() {
		return ordereds;
	}
	public void setOrdereds(List<Order> ordereds) {
		this.ordereds = ordereds;
	}
	
	

}
