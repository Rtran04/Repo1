
public class CheckingAccount extends BankAccount {

	private static final double FEE = .15;
	
	public CheckingAccount(String name, double initialBalance){
		
		super(name, initialBalance);
		
		setAccountNumber(getAccountNumber() + "-10");
		
	}
	
	@Override
	public boolean withdraw(double amount) {
		
		double total = amount + FEE;
		
		boolean completed = super.withdraw(total);
		
		return completed;
	}
	
	
}
