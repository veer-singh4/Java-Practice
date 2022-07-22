package Lab1;

import java.util.ArrayList;
import java.util.HashMap;

public class BankApp {
	private String name;
	
	private ArrayList<Account> accounts=new ArrayList<Account>();
	
	

	public BankApp(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(ArrayList<Account> accounts) {
		this.accounts = accounts;
	}
	
	public static int checkEquality(ArrayList<Account> accounts) {
		int count=0;
		
		HashMap<Double,Boolean> hm=new HashMap<Double,Boolean>();
		for(Account acc: accounts) {
			if(!hm.containsKey(acc.getBalance())) {
				hm.put((acc.getBalance()), false);
			}
			else
			{
				if(hm.get(acc.getBalance())==false) {
					hm.put((acc.getBalance()), true);
					count+=2;
				}
				else
					count++;
			}
			
		}
		return count;
	}
	

}
