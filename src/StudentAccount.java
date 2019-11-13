
public class StudentAccount extends BankAccount {
	//attributes
	private double interestRate;
	
	
	
	//methods
	//default constructor
	public StudentAccount() {
		//calls default superclass constructor automatically
		interestRate = 0.05;
	}
	//overloaded constructor
	public StudentAccount(String n, double b) {
		super(n, b);
		interestRate = 0.01;
	}
	
	public double getIntRate() {
		return interestRate;
	}
	
	public void setIntRate(double rate) {
		interestRate = rate;
	}
	
	public void earnInterest() {
		//calculate interest each month and add to balance
		double intEarned = getBalance() * interestRate;
		deposit(intEarned);
	}
	
	
	
}
