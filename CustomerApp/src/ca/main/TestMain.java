package ca.main;

import java.util.ArrayList;
import java.util.List;

import ca.entity.Company;
import ca.entity.Customer;
import ca.entity.Item;
import ca.entity.Order;
import ca.entity.OrderedItem;
import ca.entity.RegCustomer;

public class TestMain {
	
	public static void main(String[] args) {
		
		Company company=new Company("virtusa");
		
		Customer c1=new Customer(1, "rahul");
		Customer c2=new Customer(2, "ashish");
		Customer rc1=new RegCustomer(3, "s", 5);
		//Customer rc2=new RegCustomer(4, "k", 2);
		
		List<Customer> customers= new ArrayList<Customer>();
		customers.add(c1);
		customers.add(c2);
		customers.add(rc1);
	//	customers.add(rc2);
	
		
		company.setCustomers(customers);
		
		
		Order o1=new Order(1, "food", c1);
		Order o2=new Order(2, "travel", c1);
		
		
		
		List<Order> ordereds= new ArrayList<Order>();
		ordereds.add(o1);
		ordereds.add(o2);
		
		c1.setOrdereds(ordereds);
		c2.setOrdereds(ordereds);
		rc1.setOrdereds(ordereds);
	//	rc2.setOrdereds(ordereds);
		
		Item i=new Item("food", 2000);
		
		
		
		OrderedItem oi1=new OrderedItem(4, i);
		OrderedItem oi2=new OrderedItem(2, i);
		
		List<OrderedItem> ordereditems= new ArrayList<OrderedItem>();
		ordereditems.add(oi1);
		ordereditems.add(oi2);
		
		o1.setOrdereditems(ordereditems);
		o2.setOrdereditems(ordereditems);
		
		
		System.out.println("Totalworth of Company : " +company.getTotalWorthOfOrderPlaced());

		
	
		
		
	}

}
