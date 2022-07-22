package Lab6;


public class Account {
	private int accountId;
	private String name;
	private int balance;
	
	public Account() {
		super();
	}

	public Account(int accountId, String name, int balance) {
		super();
		this.accountId = accountId;
		this.name = name;
		this.balance = balance;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public boolean equals(Account acc) {
		if(this.getAccountId()==acc.getAccountId()) {
			return true;
		}
	  else if(this.getName()==acc.getName()) {
		 return true;
	  }
	  else if(this.getBalance()==acc.getBalance()) {
		  return true;
	  }
	  else
		  return false;
	}

}
