package bankAccount_ManagementSystem;

public class SavingsAccount extends BankAccount {
	private double interestRate;

	public SavingsAccount(int accountNumber, double balance, double interestRate) {
		super(accountNumber, balance);
		this.interestRate = interestRate;
	}

	public double addInterest() {
		double interest = balance * interestRate / 100;
		balance += interest;
		System.out.println("Interest Added: " + interest);
		return balance;
	}
}
