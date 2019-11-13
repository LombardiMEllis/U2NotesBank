
public class U2L02Bank {

	public static void main(String[] args) {
		/*
		BankAccount samantha = new BankAccount("Samantha Honig", 1000);
		BankAccount hannah = new BankAccount("Hannah A-B", 1500);
		//samantha.name = "Samantha Honig"; - this won't work because it's private
		//samantha.setName("Samantha Honig");
		
		System.out.println(samantha);
		
		samantha.deposit(10000);
		
		System.out.println(samantha);
		
		BankAccount eleanor = new BankAccount();
		System.out.println(eleanor);
		*/
		
		StudentAccount elaini = new StudentAccount("Elaini Asamere", 10000);
		
		for (int i = 0; i < 12; i++) {
			System.out.print("Month " + i + ": ");
			System.out.println(elaini + " with an interest rate of " + elaini.getIntRate());
			
			//end of month - calculate interest
			elaini.earnInterest();
		}
		
	}

}
