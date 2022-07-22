package Isa.generalization;

public class SavingAccount extends Account {
	
	private double balance;

	public SavingAccount(int id, String name, double balance) {
		super(id, name);
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
