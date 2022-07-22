package Lab1;

import java.util.ArrayList;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Account> accounts=new ArrayList<Account>();
		
		Account account1=new Account(1001, "kumar", 25000);
		Account account2=new Account(1002, "shanthi", 5000);
		Account account3=new Account(1003, "Kavya", 25000);
		Account account4=new Account(1004, "Mohan", 5000);
		Account account5=new Account(1005, "Dinesh", 22000);
		
		accounts.add(account1);
		accounts.add(account2);
		accounts.add(account3);
		accounts.add(account4);
		accounts.add(account5);
		
		
		System.out.print(BankApp.checkEquality(accounts));


	}

}
