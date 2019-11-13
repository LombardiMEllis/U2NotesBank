import java.text.DecimalFormat;

public class BankAccount {
	//attributes (variables)
	private String name;
	private int accNumber = 777777;
	private double balance;
	
	//methods (functions)
	//default constructor -takes no parameters
	public BankAccount() {
		name = "none given";
		accNumber = -1;
		balance = 0;
	}
	//overloaded constructor
	public BankAccount(String n, double initialDeposit) {
		name = n;
		balance = initialDeposit;
		accNumber += (int)(Math.random()*100000);
	}
	
	public void setName(String n) {
		name = n;
	}
	public String getName() {
		return name;
	}
	
	public int getAccountNum() {
		return accNumber;
	}
	public void setAccountNum(int n) {
		accNumber = n;
	}
	
	public double getBalance() {
		return balance;
	}
	
	
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount;
	}
	
	//toString method
	public String toString() {
		DecimalFormat formatter = new DecimalFormat("###,###,###.00");
		return name + " (" + accNumber 
				+ ") has a balance of $" + formatter.format(balance);
	}

}
