package oo.hasa;

import java.util.ArrayList;
import java.util.List;

public class TestMain {

	public static void main(String[] args) {
		
		
		Company cp1=new Company("virtusa");
		
		
		
		Address a1=new Address("home");
		cp1.setAddress(a1);
	
		a1.setCompany(cp1);
		
		
		System.out.println("Company Name :"+a1.getCompany().getCompanyName());
		
		System.out.println("Address :"+cp1.getAddress().getAddress());
		
		
		Customer c1=new Customer("rahul");
		Customer c2=new Customer("vijay");
		
	    List<Customer> customers = new ArrayList<Customer>();
	    
	    customers.add(c1);
	    customers.add(c2);
	    
	    cp1.setCustomers(customers);
	    System.out.println("customer name:" +cp1.getCustomers());
	    
	    Product p1=new Product(1);
	    Product p2=new Product(2);
	    List<Product> product = new ArrayList<Product>();
	    product.add(p1);
	    product.add(p2);
	    cp1.setProduct(product);
	    System.out.println("Product Id:" +cp1.getProduct());
	    
	    
	    
	    

	}

}
