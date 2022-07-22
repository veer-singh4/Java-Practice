package Isa.generalization;

public class TestMain {

	public static void main(String[] args) {
		
		SavingAccount sa1 = new SavingAccount(1,"arun",10000.0);
		SavingAccount sa2 = new SavingAccount(2,"arya",20000.0);
		
		System.out.println("Id : " + sa1.getId());
		System.out.println("name : " + sa1.getName());
		System.out.println("balance : " + sa1.getBalance());
		
		System.out.println("Id : " + sa2.getId());
		System.out.println("name : " + sa2.getName());
		System.out.println("balance : " + sa2.getBalance());

	}

}
