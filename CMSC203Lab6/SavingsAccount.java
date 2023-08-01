
public class SavingsAccount extends BankAccount {

	
	private static final double rate = .025;
	
	private static int savingsNumber = 0;
	private String accountNumber;
	
	public SavingsAccount(String name, double initialBalance) {
		
		super(name, initialBalance);
		
		savingsNumber++;
		
		accountNumber = getAccountNumber() + "-" + savingsNumber;
		
	}
	
	public void postInterest() {
		double interest = getBalance() * rate;
		
		deposit(interest);
	}
	
	@Override
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public SavingsAccount(SavingsAccount oldAccount, double initialBalance) {
		super(oldAccount, initialBalance);
		
		savingsNumber++;
		
		accountNumber = oldAccount.getAccountNumber() + "-" + savingsNumber;
	}
}
