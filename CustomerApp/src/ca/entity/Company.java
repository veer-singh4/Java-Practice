package ca.entity;

import java.util.ArrayList;
import java.util.List;

public class Company {
	
	private String name;
	private List<Item> items= new ArrayList<Item>();
	
	private List<Customer> customers= new ArrayList<Customer>();

	public Company(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
	
	public double getTotalWorthOfOrderPlaced() {
		double totalworth=0,finaltotal=0;
		
		for(Customer customer: customers) {
			for(Order order: customer.getOrdereds()) {
				for(OrderedItem orderedItem : order.getOrdereditems()) {
					if(customer instanceof RegCustomer) {
						double worth=0;
						worth= orderedItem.getItem().getRate()*orderedItem.getQty();
						totalworth=worth-(worth*((RegCustomer)customer).getSpDiscount()/100);
						finaltotal+=totalworth;
					}
					else {
						totalworth= orderedItem.getItem().getRate()*orderedItem.getQty();
						finaltotal+=totalworth;
					}
						}
					}
				}
		return finaltotal;
		}

	
	
	
}
