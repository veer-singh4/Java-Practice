package oo.uses;


public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Customer c1 = new Customer();
        Customer c2 = new Customer();
        
        Employee e1 = new Employee();
        Employee e2 = new Employee();
		
		System.out.println("Customer 1 details");
		System.out.println("Cust Id : " + c1.getCustId());
		System.out.println("Emp Id : " + e1.getEmpId());
		
		System.out.println("Customer 2 details");
		System.out.println("Cust Id : " + c2.getCustId());
		System.out.println("Emp Id : " + e2.getEmpId());

	}

}
